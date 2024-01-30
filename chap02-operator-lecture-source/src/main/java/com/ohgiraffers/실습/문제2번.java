package com.ohgiraffers.실습;

public class 문제2번 {
    public static void main(String[] args) {
        /*- 실습문제 2

     사각형의 넓이와 둘레를 구하여 출력합니다.
    너비 12.5 높이 36.4를 변수에 저장하고,
    넓이와 둘레를 계산한 뒤 변수에 담아 아래와 같이 출력하세요.

    -- 출력 예시 --

    면적 : 455.0
    둘레 : 97.8*/

        double a = 12.5;
        double b = 36.4;

        System.out.println("면적 : " + (a*b));
        System.out.println("둘레 : " + (a+b)*2);
    }
}
