package methodTest;

import java.util.Scanner;

public class WhatName {

    protected static String inputName(Scanner scan){
        System.out.print("학생 이름 : ");
        return scan.next();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("이름 : %s\n", inputName(scan));
    }
}
