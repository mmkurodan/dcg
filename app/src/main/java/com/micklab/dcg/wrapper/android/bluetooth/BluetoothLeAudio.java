// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothLeAudio {
    private final android.bluetooth.BluetoothLeAudio real;

    public BluetoothLeAudio(android.bluetooth.BluetoothLeAudio real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudio wrap(android.bluetooth.BluetoothLeAudio real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudio(real);
    }

    public android.bluetooth.BluetoothLeAudio unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice getConnectedGroupLeadDevice(int arg0) {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice.wrap(real.getConnectedGroupLeadDevice(arg0));
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return real.getConnectionState(arg0 == null ? null : arg0.unwrap());
    }

    public int getGroupId(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return real.getGroupId(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String ACTION_LE_AUDIO_CONNECTION_STATE_CHANGED = android.bluetooth.BluetoothLeAudio.ACTION_LE_AUDIO_CONNECTION_STATE_CHANGED;
    public static final int GROUP_ID_INVALID = android.bluetooth.BluetoothLeAudio.GROUP_ID_INVALID;

}
