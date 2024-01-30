package com.ohgiraffers.출력클래스;

import java.util.Scanner;

public class 문제2 {
    public static void main(String[] args) {
        /* Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 10의 자리와 1의 자리가 같은지 판별하여
         출력하는 프로그램을 작성하세요. */
        /*10의 자리: 1
        1의 자리: 1
        같은 숫자입니다.

        or

        10의 자리: 4
        1의 자리: 3
        같은 숫자가 아닙니다.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("2자리의 정수를 입력하세요: ");
        char num1 = sc.nextLine().charAt(0);
        char num2 = sc.nextLine().charAt(1);

        System.out.println("10의 자리 : " + num1);
        System.out.println("1의 자리 : " + num2);



















    }



}
