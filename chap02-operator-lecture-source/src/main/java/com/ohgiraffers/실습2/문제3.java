package com.ohgiraffers.실습2;

public class 문제3 {
    public static void main(String[] args) {
        /*정수형 변수를 선언하고, 삼항연산자를 사용하여

         입력된 수가 짝수인지 홀수인지 출력하는 프로그램을 작성해본다.

         /* 참고사항 : 조건식에 %를 활용하여 짝수인지 홀수인지를 판단해 보세요~~ */
        /*출력예시

         입력하신 수는 짝수입니다.

         또는 입력하신 수는 홀수입니다.*/
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        int a = 1;
        int b = 0;

        String result1 = (a % 2==1 )? "짝수" : "홀수";
        String result2 = (b % 2==1 )? "짝수" : "홀수";

//        (오답노트) ()안에 ==를 꼭 써야함!

        System.out.println(result1 + "입니다.");
        System.out.println(result2 + "입니다.");
    }
}
