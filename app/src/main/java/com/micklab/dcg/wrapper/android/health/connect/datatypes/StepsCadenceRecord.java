// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class StepsCadenceRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StepsCadenceRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord wrap(android.health.connect.datatypes.StepsCadenceRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.StepsCadenceRecord getReal() {
        return (android.health.connect.datatypes.StepsCadenceRecord) real;
    }

    public android.health.connect.datatypes.StepsCadenceRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.StepsCadenceRecord) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.StepsCadenceRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder wrap(android.health.connect.datatypes.StepsCadenceRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.StepsCadenceRecord.Builder getReal() {
            return (android.health.connect.datatypes.StepsCadenceRecord.Builder) real;
        }

        public android.health.connect.datatypes.StepsCadenceRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, java.util.List arg3) {
            this(new android.health.connect.datatypes.StepsCadenceRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.wrap(((android.health.connect.datatypes.StepsCadenceRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder.wrap(((android.health.connect.datatypes.StepsCadenceRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder.wrap(((android.health.connect.datatypes.StepsCadenceRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder.wrap(((android.health.connect.datatypes.StepsCadenceRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder.wrap(((android.health.connect.datatypes.StepsCadenceRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
    public static final class StepsCadenceRecordSample {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private StepsCadenceRecordSample(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample wrap(android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample getReal() {
            return (android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample) real;
        }

        public android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample unwrap() {
            return getReal();
        }

        public StepsCadenceRecordSample(double arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample) real).equals(arg0);
        }

        public double getRate() {
            return ((android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample) real).getRate();
        }

        public java.time.Instant getTime() {
            return ((android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample) real).getTime();
        }

        public int hashCode() {
            return ((android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample) real).hashCode();
        }

    }
}
