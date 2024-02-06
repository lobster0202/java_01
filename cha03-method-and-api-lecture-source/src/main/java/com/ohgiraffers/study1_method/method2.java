package com.ohgiraffers.study1_method;

public class method2 {
    public void testMethod (int num) {
        String result = (num % 2 == 0)? "짝수" : "홀수";
        System.out.println("수는 " + num + ", " + result + "입니다.");
    }
}
