// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class HeartRateVariabilityRmssdRecord {
    private final android.health.connect.datatypes.HeartRateVariabilityRmssdRecord real;

    public HeartRateVariabilityRmssdRecord(android.health.connect.datatypes.HeartRateVariabilityRmssdRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord wrap(android.health.connect.datatypes.HeartRateVariabilityRmssdRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord(real);
    }

    public android.health.connect.datatypes.HeartRateVariabilityRmssdRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public double getHeartRateVariabilityMillis() {
        return real.getHeartRateVariabilityMillis();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder real;

        public Builder(android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder wrap(android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder(real);
        }

        public android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, double arg2) {
            this(new android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateVariabilityRmssdRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
