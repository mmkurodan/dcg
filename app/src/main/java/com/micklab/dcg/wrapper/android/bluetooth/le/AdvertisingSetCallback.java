// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class AdvertisingSetCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdvertisingSetCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback wrap(android.bluetooth.le.AdvertisingSetCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.AdvertisingSetCallback getReal() {
        return (android.bluetooth.le.AdvertisingSetCallback) real;
    }

    public android.bluetooth.le.AdvertisingSetCallback unwrap() {
        return getReal();
    }

    public void onAdvertisingDataSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, int arg1) {
        ((android.bluetooth.le.AdvertisingSetCallback) real).onAdvertisingDataSet(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onAdvertisingEnabled(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, boolean arg1, int arg2) {
        ((android.bluetooth.le.AdvertisingSetCallback) real).onAdvertisingEnabled(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onAdvertisingParametersUpdated(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, int arg1, int arg2) {
        ((android.bluetooth.le.AdvertisingSetCallback) real).onAdvertisingParametersUpdated(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onAdvertisingSetStarted(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, int arg1, int arg2) {
        ((android.bluetooth.le.AdvertisingSetCallback) real).onAdvertisingSetStarted(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onAdvertisingSetStopped(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0) {
        ((android.bluetooth.le.AdvertisingSetCallback) real).onAdvertisingSetStopped(arg0 == null ? null : arg0.getReal());
    }

    public void onPeriodicAdvertisingDataSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, int arg1) {
        ((android.bluetooth.le.AdvertisingSetCallback) real).onPeriodicAdvertisingDataSet(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onPeriodicAdvertisingEnabled(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, boolean arg1, int arg2) {
        ((android.bluetooth.le.AdvertisingSetCallback) real).onPeriodicAdvertisingEnabled(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onPeriodicAdvertisingParametersUpdated(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, int arg1) {
        ((android.bluetooth.le.AdvertisingSetCallback) real).onPeriodicAdvertisingParametersUpdated(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onScanResponseDataSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, int arg1) {
        ((android.bluetooth.le.AdvertisingSetCallback) real).onScanResponseDataSet(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int ADVERTISE_FAILED_ALREADY_STARTED = android.bluetooth.le.AdvertisingSetCallback.ADVERTISE_FAILED_ALREADY_STARTED;
    public static final int ADVERTISE_FAILED_DATA_TOO_LARGE = android.bluetooth.le.AdvertisingSetCallback.ADVERTISE_FAILED_DATA_TOO_LARGE;
    public static final int ADVERTISE_FAILED_FEATURE_UNSUPPORTED = android.bluetooth.le.AdvertisingSetCallback.ADVERTISE_FAILED_FEATURE_UNSUPPORTED;
    public static final int ADVERTISE_FAILED_INTERNAL_ERROR = android.bluetooth.le.AdvertisingSetCallback.ADVERTISE_FAILED_INTERNAL_ERROR;
    public static final int ADVERTISE_FAILED_TOO_MANY_ADVERTISERS = android.bluetooth.le.AdvertisingSetCallback.ADVERTISE_FAILED_TOO_MANY_ADVERTISERS;
    public static final int ADVERTISE_SUCCESS = android.bluetooth.le.AdvertisingSetCallback.ADVERTISE_SUCCESS;

}
