package com.mykavr.version3factorymethodpattern;

public abstract class DeliveryManager {
    protected Parcel parcel;

    public DeliveryManager(Parcel parcel) {
        this.parcel = parcel;
    }

    public void sendParcel() {
        Delivery delivery = getDelivery();
        String trackingNumber = delivery.send();
        parcel.setSent(true);
        parcel.setTrackingNumber(trackingNumber);
    }

    protected abstract Delivery getDelivery();
}
