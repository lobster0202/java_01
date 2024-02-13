package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class application4 {
    public static void main(String[] args) {

        /* [Stack]
        * Stack은 리스트 계열 클래스의 Vector클래스를 상속 받아 구현하였다.
        * 스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하며
        * 후입선출(LIFO -Last Input First Out) 방식의 자료 구조라 불린다.
        * 후입 선출: 1번 2번 3번이 차례대로 들어가면 나오는건 반대로 3번 2번 1번으로 나옴 */


        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        // Stack에 값을 넣을 때는 push 메소드를 쓰는게 좋다. add도 가능하지만 interger는 벡터값이기에 push를 권장

        System.out.println(integerStack);

        System.out.println(integerStack.search(5));
        // 인덱스가 아니라 위에까지의 순번을 의미

        /* stack에서 값을 꺼내는 메소드
        * peek() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환
        * pop() : 해당 스택의 가장 마지막에 있는(상단에 있는) 요소 반환 후 제거 */

        System.out.println("peek() : " + integerStack.peek());
        System.out.println(integerStack);

        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
        System.out.println("pop() : " + integerStack.pop());
//        System.out.println("pop() : " + integerStack.pop());            // EmptyStackException 발생
        System.out.println(integerStack);

//        for (int i = 0; i < integerStack.size() ; i++) {
//            if ()
//        }



    }
}
