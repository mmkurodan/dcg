// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class RecordingSession {
    private final android.media.metrics.RecordingSession real;

    public RecordingSession(android.media.metrics.RecordingSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.RecordingSession wrap(android.media.metrics.RecordingSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.RecordingSession(real);
    }

    public android.media.metrics.RecordingSession unwrap() {
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
