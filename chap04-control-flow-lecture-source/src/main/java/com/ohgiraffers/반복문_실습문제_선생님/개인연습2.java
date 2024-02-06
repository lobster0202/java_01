package com.ohgiraffers.반복문_실습문제_선생님;

import java.util.Scanner;

public class 개인연습2 {
    /* 정수를 입력받아 1부터 입력받은 정수까지
     * 홀수이면 "토", 짝수이면 "마"가 정수만큼 누적되어 출력되도록 하세요.
     *
     * -- 입력 예시 --
     * 정수를 입력하세요 : 5
     *
     * -- 출력 예시 --
     * 토마토마토
     * */



    //(참고!) 삼항연산자를 사용하여 코드를 줄일 수도 있다!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int j = sc.nextInt();

        for(int i =1; i <= j; i++) {
            String result = (i % 2 == 1)? "토" : "마";

            System.out.print(result);
        }
    }
}
