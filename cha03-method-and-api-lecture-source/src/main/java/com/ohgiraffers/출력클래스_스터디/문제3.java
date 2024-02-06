package com.ohgiraffers.출력클래스_스터디;

import java.util.Scanner;

public class 문제3 {
    public static void main(String[] args) {
        /**심화) Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력 받아 5만 원권, 1만 원권, 천 원권, 100원짜리 동전, 10원짜리 동전,
         1원짜리 동전 각 몇 개로 변화되는지 출력하세요.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("돈의 액수를 입력하세요 : ");
        int money = sc.nextInt();

        int cost50000 = money / 50000;
        int cost10000 = (money % 50000) / 10000;
        int cost1000 = ((money % 50000) % 10000) / 1000;
        int cost100 = (((money % 50000) % 10000) % 1000) / 100;
        int cost10 = ((((money % 50000) % 10000) % 1000) % 100)/10;
        int cost1 = (((((money % 50000) % 10000) % 1000) % 100) % 10) / 1;

        System.out.println("입력하신 돈은");
        System.out.println("5만원권으로 " + cost50000 + "개");
        System.out.println("1만원권으로 " + cost10000 + "개");
        System.out.println("1000원 권으로 " + cost1000 + "개");
        System.out.println("100원짜리 동전으로" + cost100 + "개");
        System.out.println("10원짜리 동전으로" + cost10 + "개");
        System.out.println("1원짜리 동전으로" + cost1 + "개");
        System.out.println("나옵니다.");
    }
}
