// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothGattService {
    private final android.bluetooth.BluetoothGattService real;

    public BluetoothGattService(android.bluetooth.BluetoothGattService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService wrap(android.bluetooth.BluetoothGattService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService(real);
    }

    public android.bluetooth.BluetoothGattService unwrap() {
        return real;
    }

    public BluetoothGattService(java.util.UUID arg0, int arg1) {
        this(new android.bluetooth.BluetoothGattService(arg0, arg1));
    }

    public boolean addCharacteristic(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg0) {
        return real.addCharacteristic(arg0 == null ? null : arg0.unwrap());
    }

    public boolean addService(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService arg0) {
        return real.addService(arg0 == null ? null : arg0.unwrap());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic getCharacteristic(java.util.UUID arg0) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic.wrap(real.getCharacteristic(arg0));
    }

    public int getInstanceId() {
        return real.getInstanceId();
    }

    public int getType() {
        return real.getType();
    }

    public java.util.UUID getUuid() {
        return real.getUuid();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int SERVICE_TYPE_PRIMARY = android.bluetooth.BluetoothGattService.SERVICE_TYPE_PRIMARY;
    public static final int SERVICE_TYPE_SECONDARY = android.bluetooth.BluetoothGattService.SERVICE_TYPE_SECONDARY;

}
