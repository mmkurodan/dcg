// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothGattServerCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothGattServerCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattServerCallback wrap(android.bluetooth.BluetoothGattServerCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattServerCallback(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothGattServerCallback getReal() {
        return (android.bluetooth.BluetoothGattServerCallback) real;
    }

    public android.bluetooth.BluetoothGattServerCallback unwrap() {
        return getReal();
    }

    public void onCharacteristicReadRequest(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg3) {
        ((android.bluetooth.BluetoothGattServerCallback) real).onCharacteristicReadRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void onCharacteristicWriteRequest(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattCharacteristic arg2, boolean arg3, boolean arg4, int arg5, byte[] arg6) {
        ((android.bluetooth.BluetoothGattServerCallback) real).onCharacteristicWriteRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5, arg6);
    }

    public void onConnectionStateChange(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, int arg2) {
        ((android.bluetooth.BluetoothGattServerCallback) real).onConnectionStateChange(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onDescriptorReadRequest(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor arg3) {
        ((android.bluetooth.BluetoothGattServerCallback) real).onDescriptorReadRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal());
    }

    public void onDescriptorWriteRequest(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattDescriptor arg2, boolean arg3, boolean arg4, int arg5, byte[] arg6) {
        ((android.bluetooth.BluetoothGattServerCallback) real).onDescriptorWriteRequest(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5, arg6);
    }

    public void onExecuteWrite(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, boolean arg2) {
        ((android.bluetooth.BluetoothGattServerCallback) real).onExecuteWrite(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void onMtuChanged(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1) {
        ((android.bluetooth.BluetoothGattServerCallback) real).onMtuChanged(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onNotificationSent(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1) {
        ((android.bluetooth.BluetoothGattServerCallback) real).onNotificationSent(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onPhyRead(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, int arg2, int arg3) {
        ((android.bluetooth.BluetoothGattServerCallback) real).onPhyRead(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onPhyUpdate(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1, int arg2, int arg3) {
        ((android.bluetooth.BluetoothGattServerCallback) real).onPhyUpdate(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void onServiceAdded(int arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattService arg1) {
        ((android.bluetooth.BluetoothGattServerCallback) real).onServiceAdded(arg0, arg1 == null ? null : arg1.getReal());
    }

}
