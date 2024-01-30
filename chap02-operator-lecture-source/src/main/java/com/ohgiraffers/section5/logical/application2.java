package com.ohgiraffers.section5.logical;

public class application2 {
    public static void main(String[] args) {

        /*논리 연산자의 우선순위
        * && : 11순위
        * || : 12순위
        * */

        int num1 = 55;
        /*
        * 1 <= 변수 <= 변수 (X)
        * 1 <= 변수 && 변수 <= 100*/
        System.out.println("인1부터 100사이지? : " + (1 <= num1 && num1 <= 100));   // true
        //(석현) 위에 범위 쓰는거 엑셀에서 배운거임! 기억하자!

        int num2 = 175;
        System.out.println("1부터 100사이인지? : " + (1 <= num2 && num2 <= 100));  // false

        /* 영어 대문자인지 확인 */
        /* 문자 변수 >= 'A' && 문자변수 <= 'Z'*/
        char ch = 'T';
        System.out.println("영어 대문자인지? : " + ( ch >= 'A' && ch <= 'Z'));     // ture

        char ch2 = 'w';
        System.out.println("영어 대문자인지? : " + ( ch2 >= 'A' && ch2 <= 'Z'));   // false

        /* 대소문자 상관없이 영문자 'y'인지 확인 */
        char ch3 = 'Y';
        System.out.println("영문자 y인지? : " + (ch3 == 'Y' || ch3 == 'y'));     // true

        /*영문자인지 확인
        * A ~ Z : 65 ~ 90
        * a ~ z : 97 ~ 120
        */
        char ch5 = 'f';
        System.out.println("영문자인지 확인: " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >='a' && ch5 <= 'z')));   // true
        System.out.println("영문자인지 확인: " + ((ch5 >= 65 && ch5 <= 90) || (ch5 >=97 && ch5 <= 120)));      // true
    }
}
