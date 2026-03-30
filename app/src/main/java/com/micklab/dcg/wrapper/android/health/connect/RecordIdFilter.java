// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class RecordIdFilter {
    private final android.health.connect.RecordIdFilter real;

    public RecordIdFilter(android.health.connect.RecordIdFilter real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.RecordIdFilter wrap(android.health.connect.RecordIdFilter real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.RecordIdFilter(real);
    }

    public android.health.connect.RecordIdFilter unwrap() {
        return real;
    }

    public java.lang.String getClientRecordId() {
        return real.getClientRecordId();
    }

    public java.lang.String getId() {
        return real.getId();
    }

}
