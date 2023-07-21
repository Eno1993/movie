package com.company;

public class AmountDefaultDiscountPolicy extends DefaultDiscountPolicy {

    private Money discountAmount;

    public AmountDefaultDiscountPolicy(Money discountAmount, DiscountCondition ... discountConditions){
        super(discountConditions);
        this.discountAmount = discountAmount;
    }

    @Override
    public Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
