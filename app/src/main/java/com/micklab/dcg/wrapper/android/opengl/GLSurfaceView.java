// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLSurfaceView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GLSurfaceView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLSurfaceView wrap(android.opengl.GLSurfaceView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLSurfaceView(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.GLSurfaceView getReal() {
        return (android.opengl.GLSurfaceView) real;
    }

    public android.opengl.GLSurfaceView unwrap() {
        return getReal();
    }

    public GLSurfaceView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.opengl.GLSurfaceView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public GLSurfaceView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.opengl.GLSurfaceView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int getDebugFlags() {
        return ((android.opengl.GLSurfaceView) real).getDebugFlags();
    }

    public boolean getPreserveEGLContextOnPause() {
        return ((android.opengl.GLSurfaceView) real).getPreserveEGLContextOnPause();
    }

    public int getRenderMode() {
        return ((android.opengl.GLSurfaceView) real).getRenderMode();
    }

    public void onPause() {
        ((android.opengl.GLSurfaceView) real).onPause();
    }

    public void onResume() {
        ((android.opengl.GLSurfaceView) real).onResume();
    }

    public void queueEvent(java.lang.Runnable arg0) {
        ((android.opengl.GLSurfaceView) real).queueEvent(arg0);
    }

    public void requestRender() {
        ((android.opengl.GLSurfaceView) real).requestRender();
    }

    public void setDebugFlags(int arg0) {
        ((android.opengl.GLSurfaceView) real).setDebugFlags(arg0);
    }

    public void setEGLConfigChooser(com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLConfigChooser arg0) {
        ((android.opengl.GLSurfaceView) real).setEGLConfigChooser(arg0 == null ? null : arg0.getReal());
    }

    public void setEGLConfigChooser(boolean arg0) {
        ((android.opengl.GLSurfaceView) real).setEGLConfigChooser(arg0);
    }

    public void setEGLConfigChooser(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ((android.opengl.GLSurfaceView) real).setEGLConfigChooser(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void setEGLContextClientVersion(int arg0) {
        ((android.opengl.GLSurfaceView) real).setEGLContextClientVersion(arg0);
    }

    public void setEGLContextFactory(com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLContextFactory arg0) {
        ((android.opengl.GLSurfaceView) real).setEGLContextFactory(arg0 == null ? null : arg0.getReal());
    }

    public void setEGLWindowSurfaceFactory(com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLWindowSurfaceFactory arg0) {
        ((android.opengl.GLSurfaceView) real).setEGLWindowSurfaceFactory(arg0 == null ? null : arg0.getReal());
    }

    public void setGLWrapper(com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.GLWrapper arg0) {
        ((android.opengl.GLSurfaceView) real).setGLWrapper(arg0 == null ? null : arg0.getReal());
    }

    public void setPreserveEGLContextOnPause(boolean arg0) {
        ((android.opengl.GLSurfaceView) real).setPreserveEGLContextOnPause(arg0);
    }

    public void setRenderMode(int arg0) {
        ((android.opengl.GLSurfaceView) real).setRenderMode(arg0);
    }

    public void setRenderer(com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.Renderer arg0) {
        ((android.opengl.GLSurfaceView) real).setRenderer(arg0 == null ? null : arg0.getReal());
    }

    public void surfaceChanged(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0, int arg1, int arg2, int arg3) {
        ((android.opengl.GLSurfaceView) real).surfaceChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
    }

    public void surfaceCreated(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        ((android.opengl.GLSurfaceView) real).surfaceCreated(arg0 == null ? null : arg0.getReal());
    }

    public void surfaceDestroyed(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        ((android.opengl.GLSurfaceView) real).surfaceDestroyed(arg0 == null ? null : arg0.getReal());
    }

    public void surfaceRedrawNeeded(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        ((android.opengl.GLSurfaceView) real).surfaceRedrawNeeded(arg0 == null ? null : arg0.getReal());
    }

    public void surfaceRedrawNeededAsync(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0, java.lang.Runnable arg1) {
        ((android.opengl.GLSurfaceView) real).surfaceRedrawNeededAsync(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int DEBUG_CHECK_GL_ERROR = android.opengl.GLSurfaceView.DEBUG_CHECK_GL_ERROR;
    public static final int DEBUG_LOG_GL_CALLS = android.opengl.GLSurfaceView.DEBUG_LOG_GL_CALLS;
    public static final int RENDERMODE_CONTINUOUSLY = android.opengl.GLSurfaceView.RENDERMODE_CONTINUOUSLY;
    public static final int RENDERMODE_WHEN_DIRTY = android.opengl.GLSurfaceView.RENDERMODE_WHEN_DIRTY;

    public static final class EGLConfigChooser {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EGLConfigChooser(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLConfigChooser wrap(android.opengl.GLSurfaceView.EGLConfigChooser real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLConfigChooser(real, (__DcgwBridgeToken) null);
        }

        public android.opengl.GLSurfaceView.EGLConfigChooser getReal() {
            return (android.opengl.GLSurfaceView.EGLConfigChooser) real;
        }

        public android.opengl.GLSurfaceView.EGLConfigChooser unwrap() {
            return getReal();
        }

        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 arg0, javax.microedition.khronos.egl.EGLDisplay arg1) {
            return ((android.opengl.GLSurfaceView.EGLConfigChooser) real).chooseConfig(arg0, arg1);
        }

    }
    public static final class EGLContextFactory {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EGLContextFactory(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLContextFactory wrap(android.opengl.GLSurfaceView.EGLContextFactory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLContextFactory(real, (__DcgwBridgeToken) null);
        }

        public android.opengl.GLSurfaceView.EGLContextFactory getReal() {
            return (android.opengl.GLSurfaceView.EGLContextFactory) real;
        }

        public android.opengl.GLSurfaceView.EGLContextFactory unwrap() {
            return getReal();
        }

        public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 arg0, javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLConfig arg2) {
            return ((android.opengl.GLSurfaceView.EGLContextFactory) real).createContext(arg0, arg1, arg2);
        }

        public void destroyContext(javax.microedition.khronos.egl.EGL10 arg0, javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLContext arg2) {
            ((android.opengl.GLSurfaceView.EGLContextFactory) real).destroyContext(arg0, arg1, arg2);
        }

    }
    public static final class EGLWindowSurfaceFactory {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private EGLWindowSurfaceFactory(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLWindowSurfaceFactory wrap(android.opengl.GLSurfaceView.EGLWindowSurfaceFactory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLWindowSurfaceFactory(real, (__DcgwBridgeToken) null);
        }

        public android.opengl.GLSurfaceView.EGLWindowSurfaceFactory getReal() {
            return (android.opengl.GLSurfaceView.EGLWindowSurfaceFactory) real;
        }

        public android.opengl.GLSurfaceView.EGLWindowSurfaceFactory unwrap() {
            return getReal();
        }

        public javax.microedition.khronos.egl.EGLSurface createWindowSurface(javax.microedition.khronos.egl.EGL10 arg0, javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLConfig arg2, java.lang.Object arg3) {
            return ((android.opengl.GLSurfaceView.EGLWindowSurfaceFactory) real).createWindowSurface(arg0, arg1, arg2, arg3);
        }

        public void destroySurface(javax.microedition.khronos.egl.EGL10 arg0, javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLSurface arg2) {
            ((android.opengl.GLSurfaceView.EGLWindowSurfaceFactory) real).destroySurface(arg0, arg1, arg2);
        }

    }
    public static final class GLWrapper {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private GLWrapper(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.GLWrapper wrap(android.opengl.GLSurfaceView.GLWrapper real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.GLWrapper(real, (__DcgwBridgeToken) null);
        }

        public android.opengl.GLSurfaceView.GLWrapper getReal() {
            return (android.opengl.GLSurfaceView.GLWrapper) real;
        }

        public android.opengl.GLSurfaceView.GLWrapper unwrap() {
            return getReal();
        }

        public javax.microedition.khronos.opengles.GL wrap(javax.microedition.khronos.opengles.GL arg0) {
            return ((android.opengl.GLSurfaceView.GLWrapper) real).wrap(arg0);
        }

    }
    public static final class Renderer {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Renderer(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.Renderer wrap(android.opengl.GLSurfaceView.Renderer real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.Renderer(real, (__DcgwBridgeToken) null);
        }

        public android.opengl.GLSurfaceView.Renderer getReal() {
            return (android.opengl.GLSurfaceView.Renderer) real;
        }

        public android.opengl.GLSurfaceView.Renderer unwrap() {
            return getReal();
        }

        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 arg0) {
            ((android.opengl.GLSurfaceView.Renderer) real).onDrawFrame(arg0);
        }

        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 arg0, int arg1, int arg2) {
            ((android.opengl.GLSurfaceView.Renderer) real).onSurfaceChanged(arg0, arg1, arg2);
        }

        public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 arg0, javax.microedition.khronos.egl.EGLConfig arg1) {
            ((android.opengl.GLSurfaceView.Renderer) real).onSurfaceCreated(arg0, arg1);
        }

    }
}
