package com.mykavr.version1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Parcel> parcels = getParcels();

        for (Parcel parcel : parcels) {
            UkrposhtaDelivery delivery = new UkrposhtaDelivery(
                    parcel.getCountry(),
                    parcel.getPostalCode(),
                    parcel.getCity(),
                    parcel.getAddress(),
                    parcel.getRecipientName(),
                    parcel.getContent());
            delivery.send();
        }
    }

    private static List<Parcel> getParcels() {
        List<Parcel> parcels = new ArrayList<>();

        parcels.add(new Parcel("Pack of documents", "Ivan Sirko",
                "Kyiv", "Kniazia Romana Mstyslavycha str., 4, kv. 37", "02192"));

        parcels.add(new Parcel("A bottle of wine", "Hanna Shevchenko",
                "Kyiv", "Khreshchatyk, 44, kv. 18", "01001"));

        parcels.add(new Parcel("Books on Physics", "Petro Kolomiiets",
                "Lviv", "Tekhnichna st., 3, kv. 4", "79000"));

        parcels.add(new Parcel("Laptop", "Mariia Ponomarenko",
                "Kharkiv", "Sumska st., 67, kv. 29", "61000"));

        return parcels;
    }
}