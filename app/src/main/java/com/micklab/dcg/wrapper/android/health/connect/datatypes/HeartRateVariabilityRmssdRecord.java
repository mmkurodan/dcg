// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class HeartRateVariabilityRmssdRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HeartRateVariabilityRmssdRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord wrap(android.health.connect.datatypes.HeartRateVariabilityRmssdRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.HeartRateVariabilityRmssdRecord getReal() {
        return (android.health.connect.datatypes.HeartRateVariabilityRmssdRecord) real;
    }

    public android.health.connect.datatypes.HeartRateVariabilityRmssdRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.HeartRateVariabilityRmssdRecord) real).equals(arg0);
    }

    public double getHeartRateVariabilityMillis() {
        return ((android.health.connect.datatypes.HeartRateVariabilityRmssdRecord) real).getHeartRateVariabilityMillis();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.HeartRateVariabilityRmssdRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder wrap(android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder getReal() {
            return (android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder) real;
        }

        public android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, double arg2) {
            this(new android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.wrap(((android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder.wrap(((android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder.wrap(((android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
