package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Person {
    /* 사람의 속성 : 이름(String), 나이(int), 국적(String), 강아지(클래스), --- 캡슐화 */

    private String name;
    private int age;
    private String country;
    private Dog myDog;

    public Person() {}

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

        return country = "한국";
    }

    public void setCountry(String country) {

        String[] country1 = {"한국", "일본", "중국", "홍콩", "터키"};
//        for (int i = 0; i < country1.length; i++) {
//            if (country1[i].equals(country)) {
//                this.country = country; break;
//            }else {
//                this.country = "한국";
//            }
//        }
        for (String checkCountry : country1) {
            if(country.equals(checkCountry)) {
                this.country = country;
                return;
            }
        }
        System.out.println("확인되지 않은 국가입니다. 국적을 한국으로 자동 설정합니다.");
        // (정보) break를 쓰지 않고 return을 써서 반복적으로 출력되는걸 막을 수 있다.

        System.out.println(this.name +  "의 나라는 : " + this.country + "입니다.");


    }

    public Dog getMyDog() {
        return myDog;
    }

    public void setMyDog(Dog myDog) {
        this.myDog = myDog;
    }

    public void adoptDog() {
        /* 강아지 이름을 입력받고, 입력받은 이름을 속성으로 강아지 객체 생성하여
        * 이 사람의 강아지로 설정 */

        //(석현) 모르겠는 것 : 이 사람의 강아지로 설정을 어떻게 하지?
        // = application에서 이름을 입력받고 여기서 객체를 생성해서 application에서 이 사람의 강아지로 해야됨

        Scanner sc = new Scanner(System.in);
        System.out.print("강아지의 이름을 입력해주세요 : ");
        String dogName = sc.nextLine();

//        Dog myDog = new Dog(dogName);

        this.myDog = new Dog(dogName);

        System.out.println(this.name + "의 강아지 : " + dogName);

        //= name은 Dog와 똑같은 클래스를 가지나?


    }
    public void teachDog(String[] teachingAbility) {
        /* 내 강아지의 재주를 설정 */

        this.myDog.learnAbility(teachingAbility);
        // 이미 입력받은 개의 재주를 설정하고 싶은거라서 myDog를 쓰고
        // 나중가서는 다른 myDog랑 헷갈릴 수 있으니 this.을 써주면 된다.
    }

    public void orderToDog() {
        /* 1. void 메소드 출력
        *  2. String으로 변경하여 출력
        *   출력예시 ) 뽀삐는 앉아!를 할 수 있어요 :) or 뽀삐는 앉아!를 배우지 않았어요.
        *  3. boolean으로 변경하여 출력
        *   출력예시 ) 뽀삐는 앉아!를 배웠어요!! or 뽀삐는 짖어!를 할 수 없어요. */

        Scanner sc = new Scanner(System.in);

        String[] skillArr = this.myDog.getSkill();

        // Arrays.toString 이용
        System.out.println("시킬 수 있는 재주로" + Arrays.toString(skillArr) + "가 있습니다.");

        System.out.print("어떤 재주를 시키시겠습니까? : " );
        String order = sc.nextLine();

//        this.myDog.doSomeThingVoid(order);
        this.myDog.doSomeThingString(order);
        System.out.println(this.myDog.doSomeThingString(order));

//        for (int i = 0 ; i < skillArr.length; i++) {
//            if (order.equals(skillArr[i])) {
//                this.myDog.doSomeThingBoolean(order);
//                return;
//            }
//            else {
//                System.out.println("아직 배우지 않은 재주입니다.");
//            }
//        }
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
