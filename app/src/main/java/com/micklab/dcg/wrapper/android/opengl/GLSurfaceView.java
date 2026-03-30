// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class GLSurfaceView {
    private final android.opengl.GLSurfaceView real;

    public GLSurfaceView(android.opengl.GLSurfaceView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.GLSurfaceView wrap(android.opengl.GLSurfaceView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLSurfaceView(real);
    }

    public android.opengl.GLSurfaceView unwrap() {
        return real;
    }

    public GLSurfaceView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.opengl.GLSurfaceView(arg0 == null ? null : arg0.unwrap()));
    }

    public GLSurfaceView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.opengl.GLSurfaceView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public int getDebugFlags() {
        return real.getDebugFlags();
    }

    public boolean getPreserveEGLContextOnPause() {
        return real.getPreserveEGLContextOnPause();
    }

    public int getRenderMode() {
        return real.getRenderMode();
    }

    public void onPause() {
        real.onPause();
    }

    public void onResume() {
        real.onResume();
    }

    public void queueEvent(java.lang.Runnable arg0) {
        real.queueEvent(arg0);
    }

    public void requestRender() {
        real.requestRender();
    }

    public void setDebugFlags(int arg0) {
        real.setDebugFlags(arg0);
    }

    public void setEGLConfigChooser(com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLConfigChooser arg0) {
        real.setEGLConfigChooser(arg0 == null ? null : arg0.unwrap());
    }

    public void setEGLConfigChooser(boolean arg0) {
        real.setEGLConfigChooser(arg0);
    }

    public void setEGLConfigChooser(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        real.setEGLConfigChooser(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public void setEGLContextClientVersion(int arg0) {
        real.setEGLContextClientVersion(arg0);
    }

    public void setEGLContextFactory(com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLContextFactory arg0) {
        real.setEGLContextFactory(arg0 == null ? null : arg0.unwrap());
    }

    public void setEGLWindowSurfaceFactory(com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLWindowSurfaceFactory arg0) {
        real.setEGLWindowSurfaceFactory(arg0 == null ? null : arg0.unwrap());
    }

    public void setGLWrapper(com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.GLWrapper arg0) {
        real.setGLWrapper(arg0 == null ? null : arg0.unwrap());
    }

    public void setPreserveEGLContextOnPause(boolean arg0) {
        real.setPreserveEGLContextOnPause(arg0);
    }

    public void setRenderMode(int arg0) {
        real.setRenderMode(arg0);
    }

    public void setRenderer(com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.Renderer arg0) {
        real.setRenderer(arg0 == null ? null : arg0.unwrap());
    }

    public void surfaceChanged(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0, int arg1, int arg2, int arg3) {
        real.surfaceChanged(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3);
    }

    public void surfaceCreated(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        real.surfaceCreated(arg0 == null ? null : arg0.unwrap());
    }

    public void surfaceDestroyed(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        real.surfaceDestroyed(arg0 == null ? null : arg0.unwrap());
    }

    public void surfaceRedrawNeeded(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
        real.surfaceRedrawNeeded(arg0 == null ? null : arg0.unwrap());
    }

    public void surfaceRedrawNeededAsync(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0, java.lang.Runnable arg1) {
        real.surfaceRedrawNeededAsync(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int DEBUG_CHECK_GL_ERROR = android.opengl.GLSurfaceView.DEBUG_CHECK_GL_ERROR;
    public static final int DEBUG_LOG_GL_CALLS = android.opengl.GLSurfaceView.DEBUG_LOG_GL_CALLS;
    public static final int RENDERMODE_CONTINUOUSLY = android.opengl.GLSurfaceView.RENDERMODE_CONTINUOUSLY;
    public static final int RENDERMODE_WHEN_DIRTY = android.opengl.GLSurfaceView.RENDERMODE_WHEN_DIRTY;

    public static final class EGLConfigChooser {
        private final android.opengl.GLSurfaceView.EGLConfigChooser real;

        public EGLConfigChooser(android.opengl.GLSurfaceView.EGLConfigChooser real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLConfigChooser wrap(android.opengl.GLSurfaceView.EGLConfigChooser real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLConfigChooser(real);
        }

        public android.opengl.GLSurfaceView.EGLConfigChooser unwrap() {
            return real;
        }

        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 arg0, javax.microedition.khronos.egl.EGLDisplay arg1) {
            return real.chooseConfig(arg0, arg1);
        }

    }
    public static final class EGLContextFactory {
        private final android.opengl.GLSurfaceView.EGLContextFactory real;

        public EGLContextFactory(android.opengl.GLSurfaceView.EGLContextFactory real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLContextFactory wrap(android.opengl.GLSurfaceView.EGLContextFactory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLContextFactory(real);
        }

        public android.opengl.GLSurfaceView.EGLContextFactory unwrap() {
            return real;
        }

        public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 arg0, javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLConfig arg2) {
            return real.createContext(arg0, arg1, arg2);
        }

        public void destroyContext(javax.microedition.khronos.egl.EGL10 arg0, javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLContext arg2) {
            real.destroyContext(arg0, arg1, arg2);
        }

    }
    public static final class EGLWindowSurfaceFactory {
        private final android.opengl.GLSurfaceView.EGLWindowSurfaceFactory real;

        public EGLWindowSurfaceFactory(android.opengl.GLSurfaceView.EGLWindowSurfaceFactory real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLWindowSurfaceFactory wrap(android.opengl.GLSurfaceView.EGLWindowSurfaceFactory real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.EGLWindowSurfaceFactory(real);
        }

        public android.opengl.GLSurfaceView.EGLWindowSurfaceFactory unwrap() {
            return real;
        }

        public javax.microedition.khronos.egl.EGLSurface createWindowSurface(javax.microedition.khronos.egl.EGL10 arg0, javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLConfig arg2, java.lang.Object arg3) {
            return real.createWindowSurface(arg0, arg1, arg2, arg3);
        }

        public void destroySurface(javax.microedition.khronos.egl.EGL10 arg0, javax.microedition.khronos.egl.EGLDisplay arg1, javax.microedition.khronos.egl.EGLSurface arg2) {
            real.destroySurface(arg0, arg1, arg2);
        }

    }
    public static final class GLWrapper {
        private final android.opengl.GLSurfaceView.GLWrapper real;

        public GLWrapper(android.opengl.GLSurfaceView.GLWrapper real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.GLWrapper wrap(android.opengl.GLSurfaceView.GLWrapper real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.GLWrapper(real);
        }

        public android.opengl.GLSurfaceView.GLWrapper unwrap() {
            return real;
        }

        public javax.microedition.khronos.opengles.GL wrap(javax.microedition.khronos.opengles.GL arg0) {
            return real.wrap(arg0);
        }

    }
    public static final class Renderer {
        private final android.opengl.GLSurfaceView.Renderer real;

        public Renderer(android.opengl.GLSurfaceView.Renderer real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.Renderer wrap(android.opengl.GLSurfaceView.Renderer real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.GLSurfaceView.Renderer(real);
        }

        public android.opengl.GLSurfaceView.Renderer unwrap() {
            return real;
        }

        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 arg0) {
            real.onDrawFrame(arg0);
        }

        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 arg0, int arg1, int arg2) {
            real.onSurfaceChanged(arg0, arg1, arg2);
        }

        public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 arg0, javax.microedition.khronos.egl.EGLConfig arg1) {
            real.onSurfaceCreated(arg0, arg1);
        }

    }
}
