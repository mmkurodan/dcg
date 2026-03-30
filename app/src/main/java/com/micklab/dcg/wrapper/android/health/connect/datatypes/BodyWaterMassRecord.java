// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BodyWaterMassRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BodyWaterMassRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord wrap(android.health.connect.datatypes.BodyWaterMassRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.BodyWaterMassRecord getReal() {
        return (android.health.connect.datatypes.BodyWaterMassRecord) real;
    }

    public android.health.connect.datatypes.BodyWaterMassRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.BodyWaterMassRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass getBodyWaterMass() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass.wrap(((android.health.connect.datatypes.BodyWaterMassRecord) real).getBodyWaterMass());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.BodyWaterMassRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.Builder wrap(android.health.connect.datatypes.BodyWaterMassRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.BodyWaterMassRecord.Builder getReal() {
            return (android.health.connect.datatypes.BodyWaterMassRecord.Builder) real;
        }

        public android.health.connect.datatypes.BodyWaterMassRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass arg2) {
            this(new android.health.connect.datatypes.BodyWaterMassRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.wrap(((android.health.connect.datatypes.BodyWaterMassRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.Builder.wrap(((android.health.connect.datatypes.BodyWaterMassRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.Builder.wrap(((android.health.connect.datatypes.BodyWaterMassRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
