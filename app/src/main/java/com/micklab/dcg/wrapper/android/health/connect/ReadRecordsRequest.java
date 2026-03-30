// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class ReadRecordsRequest {
    private final android.health.connect.ReadRecordsRequest real;

    public ReadRecordsRequest(android.health.connect.ReadRecordsRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequest wrap(android.health.connect.ReadRecordsRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequest(real);
    }

    public android.health.connect.ReadRecordsRequest unwrap() {
        return real;
    }

}
