package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class application1 {
    public static void main(String[] args) {

        /* java.util.scanner를 이용 다양한 자료형 값 입렵 받기 */
        // (석현) 작성하면 자동으로 스캐너가 import 된것을 볼 수 있음

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : " );
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다.");

        System.out.print("키를 입력해주세요 : ");
        float height = sc.nextFloat();
        System.out.println("입력하신 키는 " + height + "입니다.");

        System.out.print("true 또는 false를 입력해주세요.");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리값은 : " + isTrue + "입니다.");

        sc.nextLine();
        System.out.print("아무 문자열을 입력해주세요 : ");
        char ch = sc.nextLine().charAt(10);
        System.out.println("입력하신 문자는 " + ch + "입니다.");
        // (석현) 입력한 문자열이 범위보다 글자수가 작으면 오류남










    }
}
