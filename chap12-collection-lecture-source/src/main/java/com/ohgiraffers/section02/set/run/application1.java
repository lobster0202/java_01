package com.ohgiraffers.section02.set.run;

import java.util.*;

public class application1 {
    public static void main(String[] args) {

        /* [set 인터페이스를 구현한 Set 컬렉션 클래스의 특징]
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복 저장을 허용하지 않는다.
        *
        * [HashSet 클래스]
        * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        * JDK 1.2 부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다. */

        HashSet<String> hset = new HashSet<>();
//        Set hset2 = new HashSet();
//        Collection hset3 = new HashSet();

        hset.add("java");
        hset.add("oracle");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");

        System.out.println("hset : " + hset);

        // (석현) Set은 중복 저장자체를 허용하지 않음
        hset.add("java");
        System.out.println("hset : " + hset);
        System.out.println("저장된 객체수 : " + hset.size());
        System.out.println("포함확인 : " + hset.contains("oracle"));

        // (석현) contatins() : 주어진 컬렉션 또는 문자열이 특정 요소 또는 문자열을 포함하고 있는지 여부를 확인하는 데 사용


        /* toArray() : HashSet 에 저장된 모든 요소를 포함하는 새로운 'Object'타입의 배열 반환 */
        Object[] arr = hset.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        /* iterator() : Collection 인터페이스의 메소드로, Collection에 저장된 요소들을
        *               순차적으로 접근하는데 사용되는 Iterator를 반환한다.*/
        Iterator<String> iter = hset.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        hset.clear();       // hset안에 입력된 값들 지우는 메소드
        System.out.println(hset.isEmpty());











    }
}
