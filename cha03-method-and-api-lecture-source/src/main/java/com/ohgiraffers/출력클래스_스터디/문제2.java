package com.ohgiraffers.출력클래스_스터디;

import java.util.Scanner;

public class 문제2 {
    public static void main(String[] args) {
        /* Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고, 10의 자리와 1의 자리가 같은지 판별하여
         출력하는 프로그램을 작성하세요. */
        /*10의 자리: 1
        1의 자리: 1
        같은 숫자입니다.

        or

        10의 자리: 4
        1의 자리: 3
        같은 숫자가 아닙니다.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("2자리의 정수를 입력하세요: ");
        String str = sc.nextLine();

        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);

//        char num1 = sc.nextLine().charAt(0);
//        char num2 = sc.nextLine().charAt(1);

        System.out.println("10의 자리 : " + ch1);
        System.out.println("1의 자리 : " + ch2);

        String result = (ch1 == ch2)? "같은 숫자입니다." : "같은 숫자가 아닙니다.";

        System.out.println(result);

        /*(오답노트) sc.nextLine() = 이 부분이 틀린거임!
        = sc.nextLine() 이라는게 상황에 맞지 않는 메소드였다.
        이미 입력돼있는 값을 쓰면 되는데 새로운 값을 써버려서 문제가 생긴것 */

        /* sc.nextLine()을 변수로 만들어 버리면 '2자리의 정수'라는 문장을 계속 받는 변수가 되는거지만
        * sc.nextLine()을 새로 써버리면 계속 새로운 문장을 받는 메소드가 되기 때문에
        * 아예 변수로 만들어 줘서 초기화가 안되게 하는거임 */




    }




}
