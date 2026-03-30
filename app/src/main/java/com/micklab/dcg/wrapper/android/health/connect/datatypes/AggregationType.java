// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class AggregationType {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AggregationType(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.AggregationType wrap(android.health.connect.datatypes.AggregationType real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.AggregationType(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.AggregationType getReal() {
        return (android.health.connect.datatypes.AggregationType) real;
    }

    public android.health.connect.datatypes.AggregationType unwrap() {
        return getReal();
    }

}
