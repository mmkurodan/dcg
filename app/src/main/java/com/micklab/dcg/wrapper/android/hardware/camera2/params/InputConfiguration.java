// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class InputConfiguration {
    private final android.hardware.camera2.params.InputConfiguration real;

    public InputConfiguration(android.hardware.camera2.params.InputConfiguration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.InputConfiguration wrap(android.hardware.camera2.params.InputConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.InputConfiguration(real);
    }

    public android.hardware.camera2.params.InputConfiguration unwrap() {
        return real;
    }

    public InputConfiguration(java.util.Collection arg0, int arg1) {
        this(new android.hardware.camera2.params.InputConfiguration(arg0, arg1));
    }

    public InputConfiguration(int arg0, int arg1, int arg2) {
        this(new android.hardware.camera2.params.InputConfiguration(arg0, arg1, arg2));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getFormat() {
        return real.getFormat();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isMultiResolution() {
        return real.isMultiResolution();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
