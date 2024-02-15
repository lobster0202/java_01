package com.ohgiraffers.section02.userexceoption;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnoughMoney(50000, 30000);
//            et.checkEnoughMoney(-50000,50000);
//            et.checkEnoughMoney(50000,-60000);

            et.checkEnoughMoney(30000,50000);
        } catch (Exception e) {
            e.printStackTrace();            // 예외가 발생했을 때 스택을 추적해주는 메소드
        }












    }
}
