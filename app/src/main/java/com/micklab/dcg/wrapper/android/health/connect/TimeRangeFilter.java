// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class TimeRangeFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TimeRangeFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.TimeRangeFilter wrap(android.health.connect.TimeRangeFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.TimeRangeFilter(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.TimeRangeFilter getReal() {
        return (android.health.connect.TimeRangeFilter) real;
    }

    public android.health.connect.TimeRangeFilter unwrap() {
        return getReal();
    }

}
