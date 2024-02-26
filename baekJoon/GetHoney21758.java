package baekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GetHoney21758 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, max = 0;
        int[] arr = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < arr.length; i++){
            sum += (arr[i] = Integer.parseInt(st.nextToken()));
            if(arr[i] > max && i != 0 && i != arr.length - 1)   max = arr[i];
        }

        //middle honeypot case
        max += sum - arr[0] - arr[arr.length - 1];

        //right honeypot case
        for(int i = 1, mSum = 0, rSum = sum - arr[0] - arr[i]; i < arr.length - 1; mSum += arr[i], rSum -= arr[++i])
            max = Math.max(max, mSum + rSum * 2);

        //left honeypot case
        for(int i = arr.length - 2, mSum = 0, lSum = sum - arr[i + 1] - arr[i]; i > 0; mSum += arr[i], lSum -= arr[--i])
            max = Math.max(max, mSum + lSum * 2);

        System.out.println(max);
        br.close();
    }
}