package com.ohgiraffers.조건문_실습문제_선생님;

import java.util.Scanner;

public class 문제1_오답노트 {
    public static void main(String[] args) {
        /* 판다가 축제 아르바이트를 시작했습니다.
         * 맥주를 판매하려면 성인인지 확인을 해야 해요.
         *
         * '나이가 어떻게 되세요?'를 출력하고 나이(정수)를 입력받아,
         * 성인이 면 '판매 가능합니다.'를 출력하고,
         * 미성년자이면 '판매 불가능합니다. 음료 코너에서 골라주세요.' 를 출력하세요.
         *
         * -- 입력 예시 --
         * 성인이십니까? 21
         *
         * -- 출력 예시 --
         * 판매 가능합니다.
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("나이가 어떻게 되세요? ");
        int age = sc.nextInt();
        if (age <= 19) {
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요.");
        } else{
            System.out.println("판매 가능합니다.");

            sc.close();     // 메모리 절약에 효과가 있음
        }
    }
}
