// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGLExt {
    private final android.opengl.EGLExt real;

    public EGLExt(android.opengl.EGLExt real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLExt wrap(android.opengl.EGLExt real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGLExt(real);
    }

    public android.opengl.EGLExt unwrap() {
        return real;
    }

    public EGLExt() {
        this(new android.opengl.EGLExt());
    }

    public static com.micklab.dcg.wrapper.android.hardware.SyncFence eglDupNativeFenceFDANDROID(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSync arg1) {
        return com.micklab.dcg.wrapper.android.hardware.SyncFence.wrap(android.opengl.EGLExt.eglDupNativeFenceFDANDROID(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public static boolean eglPresentationTimeANDROID(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSurface arg1, long arg2) {
        return android.opengl.EGLExt.eglPresentationTimeANDROID(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static final int EGL_CONTEXT_FLAGS_KHR = android.opengl.EGLExt.EGL_CONTEXT_FLAGS_KHR;
    public static final int EGL_CONTEXT_MAJOR_VERSION_KHR = android.opengl.EGLExt.EGL_CONTEXT_MAJOR_VERSION_KHR;
    public static final int EGL_CONTEXT_MINOR_VERSION_KHR = android.opengl.EGLExt.EGL_CONTEXT_MINOR_VERSION_KHR;
    public static final int EGL_NO_NATIVE_FENCE_FD_ANDROID = android.opengl.EGLExt.EGL_NO_NATIVE_FENCE_FD_ANDROID;
    public static final int EGL_OPENGL_ES3_BIT_KHR = android.opengl.EGLExt.EGL_OPENGL_ES3_BIT_KHR;
    public static final int EGL_RECORDABLE_ANDROID = android.opengl.EGLExt.EGL_RECORDABLE_ANDROID;
    public static final int EGL_SYNC_NATIVE_FENCE_ANDROID = android.opengl.EGLExt.EGL_SYNC_NATIVE_FENCE_ANDROID;
    public static final int EGL_SYNC_NATIVE_FENCE_FD_ANDROID = android.opengl.EGLExt.EGL_SYNC_NATIVE_FENCE_FD_ANDROID;
    public static final int EGL_SYNC_NATIVE_FENCE_SIGNALED_ANDROID = android.opengl.EGLExt.EGL_SYNC_NATIVE_FENCE_SIGNALED_ANDROID;

}
