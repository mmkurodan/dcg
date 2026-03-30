// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHidDeviceAppQosSettings {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothHidDeviceAppQosSettings(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDeviceAppQosSettings wrap(android.bluetooth.BluetoothHidDeviceAppQosSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDeviceAppQosSettings(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothHidDeviceAppQosSettings getReal() {
        return (android.bluetooth.BluetoothHidDeviceAppQosSettings) real;
    }

    public android.bluetooth.BluetoothHidDeviceAppQosSettings unwrap() {
        return getReal();
    }

    public BluetoothHidDeviceAppQosSettings(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.bluetooth.BluetoothHidDeviceAppQosSettings(arg0, arg1, arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.bluetooth.BluetoothHidDeviceAppQosSettings) real).describeContents();
    }

    public int getDelayVariation() {
        return ((android.bluetooth.BluetoothHidDeviceAppQosSettings) real).getDelayVariation();
    }

    public int getLatency() {
        return ((android.bluetooth.BluetoothHidDeviceAppQosSettings) real).getLatency();
    }

    public int getPeakBandwidth() {
        return ((android.bluetooth.BluetoothHidDeviceAppQosSettings) real).getPeakBandwidth();
    }

    public int getServiceType() {
        return ((android.bluetooth.BluetoothHidDeviceAppQosSettings) real).getServiceType();
    }

    public int getTokenBucketSize() {
        return ((android.bluetooth.BluetoothHidDeviceAppQosSettings) real).getTokenBucketSize();
    }

    public int getTokenRate() {
        return ((android.bluetooth.BluetoothHidDeviceAppQosSettings) real).getTokenRate();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.BluetoothHidDeviceAppQosSettings) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int MAX = android.bluetooth.BluetoothHidDeviceAppQosSettings.MAX;
    public static final int SERVICE_BEST_EFFORT = android.bluetooth.BluetoothHidDeviceAppQosSettings.SERVICE_BEST_EFFORT;
    public static final int SERVICE_GUARANTEED = android.bluetooth.BluetoothHidDeviceAppQosSettings.SERVICE_GUARANTEED;
    public static final int SERVICE_NO_TRAFFIC = android.bluetooth.BluetoothHidDeviceAppQosSettings.SERVICE_NO_TRAFFIC;

}
