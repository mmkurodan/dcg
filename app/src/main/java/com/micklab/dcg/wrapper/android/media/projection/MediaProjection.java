// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.projection;

public final class MediaProjection {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaProjection(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.projection.MediaProjection wrap(android.media.projection.MediaProjection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.projection.MediaProjection(real, (__DcgwBridgeToken) null);
    }

    public android.media.projection.MediaProjection getReal() {
        return (android.media.projection.MediaProjection) real;
    }

    public android.media.projection.MediaProjection unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.view.Surface arg5, com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.Callback arg6, com.micklab.dcg.wrapper.android.os.Handler arg7) {
        return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.wrap(((android.media.projection.MediaProjection) real).createVirtualDisplay(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal(), arg6 == null ? null : arg6.getReal(), arg7 == null ? null : arg7.getReal()));
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.media.projection.MediaProjection.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.projection.MediaProjection) real).registerCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void stop() {
        ((android.media.projection.MediaProjection) real).stop();
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.media.projection.MediaProjection.Callback arg0) {
        ((android.media.projection.MediaProjection) real).unregisterCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.projection.MediaProjection.Callback wrap(android.media.projection.MediaProjection.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.projection.MediaProjection.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.media.projection.MediaProjection.Callback getReal() {
            return (android.media.projection.MediaProjection.Callback) real;
        }

        public android.media.projection.MediaProjection.Callback unwrap() {
            return getReal();
        }

        public void onCapturedContentResize(int arg0, int arg1) {
            ((android.media.projection.MediaProjection.Callback) real).onCapturedContentResize(arg0, arg1);
        }

        public void onCapturedContentVisibilityChanged(boolean arg0) {
            ((android.media.projection.MediaProjection.Callback) real).onCapturedContentVisibilityChanged(arg0);
        }

        public void onStop() {
            ((android.media.projection.MediaProjection.Callback) real).onStop();
        }

    }
}
