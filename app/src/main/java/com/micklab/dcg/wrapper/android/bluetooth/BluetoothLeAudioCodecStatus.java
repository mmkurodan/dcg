// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothLeAudioCodecStatus {
    private final android.bluetooth.BluetoothLeAudioCodecStatus real;

    public BluetoothLeAudioCodecStatus(android.bluetooth.BluetoothLeAudioCodecStatus real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecStatus wrap(android.bluetooth.BluetoothLeAudioCodecStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecStatus(real);
    }

    public android.bluetooth.BluetoothLeAudioCodecStatus unwrap() {
        return real;
    }

    public BluetoothLeAudioCodecStatus(com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig arg1, java.util.List arg2, java.util.List arg3, java.util.List arg4, java.util.List arg5) {
        this(new android.bluetooth.BluetoothLeAudioCodecStatus(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4, arg5));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig getInputCodecConfig() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.wrap(real.getInputCodecConfig());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig getOutputCodecConfig() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.wrap(real.getOutputCodecConfig());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isInputCodecConfigSelectable(com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig arg0) {
        return real.isInputCodecConfigSelectable(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isOutputCodecConfigSelectable(com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig arg0) {
        return real.isOutputCodecConfigSelectable(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String EXTRA_LE_AUDIO_CODEC_STATUS = android.bluetooth.BluetoothLeAudioCodecStatus.EXTRA_LE_AUDIO_CODEC_STATUS;

}
