// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothLeAudio {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothLeAudio(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudio wrap(android.bluetooth.BluetoothLeAudio real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudio(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothLeAudio getReal() {
        return (android.bluetooth.BluetoothLeAudio) real;
    }

    public android.bluetooth.BluetoothLeAudio unwrap() {
        return getReal();
    }

    public void close() {
        ((android.bluetooth.BluetoothLeAudio) real).close();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getConnectedGroupLeadDevice(int arg0) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(((android.bluetooth.BluetoothLeAudio) real).getConnectedGroupLeadDevice(arg0));
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothLeAudio) real).getConnectionState(arg0 == null ? null : arg0.getReal());
    }

    public int getGroupId(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return ((android.bluetooth.BluetoothLeAudio) real).getGroupId(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String ACTION_LE_AUDIO_CONNECTION_STATE_CHANGED = android.bluetooth.BluetoothLeAudio.ACTION_LE_AUDIO_CONNECTION_STATE_CHANGED;
    public static final int GROUP_ID_INVALID = android.bluetooth.BluetoothLeAudio.GROUP_ID_INVALID;

}
