// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvRecordingClient {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvRecordingClient(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvRecordingClient wrap(android.media.tv.TvRecordingClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvRecordingClient(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TvRecordingClient getReal() {
        return (android.media.tv.TvRecordingClient) real;
    }

    public android.media.tv.TvRecordingClient unwrap() {
        return getReal();
    }

    public TvRecordingClient(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.media.tv.TvRecordingClient.RecordingCallback arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        this(new android.media.tv.TvRecordingClient(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
    }

    public void pauseRecording() {
        ((android.media.tv.TvRecordingClient) real).pauseRecording();
    }

    public void pauseRecording(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.media.tv.TvRecordingClient) real).pauseRecording(arg0 == null ? null : arg0.getReal());
    }

    public void release() {
        ((android.media.tv.TvRecordingClient) real).release();
    }

    public void resumeRecording() {
        ((android.media.tv.TvRecordingClient) real).resumeRecording();
    }

    public void resumeRecording(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.media.tv.TvRecordingClient) real).resumeRecording(arg0 == null ? null : arg0.getReal());
    }

    public void sendAppPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.media.tv.TvRecordingClient) real).sendAppPrivateCommand(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setTvInteractiveAppView(com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView arg0, java.lang.String arg1) {
        ((android.media.tv.TvRecordingClient) real).setTvInteractiveAppView(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void startRecording(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.media.tv.TvRecordingClient) real).startRecording(arg0 == null ? null : arg0.getReal());
    }

    public void startRecording(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.media.tv.TvRecordingClient) real).startRecording(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void stopRecording() {
        ((android.media.tv.TvRecordingClient) real).stopRecording();
    }

    public void tune(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        ((android.media.tv.TvRecordingClient) real).tune(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void tune(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.media.tv.TvRecordingClient) real).tune(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public static final class RecordingCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RecordingCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvRecordingClient.RecordingCallback wrap(android.media.tv.TvRecordingClient.RecordingCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvRecordingClient.RecordingCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvRecordingClient.RecordingCallback getReal() {
            return (android.media.tv.TvRecordingClient.RecordingCallback) real;
        }

        public android.media.tv.TvRecordingClient.RecordingCallback unwrap() {
            return getReal();
        }

        public void onConnectionFailed(java.lang.String arg0) {
            ((android.media.tv.TvRecordingClient.RecordingCallback) real).onConnectionFailed(arg0);
        }

        public void onDisconnected(java.lang.String arg0) {
            ((android.media.tv.TvRecordingClient.RecordingCallback) real).onDisconnected(arg0);
        }

        public void onError(int arg0) {
            ((android.media.tv.TvRecordingClient.RecordingCallback) real).onError(arg0);
        }

        public void onRecordingStopped(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.media.tv.TvRecordingClient.RecordingCallback) real).onRecordingStopped(arg0 == null ? null : arg0.getReal());
        }

        public void onTuned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.media.tv.TvRecordingClient.RecordingCallback) real).onTuned(arg0 == null ? null : arg0.getReal());
        }

    }
}
