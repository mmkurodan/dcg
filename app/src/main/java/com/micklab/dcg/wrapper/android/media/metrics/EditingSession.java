// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class EditingSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EditingSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.EditingSession wrap(android.media.metrics.EditingSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.EditingSession(real, (__DcgwBridgeToken) null);
    }

    public android.media.metrics.EditingSession getReal() {
        return (android.media.metrics.EditingSession) real;
    }

    public android.media.metrics.EditingSession unwrap() {
        return getReal();
    }

    public void close() {
        ((android.media.metrics.EditingSession) real).close();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.metrics.EditingSession) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(((android.media.metrics.EditingSession) real).getSessionId());
    }

    public int hashCode() {
        return ((android.media.metrics.EditingSession) real).hashCode();
    }

    public void reportEditingEndedEvent(com.micklab.dcg.wrapper.android.media.metrics.EditingEndedEvent arg0) {
        ((android.media.metrics.EditingSession) real).reportEditingEndedEvent(arg0 == null ? null : arg0.getReal());
    }

}
