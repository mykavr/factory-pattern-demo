package com.mykavr.version3factorymethodpattern;

public class DeliveryManagerFactory {
    public static DeliveryManager getManagerFor(Parcel parcel) {
        if (parcel.getDeliveryMethod() == DeliveryMethod.UKRPOSHTA) {
            return new UkrposhtaDeliveryManager(parcel);
        } else {
            return new NovaPoshtaDeliveryManager(parcel);
        }
    }
}
