package com.mykavr.version4abstractfactory.payment;

public class BankTransfer implements Payment {
    @Override
    public boolean pay() {
        System.out.println("Paying by IBAN number...");
        return true;
    }
}
