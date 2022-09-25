package com.mykavr.version4abstractfactory;

import com.mykavr.version4abstractfactory.payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class MainV4AbstractFactory {
    public static void main(String[] args) {
        List<Parcel> parcels = getParcels();

        for (Parcel parcel : parcels) {
            ParcelManager manager = ParcelManager.getManagerFor(parcel.getDeliveryMethod());

            String trackingNumber = manager.getDelivery(parcel).send();
            parcel.setSent(true);
            parcel.setTrackingNumber(trackingNumber);

            String trackingInfo = parcel.getTrackingNumber() + " " + parcel.getDeliveryMethod();
            System.out.println(trackingInfo);

            Payment payment = manager.getPayment();
            if (!payment.pay()) {
                System.out.println("Payment failed, trying again");
                if (!payment.pay()) {
                    throw new RuntimeException("Payment Failed!");
                }
            }
        }
    }

    private static List<Parcel> getParcels() {
        List<Parcel> parcels = new ArrayList<>();

        parcels.add(new Parcel("Pack of documents", "Ivan Sirko",
                "Kyiv", "Kniazia Romana Mstyslavycha str., 4, kv. 37", "02192"));

        parcels.add(new Parcel("A bottle of wine", "Hanna Shevchenko",
                "Kyiv", "Khreshchatyk, 44, kv. 18", "01001"));

        parcels.add(new Parcel("Books on Physics", "Petro Kolomiiets",
                "+380681234567", "Lviv", 14));

        parcels.add(new Parcel("Laptop", "Mariia Ponomarenko",
                "Kharkiv", "Sumska st., 67, kv. 29", "61000"));

        return parcels;
    }
}
