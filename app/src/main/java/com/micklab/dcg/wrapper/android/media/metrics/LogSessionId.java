// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class LogSessionId {
    private final android.media.metrics.LogSessionId real;

    public LogSessionId(android.media.metrics.LogSessionId real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.LogSessionId wrap(android.media.metrics.LogSessionId real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.LogSessionId(real);
    }

    public android.media.metrics.LogSessionId unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getStringId() {
        return real.getStringId();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public static final com.micklab.dcg.wrapper.android.media.metrics.LogSessionId LOG_SESSION_ID_NONE = com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE);

}
