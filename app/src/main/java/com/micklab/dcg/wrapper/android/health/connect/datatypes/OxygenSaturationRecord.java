// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class OxygenSaturationRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OxygenSaturationRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord wrap(android.health.connect.datatypes.OxygenSaturationRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.OxygenSaturationRecord getReal() {
        return (android.health.connect.datatypes.OxygenSaturationRecord) real;
    }

    public android.health.connect.datatypes.OxygenSaturationRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.OxygenSaturationRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage getPercentage() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage.wrap(((android.health.connect.datatypes.OxygenSaturationRecord) real).getPercentage());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.OxygenSaturationRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.Builder wrap(android.health.connect.datatypes.OxygenSaturationRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.OxygenSaturationRecord.Builder getReal() {
            return (android.health.connect.datatypes.OxygenSaturationRecord.Builder) real;
        }

        public android.health.connect.datatypes.OxygenSaturationRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage arg2) {
            this(new android.health.connect.datatypes.OxygenSaturationRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.wrap(((android.health.connect.datatypes.OxygenSaturationRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.Builder.wrap(((android.health.connect.datatypes.OxygenSaturationRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.Builder.wrap(((android.health.connect.datatypes.OxygenSaturationRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
