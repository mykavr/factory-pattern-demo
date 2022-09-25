package com.mykavr.version3withoutpatterns;

public class DeliveryManager {
    // con
    private Parcel parcel;

    DeliveryManager(Parcel parcel) {
        this.parcel = parcel;
    }

    public void sendParcel() {
        Delivery delivery = null;

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
    }
}
