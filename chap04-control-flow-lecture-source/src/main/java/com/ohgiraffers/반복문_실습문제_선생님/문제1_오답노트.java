package com.ohgiraffers.반복문_실습문제_선생님;

import java.util.Scanner;

public class 문제1_오답노트 {
    public static void main(String[] args) {
        /* 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num ; i++ ) {
            if (i % 2 == 0) {
                sum += i ;

//            } else {
//                sum += 0; (오답노트) 이거 안적어도 됐네?
            }
        }
        System.out.println("1부터 10까지 짝수의 합 : " + sum);
    }
}
