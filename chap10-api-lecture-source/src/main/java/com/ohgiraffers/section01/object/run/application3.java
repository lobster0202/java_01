package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class application3 {
    public static void main(String[] args) {
        /* hashcode 메소드 오버라이딩
        * Object 클래스의 명세에 작성된 일반 규약에 따르면
        * equals() 메소드를 재정의 하는 경우 반드시 hashCode() 메소드도 재정의 하도록 되어있다.
        * 만약 hashCode()를 재정의 하지 않으면 같은 값을 가지는 동등 객체는
        * 같은 해시코드 값을 가져야 한다는 규약에 위반되게 된다. (강제성은 없지만 규약대로 작성하는 것이 좋다.) */

// (석현) 명세 뜻:프로젝트나 제품의 요구사항, 기능, 동작 방식, 인터페이스 등을 명확하고 상세하게 설명한 문서나 스펙

        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(1,"홍길동전","허균",50000);

        System.out.println("book1의 hashCode : " + book1.hashCode());
        System.out.println("book2의 hashCode : " + book2.hashCode());






    }
}
