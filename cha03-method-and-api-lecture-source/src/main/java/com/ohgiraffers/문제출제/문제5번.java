package com.ohgiraffers.문제출제;

public class 문제5번 {
    public static void main(String[] args) {

        /*국어, 영어, 수학 세 과목의 점수를 입력 받아, 총점과 평균을 구하는 메소드를 만들어 보세요. */


        문제5번 app = new 문제5번();
        app.sumScore(60,70,80);
        app.averageScore(60,70,80);
    }

    public void sumScore(int korean, int english, int math) {
        int result = (korean + english + math);

        System.out.println("국어 : " + korean + " 영어 : " + english + " 수학 :" + math);
        System.out.println("총점 : " + result );
    }

    public void  averageScore(int korean, int english, int math) {
        int result = (korean + english + math)/3;

        System.out.println("국어 : " + korean + " 영어 : " + english + " 수학 :" + math);
        System.out.println("평균 : " + result );
    }










}
