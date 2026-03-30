// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BodyTemperatureRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BodyTemperatureRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyTemperatureRecord wrap(android.health.connect.datatypes.BodyTemperatureRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyTemperatureRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.BodyTemperatureRecord getReal() {
        return (android.health.connect.datatypes.BodyTemperatureRecord) real;
    }

    public android.health.connect.datatypes.BodyTemperatureRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.BodyTemperatureRecord) real).equals(arg0);
    }

    public int getMeasurementLocation() {
        return ((android.health.connect.datatypes.BodyTemperatureRecord) real).getMeasurementLocation();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature getTemperature() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature.wrap(((android.health.connect.datatypes.BodyTemperatureRecord) real).getTemperature());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.BodyTemperatureRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyTemperatureRecord.Builder wrap(android.health.connect.datatypes.BodyTemperatureRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyTemperatureRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.BodyTemperatureRecord.Builder getReal() {
            return (android.health.connect.datatypes.BodyTemperatureRecord.Builder) real;
        }

        public android.health.connect.datatypes.BodyTemperatureRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature arg3) {
            this(new android.health.connect.datatypes.BodyTemperatureRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyTemperatureRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyTemperatureRecord.wrap(((android.health.connect.datatypes.BodyTemperatureRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyTemperatureRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyTemperatureRecord.Builder.wrap(((android.health.connect.datatypes.BodyTemperatureRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyTemperatureRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyTemperatureRecord.Builder.wrap(((android.health.connect.datatypes.BodyTemperatureRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
