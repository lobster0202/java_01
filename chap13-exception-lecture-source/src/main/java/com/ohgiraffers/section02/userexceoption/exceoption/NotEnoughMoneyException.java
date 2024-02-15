package com.ohgiraffers.section02.userexceoption.exceoption;

public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException() {}

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
