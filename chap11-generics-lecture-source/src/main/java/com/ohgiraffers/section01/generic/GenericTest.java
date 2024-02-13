package com.ohgiraffers.section01.generic;

public class GenericTest <T> {
    // (석현) 다른 대문자를 사용해도 상관없지만 관례상 대문자로 사용한다

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }


}
