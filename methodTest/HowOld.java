package methodTest;

import java.util.Scanner;

public class HowOld {

    protected static int inputAge(Scanner scan){
        System.out.print("나이 입력 : ");
        return scan.nextInt();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(inputAge(scan));
    }
}
