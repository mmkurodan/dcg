// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class MenstruationPeriodRecord {
    private final android.health.connect.datatypes.MenstruationPeriodRecord real;

    public MenstruationPeriodRecord(android.health.connect.datatypes.MenstruationPeriodRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord wrap(android.health.connect.datatypes.MenstruationPeriodRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord(real);
    }

    public android.health.connect.datatypes.MenstruationPeriodRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.MenstruationPeriodRecord.Builder real;

        public Builder(android.health.connect.datatypes.MenstruationPeriodRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder wrap(android.health.connect.datatypes.MenstruationPeriodRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder(real);
        }

        public android.health.connect.datatypes.MenstruationPeriodRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2) {
            this(new android.health.connect.datatypes.MenstruationPeriodRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
}
