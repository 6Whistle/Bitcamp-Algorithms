package kaupOOP;

import memberOOP.Member;

import java.util.Scanner;

public class KaupView {

    public static double returnRandomHeight(){     return Math.random() * 50 + 150;    }
    public static double returnRandomWeight(){     return Math.random() * 30 + 50;     }
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("입력(키, 몸무게)");
            Member member = new Member(returnRandomHeight(), returnRandomWeight());

            KaupService service = new KaupServiceImpl();
            double bmi = service.createBMI();
            String bodyMass = service.createBodyMass();

            System.out.println("===BMI 계산기====");
            System.out.println("이름: " + member.getName());
            System.out.println("몸무게: " + member.getWeight());
            System.out.println("키: " + member.getHeight());
            System.out.println("BMI: " + bmi);
            System.out.println("BodyMass: " + bodyMass);
        }
    }
}