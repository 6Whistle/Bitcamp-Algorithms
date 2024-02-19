import java.util.Arrays;
import java.util.Scanner;

public class SevenNanjengi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) sum += (arr[i] = scan.nextInt());
        for(int i = 0; i < arr.length - 1; i++)  for(int j = i + 1; j < arr.length; j++)
            if((sum - arr[i] - arr[j]) == 100){
                arr[i] = arr[j] = 100;
                Arrays.sort(arr);
                for(int k = 0; k < arr.length - 2; k++)    System.out.println(arr[k]);
                return;
            }
    }
}
