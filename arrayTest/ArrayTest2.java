package arrayTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayTest2 {
    /**
     * Optimization Problem : Find Max Value(Greedy Algorithm)
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int max = Integer.MIN_VALUE;
//        for(int i = 1; i > -1; System.out.println(i = sc.nextInt()), max = Integer.max(i, max))
//            System.out.print("입력(음수 입력 시 종료) : ");
//        System.out.printf("최대값 : %d", max);

        int max = 0;
        System.out.print("입력 개수 : ");
        int[] arr = new int[sc.nextInt()];
        String[] names = new String[arr.length];
        System.out.println("입력(형식 : 이름 점수)");
        for(int i = 0; i < arr.length; i++){
            names[i] = sc.next();
            max = arr[max] > (arr[i] = sc.nextInt()) ? max : i;
        }
        System.out.printf("name : %s, score : %d\n", names[max], arr[max]);

        }
}
