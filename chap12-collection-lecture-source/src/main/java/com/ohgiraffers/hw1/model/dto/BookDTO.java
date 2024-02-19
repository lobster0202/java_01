package com.ohgiraffers.hw1.model.dto;

public class BookDTO {
    private int bNo;
    private int category;
    private String title;
    private String author;

    BookDTO() {}
    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }
    public int getbNo() {
        return bNo;
    }
    //return은 종료를 하는 메소드
    public void setbNo(int bNo) {
        this.bNo = bNo;
    }
    public int getCategory() {
        return category;
    }
    public void setCategory(int category) {
        this.category = category;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "도서 [" +
                "도서 번호 =" + bNo +
                ", 장르 분류 번호 =" + category +
                ", 도서 제목 ='" + title + '\'' +
                ", 도서 저자 ='" + author + '\'' +
                ']';
    }
}
