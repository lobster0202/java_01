package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {
        /* try-catch 블럭을 이용한 예외처리 방법 */

        ExceptionTest et = new ExceptionTest();


        try {
            et.checkEnoughMoney(10000,50000);
            System.out.println("=============== 상품 구입 가능 ===================");
        } catch (Exception e) {             // Exceoption e는 예외가 발생했을 때 해당 예외를 잡아서 처리하는데 사용되는 코드 구문
            System.out.println("================= 상품 구입 불가 =================");
        }
        System.out.println("프로그램을 종료합니다.");







    }
}
