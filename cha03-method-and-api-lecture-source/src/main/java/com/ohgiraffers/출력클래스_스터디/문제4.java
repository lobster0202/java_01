package com.ohgiraffers.출력클래스_스터디;

public class 문제4 {
    public static void main(String[] args) {
        /* Random 클래스를 이용하여 주사위 2개를 굴려 나온 수의 합을 구하고 출력하세요. */
        /*첫번째 주사위 : 5
         두번째 주사위 : 1
         주사위의 합: 6*/

        int random1 = (int)((Math.random() * 6)+1);
        int random2 = (int)((Math.random() * 6)+1);
        int sum = random1 + random2;

        System.out.println("첫번째 주사위 : " + random1);
        System.out.println("두번째 주사위 : " + random2);
        System.out.println("주사위의 합 : " + sum);
    }
}
