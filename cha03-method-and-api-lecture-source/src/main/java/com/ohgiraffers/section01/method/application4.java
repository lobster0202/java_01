package com.ohgiraffers.section01.method;

public class application4 {
    public static void main(String[] args) {
        /* 여러 개의 전달인자를 이용한 메소드 호출 테스트 */

        application4 app4 = new application4(); // 객체생성이 먼저!
        app4.testMethod("손석현",27,'남');
//        app4.testMethod(27,"손석현",'남');
    // 값의 갯수는 맞지만 순서가 다르게 전달되면 호출하지 못한다.

        char gender = '남';
        int age = 27;
        String name = "손석현";

        System.out.println("당신의 이름은 " + name + "이고, 나이는" + age + "세 이며, 성별은 " + gender + "입니다.");

        app4.testMethod(name,age,gender);

    }
    // 상수를 매개변수로 사용할 수 있다.
    public void testMethod(String name, int age, final char gender) {

        /*매개변수도 일종의 지역변수로 분류된다.
        * 매개변수 역시 final 키워드를 사용할 수 있다.
        * 지역변수에 final 키워드를 붙여 상수를 만드는 것과 동일하다.
        * final 매개변수는 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다.*/

        age = 20;
//        gender = '남'; // (석현) 똑같은 값이어도 변경하는 걸로 판단되어 쓰는거 자체가 불가능함
        name = "홍길동";


        System.out.println("당신의 이름은 " + name + "이고, 나이는" + age + "세 이며, 성별은 " + gender + "입니다.");
    }

}
