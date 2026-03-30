// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothGattCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothGattCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCallback wrap(android.bluetooth.BluetoothGattCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCallback(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothGattCallback getReal() {
        return (android.bluetooth.BluetoothGattCallback) real;
    }

    public android.bluetooth.BluetoothGattCallback unwrap() {
        return getReal();
    }

    public void onCharacteristicChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1) {
        ((android.bluetooth.BluetoothGattCallback) real).onCharacteristicChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onCharacteristicChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1, byte[] arg2) {
        ((android.bluetooth.BluetoothGattCallback) real).onCharacteristicChanged(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onCharacteristicRead(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1, int arg2) {
        ((android.bluetooth.BluetoothGattCallback) real).onCharacteristicRead(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onCharacteristicRead(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1, byte[] arg2, int arg3) {
        ((android.bluetooth.BluetoothGattCallback) real).onCharacteristicRead(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public void onCharacteristicWrite(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1, int arg2) {
        ((android.bluetooth.BluetoothGattCallback) real).onCharacteristicWrite(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onConnectionStateChange(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1, int arg2) {
        ((android.bluetooth.BluetoothGattCallback) real).onConnectionStateChange(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onDescriptorRead(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor arg1, int arg2) {
        ((android.bluetooth.BluetoothGattCallback) real).onDescriptorRead(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onDescriptorRead(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor arg1, int arg2, byte[] arg3) {
        ((android.bluetooth.BluetoothGattCallback) real).onDescriptorRead(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public void onDescriptorWrite(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor arg1, int arg2) {
        ((android.bluetooth.BluetoothGattCallback) real).onDescriptorWrite(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onMtuChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1, int arg2) {
        ((android.bluetooth.BluetoothGattCallback) real).onMtuChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onPhyRead(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1, int arg2, int arg3) {
        ((android.bluetooth.BluetoothGattCallback) real).onPhyRead(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onPhyUpdate(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1, int arg2, int arg3) {
        ((android.bluetooth.BluetoothGattCallback) real).onPhyUpdate(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onReadRemoteRssi(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1, int arg2) {
        ((android.bluetooth.BluetoothGattCallback) real).onReadRemoteRssi(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onReliableWriteCompleted(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1) {
        ((android.bluetooth.BluetoothGattCallback) real).onReliableWriteCompleted(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onServiceChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0) {
        ((android.bluetooth.BluetoothGattCallback) real).onServiceChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onServicesDiscovered(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1) {
        ((android.bluetooth.BluetoothGattCallback) real).onServicesDiscovered(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
