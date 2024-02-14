package com.ohgiraffers.level02.normal.book.run;

import com.ohgiraffers.level02.normal.book.model.vo.BookVO;

public class Application {
    public static void main(String[] args) {
        BookVO VO1 = new BookVO();

        VO1.printInformation();
        System.out.println();

        BookVO VO2 = new BookVO("자바의 정석","도우출판","남궁성");

        VO2.printInformation();
        System.out.println();

        BookVO VO3 =new BookVO("홍길동전","활빈당","허균",5000000,0.5);

        VO3.printInformation();

    }
}
