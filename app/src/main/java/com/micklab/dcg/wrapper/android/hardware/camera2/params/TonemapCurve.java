// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class TonemapCurve {
    private final android.hardware.camera2.params.TonemapCurve real;

    public TonemapCurve(android.hardware.camera2.params.TonemapCurve real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.TonemapCurve wrap(android.hardware.camera2.params.TonemapCurve real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.TonemapCurve(real);
    }

    public android.hardware.camera2.params.TonemapCurve unwrap() {
        return real;
    }

    public TonemapCurve(float[] arg0, float[] arg1, float[] arg2) {
        this(new android.hardware.camera2.params.TonemapCurve(arg0, arg1, arg2));
    }

    public void copyColorCurve(int arg0, float[] arg1, int arg2) {
        real.copyColorCurve(arg0, arg1, arg2);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.PointF getPoint(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.PointF.wrap(real.getPoint(arg0, arg1));
    }

    public int getPointCount(int arg0) {
        return real.getPointCount(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final int CHANNEL_BLUE = android.hardware.camera2.params.TonemapCurve.CHANNEL_BLUE;
    public static final int CHANNEL_GREEN = android.hardware.camera2.params.TonemapCurve.CHANNEL_GREEN;
    public static final int CHANNEL_RED = android.hardware.camera2.params.TonemapCurve.CHANNEL_RED;
    public static final float LEVEL_BLACK = android.hardware.camera2.params.TonemapCurve.LEVEL_BLACK;
    public static final float LEVEL_WHITE = android.hardware.camera2.params.TonemapCurve.LEVEL_WHITE;
    public static final int POINT_SIZE = android.hardware.camera2.params.TonemapCurve.POINT_SIZE;

}
