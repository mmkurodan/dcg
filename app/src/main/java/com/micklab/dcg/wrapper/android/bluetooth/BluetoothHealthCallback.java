// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHealthCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothHealthCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthCallback wrap(android.bluetooth.BluetoothHealthCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthCallback(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothHealthCallback getReal() {
        return (android.bluetooth.BluetoothHealthCallback) real;
    }

    public android.bluetooth.BluetoothHealthCallback unwrap() {
        return getReal();
    }

    public void onHealthAppConfigurationStatusChange(com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthAppConfiguration arg0, int arg1) {
        ((android.bluetooth.BluetoothHealthCallback) real).onHealthAppConfigurationStatusChange(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onHealthChannelStateChange(com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthAppConfiguration arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg4, int arg5) {
        ((android.bluetooth.BluetoothHealthCallback) real).onHealthChannelStateChange(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4 == null ? null : arg4.getReal(), arg5);
    }

}
