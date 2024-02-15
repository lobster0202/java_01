package com.ohgiraffers.section02.userexceoption;

import com.ohgiraffers.section02.userexceoption.exceoption.MoneyNegativeExcetion;
import com.ohgiraffers.section02.userexceoption.exceoption.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexceoption.exceoption.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money)
            throws PriceNegativeException, MoneyNegativeExcetion, NotEnoughMoneyException {
        if(price < 0 ) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }
        if (money < 0) {
            throw new MoneyNegativeExcetion("가지고 있는 돈은 음수일 수 없습니다.");
        }
        if (money < price) {
            throw new NotEnoughMoneyException("가지고 있는 돈 보다 상품 가격이 더 비쌉니다.");
        }
        System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 되세요~");
    }

}
