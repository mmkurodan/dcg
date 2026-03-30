// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothA2dp {
    private final android.bluetooth.BluetoothA2dp real;

    public BluetoothA2dp(android.bluetooth.BluetoothA2dp real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothA2dp wrap(android.bluetooth.BluetoothA2dp real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothA2dp(real);
    }

    public android.bluetooth.BluetoothA2dp unwrap() {
        return real;
    }

    public void finalize() {
        real.finalize();
    }

    public int getConnectionState(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return real.getConnectionState(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isA2dpPlaying(com.micklab.dcg.wrapper.android.bluetooth.BluetoothDevice arg0) {
        return real.isA2dpPlaying(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String ACTION_CONNECTION_STATE_CHANGED = android.bluetooth.BluetoothA2dp.ACTION_CONNECTION_STATE_CHANGED;
    public static final java.lang.String ACTION_PLAYING_STATE_CHANGED = android.bluetooth.BluetoothA2dp.ACTION_PLAYING_STATE_CHANGED;
    public static final int STATE_NOT_PLAYING = android.bluetooth.BluetoothA2dp.STATE_NOT_PLAYING;
    public static final int STATE_PLAYING = android.bluetooth.BluetoothA2dp.STATE_PLAYING;

}
