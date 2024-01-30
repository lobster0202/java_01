package com.ohgiraffers.실습2;

public class 문제4 {
    public static void main(String[] args) {
        /*실수를 변수로 선언하여 점수를 저장하고, 이를 정수로 변환하여

         점수가 90점 이상이면 ”A”,

         80점 이상이면 “B”,

         70점 이상이면 “C”,

         60점 이상이면”D”,

         60점 미만이면 “F”를 출력하는 프로그램을 작성해본다.*/
        /*출력예시

         홍길동의 이번 점수등급은 B입니다.*/
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        double score = 100;
        int intScore = (int)score;

//      (오답노트) (int)score 라고 적어도 형 변환이 가능함!

        String rank = (intScore>=90)? "A" : (intScore>=80)? "B" : (intScore>=70)? "C" : (intScore>=60)? "D" : "F";

        System.out.println("홍길동의 이번 점수 등급은 " + rank + "입니다.");
    }
}
