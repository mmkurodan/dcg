// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.display;

public final class HdrConversionMode {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HdrConversionMode(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.display.HdrConversionMode wrap(android.hardware.display.HdrConversionMode real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.display.HdrConversionMode(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.display.HdrConversionMode getReal() {
        return (android.hardware.display.HdrConversionMode) real;
    }

    public android.hardware.display.HdrConversionMode unwrap() {
        return getReal();
    }

    public HdrConversionMode(int arg0) {
        this(new android.hardware.display.HdrConversionMode(arg0), (__DcgwBridgeToken) null);
    }

    public HdrConversionMode(int arg0, int arg1) {
        this(new android.hardware.display.HdrConversionMode(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.hardware.display.HdrConversionMode) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.display.HdrConversionMode) real).equals(arg0);
    }

    public int getConversionMode() {
        return ((android.hardware.display.HdrConversionMode) real).getConversionMode();
    }

    public int getPreferredHdrOutputType() {
        return ((android.hardware.display.HdrConversionMode) real).getPreferredHdrOutputType();
    }

    public int hashCode() {
        return ((android.hardware.display.HdrConversionMode) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.display.HdrConversionMode) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.display.HdrConversionMode) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int HDR_CONVERSION_FORCE = android.hardware.display.HdrConversionMode.HDR_CONVERSION_FORCE;
    public static final int HDR_CONVERSION_PASSTHROUGH = android.hardware.display.HdrConversionMode.HDR_CONVERSION_PASSTHROUGH;
    public static final int HDR_CONVERSION_SYSTEM = android.hardware.display.HdrConversionMode.HDR_CONVERSION_SYSTEM;
    public static final int HDR_CONVERSION_UNSUPPORTED = android.hardware.display.HdrConversionMode.HDR_CONVERSION_UNSUPPORTED;

}
