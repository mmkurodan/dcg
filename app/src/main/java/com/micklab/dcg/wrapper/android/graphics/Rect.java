// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Rect {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Rect(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Rect wrap(android.graphics.Rect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Rect(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Rect getReal() {
        return (android.graphics.Rect) real;
    }

    public android.graphics.Rect unwrap() {
        return getReal();
    }

    public Rect() {
        this(new android.graphics.Rect(), (__DcgwBridgeToken) null);
    }

    public Rect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        this(new android.graphics.Rect(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Rect(int arg0, int arg1, int arg2, int arg3) {
        this(new android.graphics.Rect(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int centerX() {
        return ((android.graphics.Rect) real).centerX();
    }

    public int centerY() {
        return ((android.graphics.Rect) real).centerY();
    }

    public boolean contains(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.Rect) real).contains(arg0 == null ? null : arg0.getReal());
    }

    public boolean contains(int arg0, int arg1) {
        return ((android.graphics.Rect) real).contains(arg0, arg1);
    }

    public boolean contains(int arg0, int arg1, int arg2, int arg3) {
        return ((android.graphics.Rect) real).contains(arg0, arg1, arg2, arg3);
    }

    public int describeContents() {
        return ((android.graphics.Rect) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.graphics.Rect) real).equals(arg0);
    }

    public float exactCenterX() {
        return ((android.graphics.Rect) real).exactCenterX();
    }

    public float exactCenterY() {
        return ((android.graphics.Rect) real).exactCenterY();
    }

    public java.lang.String flattenToString() {
        return ((android.graphics.Rect) real).flattenToString();
    }

    public int hashCode() {
        return ((android.graphics.Rect) real).hashCode();
    }

    public int height() {
        return ((android.graphics.Rect) real).height();
    }

    public void inset(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
        ((android.graphics.Rect) real).inset(arg0 == null ? null : arg0.getReal());
    }

    public void inset(int arg0, int arg1) {
        ((android.graphics.Rect) real).inset(arg0, arg1);
    }

    public void inset(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.Rect) real).inset(arg0, arg1, arg2, arg3);
    }

    public boolean intersect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.Rect) real).intersect(arg0 == null ? null : arg0.getReal());
    }

    public boolean intersect(int arg0, int arg1, int arg2, int arg3) {
        return ((android.graphics.Rect) real).intersect(arg0, arg1, arg2, arg3);
    }

    public static boolean intersects(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return android.graphics.Rect.intersects(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public boolean intersects(int arg0, int arg1, int arg2, int arg3) {
        return ((android.graphics.Rect) real).intersects(arg0, arg1, arg2, arg3);
    }

    public boolean isEmpty() {
        return ((android.graphics.Rect) real).isEmpty();
    }

    public void offset(int arg0, int arg1) {
        ((android.graphics.Rect) real).offset(arg0, arg1);
    }

    public void offsetTo(int arg0, int arg1) {
        ((android.graphics.Rect) real).offsetTo(arg0, arg1);
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        ((android.graphics.Rect) real).readFromParcel(arg0 == null ? null : arg0.getReal());
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.Rect) real).set(arg0 == null ? null : arg0.getReal());
    }

    public void set(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.Rect) real).set(arg0, arg1, arg2, arg3);
    }

    public void setEmpty() {
        ((android.graphics.Rect) real).setEmpty();
    }

    public boolean setIntersect(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return ((android.graphics.Rect) real).setIntersect(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void sort() {
        ((android.graphics.Rect) real).sort();
    }

    public java.lang.String toShortString() {
        return ((android.graphics.Rect) real).toShortString();
    }

    public java.lang.String toString() {
        return ((android.graphics.Rect) real).toString();
    }

    public static com.micklab.dcg.wrapper.android.graphics.Rect unflattenFromString(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(android.graphics.Rect.unflattenFromString(arg0));
    }

    public void union(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.Rect) real).union(arg0 == null ? null : arg0.getReal());
    }

    public void union(int arg0, int arg1) {
        ((android.graphics.Rect) real).union(arg0, arg1);
    }

    public void union(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.Rect) real).union(arg0, arg1, arg2, arg3);
    }

    public int width() {
        return ((android.graphics.Rect) real).width();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.Rect) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }


}
