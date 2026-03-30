// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class LogSessionId {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LogSessionId(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.LogSessionId wrap(android.media.metrics.LogSessionId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.LogSessionId(real, (__DcgwBridgeToken) null);
    }

    public android.media.metrics.LogSessionId getReal() {
        return (android.media.metrics.LogSessionId) real;
    }

    public android.media.metrics.LogSessionId unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.metrics.LogSessionId) real).equals(arg0);
    }

    public java.lang.String getStringId() {
        return ((android.media.metrics.LogSessionId) real).getStringId();
    }

    public int hashCode() {
        return ((android.media.metrics.LogSessionId) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.media.metrics.LogSessionId) real).toString();
    }

    public static final com.micklab.dcg.wrapper.android.media.metrics.LogSessionId LOG_SESSION_ID_NONE = com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE);

}
