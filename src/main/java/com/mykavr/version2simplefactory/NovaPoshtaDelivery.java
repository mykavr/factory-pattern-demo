package com.mykavr.version2simplefactory;

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
    public void send() {
        System.out.printf("\nSending '%s' to %s %s\n%s, Nova Poshta %s\n", content, recipient, phoneNumber, city, branch);
    }
}
