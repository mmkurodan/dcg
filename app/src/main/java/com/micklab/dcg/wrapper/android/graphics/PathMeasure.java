// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PathMeasure {
    private final android.graphics.PathMeasure real;

    public PathMeasure(android.graphics.PathMeasure real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PathMeasure wrap(android.graphics.PathMeasure real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PathMeasure(real);
    }

    public android.graphics.PathMeasure unwrap() {
        return real;
    }

    public PathMeasure() {
        this(new android.graphics.PathMeasure());
    }

    public PathMeasure(com.micklab.dcg.wrapper.android.graphics.Path arg0, boolean arg1) {
        this(new android.graphics.PathMeasure(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public float getLength() {
        return real.getLength();
    }

    public boolean getMatrix(float arg0, com.micklab.dcg.wrapper.android.graphics.Matrix arg1, int arg2) {
        return real.getMatrix(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public boolean getPosTan(float arg0, float[] arg1, float[] arg2) {
        return real.getPosTan(arg0, arg1, arg2);
    }

    public boolean getSegment(float arg0, float arg1, com.micklab.dcg.wrapper.android.graphics.Path arg2, boolean arg3) {
        return real.getSegment(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public boolean isClosed() {
        return real.isClosed();
    }

    public boolean nextContour() {
        return real.nextContour();
    }

    public void setPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, boolean arg1) {
        real.setPath(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int POSITION_MATRIX_FLAG = android.graphics.PathMeasure.POSITION_MATRIX_FLAG;
    public static final int TANGENT_MATRIX_FLAG = android.graphics.PathMeasure.TANGENT_MATRIX_FLAG;

}
