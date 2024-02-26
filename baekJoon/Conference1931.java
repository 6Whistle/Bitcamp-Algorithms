package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Conference1931 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[][] arr = new int[Integer.parseInt(br.readLine())][2];
        for(int i = 0; i < arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());   arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (int[] a, int[] b)-> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1] );
        int cnt = 1;
        for(int i = 1, end = 0; i < arr.length; i++)     if(arr[end][1] <= arr[i][0]){   end = i;    cnt++;  }
        System.out.println(cnt);
    }
}
