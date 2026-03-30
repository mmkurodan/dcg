// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class IntervalRecord {
    private final android.health.connect.datatypes.IntervalRecord real;

    public IntervalRecord(android.health.connect.datatypes.IntervalRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.IntervalRecord wrap(android.health.connect.datatypes.IntervalRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.IntervalRecord(real);
    }

    public android.health.connect.datatypes.IntervalRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.time.Instant getEndTime() {
        return real.getEndTime();
    }

    public java.time.ZoneOffset getEndZoneOffset() {
        return real.getEndZoneOffset();
    }

    public java.time.Instant getStartTime() {
        return real.getStartTime();
    }

    public java.time.ZoneOffset getStartZoneOffset() {
        return real.getStartZoneOffset();
    }

    public int hashCode() {
        return real.hashCode();
    }

}
