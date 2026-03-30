// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class MeteringRectangle {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MeteringRectangle(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.MeteringRectangle wrap(android.hardware.camera2.params.MeteringRectangle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.MeteringRectangle(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.MeteringRectangle getReal() {
        return (android.hardware.camera2.params.MeteringRectangle) real;
    }

    public android.hardware.camera2.params.MeteringRectangle unwrap() {
        return getReal();
    }

    public MeteringRectangle(com.micklab.dcg.wrapper.android.graphics.Rect arg0, int arg1) {
        this(new android.hardware.camera2.params.MeteringRectangle(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public MeteringRectangle(com.micklab.dcg.wrapper.android.graphics.Point arg0, com.micklab.dcg.wrapper.android.util.Size arg1, int arg2) {
        this(new android.hardware.camera2.params.MeteringRectangle(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public MeteringRectangle(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.hardware.camera2.params.MeteringRectangle(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.MeteringRectangle) real).equals(arg0);
    }

    public boolean equals(com.micklab.dcg.wrapper.android.hardware.camera2.params.MeteringRectangle arg0) {
        return ((android.hardware.camera2.params.MeteringRectangle) real).equals(arg0 == null ? null : arg0.getReal());
    }

    public int getHeight() {
        return ((android.hardware.camera2.params.MeteringRectangle) real).getHeight();
    }

    public int getMeteringWeight() {
        return ((android.hardware.camera2.params.MeteringRectangle) real).getMeteringWeight();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getRect() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.hardware.camera2.params.MeteringRectangle) real).getRect());
    }

    public com.micklab.dcg.wrapper.android.util.Size getSize() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(((android.hardware.camera2.params.MeteringRectangle) real).getSize());
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getUpperLeftPoint() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(((android.hardware.camera2.params.MeteringRectangle) real).getUpperLeftPoint());
    }

    public int getWidth() {
        return ((android.hardware.camera2.params.MeteringRectangle) real).getWidth();
    }

    public int getX() {
        return ((android.hardware.camera2.params.MeteringRectangle) real).getX();
    }

    public int getY() {
        return ((android.hardware.camera2.params.MeteringRectangle) real).getY();
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.MeteringRectangle) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.camera2.params.MeteringRectangle) real).toString();
    }

    public static final int METERING_WEIGHT_DONT_CARE = android.hardware.camera2.params.MeteringRectangle.METERING_WEIGHT_DONT_CARE;
    public static final int METERING_WEIGHT_MAX = android.hardware.camera2.params.MeteringRectangle.METERING_WEIGHT_MAX;
    public static final int METERING_WEIGHT_MIN = android.hardware.camera2.params.MeteringRectangle.METERING_WEIGHT_MIN;

}
