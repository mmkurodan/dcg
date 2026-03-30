// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class IntermenstrualBleedingRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IntermenstrualBleedingRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord wrap(android.health.connect.datatypes.IntermenstrualBleedingRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.IntermenstrualBleedingRecord getReal() {
        return (android.health.connect.datatypes.IntermenstrualBleedingRecord) real;
    }

    public android.health.connect.datatypes.IntermenstrualBleedingRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.IntermenstrualBleedingRecord) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.IntermenstrualBleedingRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder wrap(android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder getReal() {
            return (android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder) real;
        }

        public android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.wrap(((android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder.wrap(((android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder.wrap(((android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
