// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class OxygenSaturationRecord {
    private final android.health.connect.datatypes.OxygenSaturationRecord real;

    public OxygenSaturationRecord(android.health.connect.datatypes.OxygenSaturationRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord wrap(android.health.connect.datatypes.OxygenSaturationRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord(real);
    }

    public android.health.connect.datatypes.OxygenSaturationRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage getPercentage() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage.wrap(real.getPercentage());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.OxygenSaturationRecord.Builder real;

        public Builder(android.health.connect.datatypes.OxygenSaturationRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.Builder wrap(android.health.connect.datatypes.OxygenSaturationRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.Builder(real);
        }

        public android.health.connect.datatypes.OxygenSaturationRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage arg2) {
            this(new android.health.connect.datatypes.OxygenSaturationRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.OxygenSaturationRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
