// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class EGL14 {
    private final android.opengl.EGL14 real;

    public EGL14(android.opengl.EGL14 real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGL14 wrap(android.opengl.EGL14 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.EGL14(real);
    }

    public android.opengl.EGL14 unwrap() {
        return real;
    }

    public EGL14() {
        this(new android.opengl.EGL14());
    }

    public static boolean eglBindAPI(int arg0) {
        return android.opengl.EGL14.eglBindAPI(arg0);
    }

    public static boolean eglBindTexImage(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSurface arg1, int arg2) {
        return android.opengl.EGL14.eglBindTexImage(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static boolean eglChooseConfig(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, int[] arg1, int arg2, android.opengl.EGLConfig[] arg3, int arg4, int arg5, int[] arg6, int arg7) {
        return android.opengl.EGL14.eglChooseConfig(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    public static boolean eglCopyBuffers(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSurface arg1, int arg2) {
        return android.opengl.EGL14.eglCopyBuffers(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLContext eglCreateContext(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLConfig arg1, com.micklab.dcg.wrapper.android.opengl.EGLContext arg2, int[] arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.opengl.EGLContext.wrap(android.opengl.EGL14.eglCreateContext(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLSurface eglCreatePbufferFromClientBuffer(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.opengl.EGLConfig arg3, int[] arg4, int arg5) {
        return com.micklab.dcg.wrapper.android.opengl.EGLSurface.wrap(android.opengl.EGL14.eglCreatePbufferFromClientBuffer(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5));
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLSurface eglCreatePbufferSurface(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLConfig arg1, int[] arg2, int arg3) {
        return com.micklab.dcg.wrapper.android.opengl.EGLSurface.wrap(android.opengl.EGL14.eglCreatePbufferSurface(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLSurface eglCreatePixmapSurface(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLConfig arg1, int arg2, int[] arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.opengl.EGLSurface.wrap(android.opengl.EGL14.eglCreatePixmapSurface(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLSurface eglCreateWindowSurface(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLConfig arg1, java.lang.Object arg2, int[] arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.opengl.EGLSurface.wrap(android.opengl.EGL14.eglCreateWindowSurface(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4));
    }

    public static boolean eglDestroyContext(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLContext arg1) {
        return android.opengl.EGL14.eglDestroyContext(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean eglDestroySurface(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSurface arg1) {
        return android.opengl.EGL14.eglDestroySurface(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean eglGetConfigAttrib(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLConfig arg1, int arg2, int[] arg3, int arg4) {
        return android.opengl.EGL14.eglGetConfigAttrib(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4);
    }

    public static boolean eglGetConfigs(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, android.opengl.EGLConfig[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        return android.opengl.EGL14.eglGetConfigs(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5);
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLContext eglGetCurrentContext() {
        return com.micklab.dcg.wrapper.android.opengl.EGLContext.wrap(android.opengl.EGL14.eglGetCurrentContext());
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLDisplay eglGetCurrentDisplay() {
        return com.micklab.dcg.wrapper.android.opengl.EGLDisplay.wrap(android.opengl.EGL14.eglGetCurrentDisplay());
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLSurface eglGetCurrentSurface(int arg0) {
        return com.micklab.dcg.wrapper.android.opengl.EGLSurface.wrap(android.opengl.EGL14.eglGetCurrentSurface(arg0));
    }

    public static com.micklab.dcg.wrapper.android.opengl.EGLDisplay eglGetDisplay(int arg0) {
        return com.micklab.dcg.wrapper.android.opengl.EGLDisplay.wrap(android.opengl.EGL14.eglGetDisplay(arg0));
    }

    public static int eglGetError() {
        return android.opengl.EGL14.eglGetError();
    }

    public static boolean eglInitialize(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        return android.opengl.EGL14.eglInitialize(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4);
    }

    public static boolean eglMakeCurrent(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSurface arg1, com.micklab.dcg.wrapper.android.opengl.EGLSurface arg2, com.micklab.dcg.wrapper.android.opengl.EGLContext arg3) {
        return android.opengl.EGL14.eglMakeCurrent(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap());
    }

    public static int eglQueryAPI() {
        return android.opengl.EGL14.eglQueryAPI();
    }

    public static boolean eglQueryContext(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLContext arg1, int arg2, int[] arg3, int arg4) {
        return android.opengl.EGL14.eglQueryContext(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4);
    }

    public static java.lang.String eglQueryString(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, int arg1) {
        return android.opengl.EGL14.eglQueryString(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static boolean eglQuerySurface(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSurface arg1, int arg2, int[] arg3, int arg4) {
        return android.opengl.EGL14.eglQuerySurface(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3, arg4);
    }

    public static boolean eglReleaseTexImage(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSurface arg1, int arg2) {
        return android.opengl.EGL14.eglReleaseTexImage(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public static boolean eglReleaseThread() {
        return android.opengl.EGL14.eglReleaseThread();
    }

    public static boolean eglSurfaceAttrib(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSurface arg1, int arg2, int arg3) {
        return android.opengl.EGL14.eglSurfaceAttrib(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3);
    }

    public static boolean eglSwapBuffers(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, com.micklab.dcg.wrapper.android.opengl.EGLSurface arg1) {
        return android.opengl.EGL14.eglSwapBuffers(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public static boolean eglSwapInterval(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0, int arg1) {
        return android.opengl.EGL14.eglSwapInterval(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static boolean eglTerminate(com.micklab.dcg.wrapper.android.opengl.EGLDisplay arg0) {
        return android.opengl.EGL14.eglTerminate(arg0 == null ? null : arg0.unwrap());
    }

    public static boolean eglWaitClient() {
        return android.opengl.EGL14.eglWaitClient();
    }

    public static boolean eglWaitGL() {
        return android.opengl.EGL14.eglWaitGL();
    }

    public static boolean eglWaitNative(int arg0) {
        return android.opengl.EGL14.eglWaitNative(arg0);
    }

    public static final int EGL_ALPHA_MASK_SIZE = android.opengl.EGL14.EGL_ALPHA_MASK_SIZE;
    public static final int EGL_ALPHA_SIZE = android.opengl.EGL14.EGL_ALPHA_SIZE;
    public static final int EGL_BACK_BUFFER = android.opengl.EGL14.EGL_BACK_BUFFER;
    public static final int EGL_BAD_ACCESS = android.opengl.EGL14.EGL_BAD_ACCESS;
    public static final int EGL_BAD_ALLOC = android.opengl.EGL14.EGL_BAD_ALLOC;
    public static final int EGL_BAD_ATTRIBUTE = android.opengl.EGL14.EGL_BAD_ATTRIBUTE;
    public static final int EGL_BAD_CONFIG = android.opengl.EGL14.EGL_BAD_CONFIG;
    public static final int EGL_BAD_CONTEXT = android.opengl.EGL14.EGL_BAD_CONTEXT;
    public static final int EGL_BAD_CURRENT_SURFACE = android.opengl.EGL14.EGL_BAD_CURRENT_SURFACE;
    public static final int EGL_BAD_DISPLAY = android.opengl.EGL14.EGL_BAD_DISPLAY;
    public static final int EGL_BAD_MATCH = android.opengl.EGL14.EGL_BAD_MATCH;
    public static final int EGL_BAD_NATIVE_PIXMAP = android.opengl.EGL14.EGL_BAD_NATIVE_PIXMAP;
    public static final int EGL_BAD_NATIVE_WINDOW = android.opengl.EGL14.EGL_BAD_NATIVE_WINDOW;
    public static final int EGL_BAD_PARAMETER = android.opengl.EGL14.EGL_BAD_PARAMETER;
    public static final int EGL_BAD_SURFACE = android.opengl.EGL14.EGL_BAD_SURFACE;
    public static final int EGL_BIND_TO_TEXTURE_RGB = android.opengl.EGL14.EGL_BIND_TO_TEXTURE_RGB;
    public static final int EGL_BIND_TO_TEXTURE_RGBA = android.opengl.EGL14.EGL_BIND_TO_TEXTURE_RGBA;
    public static final int EGL_BLUE_SIZE = android.opengl.EGL14.EGL_BLUE_SIZE;
    public static final int EGL_BUFFER_DESTROYED = android.opengl.EGL14.EGL_BUFFER_DESTROYED;
    public static final int EGL_BUFFER_PRESERVED = android.opengl.EGL14.EGL_BUFFER_PRESERVED;
    public static final int EGL_BUFFER_SIZE = android.opengl.EGL14.EGL_BUFFER_SIZE;
    public static final int EGL_CLIENT_APIS = android.opengl.EGL14.EGL_CLIENT_APIS;
    public static final int EGL_COLOR_BUFFER_TYPE = android.opengl.EGL14.EGL_COLOR_BUFFER_TYPE;
    public static final int EGL_CONFIG_CAVEAT = android.opengl.EGL14.EGL_CONFIG_CAVEAT;
    public static final int EGL_CONFIG_ID = android.opengl.EGL14.EGL_CONFIG_ID;
    public static final int EGL_CONFORMANT = android.opengl.EGL14.EGL_CONFORMANT;
    public static final int EGL_CONTEXT_CLIENT_TYPE = android.opengl.EGL14.EGL_CONTEXT_CLIENT_TYPE;
    public static final int EGL_CONTEXT_CLIENT_VERSION = android.opengl.EGL14.EGL_CONTEXT_CLIENT_VERSION;
    public static final int EGL_CONTEXT_LOST = android.opengl.EGL14.EGL_CONTEXT_LOST;
    public static final int EGL_CORE_NATIVE_ENGINE = android.opengl.EGL14.EGL_CORE_NATIVE_ENGINE;
    public static final int EGL_DEFAULT_DISPLAY = android.opengl.EGL14.EGL_DEFAULT_DISPLAY;
    public static final int EGL_DEPTH_SIZE = android.opengl.EGL14.EGL_DEPTH_SIZE;
    public static final int EGL_DISPLAY_SCALING = android.opengl.EGL14.EGL_DISPLAY_SCALING;
    public static final int EGL_DRAW = android.opengl.EGL14.EGL_DRAW;
    public static final int EGL_EXTENSIONS = android.opengl.EGL14.EGL_EXTENSIONS;
    public static final int EGL_FALSE = android.opengl.EGL14.EGL_FALSE;
    public static final int EGL_GREEN_SIZE = android.opengl.EGL14.EGL_GREEN_SIZE;
    public static final int EGL_HEIGHT = android.opengl.EGL14.EGL_HEIGHT;
    public static final int EGL_HORIZONTAL_RESOLUTION = android.opengl.EGL14.EGL_HORIZONTAL_RESOLUTION;
    public static final int EGL_LARGEST_PBUFFER = android.opengl.EGL14.EGL_LARGEST_PBUFFER;
    public static final int EGL_LEVEL = android.opengl.EGL14.EGL_LEVEL;
    public static final int EGL_LUMINANCE_BUFFER = android.opengl.EGL14.EGL_LUMINANCE_BUFFER;
    public static final int EGL_LUMINANCE_SIZE = android.opengl.EGL14.EGL_LUMINANCE_SIZE;
    public static final int EGL_MATCH_NATIVE_PIXMAP = android.opengl.EGL14.EGL_MATCH_NATIVE_PIXMAP;
    public static final int EGL_MAX_PBUFFER_HEIGHT = android.opengl.EGL14.EGL_MAX_PBUFFER_HEIGHT;
    public static final int EGL_MAX_PBUFFER_PIXELS = android.opengl.EGL14.EGL_MAX_PBUFFER_PIXELS;
    public static final int EGL_MAX_PBUFFER_WIDTH = android.opengl.EGL14.EGL_MAX_PBUFFER_WIDTH;
    public static final int EGL_MAX_SWAP_INTERVAL = android.opengl.EGL14.EGL_MAX_SWAP_INTERVAL;
    public static final int EGL_MIN_SWAP_INTERVAL = android.opengl.EGL14.EGL_MIN_SWAP_INTERVAL;
    public static final int EGL_MIPMAP_LEVEL = android.opengl.EGL14.EGL_MIPMAP_LEVEL;
    public static final int EGL_MIPMAP_TEXTURE = android.opengl.EGL14.EGL_MIPMAP_TEXTURE;
    public static final int EGL_MULTISAMPLE_RESOLVE = android.opengl.EGL14.EGL_MULTISAMPLE_RESOLVE;
    public static final int EGL_MULTISAMPLE_RESOLVE_BOX = android.opengl.EGL14.EGL_MULTISAMPLE_RESOLVE_BOX;
    public static final int EGL_MULTISAMPLE_RESOLVE_BOX_BIT = android.opengl.EGL14.EGL_MULTISAMPLE_RESOLVE_BOX_BIT;
    public static final int EGL_MULTISAMPLE_RESOLVE_DEFAULT = android.opengl.EGL14.EGL_MULTISAMPLE_RESOLVE_DEFAULT;
    public static final int EGL_NATIVE_RENDERABLE = android.opengl.EGL14.EGL_NATIVE_RENDERABLE;
    public static final int EGL_NATIVE_VISUAL_ID = android.opengl.EGL14.EGL_NATIVE_VISUAL_ID;
    public static final int EGL_NATIVE_VISUAL_TYPE = android.opengl.EGL14.EGL_NATIVE_VISUAL_TYPE;
    public static final int EGL_NONE = android.opengl.EGL14.EGL_NONE;
    public static final int EGL_NON_CONFORMANT_CONFIG = android.opengl.EGL14.EGL_NON_CONFORMANT_CONFIG;
    public static final int EGL_NOT_INITIALIZED = android.opengl.EGL14.EGL_NOT_INITIALIZED;
    public static final com.micklab.dcg.wrapper.android.opengl.EGLContext EGL_NO_CONTEXT = com.micklab.dcg.wrapper.android.opengl.EGLContext.wrap(android.opengl.EGL14.EGL_NO_CONTEXT);
    public static final com.micklab.dcg.wrapper.android.opengl.EGLDisplay EGL_NO_DISPLAY = com.micklab.dcg.wrapper.android.opengl.EGLDisplay.wrap(android.opengl.EGL14.EGL_NO_DISPLAY);
    public static final com.micklab.dcg.wrapper.android.opengl.EGLSurface EGL_NO_SURFACE = com.micklab.dcg.wrapper.android.opengl.EGLSurface.wrap(android.opengl.EGL14.EGL_NO_SURFACE);
    public static final int EGL_NO_TEXTURE = android.opengl.EGL14.EGL_NO_TEXTURE;
    public static final int EGL_OPENGL_API = android.opengl.EGL14.EGL_OPENGL_API;
    public static final int EGL_OPENGL_BIT = android.opengl.EGL14.EGL_OPENGL_BIT;
    public static final int EGL_OPENGL_ES2_BIT = android.opengl.EGL14.EGL_OPENGL_ES2_BIT;
    public static final int EGL_OPENGL_ES_API = android.opengl.EGL14.EGL_OPENGL_ES_API;
    public static final int EGL_OPENGL_ES_BIT = android.opengl.EGL14.EGL_OPENGL_ES_BIT;
    public static final int EGL_OPENVG_API = android.opengl.EGL14.EGL_OPENVG_API;
    public static final int EGL_OPENVG_BIT = android.opengl.EGL14.EGL_OPENVG_BIT;
    public static final int EGL_OPENVG_IMAGE = android.opengl.EGL14.EGL_OPENVG_IMAGE;
    public static final int EGL_PBUFFER_BIT = android.opengl.EGL14.EGL_PBUFFER_BIT;
    public static final int EGL_PIXEL_ASPECT_RATIO = android.opengl.EGL14.EGL_PIXEL_ASPECT_RATIO;
    public static final int EGL_PIXMAP_BIT = android.opengl.EGL14.EGL_PIXMAP_BIT;
    public static final int EGL_READ = android.opengl.EGL14.EGL_READ;
    public static final int EGL_RED_SIZE = android.opengl.EGL14.EGL_RED_SIZE;
    public static final int EGL_RENDERABLE_TYPE = android.opengl.EGL14.EGL_RENDERABLE_TYPE;
    public static final int EGL_RENDER_BUFFER = android.opengl.EGL14.EGL_RENDER_BUFFER;
    public static final int EGL_RGB_BUFFER = android.opengl.EGL14.EGL_RGB_BUFFER;
    public static final int EGL_SAMPLES = android.opengl.EGL14.EGL_SAMPLES;
    public static final int EGL_SAMPLE_BUFFERS = android.opengl.EGL14.EGL_SAMPLE_BUFFERS;
    public static final int EGL_SINGLE_BUFFER = android.opengl.EGL14.EGL_SINGLE_BUFFER;
    public static final int EGL_SLOW_CONFIG = android.opengl.EGL14.EGL_SLOW_CONFIG;
    public static final int EGL_STENCIL_SIZE = android.opengl.EGL14.EGL_STENCIL_SIZE;
    public static final int EGL_SUCCESS = android.opengl.EGL14.EGL_SUCCESS;
    public static final int EGL_SURFACE_TYPE = android.opengl.EGL14.EGL_SURFACE_TYPE;
    public static final int EGL_SWAP_BEHAVIOR = android.opengl.EGL14.EGL_SWAP_BEHAVIOR;
    public static final int EGL_SWAP_BEHAVIOR_PRESERVED_BIT = android.opengl.EGL14.EGL_SWAP_BEHAVIOR_PRESERVED_BIT;
    public static final int EGL_TEXTURE_2D = android.opengl.EGL14.EGL_TEXTURE_2D;
    public static final int EGL_TEXTURE_FORMAT = android.opengl.EGL14.EGL_TEXTURE_FORMAT;
    public static final int EGL_TEXTURE_RGB = android.opengl.EGL14.EGL_TEXTURE_RGB;
    public static final int EGL_TEXTURE_RGBA = android.opengl.EGL14.EGL_TEXTURE_RGBA;
    public static final int EGL_TEXTURE_TARGET = android.opengl.EGL14.EGL_TEXTURE_TARGET;
    public static final int EGL_TRANSPARENT_BLUE_VALUE = android.opengl.EGL14.EGL_TRANSPARENT_BLUE_VALUE;
    public static final int EGL_TRANSPARENT_GREEN_VALUE = android.opengl.EGL14.EGL_TRANSPARENT_GREEN_VALUE;
    public static final int EGL_TRANSPARENT_RED_VALUE = android.opengl.EGL14.EGL_TRANSPARENT_RED_VALUE;
    public static final int EGL_TRANSPARENT_RGB = android.opengl.EGL14.EGL_TRANSPARENT_RGB;
    public static final int EGL_TRANSPARENT_TYPE = android.opengl.EGL14.EGL_TRANSPARENT_TYPE;
    public static final int EGL_TRUE = android.opengl.EGL14.EGL_TRUE;
    public static final int EGL_VENDOR = android.opengl.EGL14.EGL_VENDOR;
    public static final int EGL_VERSION = android.opengl.EGL14.EGL_VERSION;
    public static final int EGL_VERTICAL_RESOLUTION = android.opengl.EGL14.EGL_VERTICAL_RESOLUTION;
    public static final int EGL_VG_ALPHA_FORMAT = android.opengl.EGL14.EGL_VG_ALPHA_FORMAT;
    public static final int EGL_VG_ALPHA_FORMAT_NONPRE = android.opengl.EGL14.EGL_VG_ALPHA_FORMAT_NONPRE;
    public static final int EGL_VG_ALPHA_FORMAT_PRE = android.opengl.EGL14.EGL_VG_ALPHA_FORMAT_PRE;
    public static final int EGL_VG_ALPHA_FORMAT_PRE_BIT = android.opengl.EGL14.EGL_VG_ALPHA_FORMAT_PRE_BIT;
    public static final int EGL_VG_COLORSPACE = android.opengl.EGL14.EGL_VG_COLORSPACE;
    public static final int EGL_VG_COLORSPACE_LINEAR = android.opengl.EGL14.EGL_VG_COLORSPACE_LINEAR;
    public static final int EGL_VG_COLORSPACE_LINEAR_BIT = android.opengl.EGL14.EGL_VG_COLORSPACE_LINEAR_BIT;
    public static final int EGL_VG_COLORSPACE_sRGB = android.opengl.EGL14.EGL_VG_COLORSPACE_sRGB;
    public static final int EGL_WIDTH = android.opengl.EGL14.EGL_WIDTH;
    public static final int EGL_WINDOW_BIT = android.opengl.EGL14.EGL_WINDOW_BIT;

}
