// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class AggregateRecordsResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AggregateRecordsResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsResponse wrap(android.health.connect.AggregateRecordsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.AggregateRecordsResponse(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.AggregateRecordsResponse getReal() {
        return (android.health.connect.AggregateRecordsResponse) real;
    }

    public android.health.connect.AggregateRecordsResponse unwrap() {
        return getReal();
    }

}
