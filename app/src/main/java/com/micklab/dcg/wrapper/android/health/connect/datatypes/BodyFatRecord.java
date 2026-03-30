// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BodyFatRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BodyFatRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord wrap(android.health.connect.datatypes.BodyFatRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.BodyFatRecord getReal() {
        return (android.health.connect.datatypes.BodyFatRecord) real;
    }

    public android.health.connect.datatypes.BodyFatRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.BodyFatRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage getPercentage() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage.wrap(((android.health.connect.datatypes.BodyFatRecord) real).getPercentage());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.BodyFatRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.Builder wrap(android.health.connect.datatypes.BodyFatRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.BodyFatRecord.Builder getReal() {
            return (android.health.connect.datatypes.BodyFatRecord.Builder) real;
        }

        public android.health.connect.datatypes.BodyFatRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage arg2) {
            this(new android.health.connect.datatypes.BodyFatRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.wrap(((android.health.connect.datatypes.BodyFatRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.Builder.wrap(((android.health.connect.datatypes.BodyFatRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.Builder.wrap(((android.health.connect.datatypes.BodyFatRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
