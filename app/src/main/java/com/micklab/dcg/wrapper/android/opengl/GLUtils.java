// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLUtils {
    private final android.opengl.GLUtils real;

    public GLUtils(android.opengl.GLUtils real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLUtils wrap(android.opengl.GLUtils real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLUtils(real);
    }

    public android.opengl.GLUtils unwrap() {
        return real;
    }

    public static java.lang.String getEGLErrorString(int arg0) {
        return android.opengl.GLUtils.getEGLErrorString(arg0);
    }

    public static int getInternalFormat(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return android.opengl.GLUtils.getInternalFormat(arg0 == null ? null : arg0.unwrap());
    }

    public static int getType(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return android.opengl.GLUtils.getType(arg0 == null ? null : arg0.unwrap());
    }

    public static void texImage2D(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap arg2, int arg3) {
        android.opengl.GLUtils.texImage2D(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public static void texImage2D(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap arg3, int arg4) {
        android.opengl.GLUtils.texImage2D(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4);
    }

    public static void texImage2D(int arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap arg3, int arg4, int arg5) {
        android.opengl.GLUtils.texImage2D(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5);
    }

    public static void texSubImage2D(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Bitmap arg4) {
        android.opengl.GLUtils.texSubImage2D(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap());
    }

    public static void texSubImage2D(int arg0, int arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Bitmap arg4, int arg5, int arg6) {
        android.opengl.GLUtils.texSubImage2D(arg0, arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap(), arg5, arg6);
    }

}
