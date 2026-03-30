// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class Visibility {
    private final android.opengl.Visibility real;

    public Visibility(android.opengl.Visibility real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.Visibility wrap(android.opengl.Visibility real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.Visibility(real);
    }

    public android.opengl.Visibility unwrap() {
        return real;
    }

    public Visibility() {
        this(new android.opengl.Visibility());
    }

    public static void computeBoundingSphere(float[] arg0, int arg1, int arg2, float[] arg3, int arg4) {
        android.opengl.Visibility.computeBoundingSphere(arg0, arg1, arg2, arg3, arg4);
    }

    public static int frustumCullSpheres(float[] arg0, int arg1, float[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        return android.opengl.Visibility.frustumCullSpheres(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static int visibilityTest(float[] arg0, int arg1, float[] arg2, int arg3, char[] arg4, int arg5, int arg6) {
        return android.opengl.Visibility.visibilityTest(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

}
