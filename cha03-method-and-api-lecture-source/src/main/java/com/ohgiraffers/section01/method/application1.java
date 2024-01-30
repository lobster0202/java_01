package com.ohgiraffers.section01.method;

public class application1 {
    public static void main(String[] args) {

        System.out.println("main() 시작됨..");
        /*메소드 호출 방법
        * 클래스명 사용할이름 = new 클래스명();      // 객체 생성
        * 사용할이름.메소드명();*/                 // 메소드 호출

        //마트료시카랑 똑같음

        application1 app1 = new application1();
        app1.methodA(); //(석현) 메소드 호출하는 방법 기억할것.
        System.out.println("mian() 종료됨..");

    }

    public void methodA() {
        System.out.println("methodA() 호출함..");

        //(석현)메소드 안에서 다른 메소드를 호출 하는 방식은 조금 다름
        methodB();
        System.out.println("methodA() 종료됨..");
    }


    public void methodB() {
        System.out.println("methodB() 호출함..");
        methodC();
        System.out.println("mehtodB() 종료됨..");
    }

    public void methodC() {
        System.out.println("methodC() 호출함..");

        System.out.println("methodC() 종료됨..");
    }




}
