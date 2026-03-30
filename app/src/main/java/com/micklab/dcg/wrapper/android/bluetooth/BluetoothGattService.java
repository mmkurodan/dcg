// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothGattService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothGattService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService wrap(android.bluetooth.BluetoothGattService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothGattService getReal() {
        return (android.bluetooth.BluetoothGattService) real;
    }

    public android.bluetooth.BluetoothGattService unwrap() {
        return getReal();
    }

    public BluetoothGattService(java.util.UUID arg0, int arg1) {
        this(new android.bluetooth.BluetoothGattService(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public boolean addCharacteristic(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg0) {
        return ((android.bluetooth.BluetoothGattService) real).addCharacteristic(arg0 == null ? null : arg0.getReal());
    }

    public boolean addService(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService arg0) {
        return ((android.bluetooth.BluetoothGattService) real).addService(arg0 == null ? null : arg0.getReal());
    }

    public int describeContents() {
        return ((android.bluetooth.BluetoothGattService) real).describeContents();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic getCharacteristic(java.util.UUID arg0) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic.wrap(((android.bluetooth.BluetoothGattService) real).getCharacteristic(arg0));
    }

    public int getInstanceId() {
        return ((android.bluetooth.BluetoothGattService) real).getInstanceId();
    }

    public int getType() {
        return ((android.bluetooth.BluetoothGattService) real).getType();
    }

    public java.util.UUID getUuid() {
        return ((android.bluetooth.BluetoothGattService) real).getUuid();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.BluetoothGattService) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int SERVICE_TYPE_PRIMARY = android.bluetooth.BluetoothGattService.SERVICE_TYPE_PRIMARY;
    public static final int SERVICE_TYPE_SECONDARY = android.bluetooth.BluetoothGattService.SERVICE_TYPE_SECONDARY;

}
