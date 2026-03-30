// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothHearingAid {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothHearingAid(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothHearingAid wrap(android.bluetooth.BluetoothHearingAid real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothHearingAid(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothHearingAid getReal() {
        return (android.bluetooth.BluetoothHearingAid) real;
    }

    public android.bluetooth.BluetoothHearingAid unwrap() {
        return getReal();
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothHearingAid) real).getConnectionState(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = android.bluetooth.BluetoothHearingAid.ACTION_CONNECTION_STATE_CHANGED;

}
