package com.mykavr.version3factorymethodpattern;

public class UkrposhtaDeliveryManager extends DeliveryManager {
    public UkrposhtaDeliveryManager(Parcel parcel) {
        super(parcel);
    }

    @Override
    protected Delivery getDelivery() {
        return new UkrposhtaDelivery(
                parcel.getCountry(),
                parcel.getPostalCode(),
                parcel.getCity(),
                parcel.getAddress(),
                parcel.getRecipientName(),
                parcel.getContent());
    }
}
