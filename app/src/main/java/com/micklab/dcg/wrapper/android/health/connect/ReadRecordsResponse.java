// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class ReadRecordsResponse {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReadRecordsResponse(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.ReadRecordsResponse wrap(android.health.connect.ReadRecordsResponse real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadRecordsResponse(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.ReadRecordsResponse getReal() {
        return (android.health.connect.ReadRecordsResponse) real;
    }

    public android.health.connect.ReadRecordsResponse unwrap() {
        return getReal();
    }

    public long getNextPageToken() {
        return ((android.health.connect.ReadRecordsResponse) real).getNextPageToken();
    }

}
