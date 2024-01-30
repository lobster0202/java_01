package com.ohgiraffers.section01.method;

public class application8 {
    public static void main(String[] args) {
        // (석현)접근 제어자 , 스태틱 , 메소드 명

        /*static 메소드 호출
        * static이 있는 메소드이건 non-static 메소드이건 동작 흐름은 동일하다.
        *
        * static 메소드 호출 방법
        * 클래스명.메소드명();
        * */


        /* static 메소드는 호출방법이 다르다!
        static 메소드는 class 메소드라고 부르기도 한다.*/
        System.out.println("10과 20의 합 : " + application8.sumTwoNumbers(10,20) );

        /* 동일한 클래스 내에 작성된 static 메소드는 클래스명 생략 가능*/
        System.out.println("20과 30의 합 : " + sumTwoNumbers(20,30));
    }
    public static int sumTwoNumbers(int first, int second) {
        return first + second ;

    }
}
