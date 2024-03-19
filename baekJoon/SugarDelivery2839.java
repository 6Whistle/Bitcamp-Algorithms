package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery2839 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] arr = new int[Integer.parseInt(br.readLine()) + 1];
        for(int i = 1; i < arr.length; i++){
            arr[i] = Math.min(i-3 < 0 ? Integer.MAX_VALUE : arr[i-3], i-5 < 0 ? Integer.MAX_VALUE : arr[i-5]);
            arr[i] += arr[i] == Integer.MAX_VALUE ? 0 : 1;
        }
        System.out.println(arr[arr.length - 1] == Integer.MAX_VALUE ? -1 : arr[arr.length - 1]);
    }
}
