// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class Event {
    private final android.media.metrics.Event real;

    public Event(android.media.metrics.Event real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.Event wrap(android.media.metrics.Event real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.Event(real);
    }

    public android.media.metrics.Event unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getMetricsBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getMetricsBundle());
    }

    public long getTimeSinceCreatedMillis() {
        return real.getTimeSinceCreatedMillis();
    }

}
