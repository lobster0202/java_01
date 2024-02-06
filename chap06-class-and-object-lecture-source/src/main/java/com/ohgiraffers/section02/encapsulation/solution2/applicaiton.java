package com.ohgiraffers.section02.encapsulation.solution2;

public class applicaiton {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
//        monster1.kinds = "프랑켄슈타인";      // 에러 발생
//        monster1.hp =200;                   // 에러 발생

        /* private로 접근이 안되는 필드는 그 클래스 내에서 그 필드를 사용한 메소드를 작성하고
        * 다른 클래스에서 메소드를 사용하면 쓸 수 있다. */

        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());

        // import가 됐다 안됐다 해서 import가 제대로 돼있는지 아닌지 확인하면서 해야함
    }
}
