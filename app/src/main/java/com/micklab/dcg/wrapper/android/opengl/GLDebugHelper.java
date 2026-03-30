// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLDebugHelper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GLDebugHelper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLDebugHelper wrap(android.opengl.GLDebugHelper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLDebugHelper(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.GLDebugHelper getReal() {
        return (android.opengl.GLDebugHelper) real;
    }

    public android.opengl.GLDebugHelper unwrap() {
        return getReal();
    }

    public GLDebugHelper() {
        this(new android.opengl.GLDebugHelper(), (__DcgwBridgeToken) null);
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
