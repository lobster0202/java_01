package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class application2 {
    public static void main(String[] args) {
        /*[LinkedHashSet 클래스]
        * HashSet이 가지는 기능을 모두 가지고 있고
        * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
        * JDK 1.4 부터 제공하고 있다. */

        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println("lhset : " + lhset);

        // TreeSet을 사용하여 오름차순으로 나오게 만들 수도 있음
        TreeSet<String> tset = new TreeSet<>(lhset);
        System.out.println("tset : " + tset);
    }
}
