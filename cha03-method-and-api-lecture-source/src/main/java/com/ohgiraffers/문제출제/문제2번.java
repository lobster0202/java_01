package com.ohgiraffers.문제출제;

public class 문제2번 {
    public static void main(String[] args) {

        /*정수형 변수에 임의의 값을 저장하고, 그 수가 짝수인지 홀수인지 판별하는 메소드를 작성하세요.
         결과를 출력할 때는 "짝수" 또는 "홀수"라는 문자열을 사용하세요.

         예시) 수는 8, 짝수입니다.*/
        int num = 8;

       문제2번 app = new 문제2번();

       app.testMethod(num);

    }

    public void testMethod (int num) {
        String result = (num % 2 == 0)? "짝수" : "홀수";
        System.out.println("수는 " + num + ", " + result + "입니다.");

    }

}
