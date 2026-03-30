// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class RespiratoryRateRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RespiratoryRateRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord wrap(android.health.connect.datatypes.RespiratoryRateRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.RespiratoryRateRecord getReal() {
        return (android.health.connect.datatypes.RespiratoryRateRecord) real;
    }

    public android.health.connect.datatypes.RespiratoryRateRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.RespiratoryRateRecord) real).equals(arg0);
    }

    public double getRate() {
        return ((android.health.connect.datatypes.RespiratoryRateRecord) real).getRate();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.RespiratoryRateRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.Builder wrap(android.health.connect.datatypes.RespiratoryRateRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.RespiratoryRateRecord.Builder getReal() {
            return (android.health.connect.datatypes.RespiratoryRateRecord.Builder) real;
        }

        public android.health.connect.datatypes.RespiratoryRateRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, double arg2) {
            this(new android.health.connect.datatypes.RespiratoryRateRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.wrap(((android.health.connect.datatypes.RespiratoryRateRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.Builder.wrap(((android.health.connect.datatypes.RespiratoryRateRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.Builder.wrap(((android.health.connect.datatypes.RespiratoryRateRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
