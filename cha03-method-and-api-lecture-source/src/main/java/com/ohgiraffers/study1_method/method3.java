package com.ohgiraffers.study1_method;

public class method3 {
    public void circleArea(double num1){

        System.out.println("원의 넓이 : " + (num1*num1*3.14));

//       (오답노트) 3.14가 실수형이기 때문에 double을 써야한다!
    }

    public double circleRound(double num1) {

        return 2 * 3.14 * num1 ;
    }
}
