package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // 내가 오늘 외워야 하는 것 :  get메소드, set메소드가 무엇을 하는지, 그리고 내가 입력한 값을 부르기 위해서 어떻게 해야하는지,
        // myDog에 대해 정확하게 알 것, 캡슐화 하세요 하면 속성 선언할때 private 써야 하는것,
        // 향상된 for문에서 처음에 나오는건 타입형이다.



        //(질문) return이 무슨 역할을 하는지 다시 물어보기

        /* 1.사람 생성 (이름, 나이는 생성과 동시에 초기화 되어야 함) */
        Person p = new Person("닉넴", 1);

        //(석현) 모르겠는 것 : 생성과 동시에 초기화라는 말이 뭐지?
        // 정답 : 그냥 이름이랑 나이를 적어주면 되는거임 = 이 말이 초기화를 한다는 뜻

        /* 2. 1에서 만든 사람의 국적 설정
         *       (한국, 일본, 중국, 홍콩, 터키 중 하나만 가능 /
         * 만약 다른 국가를 입력했다면 자동으로 '한국'으로 설정 ) */
        p.setCountry("일본");

        // 모르겠는 것 : set메소드에서 어떻게 객체 생성을 하고 그걸 매개변수로 사용하는지 모르겠음 ,향상된 for문을 사용해서 푸는 방법을 모르겠음
        // 정답 : set메소드에서는 this.를 써서 문제를 풀면 되는거였음

        /* 3. 강아지 입양 -> 사람이 할 수 있는 일 (= Person의 메소드를 호출해서 Dog를 추가)
        * 단, 강아지는 반드시 이름이 있어야 함 (강아지 입력 스캐너로 입력 받기) */

        // 모르겠는 것 : 내가 이름을 주긴 했는데 정작 객체는 못만드는거 같은데 뭐 어캐해야하지
        //(GPT) 이름값만 받는 생성자를 만들어 주면 됨

        p.adoptDog();

        /* 4. 강아지에게 재주 가르치기 -> 사람이 할 수 있는 일
        *    (= Person의 매개변수가 있는 메소드를 호출해서 dog의 ability 추가) */

        // 클래스의 타입에 대해 유의하기
        String[] teachingAbility = new String[]{"앉아","빵!!","기다려"};

        p.teachDog(teachingAbility);

//        System.out.println(p);

        String[] skillarr = p.getMyDog().getSkill();
        for (int i = 0; i < skillarr.length ; i++) {
            System.out.println( p.getMyDog().getName() + "의 " + (i+1) + "번 째 재주는 " + (skillarr[i]) + "입니다.");

        }
//        p.getMyDog().setName("강아지");
//        System.out.println("이름 : " + p.getMyDog().getName());
//        p.getMyDog().setSkill(teachingAbility);
//        System.out.println("재주 : " + Arrays.toString(p.getMyDog().getSkill()));
//
//        for (int i = 0)


    }
}
