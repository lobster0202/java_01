package com.hw1.model.dto;

public class AniBook extends Book {
    private int accessAge;

    public AniBook() {

    }
    public AniBook(String title, String author, String publisher, int accessAge) {
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return "AniBook{" +
                "accessAge=" + accessAge +
                '}';
    }
}
