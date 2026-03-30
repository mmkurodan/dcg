// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Matrix {
    private final android.graphics.Matrix real;

    public Matrix(android.graphics.Matrix real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Matrix wrap(android.graphics.Matrix real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Matrix(real);
    }

    public android.graphics.Matrix unwrap() {
        return real;
    }

    public Matrix() {
        this(new android.graphics.Matrix());
    }

    public Matrix(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        this(new android.graphics.Matrix(arg0 == null ? null : arg0.unwrap()));
    }

    public void dump(java.io.PrintWriter arg0) {
        real.dump(arg0);
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public void getValues(float[] arg0) {
        real.getValues(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean invert(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        return real.invert(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isAffine() {
        return real.isAffine();
    }

    public boolean isIdentity() {
        return real.isIdentity();
    }

    public void mapPoints(float[] arg0) {
        real.mapPoints(arg0);
    }

    public void mapPoints(float[] arg0, float[] arg1) {
        real.mapPoints(arg0, arg1);
    }

    public void mapPoints(float[] arg0, int arg1, float[] arg2, int arg3, int arg4) {
        real.mapPoints(arg0, arg1, arg2, arg3, arg4);
    }

    public float mapRadius(float arg0) {
        return real.mapRadius(arg0);
    }

    public boolean mapRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0) {
        return real.mapRect(arg0 == null ? null : arg0.unwrap());
    }

    public boolean mapRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1) {
        return real.mapRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void mapVectors(float[] arg0) {
        real.mapVectors(arg0);
    }

    public void mapVectors(float[] arg0, float[] arg1) {
        real.mapVectors(arg0, arg1);
    }

    public void mapVectors(float[] arg0, int arg1, float[] arg2, int arg3, int arg4) {
        real.mapVectors(arg0, arg1, arg2, arg3, arg4);
    }

    public boolean postConcat(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        return real.postConcat(arg0 == null ? null : arg0.unwrap());
    }

    public boolean postRotate(float arg0) {
        return real.postRotate(arg0);
    }

    public boolean postRotate(float arg0, float arg1, float arg2) {
        return real.postRotate(arg0, arg1, arg2);
    }

    public boolean postScale(float arg0, float arg1) {
        return real.postScale(arg0, arg1);
    }

    public boolean postScale(float arg0, float arg1, float arg2, float arg3) {
        return real.postScale(arg0, arg1, arg2, arg3);
    }

    public boolean postSkew(float arg0, float arg1) {
        return real.postSkew(arg0, arg1);
    }

    public boolean postSkew(float arg0, float arg1, float arg2, float arg3) {
        return real.postSkew(arg0, arg1, arg2, arg3);
    }

    public boolean postTranslate(float arg0, float arg1) {
        return real.postTranslate(arg0, arg1);
    }

    public boolean preConcat(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        return real.preConcat(arg0 == null ? null : arg0.unwrap());
    }

    public boolean preRotate(float arg0) {
        return real.preRotate(arg0);
    }

    public boolean preRotate(float arg0, float arg1, float arg2) {
        return real.preRotate(arg0, arg1, arg2);
    }

    public boolean preScale(float arg0, float arg1) {
        return real.preScale(arg0, arg1);
    }

    public boolean preScale(float arg0, float arg1, float arg2, float arg3) {
        return real.preScale(arg0, arg1, arg2, arg3);
    }

    public boolean preSkew(float arg0, float arg1) {
        return real.preSkew(arg0, arg1);
    }

    public boolean preSkew(float arg0, float arg1, float arg2, float arg3) {
        return real.preSkew(arg0, arg1, arg2, arg3);
    }

    public boolean preTranslate(float arg0, float arg1) {
        return real.preTranslate(arg0, arg1);
    }

    public boolean rectStaysRect() {
        return real.rectStaysRect();
    }

    public void reset() {
        real.reset();
    }

    public void set(com.micklab.dcg.wrapper.android.graphics.Matrix arg0) {
        real.set(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setConcat(com.micklab.dcg.wrapper.android.graphics.Matrix arg0, com.micklab.dcg.wrapper.android.graphics.Matrix arg1) {
        return real.setConcat(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public boolean setPolyToPoly(float[] arg0, int arg1, float[] arg2, int arg3, int arg4) {
        return real.setPolyToPoly(arg0, arg1, arg2, arg3, arg4);
    }

    public boolean setRectToRect(com.micklab.dcg.wrapper.android.graphics.RectF arg0, com.micklab.dcg.wrapper.android.graphics.RectF arg1, com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit arg2) {
        return real.setRectToRect(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void setRotate(float arg0) {
        real.setRotate(arg0);
    }

    public void setRotate(float arg0, float arg1, float arg2) {
        real.setRotate(arg0, arg1, arg2);
    }

    public void setScale(float arg0, float arg1) {
        real.setScale(arg0, arg1);
    }

    public void setScale(float arg0, float arg1, float arg2, float arg3) {
        real.setScale(arg0, arg1, arg2, arg3);
    }

    public void setSinCos(float arg0, float arg1) {
        real.setSinCos(arg0, arg1);
    }

    public void setSinCos(float arg0, float arg1, float arg2, float arg3) {
        real.setSinCos(arg0, arg1, arg2, arg3);
    }

    public void setSkew(float arg0, float arg1) {
        real.setSkew(arg0, arg1);
    }

    public void setSkew(float arg0, float arg1, float arg2, float arg3) {
        real.setSkew(arg0, arg1, arg2, arg3);
    }

    public void setTranslate(float arg0, float arg1) {
        real.setTranslate(arg0, arg1);
    }

    public void setValues(float[] arg0) {
        real.setValues(arg0);
    }

    public java.lang.String toShortString() {
        return real.toShortString();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final com.micklab.dcg.wrapper.android.graphics.Matrix IDENTITY_MATRIX = com.micklab.dcg.wrapper.android.graphics.Matrix.wrap(android.graphics.Matrix.IDENTITY_MATRIX);
    public static final int MPERSP_0 = android.graphics.Matrix.MPERSP_0;
    public static final int MPERSP_1 = android.graphics.Matrix.MPERSP_1;
    public static final int MPERSP_2 = android.graphics.Matrix.MPERSP_2;
    public static final int MSCALE_X = android.graphics.Matrix.MSCALE_X;
    public static final int MSCALE_Y = android.graphics.Matrix.MSCALE_Y;
    public static final int MSKEW_X = android.graphics.Matrix.MSKEW_X;
    public static final int MSKEW_Y = android.graphics.Matrix.MSKEW_Y;
    public static final int MTRANS_X = android.graphics.Matrix.MTRANS_X;
    public static final int MTRANS_Y = android.graphics.Matrix.MTRANS_Y;

    public static final class ScaleToFit {
        private final android.graphics.Matrix.ScaleToFit real;

        public ScaleToFit(android.graphics.Matrix.ScaleToFit real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit wrap(android.graphics.Matrix.ScaleToFit real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit(real);
        }

        public android.graphics.Matrix.ScaleToFit unwrap() {
            return real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit.wrap(android.graphics.Matrix.ScaleToFit.valueOf(arg0));
        }

        public static android.graphics.Matrix.ScaleToFit[] values() {
            return android.graphics.Matrix.ScaleToFit.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit CENTER = com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit.wrap(android.graphics.Matrix.ScaleToFit.CENTER);
        public static final com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit END = com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit.wrap(android.graphics.Matrix.ScaleToFit.END);
        public static final com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit FILL = com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit.wrap(android.graphics.Matrix.ScaleToFit.FILL);
        public static final com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit START = com.micklab.dcg.wrapper.android.graphics.Matrix.ScaleToFit.wrap(android.graphics.Matrix.ScaleToFit.START);

    }
}
