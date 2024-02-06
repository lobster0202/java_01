package com.ohgiraffers.section01.array;

public class application4 {
    public static void main(String[] args) {
     /*
     * [카드뽑기]
     * 1. 문자열 배열에 SPADE, CLOVER, HEART, DIAMOND 를 저장
     * 2. 문자열 배열에 2, 3, 4, 5, 6, 7, 8, 9, 10, JACK, QUEEN, KING, ACE 를 저장
     * 3. 1번과 2번 배열의 길이에 맞도록 난수를 각각 발생시킨다.
     * 4. 위에서 발생시킨 난수를 활용하여 카드를 출력한다.
     *
     * ========== 출력예시 ==========
     * 당신이 뽑은 카드는 DIAMOND 9 카드 입니다. */

        String[] shape = new String[]{"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] snum = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
        int random1 = (int)(Math.random() * shape.length);
        int random2 = (int)(Math.random() * snum.length);

        /* (오답노트) 난수에 곱하는 수를 표현할 때 숫자를 적어주는게 아니라
        shape.length와 같이 특정 숫자를 확실하게 나타내 줄 수 있는 것을 쓰는게 맞다. */
        /* =배열의 길이를 넣는 문제에 있어서는 배열 갯수를 세서 넣는 것 보다 배열의 길이를 나타내는 .length와 같은 함수를 넣는게 낫다. */

        System.out.println("당신이 뽑은 카드는 " + shape[random1] + " " + snum[random2] + " 카드 입니다.");



//        for(int i = random1; i < shape.length; i++) {
//            for (int j = random2; j < snum.length; j++) {
//                System.out.println("당신이 뽑은 카드는 " + shape[random1] + " " + snum[random2] + " 카드 입니다.");
//
//            }
//        }
    }
}
