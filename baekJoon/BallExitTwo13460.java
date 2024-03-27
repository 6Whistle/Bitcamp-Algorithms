package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BallExitTwo13460 {
    public static int[][] move = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[][] table = new char[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
        Queue<List<Integer>> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        queue.add(new ArrayList<>());
        for(int i = 0; i < 5; i++)  queue.peek().add(1);
        //Generate Table
        for(int i = 0; i < table.length; i++){
            String tmp = br.readLine();
            for(int j = 0; j < tmp.length(); j++) {
                table[i][j] = tmp.charAt(j);
                if (table[i][j] == 'R'){    queue.peek().set(0, i);  queue.peek().set(1, j);    }
                if (table[i][j] == 'B'){    queue.peek().set(2, i);  queue.peek().set(3, j);    }
            }
        }

        //should change stack -> queue
        while(!queue.isEmpty()){
            List<Integer> curList = queue.poll();
            int curInt = (curList.get(0) << 12) | (curList.get(1) << 8) | (curList.get(2) << 4) | (curList.get(3));
            if(set.contains(curInt))    continue;
            if(curList.get(4) > 10)     break;
            set.add(curInt);
            for(int i = 0; i < 4; i++){
                List<Integer> nextList = moveBalls(table, curList, i);
                if(nextList.get(4).equals(curList.get(4))){
                    System.out.println(curList.get(4));
                    return;
                }
                else if(nextList.get(4) > curList.get(4))    queue.add(nextList);
            }
        }
        System.out.println(-1);
    }

    public static List<Integer> moveBalls(char[][] table, List<Integer> cur, int arr) {
        int[] distance = {0, 0};
        List<Integer> next = new ArrayList<>(cur);

        for (int i = 0; i < 2; i++)
            for (; table[next.get(i * 2) + move[arr][0]][next.get(i * 2 + 1) + move[arr][1]] != '#'
                    && table[next.get(i * 2)][next.get(i * 2 + 1)] != 'O'; distance[i]++) {
                next.set(i * 2, next.get(i * 2) + move[arr][0]);
                next.set(i * 2 + 1, next.get(i * 2 + 1) + move[arr][1]);
            }

        if (next.get(0).equals(next.get(2)) && next.get(1).equals(next.get(3)) && table[next.get(0)][next.get(1)] != 'O') {
            if (distance[0] > distance[1]) {
                next.set(0, next.get(0) - move[arr][0]);
                next.set(1, next.get(1) - move[arr][1]);
            } else {
                next.set(2, next.get(2) - move[arr][0]);
                next.set(3, next.get(3) - move[arr][1]);
            }
        }

        next.set(4, cur.get(4) +
                (table[next.get(2)][next.get(3)] == 'O' ? -1
                : table[next.get(0)][next.get(1)] == 'O' ? 0
                : 1));

        return next;
    }
}
