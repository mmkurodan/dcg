// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHearingAid {
    private final android.bluetooth.BluetoothHearingAid real;

    public BluetoothHearingAid(android.bluetooth.BluetoothHearingAid real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHearingAid wrap(android.bluetooth.BluetoothHearingAid real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHearingAid(real);
    }

    public android.bluetooth.BluetoothHearingAid unwrap() {
        return real;
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return real.getConnectionState(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = android.bluetooth.BluetoothHearingAid.ACTION_CONNECTION_STATE_CHANGED;

}
