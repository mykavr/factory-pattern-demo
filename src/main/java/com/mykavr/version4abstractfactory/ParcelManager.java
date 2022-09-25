package com.mykavr.version4abstractfactory;

import com.mykavr.version4abstractfactory.delivery.Delivery;
import com.mykavr.version4abstractfactory.delivery.DeliveryMethod;
import com.mykavr.version4abstractfactory.payment.Payment;

public interface ParcelManager {

    Delivery getDelivery(Parcel parcel);

    Payment getPayment();

    static ParcelManager getManagerFor(DeliveryMethod deliveryMethod) {
        switch (deliveryMethod) {
            case UKRPOSHTA:
                return new UkrposhtaParcelManager();
            case NOVA_POSHTA:
                return new NovaPoshtaParcelManager();
            default:
                throw new RuntimeException("Unknown delivery method:" + deliveryMethod);
        }
    }
}
