import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i = 1, num = scan.nextInt(); i < 10; i++)
            System.out.printf("%d * %d = %d\n", num, i, num * i);

    }
}
