// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvRecordingClient {
    private final android.media.tv.TvRecordingClient real;

    public TvRecordingClient(android.media.tv.TvRecordingClient real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvRecordingClient wrap(android.media.tv.TvRecordingClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvRecordingClient(real);
    }

    public android.media.tv.TvRecordingClient unwrap() {
        return real;
    }

    public TvRecordingClient(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.media.tv.TvRecordingClient.RecordingCallback arg2, com.micklab.dcg.wrapper.android.os.Handler arg3) {
        this(new android.media.tv.TvRecordingClient(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap()));
    }

    public void pauseRecording() {
        real.pauseRecording();
    }

    public void pauseRecording(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.pauseRecording(arg0 == null ? null : arg0.unwrap());
    }

    public void release() {
        real.release();
    }

    public void resumeRecording() {
        real.resumeRecording();
    }

    public void resumeRecording(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.resumeRecording(arg0 == null ? null : arg0.unwrap());
    }

    public void sendAppPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.sendAppPrivateCommand(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setTvInteractiveAppView(com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView arg0, java.lang.String arg1) {
        real.setTvInteractiveAppView(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void startRecording(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        real.startRecording(arg0 == null ? null : arg0.unwrap());
    }

    public void startRecording(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.startRecording(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void stopRecording() {
        real.stopRecording();
    }

    public void tune(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        real.tune(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void tune(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.tune(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public static final class RecordingCallback {
        private final android.media.tv.TvRecordingClient.RecordingCallback real;

        public RecordingCallback(android.media.tv.TvRecordingClient.RecordingCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvRecordingClient.RecordingCallback wrap(android.media.tv.TvRecordingClient.RecordingCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvRecordingClient.RecordingCallback(real);
        }

        public android.media.tv.TvRecordingClient.RecordingCallback unwrap() {
            return real;
        }

        public void onConnectionFailed(java.lang.String arg0) {
            real.onConnectionFailed(arg0);
        }

        public void onDisconnected(java.lang.String arg0) {
            real.onDisconnected(arg0);
        }

        public void onError(int arg0) {
            real.onError(arg0);
        }

        public void onRecordingStopped(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.onRecordingStopped(arg0 == null ? null : arg0.unwrap());
        }

        public void onTuned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.onTuned(arg0 == null ? null : arg0.unwrap());
        }

    }
}
