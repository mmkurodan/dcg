// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth.le;

public final class AdvertiseCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AdvertiseCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseCallback wrap(android.bluetooth.le.AdvertiseCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseCallback(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.le.AdvertiseCallback getReal() {
        return (android.bluetooth.le.AdvertiseCallback) real;
    }

    public android.bluetooth.le.AdvertiseCallback unwrap() {
        return getReal();
    }

    public void onStartFailure(int arg0) {
        ((android.bluetooth.le.AdvertiseCallback) real).onStartFailure(arg0);
    }

    public void onStartSuccess(com.micklab.dcg.wrapper.android.bluetooth.le.AdvertiseSettings arg0) {
        ((android.bluetooth.le.AdvertiseCallback) real).onStartSuccess(arg0 == null ? null : arg0.getReal());
    }

    public static final int ADVERTISE_FAILED_ALREADY_STARTED = android.bluetooth.le.AdvertiseCallback.ADVERTISE_FAILED_ALREADY_STARTED;
    public static final int ADVERTISE_FAILED_DATA_TOO_LARGE = android.bluetooth.le.AdvertiseCallback.ADVERTISE_FAILED_DATA_TOO_LARGE;
    public static final int ADVERTISE_FAILED_FEATURE_UNSUPPORTED = android.bluetooth.le.AdvertiseCallback.ADVERTISE_FAILED_FEATURE_UNSUPPORTED;
    public static final int ADVERTISE_FAILED_INTERNAL_ERROR = android.bluetooth.le.AdvertiseCallback.ADVERTISE_FAILED_INTERNAL_ERROR;
    public static final int ADVERTISE_FAILED_TOO_MANY_ADVERTISERS = android.bluetooth.le.AdvertiseCallback.ADVERTISE_FAILED_TOO_MANY_ADVERTISERS;

}
