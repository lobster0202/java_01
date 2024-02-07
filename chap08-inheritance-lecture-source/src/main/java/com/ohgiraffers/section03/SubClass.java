package com.ohgiraffers.section03;

import com.ohgiraffers.section03.overriding.Superclass;

public class SubClass extends Superclass {

    /* 메소드 이름 변경 에러 */
//    @Override
//    public void method(int num) {}

    /* 메소드 리턴타입 변경 에러 */
//    @Override
//    public int method(int num) {
//        return 0;
//    }

    /* 매개변수 개수, 타입 변경 에러 */
    /* 매개변수 개수가 다르면 부모 클래스에서 연관된 문제라고 하면서 뜸 */
//    @Override
//    public void method(int num, String num) {}

    @Override
    public void method(int num) {}

    /* private 메소드는 오버라이딩 불가 */
//    @Override
//    private void privateMethod() {}

    /* final 메소드 오버라이딩 불가*/
//    @Override
//    public final void finalMethod() {}

    /* 부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 가능 */
//    @Override
//    void protectedMethod() {}           // 더 좁은 범위로 인식해서 불가능

//    @Override
//    protected void protectedMethod() {}     // 같은 범위 가능

    /* 위에나 아래꺼 둘중 하나는 주석 처리를 해야지 오류가 안남 */
    @Override
    public void protectedMethod() {}        // 더 넓은 범위 가능





















}
