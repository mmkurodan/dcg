// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHealthAppConfiguration {
    private final android.bluetooth.BluetoothHealthAppConfiguration real;

    public BluetoothHealthAppConfiguration(android.bluetooth.BluetoothHealthAppConfiguration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthAppConfiguration wrap(android.bluetooth.BluetoothHealthAppConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthAppConfiguration(real);
    }

    public android.bluetooth.BluetoothHealthAppConfiguration unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public int getDataType() {
        return real.getDataType();
    }

    public java.lang.String getName() {
        return real.getName();
    }

    public int getRole() {
        return real.getRole();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
