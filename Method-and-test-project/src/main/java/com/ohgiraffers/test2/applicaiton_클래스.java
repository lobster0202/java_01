package com.ohgiraffers.test2;

import com.ohgiraffers.test1.testMethod클래스;

/*1. Calculator 메소드를 호출한다.

 2. CircleArea 메소드를 호출하여 출력해본다.
 ---- 출력 예시 ----
 원의 부피는 ~~~ 입니다.

 3. TestRandom 메소드를 변수에 저장하고 리턴값이 출력되도록 출력문 작성.

 단, 다른 패키지에서의 메소드 호출이기 때문에 풀클래스 네임을 적어주거나
 또는 임포트를 해야하는데 임포트 하는 방식을 사용한다.*/

public class applicaiton_클래스 {
    public static void main(String[] args) {

        /* 1번 문제 */
        testMethod클래스.calculator(30,5);

        /* 2번 문제 */
        double result1 = testMethod클래스.CircleArea();
        System.out.println("원의 부피는 " + result1 + "입니다.");

        /* 3번 문제 */
        String result2 = testMethod클래스.TestRandom();
        System.out.println(result2);

    }
}
