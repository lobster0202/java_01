package com.ohgiraffers.실습2;

public class 문제1 {
    public static void main(String[] args) {
        /*두 개의 정수형 변수를 선언하고, 삼항 연산자를 사용하여

        두 수 중 큰 수를 출력하는 프로그램을 작성해본다.

        ---

                출력예시

        두 수 중 큰 수는 20입니다.*/
//      ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

        int a = 10;
        int b = 20;

        String result1 = (a > b)? "10입니다." : "20입니다.";

        System.out.println("두 수 중 큰 수는 " + result1 );
    }
}
