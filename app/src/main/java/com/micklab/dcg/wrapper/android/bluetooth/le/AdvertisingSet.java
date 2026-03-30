// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class AdvertisingSet {
    private final android.bluetooth.le.AdvertisingSet real;

    public AdvertisingSet(android.bluetooth.le.AdvertisingSet real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet wrap(android.bluetooth.le.AdvertisingSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet(real);
    }

    public android.bluetooth.le.AdvertisingSet unwrap() {
        return real;
    }

    public void enableAdvertising(boolean arg0, int arg1, int arg2) {
        real.enableAdvertising(arg0, arg1, arg2);
    }

    public void setAdvertisingData(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg0) {
        real.setAdvertisingData(arg0 == null ? null : arg0.unwrap());
    }

    public void setAdvertisingParameters(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters arg0) {
        real.setAdvertisingParameters(arg0 == null ? null : arg0.unwrap());
    }

    public void setPeriodicAdvertisingData(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg0) {
        real.setPeriodicAdvertisingData(arg0 == null ? null : arg0.unwrap());
    }

    public void setPeriodicAdvertisingEnabled(boolean arg0) {
        real.setPeriodicAdvertisingEnabled(arg0);
    }

    public void setPeriodicAdvertisingParameters(com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters arg0) {
        real.setPeriodicAdvertisingParameters(arg0 == null ? null : arg0.unwrap());
    }

    public void setScanResponseData(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg0) {
        real.setScanResponseData(arg0 == null ? null : arg0.unwrap());
    }

}
