// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SurfaceHolder {
    private final android.view.SurfaceHolder real;

    public SurfaceHolder(android.view.SurfaceHolder real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SurfaceHolder wrap(android.view.SurfaceHolder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceHolder(real);
    }

    public android.view.SurfaceHolder unwrap() {
        return real;
    }

    public void addCallback(com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback arg0) {
        real.addCallback(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(real.getSurface());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getSurfaceFrame() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getSurfaceFrame());
    }

    public boolean isCreating() {
        return real.isCreating();
    }

    public com.micklab.dcg.wrapper.android.graphics.Canvas lockCanvas() {
        return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(real.lockCanvas());
    }

    public com.micklab.dcg.wrapper.android.graphics.Canvas lockCanvas(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(real.lockCanvas(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Canvas lockHardwareCanvas() {
        return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(real.lockHardwareCanvas());
    }

    public void removeCallback(com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback arg0) {
        real.removeCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setFixedSize(int arg0, int arg1) {
        real.setFixedSize(arg0, arg1);
    }

    public void setFormat(int arg0) {
        real.setFormat(arg0);
    }

    public void setKeepScreenOn(boolean arg0) {
        real.setKeepScreenOn(arg0);
    }

    public void setSizeFromLayout() {
        real.setSizeFromLayout();
    }

    public void setType(int arg0) {
        real.setType(arg0);
    }

    public void unlockCanvasAndPost(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.unlockCanvasAndPost(arg0 == null ? null : arg0.unwrap());
    }

    public static final int SURFACE_TYPE_GPU = android.view.SurfaceHolder.SURFACE_TYPE_GPU;
    public static final int SURFACE_TYPE_HARDWARE = android.view.SurfaceHolder.SURFACE_TYPE_HARDWARE;
    public static final int SURFACE_TYPE_NORMAL = android.view.SurfaceHolder.SURFACE_TYPE_NORMAL;
    public static final int SURFACE_TYPE_PUSH_BUFFERS = android.view.SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS;

    public static final class BadSurfaceTypeException {
        private final android.view.SurfaceHolder.BadSurfaceTypeException real;

        public BadSurfaceTypeException(android.view.SurfaceHolder.BadSurfaceTypeException real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceHolder.BadSurfaceTypeException wrap(android.view.SurfaceHolder.BadSurfaceTypeException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceHolder.BadSurfaceTypeException(real);
        }

        public android.view.SurfaceHolder.BadSurfaceTypeException unwrap() {
            return real;
        }

        public BadSurfaceTypeException() {
            this(new android.view.SurfaceHolder.BadSurfaceTypeException());
        }

        public BadSurfaceTypeException(java.lang.String arg0) {
            this(new android.view.SurfaceHolder.BadSurfaceTypeException(arg0));
        }

    }
    public static final class Callback {
        private final android.view.SurfaceHolder.Callback real;

        public Callback(android.view.SurfaceHolder.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback wrap(android.view.SurfaceHolder.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback(real);
        }

        public android.view.SurfaceHolder.Callback unwrap() {
            return real;
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

    }
    public static final class Callback2 {
        private final android.view.SurfaceHolder.Callback2 real;

        public Callback2(android.view.SurfaceHolder.Callback2 real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback2 wrap(android.view.SurfaceHolder.Callback2 real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback2(real);
        }

        public android.view.SurfaceHolder.Callback2 unwrap() {
            return real;
        }

        public void surfaceRedrawNeeded(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
            real.surfaceRedrawNeeded(arg0 == null ? null : arg0.unwrap());
        }

        public void surfaceRedrawNeededAsync(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0, java.lang.Runnable arg1) {
            real.surfaceRedrawNeededAsync(arg0 == null ? null : arg0.unwrap(), arg1);
        }

    }
}
