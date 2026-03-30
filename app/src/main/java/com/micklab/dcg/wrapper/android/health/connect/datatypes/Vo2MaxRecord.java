// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class Vo2MaxRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Vo2MaxRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord wrap(android.health.connect.datatypes.Vo2MaxRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.Vo2MaxRecord getReal() {
        return (android.health.connect.datatypes.Vo2MaxRecord) real;
    }

    public android.health.connect.datatypes.Vo2MaxRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.Vo2MaxRecord) real).equals(arg0);
    }

    public int getMeasurementMethod() {
        return ((android.health.connect.datatypes.Vo2MaxRecord) real).getMeasurementMethod();
    }

    public double getVo2MillilitersPerMinuteKilogram() {
        return ((android.health.connect.datatypes.Vo2MaxRecord) real).getVo2MillilitersPerMinuteKilogram();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.Vo2MaxRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Builder wrap(android.health.connect.datatypes.Vo2MaxRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.Vo2MaxRecord.Builder getReal() {
            return (android.health.connect.datatypes.Vo2MaxRecord.Builder) real;
        }

        public android.health.connect.datatypes.Vo2MaxRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2, double arg3) {
            this(new android.health.connect.datatypes.Vo2MaxRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.wrap(((android.health.connect.datatypes.Vo2MaxRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Builder.wrap(((android.health.connect.datatypes.Vo2MaxRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Builder.wrap(((android.health.connect.datatypes.Vo2MaxRecord.Builder) real).setZoneOffset(arg0));
        }

    }
    public static final class Vo2MaxMeasurementMethod {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Vo2MaxMeasurementMethod(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod wrap(android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod getReal() {
            return (android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod) real;
        }

        public android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod unwrap() {
            return getReal();
        }

        public static final int MEASUREMENT_METHOD_COOPER_TEST = android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod.MEASUREMENT_METHOD_COOPER_TEST;
        public static final int MEASUREMENT_METHOD_HEART_RATE_RATIO = android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod.MEASUREMENT_METHOD_HEART_RATE_RATIO;
        public static final int MEASUREMENT_METHOD_METABOLIC_CART = android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod.MEASUREMENT_METHOD_METABOLIC_CART;
        public static final int MEASUREMENT_METHOD_MULTISTAGE_FITNESS_TEST = android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod.MEASUREMENT_METHOD_MULTISTAGE_FITNESS_TEST;
        public static final int MEASUREMENT_METHOD_OTHER = android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod.MEASUREMENT_METHOD_OTHER;
        public static final int MEASUREMENT_METHOD_ROCKPORT_FITNESS_TEST = android.health.connect.datatypes.Vo2MaxRecord.Vo2MaxMeasurementMethod.MEASUREMENT_METHOD_ROCKPORT_FITNESS_TEST;

    }
}
