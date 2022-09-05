package com.mykavr.version2;

public class NovaPoshtaDelivery {
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

    public void send() {
        System.out.printf("\nSending '%s' to %s %s\n%s, Nova Poshta %s\n", content, recipient, phoneNumber, city, branch);
    }
}
