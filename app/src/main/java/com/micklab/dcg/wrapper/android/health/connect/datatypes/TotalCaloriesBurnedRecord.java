// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class TotalCaloriesBurnedRecord {
    private final android.health.connect.datatypes.TotalCaloriesBurnedRecord real;

    public TotalCaloriesBurnedRecord(android.health.connect.datatypes.TotalCaloriesBurnedRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord wrap(android.health.connect.datatypes.TotalCaloriesBurnedRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord(real);
    }

    public android.health.connect.datatypes.TotalCaloriesBurnedRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy getEnergy() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy.wrap(real.getEnergy());
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder real;

        public Builder(android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder wrap(android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder(real);
        }

        public android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy arg3) {
            this(new android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.TotalCaloriesBurnedRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
}
