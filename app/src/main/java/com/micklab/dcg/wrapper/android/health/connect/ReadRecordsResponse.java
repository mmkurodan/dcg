// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class ReadRecordsResponse {
    private final android.health.connect.ReadRecordsResponse real;

    public ReadRecordsResponse(android.health.connect.ReadRecordsResponse real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.ReadRecordsResponse wrap(android.health.connect.ReadRecordsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadRecordsResponse(real);
    }

    public android.health.connect.ReadRecordsResponse unwrap() {
        return real;
    }

    public long getNextPageToken() {
        return real.getNextPageToken();
    }

}
