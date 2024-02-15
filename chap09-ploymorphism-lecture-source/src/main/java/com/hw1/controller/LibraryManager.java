package com.hw1.controller;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

public class LibraryManager {
    private Member mem = new Member();

    private Book[] bList = new Book[5];

    public void insertMember(Member mem) {

    }
    public Member myInfo() {
        System.out.println("마이페이지");
    }
    public Book[] selectAll() {

    }
    public Book[] searchBook(String keyword) {

        return
    }
    public int rentBook(int index) {

        return
    }

    public Member getMem() {

        return mem;
    }

    public void setMem(Member mem) {

        this.mem = mem;
    }

    public Book[] getbList() {

        return bList;
    }

    public void setbList(Book[] bList) {

        this.bList = bList;
    }
}
