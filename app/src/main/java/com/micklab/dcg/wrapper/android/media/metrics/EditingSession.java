// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class EditingSession {
    private final android.media.metrics.EditingSession real;

    public EditingSession(android.media.metrics.EditingSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.EditingSession wrap(android.media.metrics.EditingSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.EditingSession(real);
    }

    public android.media.metrics.EditingSession unwrap() {
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

    public void reportEditingEndedEvent(com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent arg0) {
        real.reportEditingEndedEvent(arg0 == null ? null : arg0.unwrap());
    }

}
