// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class AggregateRecordsGroupedByDurationResponse {
    private final android.health.connect.AggregateRecordsGroupedByDurationResponse real;

    public AggregateRecordsGroupedByDurationResponse(android.health.connect.AggregateRecordsGroupedByDurationResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsGroupedByDurationResponse wrap(android.health.connect.AggregateRecordsGroupedByDurationResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsGroupedByDurationResponse(real);
    }

    public android.health.connect.AggregateRecordsGroupedByDurationResponse unwrap() {
        return real;
    }

    public java.time.Instant getEndTime() {
        return real.getEndTime();
    }

    public java.time.Instant getStartTime() {
        return real.getStartTime();
    }

}
