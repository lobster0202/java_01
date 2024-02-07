package com.ohgiraffers.section01.polymorphism;

public class application4 {
    public static void main(String[] args) {

        application4 app4 = new application4();
        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();







    }
    public Animal getRandomAnimal() {
        int random = (int)(Math.random() * 2 );
        return random == 0? new Cat() : new Tiger();
    }
}
