// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class SurfaceHolder {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SurfaceHolder(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.SurfaceHolder wrap(android.view.SurfaceHolder real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceHolder(real, (__DcgwBridgeToken) null);
    }

    public android.view.SurfaceHolder getReal() {
        return (android.view.SurfaceHolder) real;
    }

    public android.view.SurfaceHolder unwrap() {
        return getReal();
    }

    public void addCallback(com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback arg0) {
        ((android.view.SurfaceHolder) real).addCallback(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(((android.view.SurfaceHolder) real).getSurface());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getSurfaceFrame() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.view.SurfaceHolder) real).getSurfaceFrame());
    }

    public boolean isCreating() {
        return ((android.view.SurfaceHolder) real).isCreating();
    }

    public com.micklab.dcg.wrapper.android.graphics.Canvas lockCanvas() {
        return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(((android.view.SurfaceHolder) real).lockCanvas());
    }

    public com.micklab.dcg.wrapper.android.graphics.Canvas lockCanvas(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(((android.view.SurfaceHolder) real).lockCanvas(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Canvas lockHardwareCanvas() {
        return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(((android.view.SurfaceHolder) real).lockHardwareCanvas());
    }

    public void removeCallback(com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback arg0) {
        ((android.view.SurfaceHolder) real).removeCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setFixedSize(int arg0, int arg1) {
        ((android.view.SurfaceHolder) real).setFixedSize(arg0, arg1);
    }

    public void setFormat(int arg0) {
        ((android.view.SurfaceHolder) real).setFormat(arg0);
    }

    public void setKeepScreenOn(boolean arg0) {
        ((android.view.SurfaceHolder) real).setKeepScreenOn(arg0);
    }

    public void setSizeFromLayout() {
        ((android.view.SurfaceHolder) real).setSizeFromLayout();
    }

    public void setType(int arg0) {
        ((android.view.SurfaceHolder) real).setType(arg0);
    }

    public void unlockCanvasAndPost(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.view.SurfaceHolder) real).unlockCanvasAndPost(arg0 == null ? null : arg0.getReal());
    }

    public static final int SURFACE_TYPE_GPU = android.view.SurfaceHolder.SURFACE_TYPE_GPU;
    public static final int SURFACE_TYPE_HARDWARE = android.view.SurfaceHolder.SURFACE_TYPE_HARDWARE;
    public static final int SURFACE_TYPE_NORMAL = android.view.SurfaceHolder.SURFACE_TYPE_NORMAL;
    public static final int SURFACE_TYPE_PUSH_BUFFERS = android.view.SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS;

    public static final class BadSurfaceTypeException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private BadSurfaceTypeException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceHolder.BadSurfaceTypeException wrap(android.view.SurfaceHolder.BadSurfaceTypeException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceHolder.BadSurfaceTypeException(real, (__DcgwBridgeToken) null);
        }

        public android.view.SurfaceHolder.BadSurfaceTypeException getReal() {
            return (android.view.SurfaceHolder.BadSurfaceTypeException) real;
        }

        public android.view.SurfaceHolder.BadSurfaceTypeException unwrap() {
            return getReal();
        }

        public BadSurfaceTypeException() {
            this(new android.view.SurfaceHolder.BadSurfaceTypeException(), (__DcgwBridgeToken) null);
        }

        public BadSurfaceTypeException(java.lang.String arg0) {
            this(new android.view.SurfaceHolder.BadSurfaceTypeException(arg0), (__DcgwBridgeToken) null);
        }

    }
    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback wrap(android.view.SurfaceHolder.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.view.SurfaceHolder.Callback getReal() {
            return (android.view.SurfaceHolder.Callback) real;
        }

        public android.view.SurfaceHolder.Callback unwrap() {
            return getReal();
        }

        public void surfaceChanged(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0, int arg1, int arg2, int arg3) {
            ((android.view.SurfaceHolder.Callback) real).surfaceChanged(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3);
        }

        public void surfaceCreated(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
            ((android.view.SurfaceHolder.Callback) real).surfaceCreated(arg0 == null ? null : arg0.getReal());
        }

        public void surfaceDestroyed(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
            ((android.view.SurfaceHolder.Callback) real).surfaceDestroyed(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class Callback2 {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback2(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback2 wrap(android.view.SurfaceHolder.Callback2 real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.SurfaceHolder.Callback2(real, (__DcgwBridgeToken) null);
        }

        public android.view.SurfaceHolder.Callback2 getReal() {
            return (android.view.SurfaceHolder.Callback2) real;
        }

        public android.view.SurfaceHolder.Callback2 unwrap() {
            return getReal();
        }

        public void surfaceRedrawNeeded(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0) {
            ((android.view.SurfaceHolder.Callback2) real).surfaceRedrawNeeded(arg0 == null ? null : arg0.getReal());
        }

        public void surfaceRedrawNeededAsync(com.micklab.dcg.wrapper.android.view.SurfaceHolder arg0, java.lang.Runnable arg1) {
            ((android.view.SurfaceHolder.Callback2) real).surfaceRedrawNeededAsync(arg0 == null ? null : arg0.getReal(), arg1);
        }

    }
}
