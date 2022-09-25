package com.mykavr.version4.payment;

public class CardToCardPayment implements Payment {
    @Override
    public boolean pay() {
        System.out.println("Paying card to card...");
        return true;
    }
}
