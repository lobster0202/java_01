package com.ohgiraffers.section01.method;

public class calculator {

    // non-static
    public int minNumberOf(int first, int second) {

        return (first > second)? second : first;
    }
    // static
    public static int maxNumberOf(int first, int second) {

        return (first > second)? first: second;
    }
}
