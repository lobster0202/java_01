package com.ohgiraffers.study2_main;

import com.ohgiraffers.study1_method.method3;

public class main3 {
    public static void main(String[] args) {

    /* 정수형 변수에 반지름 길이의 값을 저장하고, 원의 넓이를 구하는 메소드 circleArea을 만들고, 원의 둘레를 구하는 메소드 circleRound를 만드세요.
     단, circleArea 메소드는 함수 안에서 출력문을 출력하고 circircleRound 메소드는 round 값을 리턴 받아서 main함수에 출력하세요.
     (원의 넓이 구하는 공식 : 3.14 * 반지름 * 반지름, 원의 둘레 구하는 공식 : 2 * 3.14 * 반지름)

    반지름 : 5
    원의 둘레 : 31.4
    원의 넓이 : 78.5 */

        int num1 = 5;
        method3 app = new method3();

        System.out.println("반지름 : " + num1);
        System.out.println("원의 둘레 : " + app.circleRound(5));
        app.circleArea(5);
    }
}
