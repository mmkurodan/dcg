// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class OvulationTestRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OvulationTestRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord wrap(android.health.connect.datatypes.OvulationTestRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.OvulationTestRecord getReal() {
        return (android.health.connect.datatypes.OvulationTestRecord) real;
    }

    public android.health.connect.datatypes.OvulationTestRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.OvulationTestRecord) real).equals(arg0);
    }

    public int getResult() {
        return ((android.health.connect.datatypes.OvulationTestRecord) real).getResult();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.OvulationTestRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.Builder wrap(android.health.connect.datatypes.OvulationTestRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.OvulationTestRecord.Builder getReal() {
            return (android.health.connect.datatypes.OvulationTestRecord.Builder) real;
        }

        public android.health.connect.datatypes.OvulationTestRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2) {
            this(new android.health.connect.datatypes.OvulationTestRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.wrap(((android.health.connect.datatypes.OvulationTestRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.Builder.wrap(((android.health.connect.datatypes.OvulationTestRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.Builder.wrap(((android.health.connect.datatypes.OvulationTestRecord.Builder) real).setZoneOffset(arg0));
        }

    }
    public static final class OvulationTestResult {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OvulationTestResult(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult wrap(android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult getReal() {
            return (android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult) real;
        }

        public android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult unwrap() {
            return getReal();
        }

        public static final int RESULT_HIGH = android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult.RESULT_HIGH;
        public static final int RESULT_INCONCLUSIVE = android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult.RESULT_INCONCLUSIVE;
        public static final int RESULT_NEGATIVE = android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult.RESULT_NEGATIVE;
        public static final int RESULT_POSITIVE = android.health.connect.datatypes.OvulationTestRecord.OvulationTestResult.RESULT_POSITIVE;

    }
}
