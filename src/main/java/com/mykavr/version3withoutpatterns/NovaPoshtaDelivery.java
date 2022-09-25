package com.mykavr.version3withoutpatterns;

import java.util.UUID;

public class NovaPoshtaDelivery implements Delivery {
    private String content;
    private String recipient;
    private String phoneNumber;
    private String city;
    private String branch;

    public NovaPoshtaDelivery(String content,
                              String recipient,
                              String phoneNumber,
                              String city,
                              String branch) {
        this.content = content;
        this.recipient = recipient;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.branch = branch;
    }

    @Override
    public String send() {
        System.out.printf("\nSending '%s' to %s %s\n%s, Nova Poshta %s\n", content, recipient, phoneNumber, city, branch);
        return UUID.randomUUID().toString();
    }

    @Override
    public boolean delivered() {
        return false;
    }
}
