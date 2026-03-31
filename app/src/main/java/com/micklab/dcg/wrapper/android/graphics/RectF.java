// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class RectF {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RectF(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.RectF wrap(android.graphics.RectF real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.RectF(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.RectF getReal() {
        return (android.graphics.RectF) real;
    }

    public android.graphics.RectF unwrap() {
        return getReal();
    }

    public RectF() {
        this(new android.graphics.RectF(), (__DcgwBridgeToken) null);
    }

    public RectF(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        this(new android.graphics.RectF(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RectF(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        this(new android.graphics.RectF(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RectF(float arg0, float arg1, float arg2, float arg3) {
        this(new android.graphics.RectF(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public float centerX() {
        return ((android.graphics.RectF) real).centerX();
    }

    public float centerY() {
        return ((android.graphics.RectF) real).centerY();
    }

    public boolean contains(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return ((android.graphics.RectF) real).contains(arg0 == null ? null : arg0.getReal());
    }

    public boolean contains(float arg0, float arg1) {
        return ((android.graphics.RectF) real).contains(arg0, arg1);
    }

    public boolean contains(float arg0, float arg1, float arg2, float arg3) {
        return ((android.graphics.RectF) real).contains(arg0, arg1, arg2, arg3);
    }

    public int describeContents() {
        return ((android.graphics.RectF) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.RectF) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.graphics.RectF) real).hashCode();
    }

    public float height() {
        return ((android.graphics.RectF) real).height();
    }

    public void inset(float arg0, float arg1) {
        ((android.graphics.RectF) real).inset(arg0, arg1);
    }

    public boolean intersect(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return ((android.graphics.RectF) real).intersect(arg0 == null ? null : arg0.getReal());
    }

    public boolean intersect(float arg0, float arg1, float arg2, float arg3) {
        return ((android.graphics.RectF) real).intersect(arg0, arg1, arg2, arg3);
    }

    public static boolean intersects(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
        return android.graphics.RectF.intersects(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean intersects(float arg0, float arg1, float arg2, float arg3) {
        return ((android.graphics.RectF) real).intersects(arg0, arg1, arg2, arg3);
    }

    public boolean isEmpty() {
        return ((android.graphics.RectF) real).isEmpty();
    }

    public void offset(float arg0, float arg1) {
        ((android.graphics.RectF) real).offset(arg0, arg1);
    }

    public void offsetTo(float arg0, float arg1) {
        ((android.graphics.RectF) real).offsetTo(arg0, arg1);
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        ((android.graphics.RectF) real).readFromParcel(arg0 == null ? null : arg0.getReal());
    }

    public void round(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.RectF) real).round(arg0 == null ? null : arg0.getReal());
    }

    public void roundOut(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.RectF) real).roundOut(arg0 == null ? null : arg0.getReal());
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        ((android.graphics.RectF) real).set(arg0 == null ? null : arg0.getReal());
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.RectF) real).set(arg0 == null ? null : arg0.getReal());
    }

    public void set(float arg0, float arg1, float arg2, float arg3) {
        ((android.graphics.RectF) real).set(arg0, arg1, arg2, arg3);
    }

    public void setEmpty() {
        ((android.graphics.RectF) real).setEmpty();
    }

    public boolean setIntersect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
        return ((android.graphics.RectF) real).setIntersect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void sort() {
        ((android.graphics.RectF) real).sort();
    }

    public java.lang.String toShortString() {
        return ((android.graphics.RectF) real).toShortString();
    }

    public java.lang.String toString() {
        return ((android.graphics.RectF) real).toString();
    }

    public void union(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        ((android.graphics.RectF) real).union(arg0 == null ? null : arg0.getReal());
    }

    public void union(float arg0, float arg1) {
        ((android.graphics.RectF) real).union(arg0, arg1);
    }

    public void union(float arg0, float arg1, float arg2, float arg3) {
        ((android.graphics.RectF) real).union(arg0, arg1, arg2, arg3);
    }

    public float width() {
        return ((android.graphics.RectF) real).width();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.RectF) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
