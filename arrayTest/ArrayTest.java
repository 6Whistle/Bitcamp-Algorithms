package arrayTest;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++)     arr[i] = scan.nextInt();
        for(int i = 0; i < arr.length; i++)     System.out.println(arr[i]);
        for(int i = 2; i <= 10; i += 2)      System.out.println(i);
    }
}
