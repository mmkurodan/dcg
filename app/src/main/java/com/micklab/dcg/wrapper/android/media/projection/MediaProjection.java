// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.projection;

public final class MediaProjection {
    private final android.media.projection.MediaProjection real;

    public MediaProjection(android.media.projection.MediaProjection real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.projection.MediaProjection wrap(android.media.projection.MediaProjection real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.projection.MediaProjection(real);
    }

    public android.media.projection.MediaProjection unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.view.Surface arg5, com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.Callback arg6, com.micklab.dcg.wrapper.android.os.Handler arg7) {
        return com.micklab.dcg.wrapper.android.hardware.display.VirtualDisplay.wrap(real.createVirtualDisplay(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap(), arg6 == null ? null : arg6.unwrap(), arg7 == null ? null : arg7.unwrap()));
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.media.projection.MediaProjection.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void stop() {
        real.stop();
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.media.projection.MediaProjection.Callback arg0) {
        real.unregisterCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final class Callback {
        private final android.media.projection.MediaProjection.Callback real;

        public Callback(android.media.projection.MediaProjection.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.projection.MediaProjection.Callback wrap(android.media.projection.MediaProjection.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.projection.MediaProjection.Callback(real);
        }

        public android.media.projection.MediaProjection.Callback unwrap() {
            return real;
        }

        public void onCapturedContentResize(int arg0, int arg1) {
            real.onCapturedContentResize(arg0, arg1);
        }

        public void onCapturedContentVisibilityChanged(boolean arg0) {
            real.onCapturedContentVisibilityChanged(arg0);
        }

        public void onStop() {
            real.onStop();
        }

    }
}
