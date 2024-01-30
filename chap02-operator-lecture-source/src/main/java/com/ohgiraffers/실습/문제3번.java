package com.ohgiraffers.실습;

public class 문제3번 {
    public static void main(String[] args) {
        /*- 실습문제 3

    문자형 변수를 하나 선언하고 'a'를 대입한 후,
    문자 'a'가 가지는 유니코드값을 출력하세요.

    -- 출력 예시 --
    문자 a의 unicode : 97*/

        char ch = 'a';
        int ch2 = 'a';

        System.out.println("문자 a의 unicode : " + (ch+0) ); // (손석현)
        System.out.println("문자 a의 unicode : " + (int)ch ); // (우현이 형)출제자의 의도
        System.out.println("문자 a의 unicode : " + ch2 ); //  출제자의 의도
    }
}
