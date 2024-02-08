package com.ohgiraffers.section01.literal;
//그동안 배웠던거 합치고 나누고 등등 하는 시간
public class application3 {
    public static void  main(String[] args) {

        System.out.println("=========== 두개의 문자열 합치기 =========");
        System.out.println(9 + 9);      // 18
        System.out.println("9" + 9);    // 문자열과 숫자를 합칠경우 둘 다 문자열로 취급하기 때문에 문자열 "99"가 나온다
        System.out.println(9 + "9");    // 위랑 이거랑 같음
        System.out.println("9"+"9");    // 99

        System.out.println("============== 세개의 문자열 합치기 ============");
        System.out.println(9 + 9 + "9"); // 189 '+' 연산 방향은 왼쪽에서 오른쪽으로 간다.(숫자부터 합쳐짐)
        // 그래서 왼쪽에서 연산을 마친 후 -> 18을 문자열로 판단한뒤 뒤에 문자열 "9"와 합쳐져서 문자열 "189"가 나온다.
        System.out.println(9 +"9" + 9);     // 999
        System.out.println("9" + 9 + 9);    // 999 /얘는 문자열 "9" 를 처음에 받아들여서 이어붙이기 기능이 작동하게 된것

        System.out.println("9" + (9 + 9));  // 918

        System.out.println("========= 10과 20의 사칙연산 결과 ========");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("=========== 10과 20의 사칙연산 결과 보기 좋게 출력 ==========");
        System.out.println("10과 20의 합 : " + (10 + 20));     // 주의사항. 괄호를 묶지 않으면 문자열 합치기가 일어나서 결과가 1020이 된다.
        System.out.println("10과 20의 차 : " + (10 - 20));
        // 문자열은 마이너스 연산이 불가능하기에 앞에서 생성된 문자열과 마이너스 연산이 불가하다.(반드시 괄호를 해줘야 함)
        // 문자열에서는 -가 작동되지 않으니 괄호로 묶어야한다.
        System.out.println("10과 20의 곱 : "+ (10 * 20));
        System.out.println("10과 20을 나누기 한 몫 : "+ (10 / 20));
        System.out.println("10과 20을 나누기 한 나머지 : " + (10 % 20));

        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println(123 + 45 + "기차" + "출발");

    }

}
