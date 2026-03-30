// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class AggregateRecordsRequest {
    private final android.health.connect.AggregateRecordsRequest real;

    public AggregateRecordsRequest(android.health.connect.AggregateRecordsRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsRequest wrap(android.health.connect.AggregateRecordsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsRequest(real);
    }

    public android.health.connect.AggregateRecordsRequest unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.health.connect.TimeRangeFilter getTimeRangeFilter() {
        return com.micklab.dcg.wrapper.android.health.connect.TimeRangeFilter.wrap(real.getTimeRangeFilter());
    }

    public static final class Builder {
        private final android.health.connect.AggregateRecordsRequest.Builder real;

        public Builder(android.health.connect.AggregateRecordsRequest.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsRequest.Builder wrap(android.health.connect.AggregateRecordsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsRequest.Builder(real);
        }

        public android.health.connect.AggregateRecordsRequest.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.TimeRangeFilter arg0) {
            this(new android.health.connect.AggregateRecordsRequest.Builder(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
