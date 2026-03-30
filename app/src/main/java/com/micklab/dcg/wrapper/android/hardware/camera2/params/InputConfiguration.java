// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class InputConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InputConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.InputConfiguration wrap(android.hardware.camera2.params.InputConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.InputConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.InputConfiguration getReal() {
        return (android.hardware.camera2.params.InputConfiguration) real;
    }

    public android.hardware.camera2.params.InputConfiguration unwrap() {
        return getReal();
    }

    public InputConfiguration(java.util.Collection arg0, int arg1) {
        this(new android.hardware.camera2.params.InputConfiguration(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public InputConfiguration(int arg0, int arg1, int arg2) {
        this(new android.hardware.camera2.params.InputConfiguration(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.InputConfiguration) real).equals(arg0);
    }

    public int getFormat() {
        return ((android.hardware.camera2.params.InputConfiguration) real).getFormat();
    }

    public int getHeight() {
        return ((android.hardware.camera2.params.InputConfiguration) real).getHeight();
    }

    public int getWidth() {
        return ((android.hardware.camera2.params.InputConfiguration) real).getWidth();
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.InputConfiguration) real).hashCode();
    }

    public boolean isMultiResolution() {
        return ((android.hardware.camera2.params.InputConfiguration) real).isMultiResolution();
    }

    public java.lang.String toString() {
        return ((android.hardware.camera2.params.InputConfiguration) real).toString();
    }

}
