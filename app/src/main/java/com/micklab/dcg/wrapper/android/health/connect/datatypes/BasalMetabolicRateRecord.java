// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BasalMetabolicRateRecord {
    private final android.health.connect.datatypes.BasalMetabolicRateRecord real;

    public BasalMetabolicRateRecord(android.health.connect.datatypes.BasalMetabolicRateRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord wrap(android.health.connect.datatypes.BasalMetabolicRateRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord(real);
    }

    public android.health.connect.datatypes.BasalMetabolicRateRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power getBasalMetabolicRate() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power.wrap(real.getBasalMetabolicRate());
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.BasalMetabolicRateRecord.Builder real;

        public Builder(android.health.connect.datatypes.BasalMetabolicRateRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.Builder wrap(android.health.connect.datatypes.BasalMetabolicRateRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.Builder(real);
        }

        public android.health.connect.datatypes.BasalMetabolicRateRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power arg2) {
            this(new android.health.connect.datatypes.BasalMetabolicRateRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalMetabolicRateRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
