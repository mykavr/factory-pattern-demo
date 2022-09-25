package com.mykavr.version4abstractfactory;

import com.mykavr.version4abstractfactory.delivery.Delivery;
import com.mykavr.version4abstractfactory.delivery.UkrposhtaDelivery;
import com.mykavr.version4abstractfactory.payment.BankTransfer;
import com.mykavr.version4abstractfactory.payment.Payment;

public class UkrposhtaParcelManager implements ParcelManager {

    @Override
    public Delivery getDelivery(Parcel parcel) {
        return new UkrposhtaDelivery(
                parcel.getCountry(),
                parcel.getPostalCode(),
                parcel.getCity(),
                parcel.getAddress(),
                parcel.getRecipientName(),
                parcel.getContent());
    }

    @Override
    public Payment getPayment() {
        return new BankTransfer();
    }
}
