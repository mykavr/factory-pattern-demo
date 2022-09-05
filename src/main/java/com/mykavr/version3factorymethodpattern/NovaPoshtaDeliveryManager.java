package com.mykavr.version3factorymethodpattern;

public class NovaPoshtaDeliveryManager extends DeliveryManager {
    public NovaPoshtaDeliveryManager(Parcel parcel) {
        super(parcel);
    }

    @Override
    protected Delivery getDelivery(Parcel parcel) {
        return new NovaPoshtaDelivery(
                parcel.getContent(),
                parcel.getRecipientName(),
                parcel.getRecipientPhoneNumber(),
                parcel.getCity(),
                parcel.getNovaPoshtaBranch());
    }
}
