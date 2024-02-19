package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.comparator.AscBookNo;
import com.ohgiraffers.hw1.comparator.DescBookNo;
import com.ohgiraffers.hw1.comparator.DescBookTitle;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.*;

public class BookManager {

    private ArrayList<BookDTO> booklist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public BookManager() {
        List<String> bookList = new ArrayList<>();
    }
    public void addBook(BookDTO book) {
        booklist.add(book);
    }
    public void deleteBook(int index) {
         booklist.remove(index);
    }
    public void searchBook(String title) {
        // 배열에 있는 값과 전달 받은 값이 일치 할 경우
        // 해당하는 값의 인덱스를 반환하는 메소드가 필요

        for (int i = 0; i < booklist.size() ; i++) {
            //(GPT) List와 title을 비교하는 방법
            // List.get(i)를 기억하자
            if (booklist.get(i).equals(title)) {
                System.out.println(booklist.get(i));
            } else {
                System.out.println("조회된 도서가 목록에 없습니다.");
            }
        }
    }
    public void displayAll() {
        if (booklist != null) {
            System.out.println(booklist);
        }else {
            System.out.println("출력 결과가 없습니다.");
        }
    }
    public List<BookDTO> sortedBookList(int type) {
        /* 1. 도서번호로 오름차순 정렬
        * 2. 도서번호로 내림차순 정렬
        * 3. 책 제목으로 오름차순 정렬
        * 4. 책 제목으로 내림차순 정렬 */

        switch (type) {
            case 1 : booklist.sort(new AscBookNo());
                System.out.println("========도서번호로 오름차순 정렬 ========");
                for (BookDTO book : booklist) {
                    System.out.println(book); break;
                }
            case 2 : booklist.sort(new DescBookNo());
                System.out.println("========도서번호로 내림차순 정렬 ========");
                for (BookDTO book : booklist) {
                    System.out.println(book); break;
                }
            case 3 : booklist.sort(new AscBookNo());
                System.out.println("========책 제목으로 오름차순 정렬 ========");
                for (BookDTO book : booklist) {
                    System.out.println(book); break;
                }
            case 4 : booklist.sort(new DescBookTitle());
                System.out.println("========책 제목으로 내림차순 정렬 ========");
                for (BookDTO book : booklist) {
                    System.out.println(book); break;
                }
        }
        return booklist;
    }
    public void printBookList(List<BookDTO> printList) {
        System.out.println(booklist);
    }


}
