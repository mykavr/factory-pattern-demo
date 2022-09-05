package com.mykavr.version3factorymethodpattern;

public interface Delivery {
    /**
     * Send a parcel
     * @return tracking number
     */
    String send();

    boolean delivered();
}
