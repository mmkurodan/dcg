// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BoneMassRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BoneMassRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord wrap(android.health.connect.datatypes.BoneMassRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.BoneMassRecord getReal() {
        return (android.health.connect.datatypes.BoneMassRecord) real;
    }

    public android.health.connect.datatypes.BoneMassRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.BoneMassRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass getMass() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass.wrap(((android.health.connect.datatypes.BoneMassRecord) real).getMass());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.BoneMassRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.Builder wrap(android.health.connect.datatypes.BoneMassRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.BoneMassRecord.Builder getReal() {
            return (android.health.connect.datatypes.BoneMassRecord.Builder) real;
        }

        public android.health.connect.datatypes.BoneMassRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass arg2) {
            this(new android.health.connect.datatypes.BoneMassRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.wrap(((android.health.connect.datatypes.BoneMassRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.Builder.wrap(((android.health.connect.datatypes.BoneMassRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.Builder.wrap(((android.health.connect.datatypes.BoneMassRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
