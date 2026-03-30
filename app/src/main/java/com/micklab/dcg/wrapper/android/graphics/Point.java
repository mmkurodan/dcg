// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Point {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Point(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Point wrap(android.graphics.Point real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Point(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Point getReal() {
        return (android.graphics.Point) real;
    }

    public android.graphics.Point unwrap() {
        return getReal();
    }

    public Point() {
        this(new android.graphics.Point(), (__DcgwBridgeToken) null);
    }

    public Point(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
        this(new android.graphics.Point(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Point(int arg0, int arg1) {
        this(new android.graphics.Point(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.graphics.Point) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.Point) real).equals(arg0);
    }

    public boolean equals(int arg0, int arg1) {
        return ((android.graphics.Point) real).equals(arg0, arg1);
    }

    public int hashCode() {
        return ((android.graphics.Point) real).hashCode();
    }

    public void negate() {
        ((android.graphics.Point) real).negate();
    }

    public void offset(int arg0, int arg1) {
        ((android.graphics.Point) real).offset(arg0, arg1);
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        ((android.graphics.Point) real).readFromParcel(arg0 == null ? null : arg0.getReal());
    }

    public void set(int arg0, int arg1) {
        ((android.graphics.Point) real).set(arg0, arg1);
    }

    public java.lang.String toString() {
        return ((android.graphics.Point) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.Point) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
