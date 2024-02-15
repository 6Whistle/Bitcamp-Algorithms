import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] li = {"ID", "Password", "Password Check", "Name"
                , "Identification Number", "Call Number", "Address", "Job"};
        String[] data = new String[8];
        for(int i = 0; i < 8; i++){
            System.out.printf("%s : ", li[i]);
            data[i] = scan.nextLine();
        }
        for(int i = 0; i < 8; i++){   System.out.printf("%s : %s\n", li[i], data[i]);     }
    }
}