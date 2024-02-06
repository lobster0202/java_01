package com.ohgiraffers.study1_method;

public class method4 {
    public void maxMethod (int first, int second, int third ) {
        String result1 = (first > second)? "first": (second > third)? "third" : "second";

//        Math.max( Math.max(first ,second), third);

        System.out.println(result1);

    }

    public void minMethod (int first, int second, int third ) {
        String result2 = (first > second)? "second": (first > third)? "third" : "first";

//        Math.min(Math.min(first, second),third);
        System.out.println(result2);

    }
}
