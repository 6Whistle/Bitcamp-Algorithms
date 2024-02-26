package baekJoonPair;

import java.util.Arrays;
import java.util.Scanner;

public class ConferencePair {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[scan.nextInt()][2];
        for(int i = 0; i < arr.length; i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }

        //종료 시간을 기준으로 정렬
        //종료 시간이 같을 경우 시작 시간에 따라 정렬
        Arrays.sort(arr, (int[] a, int[] b) -> {
           if(a[1] == b[1])
               return a[0] - b[0];
           else
               return a[1] - b[1];
        });

        //(end = 0)번째 index 상태부터 출발
        //만약 현재 end의 종료시간보다 i번째 시작시간이 크거나 같을 경우
        //현재 end를 i로 옮기고 회의 횟수 cnt 증가
        int cnt = 1, end = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[end][1] <= arr[i][0]){
                end = i;
                cnt++;
            }
        }
    }
}
