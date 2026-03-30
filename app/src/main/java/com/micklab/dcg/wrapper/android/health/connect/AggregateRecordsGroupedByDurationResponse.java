// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class AggregateRecordsGroupedByDurationResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AggregateRecordsGroupedByDurationResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsGroupedByDurationResponse wrap(android.health.connect.AggregateRecordsGroupedByDurationResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsGroupedByDurationResponse(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.AggregateRecordsGroupedByDurationResponse getReal() {
        return (android.health.connect.AggregateRecordsGroupedByDurationResponse) real;
    }

    public android.health.connect.AggregateRecordsGroupedByDurationResponse unwrap() {
        return getReal();
    }

    public java.time.Instant getEndTime() {
        return ((android.health.connect.AggregateRecordsGroupedByDurationResponse) real).getEndTime();
    }

    public java.time.Instant getStartTime() {
        return ((android.health.connect.AggregateRecordsGroupedByDurationResponse) real).getStartTime();
    }

}
