package com.ohgiraffers.level02.normal.book.model.vo;

public class BookVO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookVO() {

    }
    public BookVO(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;

    }
    public BookVO(String title, String publisher, String author, int price, double discountRate){
        this(title, publisher, author);     //이거 위에꺼에서 이미 3개를 해서 이렇게 3개만 가능한것       //this는 같은 클래스내에서 생성자 호출할때 쓰는거라서
        //super 부모클래스 생성자 호출
        this.price = price;
        this.discountRate = discountRate;

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
        System.out.println(title + ". " + publisher + ". " + author + ". " + price + ". " + discountRate);

    }




}
