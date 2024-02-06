package com.ohgiraffers.출력클래스_스터디;

import java.util.Random;

public class 문제4_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int random1 = random.nextInt(6)+1;
        int random2 = random.nextInt(6)+1;

        int sum = random1 + random2;

        System.out.println("첫번째 주사위 : " + random1);
        System.out.println("두번째 주사위 : " + random2);
        System.out.println("주사위의 합 : " + sum);

    }
}
