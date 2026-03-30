// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHidDeviceAppSdpSettings {
    private final android.bluetooth.BluetoothHidDeviceAppSdpSettings real;

    public BluetoothHidDeviceAppSdpSettings(android.bluetooth.BluetoothHidDeviceAppSdpSettings real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDeviceAppSdpSettings wrap(android.bluetooth.BluetoothHidDeviceAppSdpSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHidDeviceAppSdpSettings(real);
    }

    public android.bluetooth.BluetoothHidDeviceAppSdpSettings unwrap() {
        return real;
    }

    public BluetoothHidDeviceAppSdpSettings(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, byte arg3, byte[] arg4) {
        this(new android.bluetooth.BluetoothHidDeviceAppSdpSettings(arg0, arg1, arg2, arg3, arg4));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public java.lang.String getDescription() {
        return real.getDescription();
    }

    public byte[] getDescriptors() {
        return real.getDescriptors();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public java.lang.String getProvider() {
        return real.getProvider();
    }

    public byte getSubclass() {
        return real.getSubclass();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
