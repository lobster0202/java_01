package com.ohgiraffers.section02.encapsulation.solution1;

public class Monster {
//    String name;
//    int hp;
//    public void setInfo(String info) {
//        this.name = info;
//    }
//    public void setHp(int hp) {
//        if(hp >= 0) {
//            this.hp = hp;
//        } else {
//            this.hp = 0;
//        }
//    }
//    public String getInfo() {
//        return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";

    String kinds;
    int hp;

    public void setInfo(String info) {
        this.kinds = info;
    }
    public void setHp(int hp) {
        if(hp >= 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }
    public String getInfo() {
        return "몬스터의 이름은 " + this.kinds + "이고, 체력은 " + this.hp + "입니다.";

        /*메소드를 사용해서 만들면 name같은 매개변수를 kinds로 바꿔도 메소드에서만 바꾸면 되니까
        어플리케이션에서는 바꿀 필요가 없어지니까 번거로운 일이 줄어듬 */
    }
}
