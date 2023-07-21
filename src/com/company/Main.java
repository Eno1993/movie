package com.company;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Movie avatar = new Movie("아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDefaultDiscountPolicy(Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new SequenceCondition(100),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(8, 59), LocalTime.of(12,1)),
                        new PeriodCondition(DayOfWeek.WEDNESDAY, LocalTime.of(8, 59), LocalTime.of(12,1))
                        ));

        Movie titanic = new Movie("타이타닉",
                Duration.ofMinutes(180),
                Money.wons(11000),
                new PercentDefaultDiscountPolicy(0.1,
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new SequenceCondition(100),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(8, 59), LocalTime.of(12,1)),
                        new PeriodCondition(DayOfWeek.WEDNESDAY, LocalTime.of(8, 59), LocalTime.of(12,1))
                ));
    }
}
