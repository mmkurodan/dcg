// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class BundleSession {
    private final android.media.metrics.BundleSession real;

    public BundleSession(android.media.metrics.BundleSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.BundleSession wrap(android.media.metrics.BundleSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.BundleSession(real);
    }

    public android.media.metrics.BundleSession unwrap() {
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

    public void reportBundleMetrics(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
        real.reportBundleMetrics(arg0 == null ? null : arg0.unwrap());
    }

    public static final java.lang.String KEY_STATSD_ATOM = android.media.metrics.BundleSession.KEY_STATSD_ATOM;

}
