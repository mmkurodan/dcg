// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class InstantRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InstantRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.InstantRecord wrap(android.health.connect.datatypes.InstantRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.InstantRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.InstantRecord getReal() {
        return (android.health.connect.datatypes.InstantRecord) real;
    }

    public android.health.connect.datatypes.InstantRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.InstantRecord) real).equals(arg0);
    }

    public java.time.Instant getTime() {
        return ((android.health.connect.datatypes.InstantRecord) real).getTime();
    }

    public java.time.ZoneOffset getZoneOffset() {
        return ((android.health.connect.datatypes.InstantRecord) real).getZoneOffset();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.InstantRecord) real).hashCode();
    }

}
