package com.mykavr.version4;

import com.mykavr.version4.delivery.*;
import com.mykavr.version4.payment.BankTransfer;
import com.mykavr.version4.payment.CardToCardPayment;
import com.mykavr.version4.payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class MainV4 {
    public static void main(String[] args) {
        List<Parcel> parcels = getParcels();

        for (Parcel parcel : parcels) {
            Delivery delivery;

            if (parcel.getDeliveryMethod() == DeliveryMethod.UKRPOSHTA) {
                delivery = new UkrposhtaDelivery(parcel.getCountry(), parcel.getPostalCode(), parcel.getCity(),
                        parcel.getAddress(), parcel.getRecipientName(), parcel.getContent());

            } else if (parcel.getDeliveryMethod() == DeliveryMethod.NOVA_POSHTA) {
                delivery = new NovaPoshtaDelivery(parcel.getContent(), parcel.getRecipientName(),
                        parcel.getRecipientPhoneNumber(), parcel.getCity(), parcel.getNovaPoshtaBranch());

            } else {
                throw new RuntimeException("Unknown delivery method: " + parcel.getDeliveryMethod());
            }

            String trackingNumber = delivery.send();
            parcel.setSent(true);
            parcel.setTrackingNumber(trackingNumber);

            String trackingInfo = parcel.getTrackingNumber() + " " + parcel.getDeliveryMethod();
            System.out.println(trackingInfo);

            Payment payment;
            if (parcel.getDeliveryMethod() == DeliveryMethod.UKRPOSHTA) {
                payment = new BankTransfer();
            } else if (parcel.getDeliveryMethod() == DeliveryMethod.NOVA_POSHTA) {
                payment = new CardToCardPayment();
            } else {
                throw new RuntimeException("Unknown delivery method: " + parcel.getDeliveryMethod());
            }

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
