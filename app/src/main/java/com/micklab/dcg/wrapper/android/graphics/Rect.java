// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Rect {
    private final android.graphics.Rect real;

    public Rect(android.graphics.Rect real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Rect wrap(android.graphics.Rect real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Rect(real);
    }

    public android.graphics.Rect unwrap() {
        return real;
    }

    public Rect() {
        this(new android.graphics.Rect());
    }

    public Rect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        this(new android.graphics.Rect(arg0 == null ? null : arg0.unwrap()));
    }

    public Rect(int arg0, int arg1, int arg2, int arg3) {
        this(new android.graphics.Rect(arg0, arg1, arg2, arg3));
    }

    public int centerX() {
        return real.centerX();
    }

    public int centerY() {
        return real.centerY();
    }

    public boolean contains(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.contains(arg0 == null ? null : arg0.unwrap());
    }

    public boolean contains(int arg0, int arg1) {
        return real.contains(arg0, arg1);
    }

    public boolean contains(int arg0, int arg1, int arg2, int arg3) {
        return real.contains(arg0, arg1, arg2, arg3);
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public float exactCenterX() {
        return real.exactCenterX();
    }

    public float exactCenterY() {
        return real.exactCenterY();
    }

    public java.lang.String flattenToString() {
        return real.flattenToString();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public int height() {
        return real.height();
    }

    public void inset(com.micklab.dcg.wrapper.android.graphics.Insets arg0) {
        real.inset(arg0 == null ? null : arg0.unwrap());
    }

    public void inset(int arg0, int arg1) {
        real.inset(arg0, arg1);
    }

    public void inset(int arg0, int arg1, int arg2, int arg3) {
        real.inset(arg0, arg1, arg2, arg3);
    }

    public boolean intersect(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.intersect(arg0 == null ? null : arg0.unwrap());
    }

    public boolean intersect(int arg0, int arg1, int arg2, int arg3) {
        return real.intersect(arg0, arg1, arg2, arg3);
    }

    public static boolean intersects(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
        return android.graphics.Rect.intersects(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean intersects(int arg0, int arg1, int arg2, int arg3) {
        return real.intersects(arg0, arg1, arg2, arg3);
    }

    public boolean isEmpty() {
        return real.isEmpty();
    }

    public void offset(int arg0, int arg1) {
        real.offset(arg0, arg1);
    }

    public void offsetTo(int arg0, int arg1) {
        real.offsetTo(arg0, arg1);
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        real.readFromParcel(arg0 == null ? null : arg0.unwrap());
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }

    public void set(int arg0, int arg1, int arg2, int arg3) {
        real.set(arg0, arg1, arg2, arg3);
    }

    public void setEmpty() {
        real.setEmpty();
    }

    public boolean setIntersect(com.micklab.dcg.wrapper.android.graphics.Rect arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
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

    public static com.micklab.dcg.wrapper.android.graphics.Rect unflattenFromString(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(android.graphics.Rect.unflattenFromString(arg0));
    }

    public void union(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.union(arg0 == null ? null : arg0.unwrap());
    }

    public void union(int arg0, int arg1) {
        real.union(arg0, arg1);
    }

    public void union(int arg0, int arg1, int arg2, int arg3) {
        real.union(arg0, arg1, arg2, arg3);
    }

    public int width() {
        return real.width();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }


}
