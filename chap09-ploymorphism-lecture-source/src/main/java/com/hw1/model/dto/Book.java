package com.hw1.model.dto;

public class Book {
    private String titile;
    private String author;
    private String publisher;

    public Book() {

    }
    public Book(String titile, String author, String publisher) {
        this.titile = titile;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titile='" + titile + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
