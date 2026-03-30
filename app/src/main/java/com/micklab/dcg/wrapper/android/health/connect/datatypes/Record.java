// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class Record {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Record(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Record wrap(android.health.connect.datatypes.Record real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Record(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.Record getReal() {
        return (android.health.connect.datatypes.Record) real;
    }

    public android.health.connect.datatypes.Record unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.Record) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata getMetadata() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata.wrap(((android.health.connect.datatypes.Record) real).getMetadata());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.Record) real).hashCode();
    }

}
