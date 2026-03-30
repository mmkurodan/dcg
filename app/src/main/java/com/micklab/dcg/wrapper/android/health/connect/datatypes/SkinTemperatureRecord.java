// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class SkinTemperatureRecord {
    private final android.health.connect.datatypes.SkinTemperatureRecord real;

    public SkinTemperatureRecord(android.health.connect.datatypes.SkinTemperatureRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord wrap(android.health.connect.datatypes.SkinTemperatureRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord(real);
    }

    public android.health.connect.datatypes.SkinTemperatureRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature getBaseline() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature.wrap(real.getBaseline());
    }

    public int getMeasurementLocation() {
        return real.getMeasurementLocation();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final int MEASUREMENT_LOCATION_FINGER = android.health.connect.datatypes.SkinTemperatureRecord.MEASUREMENT_LOCATION_FINGER;
    public static final int MEASUREMENT_LOCATION_TOE = android.health.connect.datatypes.SkinTemperatureRecord.MEASUREMENT_LOCATION_TOE;
    public static final int MEASUREMENT_LOCATION_UNKNOWN = android.health.connect.datatypes.SkinTemperatureRecord.MEASUREMENT_LOCATION_UNKNOWN;
    public static final int MEASUREMENT_LOCATION_WRIST = android.health.connect.datatypes.SkinTemperatureRecord.MEASUREMENT_LOCATION_WRIST;

    public static final class Builder {
        private final android.health.connect.datatypes.SkinTemperatureRecord.Builder real;

        public Builder(android.health.connect.datatypes.SkinTemperatureRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder wrap(android.health.connect.datatypes.SkinTemperatureRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder(real);
        }

        public android.health.connect.datatypes.SkinTemperatureRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2) {
            this(new android.health.connect.datatypes.SkinTemperatureRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder setBaseline(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder.wrap(real.setBaseline(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder setMeasurementLocation(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder.wrap(real.setMeasurementLocation(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
    public static final class Delta {
        private final android.health.connect.datatypes.SkinTemperatureRecord.Delta real;

        public Delta(android.health.connect.datatypes.SkinTemperatureRecord.Delta real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Delta wrap(android.health.connect.datatypes.SkinTemperatureRecord.Delta real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Delta(real);
        }

        public android.health.connect.datatypes.SkinTemperatureRecord.Delta unwrap() {
            return real;
        }

        public Delta(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.SkinTemperatureRecord.Delta(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta getDelta() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta.wrap(real.getDelta());
        }

        public java.time.Instant getTime() {
            return real.getTime();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
}
