// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class IntervalRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IntervalRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.IntervalRecord wrap(android.health.connect.datatypes.IntervalRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.IntervalRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.IntervalRecord getReal() {
        return (android.health.connect.datatypes.IntervalRecord) real;
    }

    public android.health.connect.datatypes.IntervalRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.IntervalRecord) real).equals(arg0);
    }

    public java.time.Instant getEndTime() {
        return ((android.health.connect.datatypes.IntervalRecord) real).getEndTime();
    }

    public java.time.ZoneOffset getEndZoneOffset() {
        return ((android.health.connect.datatypes.IntervalRecord) real).getEndZoneOffset();
    }

    public java.time.Instant getStartTime() {
        return ((android.health.connect.datatypes.IntervalRecord) real).getStartTime();
    }

    public java.time.ZoneOffset getStartZoneOffset() {
        return ((android.health.connect.datatypes.IntervalRecord) real).getStartZoneOffset();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.IntervalRecord) real).hashCode();
    }

}
