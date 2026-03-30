// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class BlackLevelPattern {
    private final android.hardware.camera2.params.BlackLevelPattern real;

    public BlackLevelPattern(android.hardware.camera2.params.BlackLevelPattern real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.BlackLevelPattern wrap(android.hardware.camera2.params.BlackLevelPattern real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.BlackLevelPattern(real);
    }

    public android.hardware.camera2.params.BlackLevelPattern unwrap() {
        return real;
    }

    public BlackLevelPattern(int[] arg0) {
        this(new android.hardware.camera2.params.BlackLevelPattern(arg0));
    }

    public void copyTo(int[] arg0, int arg1) {
        real.copyTo(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getOffsetForIndex(int arg0, int arg1) {
        return real.getOffsetForIndex(arg0, arg1);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int COUNT = android.hardware.camera2.params.BlackLevelPattern.COUNT;

}
