package com.mykavr.version4abstractfactory;

import com.mykavr.version4abstractfactory.delivery.Delivery;
import com.mykavr.version4abstractfactory.delivery.NovaPoshtaDelivery;
import com.mykavr.version4abstractfactory.payment.CardToCardPayment;
import com.mykavr.version4abstractfactory.payment.Payment;

public class NovaPoshtaParcelManager implements ParcelManager {

    @Override
    public Delivery getDelivery(Parcel parcel) {
        return new NovaPoshtaDelivery(
                parcel.getContent(),
                parcel.getRecipientName(),
                parcel.getRecipientPhoneNumber(),
                parcel.getCity(),
                parcel.getNovaPoshtaBranch());
    }

    @Override
    public Payment getPayment() {
        return new CardToCardPayment();
    }
}
