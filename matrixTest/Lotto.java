package matrixTest;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
    public static void main(String[] args) {
//        // 배열을 이용한 방식
//        int[] arr = new int[6];
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = 1 + (int)(Math.random() * 45);
//            for(int j = 0; j < i; j++)  if(arr[i] == arr[j]){   i--;    break;      }
//        }
//        // 퀵정렬 이용
//        Arrays.sort(arr);
//        // 버블정렬 이용
//        for(int i = 0; i < arr.length - 1; i++)     for(int j = arr.length - 2, tmp; j >= 0; j--)
//            if(arr[j] > arr[j + 1]){    tmp = arr[j];   arr[j] = arr[j + 1];    arr[j + 1] = tmp;   }
//
//        for(int i : arr)  System.out.printf("%d, ", i);

        // 정렬된 set 이용한 방식
        Set<Integer> s = new TreeSet<Integer>();
        for(; s.size() < 6; s.add(1 + (int)(Math.random() * 45)));
        for(Integer i : s)  System.out.printf("%d, ", i);
    }
}
