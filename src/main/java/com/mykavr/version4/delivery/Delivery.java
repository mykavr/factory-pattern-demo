package com.mykavr.version4.delivery;

public interface Delivery {
    /**
     * Send a parcel
     * @return tracking number
     */
    String send();

    boolean delivered();
}
