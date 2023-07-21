package com.company;


public class Reservation {
    private Customer Customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;


    public Reservation(com.company.Customer customer, Screening screening, Money fee, int audienceCount) {
        Customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
