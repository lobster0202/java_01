package com.ohgiraffers.section06.singleton;

public class application {

    public static void main(String[] args) {

        //(석현) 클래스의 인스턴스가 하나만 생성되도록 보장하는 패턴
        /* singleton pattern 이란
         * 애플리케이션이 시작될 때 어떤 클래스가 최초 한번만 메모리를 할당하고
         * 그 메모리에 인스턴스를 만들어서 하나의 인스턴스를 공유해서 사용하며
         * 메모리 낭비를 방지할 수 있게 함 (매번 인스턴스르 생성하지 않음)
         * 장점
         * 1. 첫번째 이용시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만
         *    두번째 이용시에는 인스턴스 생성 시간 없이 사용할 수 있다.
         * 2. 인스턴스가 절대적으로 한개만 존재하는 것을 보증할 수 있다.
         *
         * 단점
         * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다.
         *           (유지보수와 테스트에 문제점이 있음)
         * 2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있다.
         *
         * [싱글톤 구현 방법]
         * 1. 이른 초기화 (Eager Initialization)
         * 2. 게으른 초기화 (Lazy Initializtion)
         *
         * 처음에 대한 속도가 두번째에 대한 속도보다 느리다. */

        /* 이른 초기화 구현*/
        /* 생성자를 이용하여 인스턴스 생성을 하지 못하고 getInstance() 메소드를 호출해야만 인스턴스를 생성할 수 있다. */

//    EagerSingleton eager = new EagerSingleton();        // 생성자가 private라 접근 불가
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println("eager1의 hashcode : " + eager1.hashCode());
        System.out.println("eager1의 hashcode : " + eager2.hashCode());

        /* 게으른 초기화 구현 */
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1의 hashcode : " + lazy1.hashCode());
        System.out.println("lazy2의 hashcode : " + lazy2.hashCode());

    }

}
