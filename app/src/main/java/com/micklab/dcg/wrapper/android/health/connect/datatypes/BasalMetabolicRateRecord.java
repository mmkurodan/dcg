// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BasalMetabolicRateRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BasalMetabolicRateRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord wrap(android.health.connect.datatypes.BasalMetabolicRateRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.BasalMetabolicRateRecord getReal() {
        return (android.health.connect.datatypes.BasalMetabolicRateRecord) real;
    }

    public android.health.connect.datatypes.BasalMetabolicRateRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.BasalMetabolicRateRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power getBasalMetabolicRate() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power.wrap(((android.health.connect.datatypes.BasalMetabolicRateRecord) real).getBasalMetabolicRate());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.BasalMetabolicRateRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.Builder wrap(android.health.connect.datatypes.BasalMetabolicRateRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.BasalMetabolicRateRecord.Builder getReal() {
            return (android.health.connect.datatypes.BasalMetabolicRateRecord.Builder) real;
        }

        public android.health.connect.datatypes.BasalMetabolicRateRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power arg2) {
            this(new android.health.connect.datatypes.BasalMetabolicRateRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.wrap(((android.health.connect.datatypes.BasalMetabolicRateRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.Builder.wrap(((android.health.connect.datatypes.BasalMetabolicRateRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.Builder.wrap(((android.health.connect.datatypes.BasalMetabolicRateRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
