package com.mykavr.version4abstractfactory.payment;

public class CardToCardPayment implements Payment {
    @Override
    public boolean pay() {
        System.out.println("Paying card to card...");
        return true;
    }
}
