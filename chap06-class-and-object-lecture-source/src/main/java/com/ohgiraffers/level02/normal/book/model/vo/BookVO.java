package com.ohgiraffers.level02.normal.book.model.vo;

public class BookVO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public void BookVO() {

    }
    public void BookVO(String title, String publisher, String author) {

    }
    public void BookVO(String title, String publisher, String author, int price, double discountRate){

    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    // Getter
    public String getTitle() {
        return title;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getAuthor() {
        return author;
    }
    public int getPrice() {
        return price;
    }
    public double getDiscountRate() {
        return discountRate;
    }

    public void printInformation() {
        System.out.println();

    }




}
