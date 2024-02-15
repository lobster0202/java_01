package com.test;

public class Application {
    public static void main(String[] args) {
        /* 1.사람 생성 (이름, 나이는 생성과 동시에 초기화 되어야 함) */
        /* 2. 1에서 만든 사람의 국적 설정
         *       (한국, 일본, 중국, 홍콩, 터키 중 하나만 가능 / 만약 다른 국가를 입력했다면 자동으로 '한국'으로 설정 )
         *  Application에서는 호출만 하고 메소드에서 다 만들것 */
        /* 3. 강아지 입양 -> 사람이 할 수 있는 일 (= Person의 메소드를 호출해서 Dog를 추가)
         * 단, 강아지는 반드시 이름이 있어야 함 (강아지 입력 스캐너로 입력 받기) */
        /* 4. 강아지에게 재주 가르치기 -> 사람이 할 수 있는 일
         *    (= Person의 매개변수가 있는 메소드를 호출해서 dog의 ability 추가) */

        Person p1 = new Person("사람",1);     // 1번 끝

        p1.setCountry("한국");            // 2번 끝 - 다시 봐야함

        p1.adoptDog();                     // 3번 끝 - 다시 봐야함

        String[] teachingAbility = new String[]{"앉아","빵!!","기다려"};

        p1.teachDog(teachingAbility);

        // 내 강아지 이름 불러오기
        System.out.println(p1.getMyDog().getName());
        //= 사람 클래스. 사람 클래스의 할당된 강아지. 강아지 클래스의 할당된 이름

        //내 강아지의 스킬 불러오기
        System.out.println(p1.getMyDog().getSkill());
        //= 사람 클래스. 사람 클래스의 할당된 강아지. 강아지 클래스의 할당된 스킬

        String dogName = p1.getMyDog().getName();
        String[] skillArr = p1.getMyDog().getSkill();

        for ( int i = 0; i < skillArr.length; i++) {
            System.out.println(dogName + "의" + (i+1) + "번째 재주는 " + skillArr[i] + "입니다.");
        }
    }
}
