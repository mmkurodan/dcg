// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothCodecType {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothCodecType(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecType wrap(android.bluetooth.BluetoothCodecType real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecType(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothCodecType getReal() {
        return (android.bluetooth.BluetoothCodecType) real;
    }

    public android.bluetooth.BluetoothCodecType unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.bluetooth.BluetoothCodecType) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.bluetooth.BluetoothCodecType) real).equals(arg0);
    }

    public long getCodecId() {
        return ((android.bluetooth.BluetoothCodecType) real).getCodecId();
    }

    public java.lang.String getCodecName() {
        return ((android.bluetooth.BluetoothCodecType) real).getCodecName();
    }

    public int hashCode() {
        return ((android.bluetooth.BluetoothCodecType) real).hashCode();
    }

    public boolean isMandatoryCodec() {
        return ((android.bluetooth.BluetoothCodecType) real).isMandatoryCodec();
    }

    public java.lang.String toString() {
        return ((android.bluetooth.BluetoothCodecType) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.BluetoothCodecType) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final long CODEC_ID_AAC = android.bluetooth.BluetoothCodecType.CODEC_ID_AAC;
    public static final long CODEC_ID_APTX = android.bluetooth.BluetoothCodecType.CODEC_ID_APTX;
    public static final long CODEC_ID_APTX_HD = android.bluetooth.BluetoothCodecType.CODEC_ID_APTX_HD;
    public static final long CODEC_ID_LDAC = android.bluetooth.BluetoothCodecType.CODEC_ID_LDAC;
    public static final long CODEC_ID_OPUS = android.bluetooth.BluetoothCodecType.CODEC_ID_OPUS;
    public static final long CODEC_ID_SBC = android.bluetooth.BluetoothCodecType.CODEC_ID_SBC;

}
