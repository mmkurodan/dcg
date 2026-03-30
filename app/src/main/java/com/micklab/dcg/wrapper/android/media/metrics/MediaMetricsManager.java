// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class MediaMetricsManager {
    private final android.media.metrics.MediaMetricsManager real;

    public MediaMetricsManager(android.media.metrics.MediaMetricsManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.MediaMetricsManager wrap(android.media.metrics.MediaMetricsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.MediaMetricsManager(real);
    }

    public android.media.metrics.MediaMetricsManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.media.metrics.BundleSession createBundleSession() {
        return com.micklab.dcg.wrapper.android.media.metrics.BundleSession.wrap(real.createBundleSession());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.EditingSession createEditingSession() {
        return com.micklab.dcg.wrapper.android.media.metrics.EditingSession.wrap(real.createEditingSession());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.PlaybackSession createPlaybackSession() {
        return com.micklab.dcg.wrapper.android.media.metrics.PlaybackSession.wrap(real.createPlaybackSession());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.RecordingSession createRecordingSession() {
        return com.micklab.dcg.wrapper.android.media.metrics.RecordingSession.wrap(real.createRecordingSession());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.TranscodingSession createTranscodingSession() {
        return com.micklab.dcg.wrapper.android.media.metrics.TranscodingSession.wrap(real.createTranscodingSession());
    }

    public void releaseSessionId(java.lang.String arg0) {
        real.releaseSessionId(arg0);
    }

    public static final long INVALID_TIMESTAMP = android.media.metrics.MediaMetricsManager.INVALID_TIMESTAMP;

}
