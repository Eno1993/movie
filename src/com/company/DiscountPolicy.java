package com.company;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
