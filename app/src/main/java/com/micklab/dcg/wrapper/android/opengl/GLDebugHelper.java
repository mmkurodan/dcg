// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLDebugHelper {
    private final android.opengl.GLDebugHelper real;

    public GLDebugHelper(android.opengl.GLDebugHelper real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLDebugHelper wrap(android.opengl.GLDebugHelper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLDebugHelper(real);
    }

    public android.opengl.GLDebugHelper unwrap() {
        return real;
    }

    public GLDebugHelper() {
        this(new android.opengl.GLDebugHelper());
    }

    public static javax.microedition.khronos.egl.EGL wrap(javax.microedition.khronos.egl.EGL arg0, int arg1, java.io.Writer arg2) {
        return android.opengl.GLDebugHelper.wrap(arg0, arg1, arg2);
    }

    public static javax.microedition.khronos.opengles.GL wrap(javax.microedition.khronos.opengles.GL arg0, int arg1, java.io.Writer arg2) {
        return android.opengl.GLDebugHelper.wrap(arg0, arg1, arg2);
    }

    public static final int CONFIG_CHECK_GL_ERROR = android.opengl.GLDebugHelper.CONFIG_CHECK_GL_ERROR;
    public static final int CONFIG_CHECK_THREAD = android.opengl.GLDebugHelper.CONFIG_CHECK_THREAD;
    public static final int CONFIG_LOG_ARGUMENT_NAMES = android.opengl.GLDebugHelper.CONFIG_LOG_ARGUMENT_NAMES;
    public static final int ERROR_WRONG_THREAD = android.opengl.GLDebugHelper.ERROR_WRONG_THREAD;

}
