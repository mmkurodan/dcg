// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PointF {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PointF(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PointF wrap(android.graphics.PointF real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PointF(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.PointF getReal() {
        return (android.graphics.PointF) real;
    }

    public android.graphics.PointF unwrap() {
        return getReal();
    }

    public PointF() {
        this(new android.graphics.PointF(), (__DcgwBridgeToken) null);
    }

    public PointF(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
        this(new android.graphics.PointF(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public PointF(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
        this(new android.graphics.PointF(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public PointF(float arg0, float arg1) {
        this(new android.graphics.PointF(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.graphics.PointF) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.PointF) real).equals(arg0);
    }

    public boolean equals(float arg0, float arg1) {
        return ((android.graphics.PointF) real).equals(arg0, arg1);
    }

    public int hashCode() {
        return ((android.graphics.PointF) real).hashCode();
    }

    public float length() {
        return ((android.graphics.PointF) real).length();
    }

    public static float length(float arg0, float arg1) {
        return android.graphics.PointF.length(arg0, arg1);
    }

    public void negate() {
        ((android.graphics.PointF) real).negate();
    }

    public void offset(float arg0, float arg1) {
        ((android.graphics.PointF) real).offset(arg0, arg1);
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        ((android.graphics.PointF) real).readFromParcel(arg0 == null ? null : arg0.getReal());
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
        ((android.graphics.PointF) real).set(arg0 == null ? null : arg0.getReal());
    }

    public void set(float arg0, float arg1) {
        ((android.graphics.PointF) real).set(arg0, arg1);
    }

    public java.lang.String toString() {
        return ((android.graphics.PointF) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.PointF) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
