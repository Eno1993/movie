package com.company;

import java.util.*;
import java.util.ArrayList;

public abstract class DefaultDiscountPolicy implements DiscountPolicy{

    private List<DiscountCondition> conditions = new ArrayList<>();

    public DefaultDiscountPolicy(DiscountCondition ... discountConditions){
        this.conditions = Arrays.asList(discountConditions);
    }

    public Money calculateDiscountAmount(Screening screening){
        Boolean res = this.conditions.stream()
                .anyMatch(condition -> {
                    return condition.isSatisfiedBy(screening);
                });

        return res ? getDiscountAmount(screening) : Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
