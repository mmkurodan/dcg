// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view;

public final class Surface {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Surface(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.Surface wrap(android.view.Surface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.Surface(real, (__DcgwBridgeToken) null);
    }

    public android.view.Surface getReal() {
        return (android.view.Surface) real;
    }

    public android.view.Surface unwrap() {
        return getReal();
    }

    public Surface(com.micklab.dcg.wrapper.android.view.SurfaceControl arg0) {
        this(new android.view.Surface(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public Surface(com.micklab.dcg.wrapper.android.graphics.SurfaceTexture arg0) {
        this(new android.view.Surface(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void clearFrameRate() {
        ((android.view.Surface) real).clearFrameRate();
    }

    public int describeContents() {
        return ((android.view.Surface) real).describeContents();
    }

    public boolean isValid() {
        return ((android.view.Surface) real).isValid();
    }

    public com.micklab.dcg.wrapper.android.graphics.Canvas lockCanvas(com.micklab.dcg.wrapper.android.graphics.Rect arg0) throws java.lang.IllegalArgumentException, android.view.Surface.OutOfResourcesException {
        return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(((android.view.Surface) real).lockCanvas(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.graphics.Canvas lockHardwareCanvas() {
        return com.micklab.dcg.wrapper.android.graphics.Canvas.wrap(((android.view.Surface) real).lockHardwareCanvas());
    }

    public void readFromParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0) {
        ((android.view.Surface) real).readFromParcel(arg0 == null ? null : arg0.getReal());
    }

    public void release() {
        ((android.view.Surface) real).release();
    }

    public void setFrameRate(float arg0, int arg1) {
        ((android.view.Surface) real).setFrameRate(arg0, arg1);
    }

    public void setFrameRate(float arg0, int arg1, int arg2) {
        ((android.view.Surface) real).setFrameRate(arg0, arg1, arg2);
    }

    public java.lang.String toString() {
        return ((android.view.Surface) real).toString();
    }

    public void unlockCanvas(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.view.Surface) real).unlockCanvas(arg0 == null ? null : arg0.getReal());
    }

    public void unlockCanvasAndPost(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.view.Surface) real).unlockCanvasAndPost(arg0 == null ? null : arg0.getReal());
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.view.Surface) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int CHANGE_FRAME_RATE_ALWAYS = android.view.Surface.CHANGE_FRAME_RATE_ALWAYS;
    public static final int CHANGE_FRAME_RATE_ONLY_IF_SEAMLESS = android.view.Surface.CHANGE_FRAME_RATE_ONLY_IF_SEAMLESS;
    public static final int FRAME_RATE_COMPATIBILITY_DEFAULT = android.view.Surface.FRAME_RATE_COMPATIBILITY_DEFAULT;
    public static final int FRAME_RATE_COMPATIBILITY_FIXED_SOURCE = android.view.Surface.FRAME_RATE_COMPATIBILITY_FIXED_SOURCE;
    public static final int ROTATION_0 = android.view.Surface.ROTATION_0;
    public static final int ROTATION_180 = android.view.Surface.ROTATION_180;
    public static final int ROTATION_270 = android.view.Surface.ROTATION_270;
    public static final int ROTATION_90 = android.view.Surface.ROTATION_90;

    public static final class OutOfResourcesException {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OutOfResourcesException(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.view.Surface.OutOfResourcesException wrap(android.view.Surface.OutOfResourcesException real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.view.Surface.OutOfResourcesException(real, (__DcgwBridgeToken) null);
        }

        public android.view.Surface.OutOfResourcesException getReal() {
            return (android.view.Surface.OutOfResourcesException) real;
        }

        public android.view.Surface.OutOfResourcesException unwrap() {
            return getReal();
        }

        public OutOfResourcesException() {
            this(new android.view.Surface.OutOfResourcesException(), (__DcgwBridgeToken) null);
        }

        public OutOfResourcesException(java.lang.String arg0) {
            this(new android.view.Surface.OutOfResourcesException(arg0), (__DcgwBridgeToken) null);
        }

    }
}
