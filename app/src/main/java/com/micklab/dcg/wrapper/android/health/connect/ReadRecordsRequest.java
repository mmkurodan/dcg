// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class ReadRecordsRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReadRecordsRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequest wrap(android.health.connect.ReadRecordsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequest(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.ReadRecordsRequest getReal() {
        return (android.health.connect.ReadRecordsRequest) real;
    }

    public android.health.connect.ReadRecordsRequest unwrap() {
        return getReal();
    }

}
