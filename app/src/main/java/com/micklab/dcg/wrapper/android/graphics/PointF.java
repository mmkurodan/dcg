// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PointF {
    private final android.graphics.PointF real;

    public PointF(android.graphics.PointF real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PointF wrap(android.graphics.PointF real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PointF(real);
    }

    public android.graphics.PointF unwrap() {
        return real;
    }

    public PointF() {
        this(new android.graphics.PointF());
    }

    public PointF(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
        this(new android.graphics.PointF(arg0 == null ? null : arg0.unwrap()));
    }

    public PointF(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
        this(new android.graphics.PointF(arg0 == null ? null : arg0.unwrap()));
    }

    public PointF(float arg0, float arg1) {
        this(new android.graphics.PointF(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public boolean equals(float arg0, float arg1) {
        return real.equals(arg0, arg1);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public float length() {
        return real.length();
    }

    public static float length(float arg0, float arg1) {
        return android.graphics.PointF.length(arg0, arg1);
    }

    public void negate() {
        real.negate();
    }

    public void offset(float arg0, float arg1) {
        real.offset(arg0, arg1);
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        real.readFromParcel(arg0 == null ? null : arg0.unwrap());
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.PointF arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }

    public void set(float arg0, float arg1) {
        real.set(arg0, arg1);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
