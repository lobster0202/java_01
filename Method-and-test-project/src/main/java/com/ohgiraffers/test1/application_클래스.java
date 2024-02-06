package com.ohgiraffers.test1;

public class application_클래스 {
    public static void main(String[] args) {
        /*1. 기본자료형 8개를 선언과 동시에 초기화 한다.
         2. 서로다른 자료형 값을 +연산하여 <강제형변환>을 이용하여 알맞는 변수에 담아준다. (1개만)
         3. 결과값을 삼항연산자를 활용하여 양수면 "양수입니다" 음수면 "음수입니다" 나올 수 있도록 코드작성.*/


     /*1번 문제 */
     byte bnum = 1;
     short snum = 1;
     int inum = 1;
     long lnum = 1L;

     float fnum = 1.0f;
     double dnum = 1;

     char ch = 'a';

     boolean isTrue = true;

     /* 2번 문제 */
     double num1 = 2.2;
     int num2 = 1 + (int)num1;
     int num3 = 1 - ch;

     /* 3번 문제 */
     String result = (num3 > 0)? "양수입니다." : "음수입니다.";
     System.out.println(result);





    }
}
