// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class RectF {
    private final android.graphics.RectF real;

    public RectF(android.graphics.RectF real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.RectF wrap(android.graphics.RectF real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.RectF(real);
    }

    public android.graphics.RectF unwrap() {
        return real;
    }

    public RectF() {
        this(new android.graphics.RectF());
    }

    public RectF(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        this(new android.graphics.RectF(arg0 == null ? null : arg0.unwrap()));
    }

    public RectF(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        this(new android.graphics.RectF(arg0 == null ? null : arg0.unwrap()));
    }

    public RectF(float arg0, float arg1, float arg2, float arg3) {
        this(new android.graphics.RectF(arg0, arg1, arg2, arg3));
    }

    public float centerX() {
        return real.centerX();
    }

    public float centerY() {
        return real.centerY();
    }

    public boolean contains(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return real.contains(arg0 == null ? null : arg0.unwrap());
    }

    public boolean contains(float arg0, float arg1) {
        return real.contains(arg0, arg1);
    }

    public boolean contains(float arg0, float arg1, float arg2, float arg3) {
        return real.contains(arg0, arg1, arg2, arg3);
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public float height() {
        return real.height();
    }

    public void inset(float arg0, float arg1) {
        real.inset(arg0, arg1);
    }

    public boolean intersect(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return real.intersect(arg0 == null ? null : arg0.unwrap());
    }

    public boolean intersect(float arg0, float arg1, float arg2, float arg3) {
        return real.intersect(arg0, arg1, arg2, arg3);
    }

    public static boolean intersects(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
        return android.graphics.RectF.intersects(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean intersects(float arg0, float arg1, float arg2, float arg3) {
        return real.intersects(arg0, arg1, arg2, arg3);
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public void offset(float arg0, float arg1) {
        real.offset(arg0, arg1);
    }

    public void offsetTo(float arg0, float arg1) {
        real.offsetTo(arg0, arg1);
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        real.readFromParcel(arg0 == null ? null : arg0.unwrap());
    }

    public void round(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.round(arg0 == null ? null : arg0.unwrap());
    }

    public void roundOut(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.roundOut(arg0 == null ? null : arg0.unwrap());
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }

    public void set(float arg0, float arg1, float arg2, float arg3) {
        real.set(arg0, arg1, arg2, arg3);
    }

    public void setEmpty() {
        real.setEmpty();
    }

    public boolean setIntersect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
        return real.setIntersect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void sort() {
        real.sort();
    }

    public java.lang.String toShortString() {
        return real.toShortString();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void union(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        real.union(arg0 == null ? null : arg0.unwrap());
    }

    public void union(float arg0, float arg1) {
        real.union(arg0, arg1);
    }

    public void union(float arg0, float arg1, float arg2, float arg3) {
        real.union(arg0, arg1, arg2, arg3);
    }

    public float width() {
        return real.width();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
