// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class TranscodingSession {
    private final android.media.metrics.TranscodingSession real;

    public TranscodingSession(android.media.metrics.TranscodingSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.TranscodingSession wrap(android.media.metrics.TranscodingSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.TranscodingSession(real);
    }

    public android.media.metrics.TranscodingSession unwrap() {
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

}
