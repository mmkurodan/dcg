// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class RespiratoryRateRecord {
    private final android.health.connect.datatypes.RespiratoryRateRecord real;

    public RespiratoryRateRecord(android.health.connect.datatypes.RespiratoryRateRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord wrap(android.health.connect.datatypes.RespiratoryRateRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord(real);
    }

    public android.health.connect.datatypes.RespiratoryRateRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public double getRate() {
        return real.getRate();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.RespiratoryRateRecord.Builder real;

        public Builder(android.health.connect.datatypes.RespiratoryRateRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.Builder wrap(android.health.connect.datatypes.RespiratoryRateRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.Builder(real);
        }

        public android.health.connect.datatypes.RespiratoryRateRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, double arg2) {
            this(new android.health.connect.datatypes.RespiratoryRateRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.RespiratoryRateRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
