package com.test;

import java.lang.invoke.SwitchPoint;
import java.util.Arrays;

public class Dog {
    /* 강아지 속성 : 이름(String), 재주(String[]) */

    private String name;
    private String[] skill;

    public Dog() {}

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String[] skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkill() {
        return skill;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }
    public void learnAbility(String[] teachingAbility) {
        /* 강아지의 정보가 출력되는 조회 메소드
         * 이름과 재주가 출력되도록 하기!!
         * (재주는 배열이기 때문에 for문 사용) */
        this.skill = teachingAbility;
    }

    /* Dog의 반환타입인 void인 메소드 호출 */
//    public void doSomeThingVoid(String order) {
//        /* Swtich문 사용해서 작성 */
//        switch (order) {
//            case "앉아" :
//                System.out.println(this.name + "이 앉습니다."); break;
//            case "빵!!" :
//                System.out.println(this.name + "이 죽은척을 합니다."); break;
//            case "기다려" :
//                System.out.println(this.name +"이 기다립니다."); break;
//            default:
//                System.out.println("아직 못배운 재주에요"); break;
//        }
//    }

    public String doSomeThingString(String order) {

        String result;

        switch (order) {
            case "앉아" :
                result = this.name + " 이 앉습니다."; break;
            case "빵!!" :
                result = this.name + "이 죽은척을 합니다."; break;
            case "기다려" :
                result = this.name +"이 기다립니다."; break;
            default:
                result = "아직 못배운 재주에요"; break;
        }

        return result;

    }

    public boolean doSomeThingBoolean(String order){

//        switch문을 작동하게 할것 입력받은 값이랑 배열에 있는 값이 같다면

        boolean isTrue = true;
        String result;

        switch (order) {
            case "앉아" :
                result = this.name + " 이 앉습니다."; break;
            case "빵!!" :
                result = this.name + "이 죽은척을 합니다."; break;
            case "기다려" :
                result = this.name +"이 기다립니다."; break;
            default:
                result = this.name + "가 아직 못배운 재주에요"; break;
        }

        return isTrue;


    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", skill=" + Arrays.toString(skill) +
                '}';
    }

}








