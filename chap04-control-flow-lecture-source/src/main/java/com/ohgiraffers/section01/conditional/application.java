package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        A_if a = new A_if();
//        a.simpleIfStatment();

        A_if b = new A_if();
//        b.nestedIfStatment();

        B_ifElse c = new B_ifElse();
//        c.simpleIfElseStatement();
//        c.nestedIfElseStatement();

        C_ifElseif d = new C_ifElseif();
//        d.simpleIfElseIfStatement();
        d.nestedIfElseStatement2();

        D_switch e = new D_switch();
//        e.simpleSwitchStatement();
//        e.switchVendingMachine();


    }
}
