// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHealthAppConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothHealthAppConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthAppConfiguration wrap(android.bluetooth.BluetoothHealthAppConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthAppConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothHealthAppConfiguration getReal() {
        return (android.bluetooth.BluetoothHealthAppConfiguration) real;
    }

    public android.bluetooth.BluetoothHealthAppConfiguration unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.bluetooth.BluetoothHealthAppConfiguration) real).describeContents();
    }

    public int getDataType() {
        return ((android.bluetooth.BluetoothHealthAppConfiguration) real).getDataType();
    }

    public java.lang.String getName() {
        return ((android.bluetooth.BluetoothHealthAppConfiguration) real).getName();
    }

    public int getRole() {
        return ((android.bluetooth.BluetoothHealthAppConfiguration) real).getRole();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.BluetoothHealthAppConfiguration) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
