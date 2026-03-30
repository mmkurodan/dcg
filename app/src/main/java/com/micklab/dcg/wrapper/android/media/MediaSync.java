// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaSync {
    private final android.media.MediaSync real;

    public MediaSync(android.media.MediaSync real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaSync wrap(android.media.MediaSync real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSync(real);
    }

    public android.media.MediaSync unwrap() {
        return real;
    }

    public MediaSync() {
        this(new android.media.MediaSync());
    }

    public com.micklab.dcg.wrapper.android.view.Surface createInputSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(real.createInputSurface());
    }

    public void flush() {
        real.flush();
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams getPlaybackParams() {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(real.getPlaybackParams());
    }

    public com.micklab.dcg.wrapper.android.media.SyncParams getSyncParams() {
        return com.micklab.dcg.wrapper.android.media.SyncParams.wrap(real.getSyncParams());
    }

    public com.micklab.dcg.wrapper.android.media.MediaTimestamp getTimestamp() {
        return com.micklab.dcg.wrapper.android.media.MediaTimestamp.wrap(real.getTimestamp());
    }

    public void queueAudio(java.nio.ByteBuffer arg0, int arg1, long arg2) {
        real.queueAudio(arg0, arg1, arg2);
    }

    public void release() {
        real.release();
    }

    public void setAudioTrack(com.micklab.dcg.wrapper.android.media.AudioTrack arg0) {
        real.setAudioTrack(arg0 == null ? null : arg0.unwrap());
    }

    public void setCallback(com.micklab.dcg.wrapper.android.media.MediaSync.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setOnErrorListener(com.micklab.dcg.wrapper.android.media.MediaSync.OnErrorListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setOnErrorListener(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
        real.setPlaybackParams(arg0 == null ? null : arg0.unwrap());
    }

    public void setSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        real.setSurface(arg0 == null ? null : arg0.unwrap());
    }

    public void setSyncParams(com.micklab.dcg.wrapper.android.media.SyncParams arg0) {
        real.setSyncParams(arg0 == null ? null : arg0.unwrap());
    }

    public static final int MEDIASYNC_ERROR_AUDIOTRACK_FAIL = android.media.MediaSync.MEDIASYNC_ERROR_AUDIOTRACK_FAIL;
    public static final int MEDIASYNC_ERROR_SURFACE_FAIL = android.media.MediaSync.MEDIASYNC_ERROR_SURFACE_FAIL;

    public static final class Callback {
        private final android.media.MediaSync.Callback real;

        public Callback(android.media.MediaSync.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaSync.Callback wrap(android.media.MediaSync.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSync.Callback(real);
        }

        public android.media.MediaSync.Callback unwrap() {
            return real;
        }

        public void onAudioBufferConsumed(com.micklab.dcg.wrapper.android.media.MediaSync arg0, java.nio.ByteBuffer arg1, int arg2) {
            real.onAudioBufferConsumed(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
    public static final class OnErrorListener {
        private final android.media.MediaSync.OnErrorListener real;

        public OnErrorListener(android.media.MediaSync.OnErrorListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaSync.OnErrorListener wrap(android.media.MediaSync.OnErrorListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSync.OnErrorListener(real);
        }

        public android.media.MediaSync.OnErrorListener unwrap() {
            return real;
        }

        public void onError(com.micklab.dcg.wrapper.android.media.MediaSync arg0, int arg1, int arg2) {
            real.onError(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
        }

    }
}
