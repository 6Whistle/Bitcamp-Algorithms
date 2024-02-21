package memberOOP;

import java.util.Scanner;

public class MemberView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력(순서 : 아이디 비번 비번확인 이름 주민번호 전화번호 주소)");
        MemberModel mm = new MemberModel(scanner.next(), scanner.next(), scanner.next(), scanner.next(),
                                         scanner.next(), scanner.next(), scanner.next());

        System.out.println(mm.toString());
    }
}