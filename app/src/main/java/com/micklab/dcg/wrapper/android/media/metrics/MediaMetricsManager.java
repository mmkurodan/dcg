// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class MediaMetricsManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaMetricsManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.MediaMetricsManager wrap(android.media.metrics.MediaMetricsManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.MediaMetricsManager(real, (__DcgwBridgeToken) null);
    }

    public android.media.metrics.MediaMetricsManager getReal() {
        return (android.media.metrics.MediaMetricsManager) real;
    }

    public android.media.metrics.MediaMetricsManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.media.metrics.BundleSession createBundleSession() {
        return com.micklab.dcg.wrapper.android.media.metrics.BundleSession.wrap(((android.media.metrics.MediaMetricsManager) real).createBundleSession());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.EditingSession createEditingSession() {
        return com.micklab.dcg.wrapper.android.media.metrics.EditingSession.wrap(((android.media.metrics.MediaMetricsManager) real).createEditingSession());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.PlaybackSession createPlaybackSession() {
        return com.micklab.dcg.wrapper.android.media.metrics.PlaybackSession.wrap(((android.media.metrics.MediaMetricsManager) real).createPlaybackSession());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.RecordingSession createRecordingSession() {
        return com.micklab.dcg.wrapper.android.media.metrics.RecordingSession.wrap(((android.media.metrics.MediaMetricsManager) real).createRecordingSession());
    }

    public com.micklab.dcg.wrapper.android.media.metrics.TranscodingSession createTranscodingSession() {
        return com.micklab.dcg.wrapper.android.media.metrics.TranscodingSession.wrap(((android.media.metrics.MediaMetricsManager) real).createTranscodingSession());
    }

    public void releaseSessionId(java.lang.String arg0) {
        ((android.media.metrics.MediaMetricsManager) real).releaseSessionId(arg0);
    }

    public static final long INVALID_TIMESTAMP = android.media.metrics.MediaMetricsManager.INVALID_TIMESTAMP;

}
