package com.ohgiraffers.section01.method;

public class application2 {
    public static void main(String[] args) {


        // (석현)부메랑 같은 느낌
        // 지금 당장 메소드 순서를 이해하는건 괜찮은데
        // 메소드 끝 부분은 ';'이 아니라 '{}'으로 끝난다는걸 기억해야 할듯
        System.out.println("main() 시작됨..");
        application2 app2 = new application2();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main() 종료됨..");
    }
    public void methodA() {
        System.out.println("methodA 호출됨");
        System.out.println("methodA 종료됨");
    }
    public void methodB() {
        System.out.println("methodB 호출됨");
        System.out.println("mehtodB 종료됨");
    }
    public void methodC() {
        System.out.println("methodC 호출됨");
        System.out.println("methodC 종료됨");
    }
}
