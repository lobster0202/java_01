package com.ohgiraffers.section01.method;

public class application7 {
    public static void main(String[] args) {

        /* 매개변수(parameter)와 리턴값 복합 활용 */

        /* (석현)아래 method에서 지정한 변수는 main에서 지정한 변수랑 다른거기 때문에
        main에서도 first가 있고 아래 plusTwoNumbers(int first, int second)에 first가 있다고 해서 둘이 똑같은 값인게 아니다.
        그래서 헷갈리지 않게 main 메소드에서는 firstNum이라고 다시 이름을 바꿨다. */
        int firstNum = 20;
        int secondNum = 10;

        application7 app7 = new application7();
        System.out.println("더하기 : "+ app7.plusTwoNumbers(firstNum,secondNum));
        System.out.println("빼기 : " + app7.minusTwoNumbers(firstNum,secondNum));
        System.out.println("곱하기 : " + app7.multipleTwoNumbers(firstNum,secondNum));
        System.out.println("나누기 : " + app7.divideTwoNumbers(firstNum,secondNum));
    }
    public int plusTwoNumbers(int first, int second) {

        return first + second;
    }
    public int minusTwoNumbers(int first, int second) {

        return first - second;
    }
    public  int multipleTwoNumbers(int first, int second) {

        return first * second ;
    }
    public int divideTwoNumbers(int first, int second) {

        return first/second;
    }
}
