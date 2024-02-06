package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_doWhile {
    /*
    * [do-while문 표현식]
    * 초기식;
    * do {
    *       1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여
    *       만족하는 경우 수행 할 구문
    *       증감식
    * } while(조건식);
    * */

    public void simpleDoWhileStatement() {

        do {
            System.out.println("최초 한번 동작함");

        } while(false);

        System.out.println("반복문 종료 확인");
    }

    public void testDoWhileExample1() {
        /* 스캐너로 문자열 입력 받아 반복적 출력
        * 단, exit가 입력되면 반복문을 종료한다. */
        Scanner sc = new Scanner(System.in);
        String str = "";

        do {
            System.out.print("문자열을 입력해 주세요 : ");
            str = sc.nextLine();
            System.out.println(str);
            /* equals() : 문자열을 비교하는 기능 제공 */
//            while(str == "exit");
        } while(!str.equals("exit"));
//        } while(str == "exit");

        /* (석현) == 이랑 equals는 비교하는 값이 다르다.
        * 문자열은 원래 == 으로 비교가 안됨 */
        System.out.println("반복문 종료");
    }
}
