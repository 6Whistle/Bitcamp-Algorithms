package kaupOOP;


import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {
        {
            KaupModel km = new KaupModel();

            Scanner sc = new Scanner(System.in);
            System.out.print("이름 :");
            km.setName(sc.next());


            km.createHeight();
            km.createWeight();
            km.createBMI();
            km.createBodyMass();

            System.out.println("===BMI 계산기====");
            System.out.println("이름: " + km.getName());
            System.out.println("몸무게: " + km.getWeight());
            System.out.println("키: " + km.getHeight());
            System.out.println("BMI: " + km.getBmi());
            System.out.println("BodyMass: " + km.getBodyMass());


        }
    }
}