// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothManager {
    private final android.bluetooth.BluetoothManager real;

    public BluetoothManager(android.bluetooth.BluetoothManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothManager wrap(android.bluetooth.BluetoothManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothManager(real);
    }

    public android.bluetooth.BluetoothManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter getAdapter() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.wrap(real.getAdapter());
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1) {
        return real.getConnectionState(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattServer openGattServer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattServerCallback arg1) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattServer.wrap(real.openGattServer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

}
