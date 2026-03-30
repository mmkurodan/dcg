// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class AdvertisingSetCallback {
    private final android.bluetooth.le.AdvertisingSetCallback real;

    public AdvertisingSetCallback(android.bluetooth.le.AdvertisingSetCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback wrap(android.bluetooth.le.AdvertisingSetCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSetCallback(real);
    }

    public android.bluetooth.le.AdvertisingSetCallback unwrap() {
        return real;
    }

    public void onAdvertisingDataSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, int arg1) {
        real.onAdvertisingDataSet(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onAdvertisingEnabled(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, boolean arg1, int arg2) {
        real.onAdvertisingEnabled(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void onAdvertisingParametersUpdated(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, int arg1, int arg2) {
        real.onAdvertisingParametersUpdated(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void onAdvertisingSetStarted(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, int arg1, int arg2) {
        real.onAdvertisingSetStarted(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void onAdvertisingSetStopped(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0) {
        real.onAdvertisingSetStopped(arg0 == null ? null : arg0.unwrap());
    }

    public void onPeriodicAdvertisingDataSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, int arg1) {
        real.onPeriodicAdvertisingDataSet(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onPeriodicAdvertisingEnabled(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, boolean arg1, int arg2) {
        real.onPeriodicAdvertisingEnabled(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void onPeriodicAdvertisingParametersUpdated(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, int arg1) {
        real.onPeriodicAdvertisingParametersUpdated(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onScanResponseDataSet(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertisingSet arg0, int arg1) {
        real.onScanResponseDataSet(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int ADVERTISE_FAILED_ALREADY_STARTED = android.bluetooth.le.AdvertisingSetCallback.ADVERTISE_FAILED_ALREADY_STARTED;
    public static final int ADVERTISE_FAILED_DATA_TOO_LARGE = android.bluetooth.le.AdvertisingSetCallback.ADVERTISE_FAILED_DATA_TOO_LARGE;
    public static final int ADVERTISE_FAILED_FEATURE_UNSUPPORTED = android.bluetooth.le.AdvertisingSetCallback.ADVERTISE_FAILED_FEATURE_UNSUPPORTED;
    public static final int ADVERTISE_FAILED_INTERNAL_ERROR = android.bluetooth.le.AdvertisingSetCallback.ADVERTISE_FAILED_INTERNAL_ERROR;
    public static final int ADVERTISE_FAILED_TOO_MANY_ADVERTISERS = android.bluetooth.le.AdvertisingSetCallback.ADVERTISE_FAILED_TOO_MANY_ADVERTISERS;
    public static final int ADVERTISE_SUCCESS = android.bluetooth.le.AdvertisingSetCallback.ADVERTISE_SUCCESS;

}
