package com.ohgiraffers.section5.logical;

public class application1 {
    public static void main(String[] args) {

        /* 논리연산자의 종류
        * 1. 논리 연결 연산자: 2개의 피연산자를 가지는 이항 연산자이며, 2개의 논리식을 판단하여 참과 거짓을 판단한다.
        * 1-1. &&(논리 AND) 연산자 : 2개의 논리식중 모두 참일 경우 참을 반환, 하나라도 거짓인 경우 거짓을 반환
        * 1-2. ||(논리 OR) 연산자 : 2개의 논리식중 하나라도 참일 경우 참을 반환, 둘 다 거짓일 경우 거진 반환
        * 2. 논리 부정 연산자 : 피연산자가 하나인 단항 연산자
        * 2-1. !(논리 NOT) 연산자 : 논리식의 결과가 참이면 거짓을, 거짓이면 참 반환
        * 나중에 NULL값 나올때 조건문에서도 많이 씀
        * 그리고 조건문이나 조건식 그런걸 많이 꾸미다 보면 나중가서 알고리즘 이라는 걸 만들게 되는데
        * 이게 연산식으로만 만드는게 아니고 나중가서 메소드라는 걸 배워서 알고리즘을 만들 수 있다
        * */

        System.out.println("true && true : " + (true && true));     // true
        System.out.println("true && false : " + (true && false));   // false
        System.out.println("false && true : " + (false && true));   // false
        System.out.println("false && false : " + (false && false)); // false

        System.out.println("true || true : " + (true || true));     // true
        System.out.println("true || false : " + (true || false));   // true
        System.out.println("false || true : " + (false || true));   // true
        System.out.println("false || false : " + (false || false)); // false

        System.out.println("true의 NOT 연산 : " + (!true));          // false
        System.out.println("false의 NOT 연산 : " + (!false));        // true
        //(질문) 보통 이런건 조건문에서 많이 쓰는지? 맞음 조건문에서 많이 씀

        /* 논리식에 논리 연산자 활용 */
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println("a < b && c < d : " + (a < b && c < d));     // true
        System.out.println("a < b && c > d : " + (a < b && c > d));     // false
        System.out.println("a > b && c < d : " + (a > b && c < d));     // false
        System.out.println("a > b && c > d : " + (a > b && c > d));     // false

        System.out.println("a < b || c < d : " + (a < b || c < d));     // true
        System.out.println("a < b || c > d : " + (a < b || c > d));     // true
        System.out.println("a > b || c < d : " + (a > b || c < d));     // true
        System.out.println("a > b || c > d : " + (a > b || c > d));     // false
    }
}
