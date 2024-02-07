package com.ohgiraffers.section01.polymorphism;

public class application3 {
    public static void main(String[] args) {
        application3 app3 = new application3();

        Animal animal1 = new Cat();
        Animal animal2 = new Tiger();

        app3.feed(animal1);                     // 동일한 타입이기 때문에 가능함
        app3.feed(animal2);

        Cat animal3 = new Cat();
        Tiger animal4 = new Tiger();


        /* up-casting */
        app3.feed((Animal)animal3);             // 명시적 형변환
        app3.feed((Animal)animal4);

        app3.feed(animal3);                     // 묵시적 형변환
        app3.feed(animal4);

        app3.feed(new Cat());
        app3.feed(new Tiger());
    }
    public void feed(Animal animal) {
        animal.eat();
    }


    /* Animal 타입이 아니었으면 이런식으로 따로따로 2개를 써줬어야 했음 */
//    public void feed(Cat cat) {
//
//    }
//    public void feed(Tiger tiger) {
//
//    }

}
