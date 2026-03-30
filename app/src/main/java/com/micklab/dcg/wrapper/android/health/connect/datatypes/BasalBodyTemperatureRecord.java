// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BasalBodyTemperatureRecord {
    private final android.health.connect.datatypes.BasalBodyTemperatureRecord real;

    public BasalBodyTemperatureRecord(android.health.connect.datatypes.BasalBodyTemperatureRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord wrap(android.health.connect.datatypes.BasalBodyTemperatureRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord(real);
    }

    public android.health.connect.datatypes.BasalBodyTemperatureRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getMeasurementLocation() {
        return real.getMeasurementLocation();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature getTemperature() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature.wrap(real.getTemperature());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder real;

        public Builder(android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder wrap(android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder(real);
        }

        public android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature arg3) {
            this(new android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
