package com.ohgiraffers.hw1.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class AscBookTitle implements Comparator<BookDTO> {

    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }



//    public int compare(BookDTO o1, BookDTO o2) {
//        int result = 0;
//
//        if (o1.getbNo() > o2.getbNo()) {
//            result = 1;
//        } else if (o1.getbNo() < o2.getbNo()) {
//            result = -1;
//        } else {
//            result = 0;
//        }
//        return result;
//    }
}
