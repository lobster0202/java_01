package com.ohgiraffers.section01.method;

public class application5 {
    public static void main(String[] args) {

        /* 메소드 리턴에 대해 이해할 수 있다.
        * return이란?
        * 모든 메소드 내부에는 return; 이 존재한다.
        * void 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막 줄에 컴파일러가 자동으로 추가를 해준다.
        * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어이다.*/

        System.out.println("main() 시작");

        application5 app5 = new application5();
        app5.testMethod();

        System.out.println("main() 종료");
    }
    public void testMethod() {
        System.out.println("testMethod() 동작 확인");

        /* 컴파일러에 의해 자동으로 추가되는 구문이다.
        * 가장 마지막에 작성해야 하고, 마지막에 작성되지 않을 경우 컴파일 에러를 발생시킨다.*/

        return; /* (석현)원래 항상 메소드 구문 마지막에는 return 구문이 있어야 하는데
        void 같은 경우는 return값이 없기 때문에 안써도 됨
        return 구문은 항상 메소드 마지막에 적어야 함! 안적으면 오류발생*/
    }
}
