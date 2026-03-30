// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class LoudnessCodecController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LoudnessCodecController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.LoudnessCodecController wrap(android.media.LoudnessCodecController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.LoudnessCodecController(real, (__DcgwBridgeToken) null);
    }

    public android.media.LoudnessCodecController getReal() {
        return (android.media.LoudnessCodecController) real;
    }

    public android.media.LoudnessCodecController unwrap() {
        return getReal();
    }

    public boolean addMediaCodec(com.micklab.dcg.wrapper.android.media.MediaCodec arg0) {
        return ((android.media.LoudnessCodecController) real).addMediaCodec(arg0 == null ? null : arg0.getReal());
    }

    public void close() {
        ((android.media.LoudnessCodecController) real).close();
    }

    public static com.micklab.dcg.wrapper.android.media.LoudnessCodecController create(int arg0) {
        return com.micklab.dcg.wrapper.android.media.LoudnessCodecController.wrap(android.media.LoudnessCodecController.create(arg0));
    }

    public static com.micklab.dcg.wrapper.android.media.LoudnessCodecController create(int arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener arg2) {
        return com.micklab.dcg.wrapper.android.media.LoudnessCodecController.wrap(android.media.LoudnessCodecController.create(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getLoudnessCodecParams(com.micklab.dcg.wrapper.android.media.MediaCodec arg0) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.LoudnessCodecController) real).getLoudnessCodecParams(arg0 == null ? null : arg0.getReal()));
    }

    public void removeMediaCodec(com.micklab.dcg.wrapper.android.media.MediaCodec arg0) {
        ((android.media.LoudnessCodecController) real).removeMediaCodec(arg0 == null ? null : arg0.getReal());
    }

    public static final class OnLoudnessCodecUpdateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnLoudnessCodecUpdateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener wrap(android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener getReal() {
            return (android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener) real;
        }

        public android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener unwrap() {
            return getReal();
        }

        public com.micklab.dcg.wrapper.android.os.Bundle onLoudnessCodecUpdate(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener) real).onLoudnessCodecUpdate(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
        }

    }
}
