package com.ohgiraffers.section06.statickeyword;

public class application {
    public static void main(String[] args) {

        /* static
        * 정적 메모리 영역에 프로그램이 start될 때 할당을 하는 키워드이다.
        * 인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있다.
        * 여러 인스턴스가 공유해서 사용할 목적의 공간이다.
        * 하지만 static 키워드의 남발을 유지보수와 추적이 힘든 코드를 작성하는 피해야 할 방식이다.
        * 명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제해야한다.
        * 의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때 이다. */

        StaticFieldTest sft1 = new StaticFieldTest();

        System.out.println(sft1.getNonStaticCount());           // 0
        System.out.println(sft1.getStaticCount());              // 0

        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println(sft1.getNonStaticCount());           // 1
        System.out.println(sft1.getStaticCount());              // 1

        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println(sft2.getNonStaticCount());           // 0        // non-Static 서로 공유되지 않기 때문에 0으로 다시 초기화 됐다.
        System.out.println(sft2.getStaticCount());              // 1        // Static은 서로 공유되기 때문에 초기화 되지 않고 공유된 값으로 나타낸다.

        /* non-static 메소드 호출 */
        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();

        /* static 메소드 호출 */
        smt.staticMethod();                                     // 권장하지 않음

        StaticMethodTest.staticMethod();                        //권장함






    }
}
