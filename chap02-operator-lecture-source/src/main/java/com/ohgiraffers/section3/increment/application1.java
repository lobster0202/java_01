package com.ohgiraffers.section3.increment;

public class application1 {
    public static void main(String[] args) {

        /* 필기.
        * 증감연산자
        * 피연산자의 앞 or 뒤에 사용이 가능하다.
        * '++' : 1 증가의 의미
        * '--' : 1 감소의 의미
        * */

        //(석현) 단항으로 사용할떄는 앞에 쓰던 뒤에 쓰던 똑같다.
        int num = 20;
        System.out.println("num : " + num);

        num++;      // 1 증가
        System.out.println("num : " + num);

        ++num;      // 1 증가
        System.out.println("num : " + num);

        num--;      // 1 감소
        System.out.println("num : " + num);

        --num;      // 1 감소
        System.out.println("num : " + num);

        /* 주의사항.
        *  증감연산자는 다른 연산자와 함께 사용할 떄 의미가 달라진다는 것이다.
        * 다른 연산자와 함께 사용할 때 증감 연산자의 의미
        * 'var++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴
        * '++var' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함
        * 'var--' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1감소시킴
        * '--var' : 피연산자의 값을 먼저 1을 감소시킨 후 다른 연산을 진행함
        * */

        int firstNum = 20;

        int result1 = firstNum++ *3;        // 다른 연산을 먼저 처리하고 마지막에 증가 처리가 됨
        /* (석현) result1 에는 1증가가 반영된게 아님
        * [순서] result1 = 20 * 3 -> firstNum = 20 + 1 이렇게만 된거라서 result1에는 반영되는게 아님!*/

        System.out.println("result1 : " + result1);
        System.out.println("firstNum : " + firstNum);

        int secondNum = 20;                 // 증가를 먼저 처리하고 난 뒤 다른 연산을 함
        int result2 = ++secondNum * 3 ;
        System.out.println("result2 : " + result2);
        System.out.println("secondNum : " + secondNum);

        // (석현) 이게 어디에 쓰이냐 이런 것 보다는 앞 뒤에 '++'를 붙였을 때 어떤차이가 있냐를 생각하는게 좋음!
        int num1 = 10;                      // 아까랑 똑같은 원리
        int addNum = num1++;
        System.out.println("addNum : " + addNum);
        System.out.println("num1 : " + num1);
    }
}
