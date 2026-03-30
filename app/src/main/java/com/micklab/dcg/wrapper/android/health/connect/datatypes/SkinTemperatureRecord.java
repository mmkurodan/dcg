// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class SkinTemperatureRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SkinTemperatureRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord wrap(android.health.connect.datatypes.SkinTemperatureRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.SkinTemperatureRecord getReal() {
        return (android.health.connect.datatypes.SkinTemperatureRecord) real;
    }

    public android.health.connect.datatypes.SkinTemperatureRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.SkinTemperatureRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature getBaseline() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature.wrap(((android.health.connect.datatypes.SkinTemperatureRecord) real).getBaseline());
    }

    public int getMeasurementLocation() {
        return ((android.health.connect.datatypes.SkinTemperatureRecord) real).getMeasurementLocation();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.SkinTemperatureRecord) real).hashCode();
    }

    public static final int MEASUREMENT_LOCATION_FINGER = android.health.connect.datatypes.SkinTemperatureRecord.MEASUREMENT_LOCATION_FINGER;
    public static final int MEASUREMENT_LOCATION_TOE = android.health.connect.datatypes.SkinTemperatureRecord.MEASUREMENT_LOCATION_TOE;
    public static final int MEASUREMENT_LOCATION_UNKNOWN = android.health.connect.datatypes.SkinTemperatureRecord.MEASUREMENT_LOCATION_UNKNOWN;
    public static final int MEASUREMENT_LOCATION_WRIST = android.health.connect.datatypes.SkinTemperatureRecord.MEASUREMENT_LOCATION_WRIST;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder wrap(android.health.connect.datatypes.SkinTemperatureRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.SkinTemperatureRecord.Builder getReal() {
            return (android.health.connect.datatypes.SkinTemperatureRecord.Builder) real;
        }

        public android.health.connect.datatypes.SkinTemperatureRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2) {
            this(new android.health.connect.datatypes.SkinTemperatureRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.wrap(((android.health.connect.datatypes.SkinTemperatureRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder.wrap(((android.health.connect.datatypes.SkinTemperatureRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder.wrap(((android.health.connect.datatypes.SkinTemperatureRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder setBaseline(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder.wrap(((android.health.connect.datatypes.SkinTemperatureRecord.Builder) real).setBaseline(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder.wrap(((android.health.connect.datatypes.SkinTemperatureRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder setMeasurementLocation(int arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder.wrap(((android.health.connect.datatypes.SkinTemperatureRecord.Builder) real).setMeasurementLocation(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Builder.wrap(((android.health.connect.datatypes.SkinTemperatureRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
    public static final class Delta {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Delta(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Delta wrap(android.health.connect.datatypes.SkinTemperatureRecord.Delta real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SkinTemperatureRecord.Delta(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.SkinTemperatureRecord.Delta getReal() {
            return (android.health.connect.datatypes.SkinTemperatureRecord.Delta) real;
        }

        public android.health.connect.datatypes.SkinTemperatureRecord.Delta unwrap() {
            return getReal();
        }

        public Delta(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.SkinTemperatureRecord.Delta(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.health.connect.datatypes.SkinTemperatureRecord.Delta) real).equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta getDelta() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.TemperatureDelta.wrap(((android.health.connect.datatypes.SkinTemperatureRecord.Delta) real).getDelta());
        }

        public java.time.Instant getTime() {
            return ((android.health.connect.datatypes.SkinTemperatureRecord.Delta) real).getTime();
        }

        public int hashCode() {
            return ((android.health.connect.datatypes.SkinTemperatureRecord.Delta) real).hashCode();
        }

    }
}
