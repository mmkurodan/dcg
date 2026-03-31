// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class SurfaceTexture {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SurfaceTexture(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.SurfaceTexture wrap(android.graphics.SurfaceTexture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.SurfaceTexture(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.SurfaceTexture getReal() {
        return (android.graphics.SurfaceTexture) real;
    }

    public android.graphics.SurfaceTexture unwrap() {
        return getReal();
    }

    public SurfaceTexture(int arg0) {
        this(new android.graphics.SurfaceTexture(arg0), (__DcgwBridgeToken) null);
    }

    public SurfaceTexture(boolean arg0) {
        this(new android.graphics.SurfaceTexture(arg0), (__DcgwBridgeToken) null);
    }

    public SurfaceTexture(int arg0, boolean arg1) {
        this(new android.graphics.SurfaceTexture(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public void attachToGLContext(int arg0) {
        ((android.graphics.SurfaceTexture) real).attachToGLContext(arg0);
    }

    public void detachFromGLContext() {
        ((android.graphics.SurfaceTexture) real).detachFromGLContext();
    }

    public int getDataSpace() {
        return ((android.graphics.SurfaceTexture) real).getDataSpace();
    }

    public long getTimestamp() {
        return ((android.graphics.SurfaceTexture) real).getTimestamp();
    }

    public void getTransformMatrix(float[] arg0) {
        ((android.graphics.SurfaceTexture) real).getTransformMatrix(arg0);
    }

    public boolean isReleased() {
        return ((android.graphics.SurfaceTexture) real).isReleased();
    }

    public void release() {
        ((android.graphics.SurfaceTexture) real).release();
    }

    public void releaseTexImage() {
        ((android.graphics.SurfaceTexture) real).releaseTexImage();
    }

    public void setDefaultBufferSize(int arg0, int arg1) {
        ((android.graphics.SurfaceTexture) real).setDefaultBufferSize(arg0, arg1);
    }

    public void setOnFrameAvailableListener(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.OnFrameAvailableListener arg0) {
        ((android.graphics.SurfaceTexture) real).setOnFrameAvailableListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnFrameAvailableListener(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.OnFrameAvailableListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.graphics.SurfaceTexture) real).setOnFrameAvailableListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void updateTexImage() {
        ((android.graphics.SurfaceTexture) real).updateTexImage();
    }

    public static final class OnFrameAvailableListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnFrameAvailableListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.OnFrameAvailableListener wrap(android.graphics.SurfaceTexture.OnFrameAvailableListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.OnFrameAvailableListener(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.SurfaceTexture.OnFrameAvailableListener getReal() {
            return (android.graphics.SurfaceTexture.OnFrameAvailableListener) real;
        }

        public android.graphics.SurfaceTexture.OnFrameAvailableListener unwrap() {
            return getReal();
        }

        public void onFrameAvailable(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture arg0) {
            ((android.graphics.SurfaceTexture.OnFrameAvailableListener) real).onFrameAvailable(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class OutOfResourcesException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OutOfResourcesException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.OutOfResourcesException wrap(android.graphics.SurfaceTexture.OutOfResourcesException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.OutOfResourcesException(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.SurfaceTexture.OutOfResourcesException getReal() {
            return (android.graphics.SurfaceTexture.OutOfResourcesException) real;
        }

        public android.graphics.SurfaceTexture.OutOfResourcesException unwrap() {
            return getReal();
        }

        public OutOfResourcesException() {
            this(new android.graphics.SurfaceTexture.OutOfResourcesException(), (__DcgwBridgeToken) null);
        }

        public OutOfResourcesException(java.lang.String arg0) {
            this(new android.graphics.SurfaceTexture.OutOfResourcesException(arg0), (__DcgwBridgeToken) null);
        }

    }
}
