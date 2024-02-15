import java.util.Scanner;

public class Calculate{
    public static void main(String[] args){
        Cal cal = new Cal();
        cal.getInput();
        cal.calculate();
        cal.print();

    }
}
class Cal {
    int a, b, res = 0;
    char op;

    //Constructor
    Cal(){    this.a = 0;     this.b = 0;     this.op = '+';  }
    Cal(int inputA, int inputB, char inputOp){ this.a = inputA;   this.b = inputB;    this.op = inputOp;  }

    //Get value from user and change a, b and op
    void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.print("입력1 : ");
        this.a = Integer.parseInt(scan.next());     //scan.nextInt()

        System.out.print("입력2 : ");
        this.b = Integer.parseInt(scan.next());     //scan.nextInt()

        System.out.print("연산자 : ");
        this.op = scan.next().charAt(0);
    }

    //Calculate using a, b and op and print
    void calculate(){
        res = op == '+' ? a + b :
              op == '-' ? a - b :
              op == '*' ? a * b :
              op == '/' && b != 0 ? a / b : -1;
    }

    //Print
    void print(){
        System.out.printf("%d %c %d = %d\n", a, op, b, res);
    }
}