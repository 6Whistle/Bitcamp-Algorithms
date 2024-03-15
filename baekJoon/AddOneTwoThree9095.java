package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddOneTwoThree9095 {
    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int max = 0;
        int[] input = new int[Integer.parseInt(br.readLine())];
        for(int i = 0; i < input.length; max = Math.max(max, input[i++]))  input[i] = Integer.parseInt(br.readLine());
        int[] arr = new int[max + 3];
        arr[0] = arr[1] = 0;    arr[2] = 1;
        for(int i = 3; i < arr.length; i++)     arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        for(int i = 0; i < input.length; i++)   System.out.println(arr[input[i] + 2]);
    }
}
