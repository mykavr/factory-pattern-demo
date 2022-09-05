package com.mykavr.version2simplefactory;

public class DeliveryFactory {
    public static Delivery getDeliveryFor(Parcel parcel) {
        if (parcel.getDeliveryMethod() == DeliveryMethod.UKRPOSHTA) {
            return new UkrposhtaDelivery(
                    parcel.getCountry(),
                    parcel.getPostalCode(),
                    parcel.getCity(),
                    parcel.getAddress(),
                    parcel.getRecipientName(),
                    parcel.getContent());
        } else {
            return new NovaPoshtaDelivery(
                    parcel.getContent(),
                    parcel.getRecipientName(),
                    parcel.getRecipientPhoneNumber(),
                    parcel.getCity(),
                    parcel.getNovaPoshtaBranch());
        }
    }
}
