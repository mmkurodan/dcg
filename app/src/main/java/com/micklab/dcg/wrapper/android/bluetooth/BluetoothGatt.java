// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothGatt {
    private final android.bluetooth.BluetoothGatt real;

    public BluetoothGatt(android.bluetooth.BluetoothGatt real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt wrap(android.bluetooth.BluetoothGatt real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothGatt(real);
    }

    public android.bluetooth.BluetoothGatt unwrap() {
        return real;
    }

    public void abortReliableWrite() {
        real.abortReliableWrite();
    }

    public void abortReliableWrite(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        real.abortReliableWrite(arg0 == null ? null : arg0.unwrap());
    }

    public boolean beginReliableWrite() {
        return real.beginReliableWrite();
    }

    public void close() {
        real.close();
    }

    public boolean connect() {
        return real.connect();
    }

    public void disconnect() {
        real.disconnect();
    }

    public boolean discoverServices() {
        return real.discoverServices();
    }

    public boolean executeReliableWrite() {
        return real.executeReliableWrite();
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return real.getConnectionState(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getDevice() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(real.getDevice());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService getService(java.util.UUID arg0) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService.wrap(real.getService(arg0));
    }

    public boolean readCharacteristic(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg0) {
        return real.readCharacteristic(arg0 == null ? null : arg0.unwrap());
    }

    public boolean readDescriptor(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor arg0) {
        return real.readDescriptor(arg0 == null ? null : arg0.unwrap());
    }

    public void readPhy() {
        real.readPhy();
    }

    public boolean readRemoteRssi() {
        return real.readRemoteRssi();
    }

    public boolean requestConnectionPriority(int arg0) {
        return real.requestConnectionPriority(arg0);
    }

    public boolean requestMtu(int arg0) {
        return real.requestMtu(arg0);
    }

    public boolean setCharacteristicNotification(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg0, boolean arg1) {
        return real.setCharacteristicNotification(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setPreferredPhy(int arg0, int arg1, int arg2) {
        real.setPreferredPhy(arg0, arg1, arg2);
    }

    public boolean writeCharacteristic(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg0) {
        return real.writeCharacteristic(arg0 == null ? null : arg0.unwrap());
    }

    public int writeCharacteristic(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg0, byte[] arg1, int arg2) {
        return real.writeCharacteristic(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean writeDescriptor(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor arg0) {
        return real.writeDescriptor(arg0 == null ? null : arg0.unwrap());
    }

    public int writeDescriptor(com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor arg0, byte[] arg1) {
        return real.writeDescriptor(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int CONNECTION_PRIORITY_BALANCED = android.bluetooth.BluetoothGatt.CONNECTION_PRIORITY_BALANCED;
    public static final int CONNECTION_PRIORITY_DCK = android.bluetooth.BluetoothGatt.CONNECTION_PRIORITY_DCK;
    public static final int CONNECTION_PRIORITY_HIGH = android.bluetooth.BluetoothGatt.CONNECTION_PRIORITY_HIGH;
    public static final int CONNECTION_PRIORITY_LOW_POWER = android.bluetooth.BluetoothGatt.CONNECTION_PRIORITY_LOW_POWER;
    public static final int GATT_CONNECTION_CONGESTED = android.bluetooth.BluetoothGatt.GATT_CONNECTION_CONGESTED;
    public static final int GATT_CONNECTION_TIMEOUT = android.bluetooth.BluetoothGatt.GATT_CONNECTION_TIMEOUT;
    public static final int GATT_FAILURE = android.bluetooth.BluetoothGatt.GATT_FAILURE;
    public static final int GATT_INSUFFICIENT_AUTHENTICATION = android.bluetooth.BluetoothGatt.GATT_INSUFFICIENT_AUTHENTICATION;
    public static final int GATT_INSUFFICIENT_AUTHORIZATION = android.bluetooth.BluetoothGatt.GATT_INSUFFICIENT_AUTHORIZATION;
    public static final int GATT_INSUFFICIENT_ENCRYPTION = android.bluetooth.BluetoothGatt.GATT_INSUFFICIENT_ENCRYPTION;
    public static final int GATT_INVALID_ATTRIBUTE_LENGTH = android.bluetooth.BluetoothGatt.GATT_INVALID_ATTRIBUTE_LENGTH;
    public static final int GATT_INVALID_OFFSET = android.bluetooth.BluetoothGatt.GATT_INVALID_OFFSET;
    public static final int GATT_READ_NOT_PERMITTED = android.bluetooth.BluetoothGatt.GATT_READ_NOT_PERMITTED;
    public static final int GATT_REQUEST_NOT_SUPPORTED = android.bluetooth.BluetoothGatt.GATT_REQUEST_NOT_SUPPORTED;
    public static final int GATT_SUCCESS = android.bluetooth.BluetoothGatt.GATT_SUCCESS;
    public static final int GATT_WRITE_NOT_PERMITTED = android.bluetooth.BluetoothGatt.GATT_WRITE_NOT_PERMITTED;

}
