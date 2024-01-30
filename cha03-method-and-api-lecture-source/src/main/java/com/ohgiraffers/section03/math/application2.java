package com.ohgiraffers.section03.math;

public class application2 {
    public static void main(String[] args) {

        /* 난수의 활용
        * (int)(Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값 */
        int random1 = (int)(Math.random() * 10) ;       // 0 ~ 9까지 난수 발생
        System.out.println("0~9 난수 : " + random1);

        int random2 = (int)(Math.random() * 10) + 1;    // 1 ~ 10까지의 난수 발생
        System.out.println("1 ~ 10 난수 : " + random2);

        int random3 = (int)(Math.random() * 6) + 10 ;         // 10 ~ 15까지의 난수 발생

        /* 6개를 구하고 싶다면 0~0.9 에다가 6을 곱해보자
        그럼 0에서 5.4까지의 범위가 나오는데
        정수로 변환하게 되면 데이터 손실로 인해서 소수자리가 버려진다.
        따라서 0 ~ 5까지의 난수가 발생하게 되고
        거기에 구하려는 난수의 최소값인 10을 더하게 되면 10 ~ 15까지의 난수가 발생하는 것이다 */



    }
}
