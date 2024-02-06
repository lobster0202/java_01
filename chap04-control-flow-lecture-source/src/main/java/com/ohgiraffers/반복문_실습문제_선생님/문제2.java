package com.ohgiraffers.반복문_실습문제_선생님;

import java.util.Scanner;

public class 문제2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int j = sc.nextInt();

        for (int i = 1; i <= j; i++) {
            if (i % 2 == 1) {
                System.out.print("토");
            } else {
                System.out.print("마");
            }
        }

    }

    }
