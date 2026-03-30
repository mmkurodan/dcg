// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BasalBodyTemperatureRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BasalBodyTemperatureRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord wrap(android.health.connect.datatypes.BasalBodyTemperatureRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.BasalBodyTemperatureRecord getReal() {
        return (android.health.connect.datatypes.BasalBodyTemperatureRecord) real;
    }

    public android.health.connect.datatypes.BasalBodyTemperatureRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.BasalBodyTemperatureRecord) real).equals(arg0);
    }

    public int getMeasurementLocation() {
        return ((android.health.connect.datatypes.BasalBodyTemperatureRecord) real).getMeasurementLocation();
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature getTemperature() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature.wrap(((android.health.connect.datatypes.BasalBodyTemperatureRecord) real).getTemperature());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.BasalBodyTemperatureRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder wrap(android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder getReal() {
            return (android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder) real;
        }

        public android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Temperature arg3) {
            this(new android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.wrap(((android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder.wrap(((android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder.wrap(((android.health.connect.datatypes.BasalBodyTemperatureRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
