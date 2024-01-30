package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class application3 {
    public static void main(String[] args) {
        /* 스캐너 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 읽어온다.
        * 그래서 크게 2가지 주의사항을 주의해야한다.
        * 1. nextLine()로 문자열 입력 받은 후 정수, 실수, 논리값을 입력 받을 때
        * 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열 입력받을 때 */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next();        // 공백이나 개행문자 전 까지를 읽어온다.
        System.out.println("str1 : " + str1);

        sc.nextLine();

        System.out.print("숫자를 입력해주세요. : ");
        int num1 = sc.nextInt();        // 정수값을 읽어온다.
        System.out.println("num1 : " + num1);
        /* (석현) '안녕 반가워'를 썼을 때 공백을 기준으로 next 메소드는 '안녕'까지밖에 안받아 들인다.
        그래서 그 뒤에 있는 '반가워'를 정수 변수인 int가 받아들여서 오류가 발생하는 것이다.
        따라서 중간에 nexLine을 넣어 줌으로써 int가 받아들이기 전에 nextLine이 받아들여 오류를 막는 것이다. */

        /* 정수, 실수 논리값 입력 후 nextLine()로 문자열 입력받을 때 */
        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 : " + num2);           //      \n 개행문자가 남아있게된다.

        System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");

//        sc.nextLine();

        String str2 = sc.nextLine();    // 이게 행을 바꾸지 않고 그냥 한줄 전체를 읽는다고 판단이 돼버리는 것
        System.out.println("str2 : " + str2);

        /* (석현)여기에서는 공백이 있는 문자열을 적은 다음에 엔터를 눌렀는데
        원래는 브레이크인 sc.nextLine()이 작동하지 않고
        쭉 내려가서 str2: 까지 먹어버린 것.
        즉 개행문자 sc.nextLine()이라는 브레이크를 잘 써야한다.*/





















    }
}
