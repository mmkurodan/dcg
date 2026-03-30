// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class AggregateRecordsGroupedByPeriodResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AggregateRecordsGroupedByPeriodResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsGroupedByPeriodResponse wrap(android.health.connect.AggregateRecordsGroupedByPeriodResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsGroupedByPeriodResponse(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.AggregateRecordsGroupedByPeriodResponse getReal() {
        return (android.health.connect.AggregateRecordsGroupedByPeriodResponse) real;
    }

    public android.health.connect.AggregateRecordsGroupedByPeriodResponse unwrap() {
        return getReal();
    }

    public java.time.LocalDateTime getEndTime() {
        return ((android.health.connect.AggregateRecordsGroupedByPeriodResponse) real).getEndTime();
    }

    public java.time.LocalDateTime getStartTime() {
        return ((android.health.connect.AggregateRecordsGroupedByPeriodResponse) real).getStartTime();
    }

}
