package com.company;

public class NonDiscountPolicy implements DiscountPolicy {

    /*@Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }*/

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
