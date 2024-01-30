package com.ohgiraffers.section04.overflow;
public class application1 {
    public static void main(String[] args) {

        /* 필기.
        * 자료형 별 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림처리 하고 sign bit를 반전시켜 최소값으로 순환시킴
        * */

        byte num1 = 127;
        System.out.println("num1 : " + num1);       //127 : byte의 최대 저장 범위

        num1++;     //num1 = num1 + 1   // 1증가

        System.out.println("num1 overflow : " + num1);
        /**(석현) 최대 범위를 벗어날 경우 아예 처음으로 돌아가는 식으로 돼서 -128이 뜸
        옵치 5000점 넘었을때 사건이라고 생각하면 됨/

         /*필기. 언더플로우
         * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
         * */
        byte num2 = -128;

        System.out.println("num2 : " + num2);       //-128 : byte의 최소 저장 범위

        num2--;     //num2 = num2 - 1       // 1 감소

        System.out.println("num2 underflow : " + num2);

        /*범위를 외워야하거나 그런건 아니다 하지만?
        범위를 모르게 되면 에러 표시도 안뜨기 때문에 어느정도는 숙지하고 코드를 짜야한다.*/

        int firstNum = 1000000;     //100만
        int secondNum = 700000;     //70만

        int multi = firstNum * secondNum;
        System.out.println("firstNum * secondNum : " + multi);      //-79669248

        long longMulti = firstNum * secondNum;
        System.out.println("longMulti : " + longMulti);     //이미 오버플로우 처리 된 결과를 담았기 때문에 차이가 없다.
        //(석현) 이미 int로 저질렀으니까 multi는 이미 int로 판단

        long result = (long) firstNum * secondNum;      // (석현)뒤에 (long) 붙이는 걸 강제 형변환이라고 한다.
        System.out.println("result : " + result);       //정상적으로 7천억이 출력된다.

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        int num3 = 200000000;        // 200만
        int num4 = 300000000;        // 300만

        int multi2 = num3 * num4;
        System.out.println("multi2 : " + multi2);   //-1635385344

        long longmulti2 = num3* num4;
        System.out.println("longmulti2 : " + longmulti2);

        /*(석현) long이라고 적어도 어쨋든 int인 숫자를 2개 곱하는거라서
        나오는 결과 값은 int로 판단됨 그래서 아예 나온 결과를 형변환 해줘야 함*/


















    }
}
