// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class RecordIdFilter {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RecordIdFilter(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.RecordIdFilter wrap(android.health.connect.RecordIdFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.RecordIdFilter(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.RecordIdFilter getReal() {
        return (android.health.connect.RecordIdFilter) real;
    }

    public android.health.connect.RecordIdFilter unwrap() {
        return getReal();
    }

    public java.lang.String getClientRecordId() {
        return ((android.health.connect.RecordIdFilter) real).getClientRecordId();
    }

    public java.lang.String getId() {
        return ((android.health.connect.RecordIdFilter) real).getId();
    }

}
