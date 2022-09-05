package com.mykavr.version2;

public class Parcel {
    private String content;
    private String recipientName;
    private String country = "Ukraine";
    private String city;
    private String postalCode;
    private String address;

    // new fields in v.2

    private DeliveryMethod deliveryMethod;
    private String recipientPhoneNumber;
    private String novaPoshtaBranch;

    public Parcel(String content, String recipientName, String city, String address, String postalCode) {
        this.deliveryMethod = DeliveryMethod.UKRPOSHTA;
        this.content = content;
        this.recipientName = recipientName;
        this.city = city;
        this.address = address;
        this.postalCode = postalCode;
    }

    public Parcel(String content, String recipientName, String recipientPhoneNumber, String city, int novaPoshtaBranch) {
        this.deliveryMethod = DeliveryMethod.NOVA_POSHTA;
        this.content = content;
        this.recipientName = recipientName;
        this.recipientPhoneNumber = recipientPhoneNumber;
        this.city = city;
        this.novaPoshtaBranch = String.valueOf(novaPoshtaBranch);
    }

    public String getContent() {
        return content;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getAddress() {
        return address;
    }

    public DeliveryMethod getDeliveryMethod() {
        return deliveryMethod;
    }

    public String getRecipientPhoneNumber() {
        return recipientPhoneNumber;
    }

    public String getNovaPoshtaBranch() {
        return novaPoshtaBranch;
    }
}
