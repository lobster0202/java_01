package com.ohgiraffers.section01.method;

public class application3 {
    public static void main(String[] args) {
        /* 전달인자(arguments)와 매개변수(parameter)를 이용한 메소드 호출 */

        /* 변수의 종류
         * 1. 지역변수
         * 2. 매개변수
         * 3. 전역변수(필드)
         * 4. 클래스(static) 변수
         * */

        /* 지역변수는 선언한 메소드 블럭 내부에서만 사용 가능하다. 이것을 지역변수의 스코프라고 한다.
         * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우
         * 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
         * 이 때 전달하는 값을 전달인자(argument) 라고 부르고,
         * 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter) 라고 부른다.*/

        application3 app3 = new application3();
        /* 전달인자와 매개변수를 이용한 메소드 호출 테스트 */
        app3.testMethod(40);
        // (석현) int 형으로 선언했기 때문에 괄호(parameter)안에 정수(arguments)를 써야한다.
//        app3.testMethod("40"); // 매개변수는 int형이지만 인자가 String형이기 때문에 에러
        //문자열을 쓰면 에러가 뜨는 것을 볼 수 있음
//        app3.testMethod(20,30,40); //매개변수는 int형 1개 이지만 인자는 3개이기 때문에 에러
        // 마찬가지로 갯수를 맞추지 않으면 에러가 뜸
//        app3.testMethod(); // 매개변수는 선언되어 있지만 인자로 값을 전달하지 않으면 에러
        // 아무것도 작성하지 않아도 에러가 뜸

        int age2 = 20;
        app3.testMethod(age2);

        /*/ (석현)위에꺼에서 int age를 40으로 해놔도
            다시 int age = 20; 을 써놔도 아무 문제없다.
            그 이유는 여긴 main 메소드고 아래는 테스트 메소드 이기 때문!
            그래서 이 상태에서 Run 눌러도 값은 똑같이 나옴!
            하지만? 지금 강의에서는 안헷갈리게 일단 age2로 쓴다*/


        /* 형변환 */

        byte byteAge = 10;
        app3.testMethod(byteAge);

        long longAge = 60;
//        app3.testMethod(longAge);     // 자동 형변환을 할 수 없어서 에러 발생
        app3.testMethod((int)longAge);  // 강제 형변환을 이용하여 자료형을 맞춘 후 호출 (데이터 손실 주의)

        /*선언한 변수보다 작은 변수를 사용하는 것은 지 알아서 형변환돼서 문제가 없다.
        * 하지만 큰 변수를 사용하면 강제 형변환을 사용해야한다. */


        /* 연산 */
        app3.testMethod(age2 * 4);
    }
    public void testMethod(int age) {

        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
