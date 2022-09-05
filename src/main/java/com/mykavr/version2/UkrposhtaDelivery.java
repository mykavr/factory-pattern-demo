package com.mykavr.version2;

public class UkrposhtaDelivery {
    private String content;
    private String address;
    private String recipient;

    public UkrposhtaDelivery(String country,
                             String postalCode,
                             String city,
                             String address,
                             String recipient,
                             String content) {
        this.content = content;
        this.address = String.format("%s %s %s\n%s", country, postalCode, city, address);
        this.recipient = recipient;
    }

    public void send() {
        System.out.printf("\nSending '%s' to %s\n%s\n", content, recipient, address);
    }
}
