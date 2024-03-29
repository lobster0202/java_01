package com.ohgiraffers.section03.math;

import java.util.Random;

public class application3 {
    public static void main(String[] args) {

        /*java.util.Random 클래스 활용하여 난수 발생
        * java.until.random 클래스의 nextInt() 메소드를 이용한 난수 발생
        * nextInt(int bound): 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜 정수로 변환
        * */

        /* random.nextInt(구하려는 난수 갯수) + 구하려는 난수 최소값 */

        Random random = new Random();

        int randomNum1 = random.nextInt(10);            // 0 ~ 9 까지의 난수 발생
        System.out.println("0 ~ 9 난수 : " + randomNum1);

        int randomNum2 = random.nextInt(26) + 20;       // 20 ~ 45 까지의 난수 발생
        System.out.println("20 ~ 45난수 : " + randomNum2);
    }
}
