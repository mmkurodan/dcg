// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class AggregateRecordsRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AggregateRecordsRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsRequest wrap(android.health.connect.AggregateRecordsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsRequest(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.AggregateRecordsRequest getReal() {
        return (android.health.connect.AggregateRecordsRequest) real;
    }

    public android.health.connect.AggregateRecordsRequest unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.health.connect.TimeRangeFilter getTimeRangeFilter() {
        return com.micklab.dcg.wrapper.android.health.connect.TimeRangeFilter.wrap(((android.health.connect.AggregateRecordsRequest) real).getTimeRangeFilter());
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsRequest.Builder wrap(android.health.connect.AggregateRecordsRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.AggregateRecordsRequest.Builder getReal() {
            return (android.health.connect.AggregateRecordsRequest.Builder) real;
        }

        public android.health.connect.AggregateRecordsRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.TimeRangeFilter arg0) {
            this(new android.health.connect.AggregateRecordsRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

    }
}
