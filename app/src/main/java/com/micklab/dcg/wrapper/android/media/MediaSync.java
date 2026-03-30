// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaSync {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaSync(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaSync wrap(android.media.MediaSync real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSync(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaSync getReal() {
        return (android.media.MediaSync) real;
    }

    public android.media.MediaSync unwrap() {
        return getReal();
    }

    public MediaSync() {
        this(new android.media.MediaSync(), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.view.Surface createInputSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(((android.media.MediaSync) real).createInputSurface());
    }

    public void flush() {
        ((android.media.MediaSync) real).flush();
    }

    public com.micklab.dcg.wrapper.android.media.PlaybackParams getPlaybackParams() {
        return com.micklab.dcg.wrapper.android.media.PlaybackParams.wrap(((android.media.MediaSync) real).getPlaybackParams());
    }

    public com.micklab.dcg.wrapper.android.media.SyncParams getSyncParams() {
        return com.micklab.dcg.wrapper.android.media.SyncParams.wrap(((android.media.MediaSync) real).getSyncParams());
    }

    public com.micklab.dcg.wrapper.android.media.MediaTimestamp getTimestamp() {
        return com.micklab.dcg.wrapper.android.media.MediaTimestamp.wrap(((android.media.MediaSync) real).getTimestamp());
    }

    public void queueAudio(java.nio.ByteBuffer arg0, int arg1, long arg2) {
        ((android.media.MediaSync) real).queueAudio(arg0, arg1, arg2);
    }

    public void release() {
        ((android.media.MediaSync) real).release();
    }

    public void setAudioTrack(com.micklab.dcg.wrapper.android.media.AudioTrack arg0) {
        ((android.media.MediaSync) real).setAudioTrack(arg0 == null ? null : arg0.getReal());
    }

    public void setCallback(com.micklab.dcg.wrapper.android.media.MediaSync.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaSync) real).setCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setOnErrorListener(com.micklab.dcg.wrapper.android.media.MediaSync.OnErrorListener arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.MediaSync) real).setOnErrorListener(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
        ((android.media.MediaSync) real).setPlaybackParams(arg0 == null ? null : arg0.getReal());
    }

    public void setSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        ((android.media.MediaSync) real).setSurface(arg0 == null ? null : arg0.getReal());
    }

    public void setSyncParams(com.micklab.dcg.wrapper.android.media.SyncParams arg0) {
        ((android.media.MediaSync) real).setSyncParams(arg0 == null ? null : arg0.getReal());
    }

    public static final int MEDIASYNC_ERROR_AUDIOTRACK_FAIL = android.media.MediaSync.MEDIASYNC_ERROR_AUDIOTRACK_FAIL;
    public static final int MEDIASYNC_ERROR_SURFACE_FAIL = android.media.MediaSync.MEDIASYNC_ERROR_SURFACE_FAIL;

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaSync.Callback wrap(android.media.MediaSync.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSync.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaSync.Callback getReal() {
            return (android.media.MediaSync.Callback) real;
        }

        public android.media.MediaSync.Callback unwrap() {
            return getReal();
        }

        public void onAudioBufferConsumed(com.micklab.dcg.wrapper.android.media.MediaSync arg0, java.nio.ByteBuffer arg1, int arg2) {
            ((android.media.MediaSync.Callback) real).onAudioBufferConsumed(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
    public static final class OnErrorListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnErrorListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.MediaSync.OnErrorListener wrap(android.media.MediaSync.OnErrorListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaSync.OnErrorListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.MediaSync.OnErrorListener getReal() {
            return (android.media.MediaSync.OnErrorListener) real;
        }

        public android.media.MediaSync.OnErrorListener unwrap() {
            return getReal();
        }

        public void onError(com.micklab.dcg.wrapper.android.media.MediaSync arg0, int arg1, int arg2) {
            ((android.media.MediaSync.OnErrorListener) real).onError(arg0 == null ? null : arg0.getReal(), arg1, arg2);
        }

    }
}
