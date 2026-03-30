// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class Event {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Event(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.Event wrap(android.media.metrics.Event real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.Event(real, (__DcgwBridgeToken) null);
    }

    public android.media.metrics.Event getReal() {
        return (android.media.metrics.Event) real;
    }

    public android.media.metrics.Event unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getMetricsBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.metrics.Event) real).getMetricsBundle());
    }

    public long getTimeSinceCreatedMillis() {
        return ((android.media.metrics.Event) real).getTimeSinceCreatedMillis();
    }

}
