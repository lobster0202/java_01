package com.ohgiraffers.section02.extend;

//public class RabbitFarm<T implements Animal> {}     //에러남
//public class RabbitFarm<T extends Animal> {} //정상

//public class RabbitFarm<T extends Rabbit & Animal> {
    // (석현) Generic 클래스에서 상속을 받으려면
    // 인터페이스라고 해도 implements 가 아닌 extend로 해야한다
    // 2개의 클래스를 상속 받으려면 앞에는 클래스, 뒤에는 인터페이스 순서로 해야한다.

    public class RabbitFarm <T extends Rabbit> {

        /* &로 여러 타입을 동시에 가지는 타입 변수를 지정할 수 있다. (&로 묶어준 모든 타입에 해당해야함)
        * 단, 클래스는 하나만 지정할 수 있으며 &의 맨 앞에는 클래스, 이후로는 인터페이스가 와야한다. */

        private T animal;
        public RabbitFarm() {}
        public RabbitFarm(T animal) {
            this.animal =  animal;
        }
        public void setAnimal(T animal) {
            this.animal = animal;
        }
        public T getAnimal() {
            return this.animal;
        }



    }

