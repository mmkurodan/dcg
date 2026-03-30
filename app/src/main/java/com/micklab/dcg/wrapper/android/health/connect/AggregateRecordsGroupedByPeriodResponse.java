// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class AggregateRecordsGroupedByPeriodResponse {
    private final android.health.connect.AggregateRecordsGroupedByPeriodResponse real;

    public AggregateRecordsGroupedByPeriodResponse(android.health.connect.AggregateRecordsGroupedByPeriodResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsGroupedByPeriodResponse wrap(android.health.connect.AggregateRecordsGroupedByPeriodResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsGroupedByPeriodResponse(real);
    }

    public android.health.connect.AggregateRecordsGroupedByPeriodResponse unwrap() {
        return real;
    }

    public java.time.LocalDateTime getEndTime() {
        return real.getEndTime();
    }

    public java.time.LocalDateTime getStartTime() {
        return real.getStartTime();
    }

}
