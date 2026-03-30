// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class AdvertisingSet {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdvertisingSet(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet wrap(android.bluetooth.le.AdvertisingSet real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.AdvertisingSet getReal() {
        return (android.bluetooth.le.AdvertisingSet) real;
    }

    public android.bluetooth.le.AdvertisingSet unwrap() {
        return getReal();
    }

    public void enableAdvertising(boolean arg0, int arg1, int arg2) {
        ((android.bluetooth.le.AdvertisingSet) real).enableAdvertising(arg0, arg1, arg2);
    }

    public void setAdvertisingData(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg0) {
        ((android.bluetooth.le.AdvertisingSet) real).setAdvertisingData(arg0 == null ? null : arg0.getReal());
    }

    public void setAdvertisingParameters(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetParameters arg0) {
        ((android.bluetooth.le.AdvertisingSet) real).setAdvertisingParameters(arg0 == null ? null : arg0.getReal());
    }

    public void setPeriodicAdvertisingData(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg0) {
        ((android.bluetooth.le.AdvertisingSet) real).setPeriodicAdvertisingData(arg0 == null ? null : arg0.getReal());
    }

    public void setPeriodicAdvertisingEnabled(boolean arg0) {
        ((android.bluetooth.le.AdvertisingSet) real).setPeriodicAdvertisingEnabled(arg0);
    }

    public void setPeriodicAdvertisingParameters(com.micklab.dcg.wrapper.android.bluetooth.le.PeriodicAdvertisingParameters arg0) {
        ((android.bluetooth.le.AdvertisingSet) real).setPeriodicAdvertisingParameters(arg0 == null ? null : arg0.getReal());
    }

    public void setScanResponseData(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseData arg0) {
        ((android.bluetooth.le.AdvertisingSet) real).setScanResponseData(arg0 == null ? null : arg0.getReal());
    }

}
