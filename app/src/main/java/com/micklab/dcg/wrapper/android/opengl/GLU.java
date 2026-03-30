// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLU {
    private final android.opengl.GLU real;

    public GLU(android.opengl.GLU real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLU wrap(android.opengl.GLU real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLU(real);
    }

    public android.opengl.GLU unwrap() {
        return real;
    }

    public GLU() {
        this(new android.opengl.GLU());
    }

    public static java.lang.String gluErrorString(int arg0) {
        return android.opengl.GLU.gluErrorString(arg0);
    }

    public static void gluLookAt(javax.microedition.khronos.opengles.GL10 arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9) {
        android.opengl.GLU.gluLookAt(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
    }

    public static void gluOrtho2D(javax.microedition.khronos.opengles.GL10 arg0, float arg1, float arg2, float arg3, float arg4) {
        android.opengl.GLU.gluOrtho2D(arg0, arg1, arg2, arg3, arg4);
    }

    public static void gluPerspective(javax.microedition.khronos.opengles.GL10 arg0, float arg1, float arg2, float arg3, float arg4) {
        android.opengl.GLU.gluPerspective(arg0, arg1, arg2, arg3, arg4);
    }

    public static int gluProject(float arg0, float arg1, float arg2, float[] arg3, int arg4, float[] arg5, int arg6, int[] arg7, int arg8, float[] arg9, int arg10) {
        return android.opengl.GLU.gluProject(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

    public static int gluUnProject(float arg0, float arg1, float arg2, float[] arg3, int arg4, float[] arg5, int arg6, int[] arg7, int arg8, float[] arg9, int arg10) {
        return android.opengl.GLU.gluUnProject(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
    }

}
