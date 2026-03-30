// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class StepsCadenceRecord {
    private final android.health.connect.datatypes.StepsCadenceRecord real;

    public StepsCadenceRecord(android.health.connect.datatypes.StepsCadenceRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord wrap(android.health.connect.datatypes.StepsCadenceRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord(real);
    }

    public android.health.connect.datatypes.StepsCadenceRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.StepsCadenceRecord.Builder real;

        public Builder(android.health.connect.datatypes.StepsCadenceRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder wrap(android.health.connect.datatypes.StepsCadenceRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder(real);
        }

        public android.health.connect.datatypes.StepsCadenceRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, java.util.List arg3) {
            this(new android.health.connect.datatypes.StepsCadenceRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
    public static final class StepsCadenceRecordSample {
        private final android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample real;

        public StepsCadenceRecordSample(android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample wrap(android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample(real);
        }

        public android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample unwrap() {
            return real;
        }

        public StepsCadenceRecordSample(double arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.StepsCadenceRecord.StepsCadenceRecordSample(arg0, arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public double getRate() {
            return real.getRate();
        }

        public java.time.Instant getTime() {
            return real.getTime();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
}
