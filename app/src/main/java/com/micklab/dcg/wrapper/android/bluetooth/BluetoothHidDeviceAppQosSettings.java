// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHidDeviceAppQosSettings {
    private final android.bluetooth.BluetoothHidDeviceAppQosSettings real;

    public BluetoothHidDeviceAppQosSettings(android.bluetooth.BluetoothHidDeviceAppQosSettings real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDeviceAppQosSettings wrap(android.bluetooth.BluetoothHidDeviceAppQosSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDeviceAppQosSettings(real);
    }

    public android.bluetooth.BluetoothHidDeviceAppQosSettings unwrap() {
        return real;
    }

    public BluetoothHidDeviceAppQosSettings(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this(new android.bluetooth.BluetoothHidDeviceAppQosSettings(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getDelayVariation() {
        return real.getDelayVariation();
    }

    public int getLatency() {
        return real.getLatency();
    }

    public int getPeakBandwidth() {
        return real.getPeakBandwidth();
    }

    public int getServiceType() {
        return real.getServiceType();
    }

    public int getTokenBucketSize() {
        return real.getTokenBucketSize();
    }

    public int getTokenRate() {
        return real.getTokenRate();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int MAX = android.bluetooth.BluetoothHidDeviceAppQosSettings.MAX;
    public static final int SERVICE_BEST_EFFORT = android.bluetooth.BluetoothHidDeviceAppQosSettings.SERVICE_BEST_EFFORT;
    public static final int SERVICE_GUARANTEED = android.bluetooth.BluetoothHidDeviceAppQosSettings.SERVICE_GUARANTEED;
    public static final int SERVICE_NO_TRAFFIC = android.bluetooth.BluetoothHidDeviceAppQosSettings.SERVICE_NO_TRAFFIC;

}
