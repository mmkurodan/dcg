// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class RoundedCorner {
    private final android.view.RoundedCorner real;

    public RoundedCorner(android.view.RoundedCorner real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.RoundedCorner wrap(android.view.RoundedCorner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.RoundedCorner(real);
    }

    public android.view.RoundedCorner unwrap() {
        return real;
    }

    public RoundedCorner(int arg0, int arg1, int arg2, int arg3) {
        this(new android.view.RoundedCorner(arg0, arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getCenter() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(real.getCenter());
    }

    public int getPosition() {
        return real.getPosition();
    }

    public int getRadius() {
        return real.getRadius();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int POSITION_BOTTOM_LEFT = android.view.RoundedCorner.POSITION_BOTTOM_LEFT;
    public static final int POSITION_BOTTOM_RIGHT = android.view.RoundedCorner.POSITION_BOTTOM_RIGHT;
    public static final int POSITION_TOP_LEFT = android.view.RoundedCorner.POSITION_TOP_LEFT;
    public static final int POSITION_TOP_RIGHT = android.view.RoundedCorner.POSITION_TOP_RIGHT;

}
