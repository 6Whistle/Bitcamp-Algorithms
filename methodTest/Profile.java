package methodTest;

import java.util.Scanner;

public class Profile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = WhatName.inputName(scan);
        int age = HowOld.inputAge(scan);
        System.out.printf("이름 : %s, 나이 : %d \n", name, age);
    }
}
