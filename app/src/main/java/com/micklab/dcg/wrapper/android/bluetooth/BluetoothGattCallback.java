// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothGattCallback {
    private final android.bluetooth.BluetoothGattCallback real;

    public BluetoothGattCallback(android.bluetooth.BluetoothGattCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCallback wrap(android.bluetooth.BluetoothGattCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCallback(real);
    }

    public android.bluetooth.BluetoothGattCallback unwrap() {
        return real;
    }

    public void onCharacteristicChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1) {
        real.onCharacteristicChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onCharacteristicChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1, byte[] arg2) {
        real.onCharacteristicChanged(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onCharacteristicRead(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1, int arg2) {
        real.onCharacteristicRead(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onCharacteristicRead(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1, byte[] arg2, int arg3) {
        real.onCharacteristicRead(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public void onCharacteristicWrite(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg1, int arg2) {
        real.onCharacteristicWrite(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onConnectionStateChange(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1, int arg2) {
        real.onConnectionStateChange(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void onDescriptorRead(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor arg1, int arg2) {
        real.onDescriptorRead(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onDescriptorRead(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor arg1, int arg2, byte[] arg3) {
        real.onDescriptorRead(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public void onDescriptorWrite(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor arg1, int arg2) {
        real.onDescriptorWrite(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onMtuChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1, int arg2) {
        real.onMtuChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void onPhyRead(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1, int arg2, int arg3) {
        real.onPhyRead(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void onPhyUpdate(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1, int arg2, int arg3) {
        real.onPhyUpdate(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void onReadRemoteRssi(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1, int arg2) {
        real.onReadRemoteRssi(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public void onReliableWriteCompleted(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1) {
        real.onReliableWriteCompleted(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onServiceChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0) {
        real.onServiceChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onServicesDiscovered(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt arg0, int arg1) {
        real.onServicesDiscovered(arg0 == null ? null : arg0.unwrap(), arg1);
    }

}
