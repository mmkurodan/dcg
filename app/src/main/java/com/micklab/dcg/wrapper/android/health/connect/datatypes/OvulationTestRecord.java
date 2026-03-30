// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class OvulationTestRecord {
    private final android.health.connect.datatypes.OvulationTestRecord real;

    public OvulationTestRecord(android.health.connect.datatypes.OvulationTestRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord wrap(android.health.connect.datatypes.OvulationTestRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord(real);
    }

    public android.health.connect.datatypes.OvulationTestRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getResult() {
        return real.getResult();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.OvulationTestRecord.Builder real;

        public Builder(android.health.connect.datatypes.OvulationTestRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.Builder wrap(android.health.connect.datatypes.OvulationTestRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.Builder(real);
        }

        public android.health.connect.datatypes.OvulationTestRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2) {
            this(new android.health.connect.datatypes.OvulationTestRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
    public static final class OvulationTestResult {
        private final android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult real;

        public OvulationTestResult(android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult wrap(android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult(real);
        }

        public android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult unwrap() {
            return real;
        }

        public static final int RESULT_HIGH = android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult.RESULT_HIGH;
        public static final int RESULT_INCONCLUSIVE = android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult.RESULT_INCONCLUSIVE;
        public static final int RESULT_NEGATIVE = android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult.RESULT_NEGATIVE;
        public static final int RESULT_POSITIVE = android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult.RESULT_POSITIVE;

    }
}
