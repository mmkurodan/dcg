// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class Vo2MaxRecord {
    private final android.health.connect.datatypes.Vo2MaxRecord real;

    public Vo2MaxRecord(android.health.connect.datatypes.Vo2MaxRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord wrap(android.health.connect.datatypes.Vo2MaxRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord(real);
    }

    public android.health.connect.datatypes.Vo2MaxRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getMeasurementMethod() {
        return real.getMeasurementMethod();
    }

    public double getVo2MillilitersPerMinuteKilogram() {
        return real.getVo2MillilitersPerMinuteKilogram();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.Vo2MaxRecord.Builder real;

        public Builder(android.health.connect.datatypes.Vo2MaxRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Builder wrap(android.health.connect.datatypes.Vo2MaxRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Builder(real);
        }

        public android.health.connect.datatypes.Vo2MaxRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2, double arg3) {
            this(new android.health.connect.datatypes.Vo2MaxRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
    public static final class Vo2MaxMeasurementMethod {
        private final android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod real;

        public Vo2MaxMeasurementMethod(android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod wrap(android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod(real);
        }

        public android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod unwrap() {
            return real;
        }

        public static final int MEASUREMENT_METHOD_COOPER_TEST = android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod.MEASUREMENT_METHOD_COOPER_TEST;
        public static final int MEASUREMENT_METHOD_HEART_RATE_RATIO = android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod.MEASUREMENT_METHOD_HEART_RATE_RATIO;
        public static final int MEASUREMENT_METHOD_METABOLIC_CART = android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod.MEASUREMENT_METHOD_METABOLIC_CART;
        public static final int MEASUREMENT_METHOD_MULTISTAGE_FITNESS_TEST = android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod.MEASUREMENT_METHOD_MULTISTAGE_FITNESS_TEST;
        public static final int MEASUREMENT_METHOD_OTHER = android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod.MEASUREMENT_METHOD_OTHER;
        public static final int MEASUREMENT_METHOD_ROCKPORT_FITNESS_TEST = android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod.MEASUREMENT_METHOD_ROCKPORT_FITNESS_TEST;

    }
}
