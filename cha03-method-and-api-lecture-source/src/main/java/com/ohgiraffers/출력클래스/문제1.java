package com.ohgiraffers.출력클래스;

public class 문제1 {
    public static void main(String[] args) {
     /* 두 정수 A와 B의 값을 입력받아 +, -, *, /를 수행하는   프로그램을 작성하세요. */
        /* 첫번째 정수 : 6
        두번째 정수 : 2
        합 : 8
        차 : 4
        곱 : 12
        나눗셈 : 3 */

        문제1 app = new 문제1();
        app.testMethod(6,2);
    }
    public void testMethod(int A, int B) {

        int sum = A + B ;
        int minus = A - B;
        int multiple = A * B;
        int divide = A / B;

        System.out.println("합 : " + sum);
        System.out.println("차 : " + minus);
        System.out.println("곱 : " + multiple);
        System.out.println("나눗셈 : " + divide);
    }
}
