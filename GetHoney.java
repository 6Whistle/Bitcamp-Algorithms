import java.util.Scanner;

public class GetHoney {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max_honey = 0, sum = 0;
        int[] arr = new int[scan.nextInt()];
        for(int i = 0; i < arr.length; i++){
            sum += (arr[i] = scan.nextInt());
            if(arr[i] > max_honey && i != 0 && i != arr.length - 1)    max_honey = arr[i];
        }
        max_honey = sum + max_honey - arr[0] - arr[arr.length - 1];


        int lSum = 0, rSum = 0;
        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 2; j < arr.length; j++){
                for(int k = i + 1; k < j; k++){
//                    max_honey = Math.max(max_honey, Math.max());
                }
            }
        }
    }
}
