// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHealthCallback {
    private final android.bluetooth.BluetoothHealthCallback real;

    public BluetoothHealthCallback(android.bluetooth.BluetoothHealthCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthCallback wrap(android.bluetooth.BluetoothHealthCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthCallback(real);
    }

    public android.bluetooth.BluetoothHealthCallback unwrap() {
        return real;
    }

    public void onHealthAppConfigurationStatusChange(com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthAppConfiguration arg0, int arg1) {
        real.onHealthAppConfigurationStatusChange(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onHealthChannelStateChange(com.micklab.dcg.wrapper.android.bluetooth.BluetoothHealthAppConfiguration arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.os.ParcelFileDescriptor arg4, int arg5) {
        real.onHealthChannelStateChange(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5);
    }

}
