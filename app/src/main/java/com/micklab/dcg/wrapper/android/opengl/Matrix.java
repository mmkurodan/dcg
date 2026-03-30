// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class Matrix {
    private final android.opengl.Matrix real;

    public Matrix(android.opengl.Matrix real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.Matrix wrap(android.opengl.Matrix real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.Matrix(real);
    }

    public android.opengl.Matrix unwrap() {
        return real;
    }

    public Matrix() {
        this(new android.opengl.Matrix());
    }

    public static void frustumM(float[] arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
        android.opengl.Matrix.frustumM(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static boolean invertM(float[] arg0, int arg1, float[] arg2, int arg3) {
        return android.opengl.Matrix.invertM(arg0, arg1, arg2, arg3);
    }

    public static float length(float arg0, float arg1, float arg2) {
        return android.opengl.Matrix.length(arg0, arg1, arg2);
    }

    public static void multiplyMM(float[] arg0, int arg1, float[] arg2, int arg3, float[] arg4, int arg5) {
        android.opengl.Matrix.multiplyMM(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void multiplyMV(float[] arg0, int arg1, float[] arg2, int arg3, float[] arg4, int arg5) {
        android.opengl.Matrix.multiplyMV(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void orthoM(float[] arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7) {
        android.opengl.Matrix.orthoM(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static void perspectiveM(float[] arg0, int arg1, float arg2, float arg3, float arg4, float arg5) {
        android.opengl.Matrix.perspectiveM(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void rotateM(float[] arg0, int arg1, float arg2, float arg3, float arg4, float arg5) {
        android.opengl.Matrix.rotateM(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void rotateM(float[] arg0, int arg1, float[] arg2, int arg3, float arg4, float arg5, float arg6, float arg7) {
        android.opengl.Matrix.rotateM(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static void scaleM(float[] arg0, int arg1, float arg2, float arg3, float arg4) {
        android.opengl.Matrix.scaleM(arg0, arg1, arg2, arg3, arg4);
    }

    public static void scaleM(float[] arg0, int arg1, float[] arg2, int arg3, float arg4, float arg5, float arg6) {
        android.opengl.Matrix.scaleM(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void setIdentityM(float[] arg0, int arg1) {
        android.opengl.Matrix.setIdentityM(arg0, arg1);
    }

    public static void setLookAtM(float[] arg0, int arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10) {
        android.opengl.Matrix.setLookAtM(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static void setRotateEulerM(float[] arg0, int arg1, float arg2, float arg3, float arg4) {
        android.opengl.Matrix.setRotateEulerM(arg0, arg1, arg2, arg3, arg4);
    }

    public static void setRotateEulerM2(float[] arg0, int arg1, float arg2, float arg3, float arg4) {
        android.opengl.Matrix.setRotateEulerM2(arg0, arg1, arg2, arg3, arg4);
    }

    public static void setRotateM(float[] arg0, int arg1, float arg2, float arg3, float arg4, float arg5) {
        android.opengl.Matrix.setRotateM(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void translateM(float[] arg0, int arg1, float arg2, float arg3, float arg4) {
        android.opengl.Matrix.translateM(arg0, arg1, arg2, arg3, arg4);
    }

    public static void translateM(float[] arg0, int arg1, float[] arg2, int arg3, float arg4, float arg5, float arg6) {
        android.opengl.Matrix.translateM(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public static void transposeM(float[] arg0, int arg1, float[] arg2, int arg3) {
        android.opengl.Matrix.transposeM(arg0, arg1, arg2, arg3);
    }

}
