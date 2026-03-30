// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class BundleSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BundleSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.BundleSession wrap(android.media.metrics.BundleSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.BundleSession(real, (__DcgwBridgeToken) null);
    }

    public android.media.metrics.BundleSession getReal() {
        return (android.media.metrics.BundleSession) real;
    }

    public android.media.metrics.BundleSession unwrap() {
        return getReal();
    }

    public void close() {
        ((android.media.metrics.BundleSession) real).close();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.metrics.BundleSession) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.metrics.LogSessionId getSessionId() {
        return com.micklab.dcg.wrapper.android.media.metrics.LogSessionId.wrap(((android.media.metrics.BundleSession) real).getSessionId());
    }

    public int hashCode() {
        return ((android.media.metrics.BundleSession) real).hashCode();
    }

    public void reportBundleMetrics(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
        ((android.media.metrics.BundleSession) real).reportBundleMetrics(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String KEY_STATSD_ATOM = android.media.metrics.BundleSession.KEY_STATSD_ATOM;

}
