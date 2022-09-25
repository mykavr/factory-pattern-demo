package com.mykavr.version4.payment;

public class BankTransfer implements Payment {
    @Override
    public boolean pay() {
        System.out.println("Paying by IBAN number...");
        return true;
    }
}
