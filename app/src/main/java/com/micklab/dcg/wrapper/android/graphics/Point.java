// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Point {
    private final android.graphics.Point real;

    public Point(android.graphics.Point real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Point wrap(android.graphics.Point real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Point(real);
    }

    public android.graphics.Point unwrap() {
        return real;
    }

    public Point() {
        this(new android.graphics.Point());
    }

    public Point(com.micklab.dcg.wrapper.android.graphics.Point arg0) {
        this(new android.graphics.Point(arg0 == null ? null : arg0.unwrap()));
    }

    public Point(int arg0, int arg1) {
        this(new android.graphics.Point(arg0, arg1));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public boolean equals(int arg0, int arg1) {
        return real.equals(arg0, arg1);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void negate() {
        real.negate();
    }

    public void offset(int arg0, int arg1) {
        real.offset(arg0, arg1);
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        real.readFromParcel(arg0 == null ? null : arg0.unwrap());
    }

    public void set(int arg0, int arg1) {
        real.set(arg0, arg1);
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
