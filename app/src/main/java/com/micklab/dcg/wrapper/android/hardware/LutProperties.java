// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class LutProperties {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LutProperties(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.LutProperties wrap(android.hardware.LutProperties real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.LutProperties(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.LutProperties getReal() {
        return (android.hardware.LutProperties) real;
    }

    public android.hardware.LutProperties unwrap() {
        return getReal();
    }

    public int getDimension() {
        return ((android.hardware.LutProperties) real).getDimension();
    }

    public int[] getSamplingKeys() {
        return ((android.hardware.LutProperties) real).getSamplingKeys();
    }

    public int getSize() {
        return ((android.hardware.LutProperties) real).getSize();
    }

    public static final int ONE_DIMENSION = android.hardware.LutProperties.ONE_DIMENSION;
    public static final int SAMPLING_KEY_CIE_Y = android.hardware.LutProperties.SAMPLING_KEY_CIE_Y;
    public static final int SAMPLING_KEY_MAX_RGB = android.hardware.LutProperties.SAMPLING_KEY_MAX_RGB;
    public static final int SAMPLING_KEY_RGB = android.hardware.LutProperties.SAMPLING_KEY_RGB;
    public static final int THREE_DIMENSION = android.hardware.LutProperties.THREE_DIMENSION;

}
