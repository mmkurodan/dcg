// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothLeAudioCodecStatus {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothLeAudioCodecStatus(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecStatus wrap(android.bluetooth.BluetoothLeAudioCodecStatus real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecStatus(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothLeAudioCodecStatus getReal() {
        return (android.bluetooth.BluetoothLeAudioCodecStatus) real;
    }

    public android.bluetooth.BluetoothLeAudioCodecStatus unwrap() {
        return getReal();
    }

    public BluetoothLeAudioCodecStatus(com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig arg0, com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig arg1, java.util.List arg2, java.util.List arg3, java.util.List arg4, java.util.List arg5) {
        this(new android.bluetooth.BluetoothLeAudioCodecStatus(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.bluetooth.BluetoothLeAudioCodecStatus) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.bluetooth.BluetoothLeAudioCodecStatus) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig getInputCodecConfig() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.wrap(((android.bluetooth.BluetoothLeAudioCodecStatus) real).getInputCodecConfig());
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig getOutputCodecConfig() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.wrap(((android.bluetooth.BluetoothLeAudioCodecStatus) real).getOutputCodecConfig());
    }

    public int hashCode() {
        return ((android.bluetooth.BluetoothLeAudioCodecStatus) real).hashCode();
    }

    public boolean isInputCodecConfigSelectable(com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig arg0) {
        return ((android.bluetooth.BluetoothLeAudioCodecStatus) real).isInputCodecConfigSelectable(arg0 == null ? null : arg0.getReal());
    }

    public boolean isOutputCodecConfigSelectable(com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig arg0) {
        return ((android.bluetooth.BluetoothLeAudioCodecStatus) real).isOutputCodecConfigSelectable(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String toString() {
        return ((android.bluetooth.BluetoothLeAudioCodecStatus) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.BluetoothLeAudioCodecStatus) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String EXTRA_LE_AUDIO_CODEC_STATUS = android.bluetooth.BluetoothLeAudioCodecStatus.EXTRA_LE_AUDIO_CODEC_STATUS;

}
