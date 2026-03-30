// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PathMeasure {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PathMeasure(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PathMeasure wrap(android.graphics.PathMeasure real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PathMeasure(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.PathMeasure getReal() {
        return (android.graphics.PathMeasure) real;
    }

    public android.graphics.PathMeasure unwrap() {
        return getReal();
    }

    public PathMeasure() {
        this(new android.graphics.PathMeasure(), (__DcgwBridgeToken) null);
    }

    public PathMeasure(com.micklab.dcg.wrapper.android.graphics.Path arg0, boolean arg1) {
        this(new android.graphics.PathMeasure(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public float getLength() {
        return ((android.graphics.PathMeasure) real).getLength();
    }

    public boolean getMatrix(float arg0, com.micklab.dcg.wrapper.android.graphics.Matrix arg1, int arg2) {
        return ((android.graphics.PathMeasure) real).getMatrix(arg0, arg1 == null ? null : arg1.getReal(), arg2);
    }

    public boolean getPosTan(float arg0, float[] arg1, float[] arg2) {
        return ((android.graphics.PathMeasure) real).getPosTan(arg0, arg1, arg2);
    }

    public boolean getSegment(float arg0, float arg1, com.micklab.dcg.wrapper.android.graphics.Path arg2, boolean arg3) {
        return ((android.graphics.PathMeasure) real).getSegment(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public boolean isClosed() {
        return ((android.graphics.PathMeasure) real).isClosed();
    }

    public boolean nextContour() {
        return ((android.graphics.PathMeasure) real).nextContour();
    }

    public void setPath(com.micklab.dcg.wrapper.android.graphics.Path arg0, boolean arg1) {
        ((android.graphics.PathMeasure) real).setPath(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int POSITION_MATRIX_FLAG = android.graphics.PathMeasure.POSITION_MATRIX_FLAG;
    public static final int TANGENT_MATRIX_FLAG = android.graphics.PathMeasure.TANGENT_MATRIX_FLAG;

}
