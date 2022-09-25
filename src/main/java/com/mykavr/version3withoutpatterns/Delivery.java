package com.mykavr.version3withoutpatterns;

public interface Delivery {
    /**
     * Send a parcel
     * @return tracking number
     */
    String send();

    boolean delivered();
}
