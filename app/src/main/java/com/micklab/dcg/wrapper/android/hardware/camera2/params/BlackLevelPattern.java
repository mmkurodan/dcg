// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class BlackLevelPattern {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BlackLevelPattern(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.BlackLevelPattern wrap(android.hardware.camera2.params.BlackLevelPattern real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.BlackLevelPattern(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.BlackLevelPattern getReal() {
        return (android.hardware.camera2.params.BlackLevelPattern) real;
    }

    public android.hardware.camera2.params.BlackLevelPattern unwrap() {
        return getReal();
    }

    public BlackLevelPattern(int[] arg0) {
        this(new android.hardware.camera2.params.BlackLevelPattern(arg0), (__DcgwBridgeToken) null);
    }

    public void copyTo(int[] arg0, int arg1) {
        ((android.hardware.camera2.params.BlackLevelPattern) real).copyTo(arg0, arg1);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.BlackLevelPattern) real).equals(arg0);
    }

    public int getOffsetForIndex(int arg0, int arg1) {
        return ((android.hardware.camera2.params.BlackLevelPattern) real).getOffsetForIndex(arg0, arg1);
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.BlackLevelPattern) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.camera2.params.BlackLevelPattern) real).toString();
    }

    public static final int COUNT = android.hardware.camera2.params.BlackLevelPattern.COUNT;

}
