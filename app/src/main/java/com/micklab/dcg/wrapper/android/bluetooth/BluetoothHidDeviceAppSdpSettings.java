// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHidDeviceAppSdpSettings {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothHidDeviceAppSdpSettings(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDeviceAppSdpSettings wrap(android.bluetooth.BluetoothHidDeviceAppSdpSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDeviceAppSdpSettings(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothHidDeviceAppSdpSettings getReal() {
        return (android.bluetooth.BluetoothHidDeviceAppSdpSettings) real;
    }

    public android.bluetooth.BluetoothHidDeviceAppSdpSettings unwrap() {
        return getReal();
    }

    public BluetoothHidDeviceAppSdpSettings(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, byte arg3, byte[] arg4) {
        this(new android.bluetooth.BluetoothHidDeviceAppSdpSettings(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.bluetooth.BluetoothHidDeviceAppSdpSettings) real).describeContents();
    }

    public java.lang.String getDescription() {
        return ((android.bluetooth.BluetoothHidDeviceAppSdpSettings) real).getDescription();
    }

    public byte[] getDescriptors() {
        return ((android.bluetooth.BluetoothHidDeviceAppSdpSettings) real).getDescriptors();
    }

    public java.lang.String getName() {
        return ((android.bluetooth.BluetoothHidDeviceAppSdpSettings) real).getName();
    }

    public java.lang.String getProvider() {
        return ((android.bluetooth.BluetoothHidDeviceAppSdpSettings) real).getProvider();
    }

    public byte getSubclass() {
        return ((android.bluetooth.BluetoothHidDeviceAppSdpSettings) real).getSubclass();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.BluetoothHidDeviceAppSdpSettings) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
