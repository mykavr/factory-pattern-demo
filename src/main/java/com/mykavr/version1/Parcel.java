package com.mykavr.version1;

public class Parcel {
    private String content;
    private String recipientName;
    private String country = "Ukraine";
    private String city;
    private String postalCode;
    private String address;

    public Parcel(String content, String recipientName, String city, String address, String postalCode) {
        this.content = content;
        this.recipientName = recipientName;
        this.city = city;
        this.address = address;
        this.postalCode = postalCode;
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
}
