// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class RoundedCorner {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RoundedCorner(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.RoundedCorner wrap(android.view.RoundedCorner real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.RoundedCorner(real, (__DcgwBridgeToken) null);
    }

    public android.view.RoundedCorner getReal() {
        return (android.view.RoundedCorner) real;
    }

    public android.view.RoundedCorner unwrap() {
        return getReal();
    }

    public RoundedCorner(int arg0, int arg1, int arg2, int arg3) {
        this(new android.view.RoundedCorner(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.view.RoundedCorner) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.view.RoundedCorner) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getCenter() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(((android.view.RoundedCorner) real).getCenter());
    }

    public int getPosition() {
        return ((android.view.RoundedCorner) real).getPosition();
    }

    public int getRadius() {
        return ((android.view.RoundedCorner) real).getRadius();
    }

    public int hashCode() {
        return ((android.view.RoundedCorner) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.view.RoundedCorner) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.RoundedCorner) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int POSITION_BOTTOM_LEFT = android.view.RoundedCorner.POSITION_BOTTOM_LEFT;
    public static final int POSITION_BOTTOM_RIGHT = android.view.RoundedCorner.POSITION_BOTTOM_RIGHT;
    public static final int POSITION_TOP_LEFT = android.view.RoundedCorner.POSITION_TOP_LEFT;
    public static final int POSITION_TOP_RIGHT = android.view.RoundedCorner.POSITION_TOP_RIGHT;

}
