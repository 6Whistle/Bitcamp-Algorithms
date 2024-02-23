package beakJoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class SevenNanjengiPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        //배열에서 2가지 값을 고름
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                // 9개의 값을 모두 더한 값 sum에서 두 값을 뺐을 때 100이 되는 경우
                if((sum - arr[i] - arr[j]) == 100) {
                    //버릴 값을 100보다 큰 수로 설정
                    arr[i] = 100;
                    arr[j] = 100;
                    //전체 반복문 탈출
                    i = arr.length;
                    j = arr.length;
                }
            }
        }
        //정렬 후 버려지는 값은 기존 값들이 100 미만임으로 가장 뒤의 인덱스에 위치하게 됨
        Arrays.sort(arr);
        //배열 안의 7개의 값만 출력
        for(int i = 0; i < 7; i++){
            System.out.println(arr[i]);
        }
    }
}
