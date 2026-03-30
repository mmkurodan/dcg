// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class SurfaceTexture {
    private final android.graphics.SurfaceTexture real;

    public SurfaceTexture(android.graphics.SurfaceTexture real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.SurfaceTexture wrap(android.graphics.SurfaceTexture real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.SurfaceTexture(real);
    }

    public android.graphics.SurfaceTexture unwrap() {
        return real;
    }

    public SurfaceTexture(boolean arg0) {
        this(new android.graphics.SurfaceTexture(arg0));
    }

    public SurfaceTexture(int arg0) {
        this(new android.graphics.SurfaceTexture(arg0));
    }

    public SurfaceTexture(int arg0, boolean arg1) {
        this(new android.graphics.SurfaceTexture(arg0, arg1));
    }

    public void attachToGLContext(int arg0) {
        real.attachToGLContext(arg0);
    }

    public void detachFromGLContext() {
        real.detachFromGLContext();
    }

    public int getDataSpace() {
        return real.getDataSpace();
    }

    public long getTimestamp() {
        return real.getTimestamp();
    }

    public void getTransformMatrix(float[] arg0) {
        real.getTransformMatrix(arg0);
    }

    public boolean isReleased() {
        return real.isReleased();
    }

    public void release() {
        real.release();
    }

    public void releaseTexImage() {
        real.releaseTexImage();
    }

    public void setDefaultBufferSize(int arg0, int arg1) {
        real.setDefaultBufferSize(arg0, arg1);
    }

    public void setOnFrameAvailableListener(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.OnFrameAvailableListener arg0) {
        real.setOnFrameAvailableListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnFrameAvailableListener(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.OnFrameAvailableListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setOnFrameAvailableListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void updateTexImage() {
        real.updateTexImage();
    }

    public static final class OnFrameAvailableListener {
        private final android.graphics.SurfaceTexture.OnFrameAvailableListener real;

        public OnFrameAvailableListener(android.graphics.SurfaceTexture.OnFrameAvailableListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.OnFrameAvailableListener wrap(android.graphics.SurfaceTexture.OnFrameAvailableListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.OnFrameAvailableListener(real);
        }

        public android.graphics.SurfaceTexture.OnFrameAvailableListener unwrap() {
            return real;
        }

        public void onFrameAvailable(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture arg0) {
            real.onFrameAvailable(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class OutOfResourcesException {
        private final android.graphics.SurfaceTexture.OutOfResourcesException real;

        public OutOfResourcesException(android.graphics.SurfaceTexture.OutOfResourcesException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.OutOfResourcesException wrap(android.graphics.SurfaceTexture.OutOfResourcesException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.SurfaceTexture.OutOfResourcesException(real);
        }

        public android.graphics.SurfaceTexture.OutOfResourcesException unwrap() {
            return real;
        }

        public OutOfResourcesException() {
            this(new android.graphics.SurfaceTexture.OutOfResourcesException());
        }

        public OutOfResourcesException(java.lang.String arg0) {
            this(new android.graphics.SurfaceTexture.OutOfResourcesException(arg0));
        }

    }
}
