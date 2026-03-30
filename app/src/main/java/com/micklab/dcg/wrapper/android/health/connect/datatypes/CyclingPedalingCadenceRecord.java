// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class CyclingPedalingCadenceRecord {
    private final android.health.connect.datatypes.CyclingPedalingCadenceRecord real;

    public CyclingPedalingCadenceRecord(android.health.connect.datatypes.CyclingPedalingCadenceRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord wrap(android.health.connect.datatypes.CyclingPedalingCadenceRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord(real);
    }

    public android.health.connect.datatypes.CyclingPedalingCadenceRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder real;

        public Builder(android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder wrap(android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder(real);
        }

        public android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, java.util.List arg3) {
            this(new android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
    public static final class CyclingPedalingCadenceRecordSample {
        private final android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample real;

        public CyclingPedalingCadenceRecordSample(android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample wrap(android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample(real);
        }

        public android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample unwrap() {
            return real;
        }

        public CyclingPedalingCadenceRecordSample(double arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample(arg0, arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public double getRevolutionsPerMinute() {
            return real.getRevolutionsPerMinute();
        }

        public java.time.Instant getTime() {
            return real.getTime();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
}
