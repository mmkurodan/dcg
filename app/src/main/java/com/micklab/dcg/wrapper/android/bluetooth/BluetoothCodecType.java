// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothCodecType {
    private final android.bluetooth.BluetoothCodecType real;

    public BluetoothCodecType(android.bluetooth.BluetoothCodecType real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecType wrap(android.bluetooth.BluetoothCodecType real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecType(real);
    }

    public android.bluetooth.BluetoothCodecType unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getCodecId() {
        return real.getCodecId();
    }

    public java.lang.String getCodecName() {
        return real.getCodecName();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isMandatoryCodec() {
        return real.isMandatoryCodec();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final long CODEC_ID_AAC = android.bluetooth.BluetoothCodecType.CODEC_ID_AAC;
    public static final long CODEC_ID_APTX = android.bluetooth.BluetoothCodecType.CODEC_ID_APTX;
    public static final long CODEC_ID_APTX_HD = android.bluetooth.BluetoothCodecType.CODEC_ID_APTX_HD;
    public static final long CODEC_ID_LDAC = android.bluetooth.BluetoothCodecType.CODEC_ID_LDAC;
    public static final long CODEC_ID_OPUS = android.bluetooth.BluetoothCodecType.CODEC_ID_OPUS;
    public static final long CODEC_ID_SBC = android.bluetooth.BluetoothCodecType.CODEC_ID_SBC;

}
