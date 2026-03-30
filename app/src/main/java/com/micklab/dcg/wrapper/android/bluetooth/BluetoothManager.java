// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothManager wrap(android.bluetooth.BluetoothManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothManager(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothManager getReal() {
        return (android.bluetooth.BluetoothManager) real;
    }

    public android.bluetooth.BluetoothManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter getAdapter() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothAdapter.wrap(((android.bluetooth.BluetoothManager) real).getAdapter());
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0, int arg1) {
        return ((android.bluetooth.BluetoothManager) real).getConnectionState(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattServer openGattServer(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattServerCallback arg1) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothGattServer.wrap(((android.bluetooth.BluetoothManager) real).openGattServer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

}
