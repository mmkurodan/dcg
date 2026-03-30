// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.display;

public final class HdrConversionMode {
    private final android.hardware.display.HdrConversionMode real;

    public HdrConversionMode(android.hardware.display.HdrConversionMode real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.display.HdrConversionMode wrap(android.hardware.display.HdrConversionMode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.HdrConversionMode(real);
    }

    public android.hardware.display.HdrConversionMode unwrap() {
        return real;
    }

    public HdrConversionMode(int arg0) {
        this(new android.hardware.display.HdrConversionMode(arg0));
    }

    public HdrConversionMode(int arg0, int arg1) {
        this(new android.hardware.display.HdrConversionMode(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getConversionMode() {
        return real.getConversionMode();
    }

    public int getPreferredHdrOutputType() {
        return real.getPreferredHdrOutputType();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int HDR_CONVERSION_FORCE = android.hardware.display.HdrConversionMode.HDR_CONVERSION_FORCE;
    public static final int HDR_CONVERSION_PASSTHROUGH = android.hardware.display.HdrConversionMode.HDR_CONVERSION_PASSTHROUGH;
    public static final int HDR_CONVERSION_SYSTEM = android.hardware.display.HdrConversionMode.HDR_CONVERSION_SYSTEM;
    public static final int HDR_CONVERSION_UNSUPPORTED = android.hardware.display.HdrConversionMode.HDR_CONVERSION_UNSUPPORTED;

}
