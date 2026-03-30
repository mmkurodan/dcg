// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGL15 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EGL15(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGL15 wrap(android.opengl.EGL15 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGL15(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.EGL15 getReal() {
        return (android.opengl.EGL15) real;
    }

    public android.opengl.EGL15 unwrap() {
        return getReal();
    }

    public static int eglClientWaitSync(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSync arg1, int arg2, long arg3) {
        return android.opengl.EGL15.eglClientWaitSync(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3);
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLImage eglCreateImage(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLContext arg1, int arg2, long arg3, long[] arg4, int arg5) {
        return com.micklab.dcg.wrapper.android.opengl.EGLImage.wrap(android.opengl.EGL15.eglCreateImage(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4, arg5));
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLSurface eglCreatePlatformPixmapSurface(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLConfig arg1, java.nio.Buffer arg2, long[] arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.opengl.EGLSurface.wrap(android.opengl.EGL15.eglCreatePlatformPixmapSurface(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLSurface eglCreatePlatformWindowSurface(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLConfig arg1, java.nio.Buffer arg2, long[] arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.opengl.EGLSurface.wrap(android.opengl.EGL15.eglCreatePlatformWindowSurface(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLSync eglCreateSync(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, int arg1, long[] arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.opengl.EGLSync.wrap(android.opengl.EGL15.eglCreateSync(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
    }

    public static boolean eglDestroyImage(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLImage arg1) {
        return android.opengl.EGL15.eglDestroyImage(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static boolean eglDestroySync(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSync arg1) {
        return android.opengl.EGL15.eglDestroySync(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLDisplay eglGetPlatformDisplay(int arg0, long arg1, long[] arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.opengl.EGLDisplay.wrap(android.opengl.EGL15.eglGetPlatformDisplay(arg0, arg1, arg2, arg3));
    }

    public static boolean eglGetSyncAttrib(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSync arg1, int arg2, long[] arg3, int arg4) {
        return android.opengl.EGL15.eglGetSyncAttrib(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3, arg4);
    }

    public static boolean eglWaitSync(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSync arg1, int arg2) {
        return android.opengl.EGL15.eglWaitSync(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public static final int EGL_CL_EVENT_HANDLE = android.opengl.EGL15.EGL_CL_EVENT_HANDLE;
    public static final int EGL_CONDITION_SATISFIED = android.opengl.EGL15.EGL_CONDITION_SATISFIED;
    public static final int EGL_CONTEXT_MAJOR_VERSION = android.opengl.EGL15.EGL_CONTEXT_MAJOR_VERSION;
    public static final int EGL_CONTEXT_MINOR_VERSION = android.opengl.EGL15.EGL_CONTEXT_MINOR_VERSION;
    public static final int EGL_CONTEXT_OPENGL_DEBUG = android.opengl.EGL15.EGL_CONTEXT_OPENGL_DEBUG;
    public static final int EGL_CONTEXT_OPENGL_FORWARD_COMPATIBLE = android.opengl.EGL15.EGL_CONTEXT_OPENGL_FORWARD_COMPATIBLE;
    public static final int EGL_CONTEXT_OPENGL_RESET_NOTIFICATION_STRATEGY = android.opengl.EGL15.EGL_CONTEXT_OPENGL_RESET_NOTIFICATION_STRATEGY;
    public static final int EGL_CONTEXT_OPENGL_ROBUST_ACCESS = android.opengl.EGL15.EGL_CONTEXT_OPENGL_ROBUST_ACCESS;
    public static final long EGL_FOREVER = android.opengl.EGL15.EGL_FOREVER;
    public static final int EGL_GL_COLORSPACE = android.opengl.EGL15.EGL_GL_COLORSPACE;
    public static final int EGL_GL_COLORSPACE_LINEAR = android.opengl.EGL15.EGL_GL_COLORSPACE_LINEAR;
    public static final int EGL_GL_COLORSPACE_SRGB = android.opengl.EGL15.EGL_GL_COLORSPACE_SRGB;
    public static final int EGL_GL_RENDERBUFFER = android.opengl.EGL15.EGL_GL_RENDERBUFFER;
    public static final int EGL_GL_TEXTURE_2D = android.opengl.EGL15.EGL_GL_TEXTURE_2D;
    public static final int EGL_GL_TEXTURE_3D = android.opengl.EGL15.EGL_GL_TEXTURE_3D;
    public static final int EGL_GL_TEXTURE_CUBE_MAP_NEGATIVE_X = android.opengl.EGL15.EGL_GL_TEXTURE_CUBE_MAP_NEGATIVE_X;
    public static final int EGL_GL_TEXTURE_CUBE_MAP_NEGATIVE_Y = android.opengl.EGL15.EGL_GL_TEXTURE_CUBE_MAP_NEGATIVE_Y;
    public static final int EGL_GL_TEXTURE_CUBE_MAP_NEGATIVE_Z = android.opengl.EGL15.EGL_GL_TEXTURE_CUBE_MAP_NEGATIVE_Z;
    public static final int EGL_GL_TEXTURE_CUBE_MAP_POSITIVE_X = android.opengl.EGL15.EGL_GL_TEXTURE_CUBE_MAP_POSITIVE_X;
    public static final int EGL_GL_TEXTURE_CUBE_MAP_POSITIVE_Y = android.opengl.EGL15.EGL_GL_TEXTURE_CUBE_MAP_POSITIVE_Y;
    public static final int EGL_GL_TEXTURE_CUBE_MAP_POSITIVE_Z = android.opengl.EGL15.EGL_GL_TEXTURE_CUBE_MAP_POSITIVE_Z;
    public static final int EGL_GL_TEXTURE_LEVEL = android.opengl.EGL15.EGL_GL_TEXTURE_LEVEL;
    public static final int EGL_GL_TEXTURE_ZOFFSET = android.opengl.EGL15.EGL_GL_TEXTURE_ZOFFSET;
    public static final int EGL_IMAGE_PRESERVED = android.opengl.EGL15.EGL_IMAGE_PRESERVED;
    public static final int EGL_LOSE_CONTEXT_ON_RESET = android.opengl.EGL15.EGL_LOSE_CONTEXT_ON_RESET;
    public static final com.micklab.dcg.wrapper.android.opengl.EGLContext EGL_NO_CONTEXT = com.micklab.dcg.wrapper.android.opengl.EGLContext.wrap(android.opengl.EGL15.EGL_NO_CONTEXT);
    public static final com.micklab.dcg.wrapper.android.opengl.EGLDisplay EGL_NO_DISPLAY = com.micklab.dcg.wrapper.android.opengl.EGLDisplay.wrap(android.opengl.EGL15.EGL_NO_DISPLAY);
    public static final com.micklab.dcg.wrapper.android.opengl.EGLImage EGL_NO_IMAGE = com.micklab.dcg.wrapper.android.opengl.EGLImage.wrap(android.opengl.EGL15.EGL_NO_IMAGE);
    public static final int EGL_NO_RESET_NOTIFICATION = android.opengl.EGL15.EGL_NO_RESET_NOTIFICATION;
    public static final com.micklab.dcg.wrapper.android.opengl.EGLSurface EGL_NO_SURFACE = com.micklab.dcg.wrapper.android.opengl.EGLSurface.wrap(android.opengl.EGL15.EGL_NO_SURFACE);
    public static final com.micklab.dcg.wrapper.android.opengl.EGLSync EGL_NO_SYNC = com.micklab.dcg.wrapper.android.opengl.EGLSync.wrap(android.opengl.EGL15.EGL_NO_SYNC);
    public static final int EGL_OPENGL_ES3_BIT = android.opengl.EGL15.EGL_OPENGL_ES3_BIT;
    public static final int EGL_PLATFORM_ANDROID_KHR = android.opengl.EGL15.EGL_PLATFORM_ANDROID_KHR;
    public static final int EGL_SIGNALED = android.opengl.EGL15.EGL_SIGNALED;
    public static final int EGL_SYNC_CL_EVENT = android.opengl.EGL15.EGL_SYNC_CL_EVENT;
    public static final int EGL_SYNC_CL_EVENT_COMPLETE = android.opengl.EGL15.EGL_SYNC_CL_EVENT_COMPLETE;
    public static final int EGL_SYNC_CONDITION = android.opengl.EGL15.EGL_SYNC_CONDITION;
    public static final int EGL_SYNC_FENCE = android.opengl.EGL15.EGL_SYNC_FENCE;
    public static final int EGL_SYNC_FLUSH_COMMANDS_BIT = android.opengl.EGL15.EGL_SYNC_FLUSH_COMMANDS_BIT;
    public static final int EGL_SYNC_PRIOR_COMMANDS_COMPLETE = android.opengl.EGL15.EGL_SYNC_PRIOR_COMMANDS_COMPLETE;
    public static final int EGL_SYNC_STATUS = android.opengl.EGL15.EGL_SYNC_STATUS;
    public static final int EGL_SYNC_TYPE = android.opengl.EGL15.EGL_SYNC_TYPE;
    public static final int EGL_TIMEOUT_EXPIRED = android.opengl.EGL15.EGL_TIMEOUT_EXPIRED;
    public static final int EGL_UNSIGNALED = android.opengl.EGL15.EGL_UNSIGNALED;

}
