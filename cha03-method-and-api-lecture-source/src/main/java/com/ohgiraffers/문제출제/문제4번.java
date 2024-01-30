package com.ohgiraffers.문제출제;

public class 문제4번 {
    public static void main(String[] args) {
        /*세 개의 정수형 변수를 선언하고, 최대값과 최소값을 구하는 메소드를 만들어 보세요.*/

        문제4번 app = new 문제4번();
        app.maxMethod(8,9,10);
        app.minMethod(8,9,10);

    }
    public void maxMethod (int first, int second, int third ) {
        String result1 = (first > second)? "first": (second > third)? "third" : "second";

//        Math.max( Math.max(first ,second), third);

        System.out.println(result1);

    }

    public void minMethod (int first, int second, int third ) {
        String result2 = (first > second)? "second": (first > third)? "third" : "first";

//        Math.min(Math.min(first, second),third);
        System.out.println(result2);

    }
}
