package com.ohgiraffers.반복문_실습문제_선생님;

import java.util.Scanner;

public class 개인연습1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++ ) {
            if (i % 2 ==0) {
                sum += i;
            }
            else if (i % 3 == 0) {
                sum += i;
            } else {
                sum += 0;
            }

        }
        System.out.println("합 : " + sum);
    }
}





