package com.ohgiraffers.study1_method;

public class method1_2 {
    public static void main(String[] args) {
        /* 심화) 패키지 두 개를 만들어 패키지 1에는 메소드 클래스, 패키지2에는 출력 클래스(메인)만 하여 프로그램 작성.

         1. **두 정수 A와 B의 값을 선언하고 +, -, *, /를 수행하는 각 메소드를 생성하여 프로그램을 작성하고 이 메소드를 호출하여 결과를 출력하세요.**
         - 실행결과 예시
        더하기: 30
        빼기: 10
        곱하기: 200
        나누기: 2 */
    }
    public void plusMethod(int num1, int num2){
        int result = num1 + num2;

        System.out.println("더하기 : " + result);
    }

    public void minusMethod(int num1, int num2){
        int result = num1 - num2;

        System.out.println("빼기 : " + result);
    }

    public void multipeMethod(int num1, int num2){
        int result = num1 * num2;

        System.out.println("곱하기 : " + result);
    }

    public void divideMethod(int num1, int num2){
        int result = num1 / num2;

        System.out.println("나누기 : " + result);
    }
}
