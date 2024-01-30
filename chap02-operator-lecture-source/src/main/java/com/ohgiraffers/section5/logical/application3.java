package com.ohgiraffers.section5.logical;

public class application3 {
    public static void main(String[] args) {

        /* AND 연산관 OR 연산의 특징
        * 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
        *   조건식 2개가 모두 만족해야 true를 반환하기 때문에
            앞의 결과가 false가 나오면 뒤의 조건을 확인 할 필요 없이 flase를 반환한다.
            따라서 연산 횟수를 줄이기 위해서는 앞에 false가 나올 가능성이 높은 조건을 작성한다.
        * 논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행 안함
        *   조건식 하나만 만족해도 true를 반환하기 떄문에
            앞의 결과가 true가 나오면 뒤의 조건을 확인 할 필요 없이 true를 반환한다.
            따라서 연산 횟수를 줄이기 위해서는 앞에 true가 나올 가능성이 높은 조건을 작성한다.
        * */

        int num1 = 10;

        int result1 = (false && ++num1 > 0)? num1 : num1;
        /*(석현) = 조건문? true: false
        (false && ++num1 > 0) = 이게 조건문
        앞에는 true 일때 나오는 값 뒤에는 false 일때 나오는 값 */
        System.out.println("&&실행 결과 : " + result1);         // 10

        int num2 = 10;
        int result2 = (true || ++num2 > 0)? num2 : num2;
        System.out.println("|| 실행결과 : " + result2);         // 10

        int num3 = 10;
        int result3 = (++num3 > 0 && false)? num3 : num3;
        System.out.println("&&실행결과2 : " + result3);
        /*(석현)이게 무슨 의미냐면 아까 처음에 한거는 앞에 먼저 false가 나와버려서
        * 그 뒤에 수식이 작동이 안된건데
        * 이번 경우에는 수식이 먼저 작동되고 뒤에 false가 작동된거라 결과가 11이 된것!*/
    }
}
