// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class PlaybackSession {
    private final android.media.metrics.PlaybackSession real;

    public PlaybackSession(android.media.metrics.PlaybackSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.PlaybackSession wrap(android.media.metrics.PlaybackSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.PlaybackSession(real);
    }

    public android.media.metrics.PlaybackSession unwrap() {
        return real;
    }

    public void close() {
        real.close();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(real.getSessionId());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void reportNetworkEvent(com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.metrics.PlaybackSession#reportNetworkEvent(android.media.metrics.NetworkEvent)");
    }

    public void reportPlaybackErrorEvent(com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent arg0) {
        real.reportPlaybackErrorEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void reportPlaybackMetrics(com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics arg0) {
        real.reportPlaybackMetrics(arg0 == null ? null : arg0.unwrap());
    }

    public void reportPlaybackStateEvent(com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent arg0) {
        real.reportPlaybackStateEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void reportTrackChangeEvent(com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent arg0) {
        real.reportTrackChangeEvent(arg0 == null ? null : arg0.unwrap());
    }

}
