// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class TranscodingSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TranscodingSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.TranscodingSession wrap(android.media.metrics.TranscodingSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.TranscodingSession(real, (__DcgwBridgeToken) null);
    }

    public android.media.metrics.TranscodingSession getReal() {
        return (android.media.metrics.TranscodingSession) real;
    }

    public android.media.metrics.TranscodingSession unwrap() {
        return getReal();
    }

    public void close() {
        ((android.media.metrics.TranscodingSession) real).close();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.metrics.TranscodingSession) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(((android.media.metrics.TranscodingSession) real).getSessionId());
    }

    public int hashCode() {
        return ((android.media.metrics.TranscodingSession) real).hashCode();
    }

}
