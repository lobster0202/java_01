package com.ohgiraffers.section01.method;

public class application9 {
    public static void main(String[] args) {

        /* 다른 클래스에서 작성한 메소드 호출 */

        int first = 100;
        int second = 50;

        /* non-static 메소드의 경우
        * 클래스가 다르더라도 사용하는 방법은 동일
        * 클래스명 사용할 이름 = new 클래스명();
        * 사용할 이름.메소드명(); */


        /* (석현) 다른 클래스를 가져와서 사용하려면 객체를 생성해줘야 함
         스태틱이 없는 메소드임 */

        calculator calc = new calculator();
        int min = calc.minNumberOf(first,second);

        //not-static은 참조값을 통해서 메소드를 호출했음

        System.out.println("두 수 중 최소값은 : " + min);

        /* static 메소드인 경우
        * 다른 클래스에 작성한 static 메소드의 경우 호출 할 때 클래스명을 반드시 기술
        * 클래스명.메소드명(); */

//        int max = maxNumberOf(first,second);
        int max = calculator.maxNumberOf(first,second);
        System.out.println("두 수 중 최대값은 : " + max);

        /* non-static과 static의 차이
        non-static은 객체를 만들어서 사용 가능하지만
        static은 다른 클래스에서 가져오는게 가능해서 아예 객체를 따로 만들거나 하진 않음

        static도 객체로 만들어서 호출 가능하긴 한데 추천하진 않음
        왜냐하면 객체는 결국 다 공유하는건데
         */

        int max2 = calc.maxNumberOf(first,second);      // static 메소드는 static에 접근하는 방법을 사용하라고 경고 메세지가 뜬다.
        System.out.println("두 수 중 더 큰 값은 : " + max2);   // 하지만 정상적으로 실행은 가능하다.

    }
}
