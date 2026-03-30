// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class MeteringRectangle {
    private final android.hardware.camera2.params.MeteringRectangle real;

    public MeteringRectangle(android.hardware.camera2.params.MeteringRectangle real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.MeteringRectangle wrap(android.hardware.camera2.params.MeteringRectangle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.MeteringRectangle(real);
    }

    public android.hardware.camera2.params.MeteringRectangle unwrap() {
        return real;
    }

    public MeteringRectangle(com.micklab.dcg.wrapper.android.graphics.Rect arg0, int arg1) {
        this(new android.hardware.camera2.params.MeteringRectangle(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public MeteringRectangle(com.micklab.dcg.wrapper.android.graphics.Point arg0, com.micklab.dcg.wrapper.android.util.Size arg1, int arg2) {
        this(new android.hardware.camera2.params.MeteringRectangle(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public MeteringRectangle(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this(new android.hardware.camera2.params.MeteringRectangle(arg0, arg1, arg2, arg3, arg4));
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public boolean equals(com.micklab.dcg.wrapper.android.hardware.camera2.params.MeteringRectangle arg0) {
        return real.equals(arg0 == null ? null : arg0.unwrap());
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int getMeteringWeight() {
        return real.getMeteringWeight();
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getRect() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getRect());
    }

    public com.micklab.dcg.wrapper.android.util.Size getSize() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(real.getSize());
    }

    public com.micklab.dcg.wrapper.android.graphics.Point getUpperLeftPoint() {
        return com.micklab.dcg.wrapper.android.graphics.Point.wrap(real.getUpperLeftPoint());
    }

    public int getWidth() {
        return real.getWidth();
    }

    public int getX() {
        return real.getX();
    }

    public int getY() {
        return real.getY();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int METERING_WEIGHT_DONT_CARE = android.hardware.camera2.params.MeteringRectangle.METERING_WEIGHT_DONT_CARE;
    public static final int METERING_WEIGHT_MAX = android.hardware.camera2.params.MeteringRectangle.METERING_WEIGHT_MAX;
    public static final int METERING_WEIGHT_MIN = android.hardware.camera2.params.MeteringRectangle.METERING_WEIGHT_MIN;

}
