package com.ohgiraffers.실습2;

public class 문제2 {
    public static void main(String[] args) {
        /*정수형 변수를 선언하여 점수를 저장하고,

         삼항 연산자를 사용하여 점수가 60점 이상이면 “합격입니다”,

         그렇지 않으면 “아쉽지만 불합격입니다.” 을 출력하는 프로그램을 작성해본다.

         ---

         출력예시

         합격입니다~~!!!

         또는 아쉽지만 불합격입니다….*/
//       ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        int a = 60;
        int b = 59;

        String result1 = (a >= 60)? "합격입니다~~!!! " : "아쉽지만 불합격입니다….";
        String result2 = (b >= 60)? "합격입니다~~!!! " : "아쉽지만 불합격입니다….";

        System.out.println(result1);
        System.out.println(result2);
    }

}
