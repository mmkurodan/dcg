// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class LoudnessCodecController {
    private final android.media.LoudnessCodecController real;

    public LoudnessCodecController(android.media.LoudnessCodecController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.LoudnessCodecController wrap(android.media.LoudnessCodecController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.LoudnessCodecController(real);
    }

    public android.media.LoudnessCodecController unwrap() {
        return real;
    }

    public boolean addMediaCodec(com.micklab.dcg.wrapper.android.media.MediaCodec arg0) {
        return real.addMediaCodec(arg0 == null ? null : arg0.unwrap());
    }

    public void close() {
        real.close();
    }

    public static com.micklab.dcg.wrapper.android.media.LoudnessCodecController create(int arg0) {
        return com.micklab.dcg.wrapper.android.media.LoudnessCodecController.wrap(android.media.LoudnessCodecController.create(arg0));
    }

    public static com.micklab.dcg.wrapper.android.media.LoudnessCodecController create(int arg0, java.util.concurrent.Executor arg1, com.micklab.dcg.wrapper.android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener arg2) {
        return com.micklab.dcg.wrapper.android.media.LoudnessCodecController.wrap(android.media.LoudnessCodecController.create(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getLoudnessCodecParams(com.micklab.dcg.wrapper.android.media.MediaCodec arg0) {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getLoudnessCodecParams(arg0 == null ? null : arg0.unwrap()));
    }

    public void removeMediaCodec(com.micklab.dcg.wrapper.android.media.MediaCodec arg0) {
        real.removeMediaCodec(arg0 == null ? null : arg0.unwrap());
    }

    public static final class OnLoudnessCodecUpdateListener {
        private final android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener real;

        public OnLoudnessCodecUpdateListener(android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener wrap(android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener(real);
        }

        public android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener unwrap() {
            return real;
        }

        public com.micklab.dcg.wrapper.android.os.Bundle onLoudnessCodecUpdate(com.micklab.dcg.wrapper.android.media.MediaCodec arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.onLoudnessCodecUpdate(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
        }

    }
}
