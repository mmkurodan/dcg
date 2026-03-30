// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class RecordingSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RecordingSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.RecordingSession wrap(android.media.metrics.RecordingSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.RecordingSession(real, (__DcgwBridgeToken) null);
    }

    public android.media.metrics.RecordingSession getReal() {
        return (android.media.metrics.RecordingSession) real;
    }

    public android.media.metrics.RecordingSession unwrap() {
        return getReal();
    }

    public void close() {
        ((android.media.metrics.RecordingSession) real).close();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.metrics.RecordingSession) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(((android.media.metrics.RecordingSession) real).getSessionId());
    }

    public int hashCode() {
        return ((android.media.metrics.RecordingSession) real).hashCode();
    }

}
