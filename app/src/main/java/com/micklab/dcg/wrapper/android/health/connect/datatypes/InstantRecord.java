// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class InstantRecord {
    private final android.health.connect.datatypes.InstantRecord real;

    public InstantRecord(android.health.connect.datatypes.InstantRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.InstantRecord wrap(android.health.connect.datatypes.InstantRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.InstantRecord(real);
    }

    public android.health.connect.datatypes.InstantRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.time.Instant getTime() {
        return real.getTime();
    }

    public java.time.ZoneOffset getZoneOffset() {
        return real.getZoneOffset();
    }

    public int hashCode() {
        return real.hashCode();
    }

}
