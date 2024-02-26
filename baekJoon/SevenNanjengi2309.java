package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SevenNanjengi2309 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int sum = 0, tmp = 0;
        List<Integer> arr = new Vector<>();
        for(int i = 0; i < 9; sum += tmp, i++)  arr.add(tmp = Integer.parseInt(br.readLine()));
        for(int i = 0; i < arr.size() - 1; i++)  for(int j = i + 1; j < arr.size(); j++)
            if((sum - arr.get(i) - arr.get(j)) == 100){     arr.set(i, 100);    arr.set(j, 100);    break;  }
        arr.stream().sorted().filter(i -> i != 100).forEach(i -> System.out.println(i.intValue()));
    }
}
