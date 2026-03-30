// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class PlaybackSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PlaybackSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.PlaybackSession wrap(android.media.metrics.PlaybackSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.PlaybackSession(real, (__DcgwBridgeToken) null);
    }

    public android.media.metrics.PlaybackSession getReal() {
        return (android.media.metrics.PlaybackSession) real;
    }

    public android.media.metrics.PlaybackSession unwrap() {
        return getReal();
    }

    public void close() {
        ((android.media.metrics.PlaybackSession) real).close();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.metrics.PlaybackSession) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(((android.media.metrics.PlaybackSession) real).getSessionId());
    }

    public int hashCode() {
        return ((android.media.metrics.PlaybackSession) real).hashCode();
    }

    public void reportNetworkEvent(com.micklab.dcg.wrapper.android.media.metrics.NetworkEvent arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.metrics.PlaybackSession#reportNetworkEvent(android.media.metrics.NetworkEvent)");
    }

    public void reportPlaybackErrorEvent(com.micklab.dcg.wrapper.android.media.metrics.PlaybackErrorEvent arg0) {
        ((android.media.metrics.PlaybackSession) real).reportPlaybackErrorEvent(arg0 == null ? null : arg0.getReal());
    }

    public void reportPlaybackMetrics(com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics arg0) {
        ((android.media.metrics.PlaybackSession) real).reportPlaybackMetrics(arg0 == null ? null : arg0.getReal());
    }

    public void reportPlaybackStateEvent(com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent arg0) {
        ((android.media.metrics.PlaybackSession) real).reportPlaybackStateEvent(arg0 == null ? null : arg0.getReal());
    }

    public void reportTrackChangeEvent(com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent arg0) {
        ((android.media.metrics.PlaybackSession) real).reportTrackChangeEvent(arg0 == null ? null : arg0.getReal());
    }

}
