package com.test;

import java.util.Scanner;

public class Person {
    /* 사람의 속성 : 이름(String), 나이(int), 국적(String), 강아지(클래스), --- 캡슐화 */
    private String name;
    private int age;
    private String country;
    private Dog myDog;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {

        String[] countryArr = {"한국","일본","중국","홍콩","터키"};
        for (int i = 0; i < countryArr.length; i++) {
            if (country.equals(countryArr[i])) {
                this.country = country;
                System.out.println(this.name + "의 나라는 " + this.country + "입니다.");
                return;
            }
        }
        System.out.println("확인되지 않은 국가입니다. 국적을 한국으로 자동 설정합니다.");

    }

    public Dog getMyDog() {
        return myDog;
    }

    public void setMyDog(Dog myDog) {
        this.myDog = myDog;
    }

    public void adoptDog() {
        Scanner sc = new Scanner(System.in);
        System.out.print("강아지의 이름을 입력하세요 : ");
        String dogName = sc.nextLine();

        this.myDog = new Dog(dogName);
        System.out.println(this.name + "의 강아지 이름은 : " + dogName + "입니다.");
        // 강아지 이름을 나타내는건 this.myDog가 아니라 dogName이다.

    }
    public void teachDog(String[] teachingAbility){
        /* 내 강아지의 재주를 설정 */
        this.myDog.learnAbility(teachingAbility);
        //내 강아지한테 알려주고 싶은거니까 this myDog를 쓴다.
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", myDog=" + myDog +
                '}';
    }
}
