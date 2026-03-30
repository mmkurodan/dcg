// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class Record {
    private final android.health.connect.datatypes.Record real;

    public Record(android.health.connect.datatypes.Record real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Record wrap(android.health.connect.datatypes.Record real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Record(real);
    }

    public android.health.connect.datatypes.Record unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata getMetadata() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.wrap(real.getMetadata());
    }

    public int hashCode() {
        return real.hashCode();
    }

}
