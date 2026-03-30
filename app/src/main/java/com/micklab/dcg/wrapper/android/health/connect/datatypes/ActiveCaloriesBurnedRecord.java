// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ActiveCaloriesBurnedRecord {
    private final android.health.connect.datatypes.ActiveCaloriesBurnedRecord real;

    public ActiveCaloriesBurnedRecord(android.health.connect.datatypes.ActiveCaloriesBurnedRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord wrap(android.health.connect.datatypes.ActiveCaloriesBurnedRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord(real);
    }

    public android.health.connect.datatypes.ActiveCaloriesBurnedRecord unwrap() {
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
        private final android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder real;

        public Builder(android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder wrap(android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder(real);
        }

        public android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Energy arg3) {
            this(new android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ActiveCaloriesBurnedRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
}
