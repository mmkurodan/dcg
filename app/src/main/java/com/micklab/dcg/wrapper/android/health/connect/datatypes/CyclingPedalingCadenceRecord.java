// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class CyclingPedalingCadenceRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CyclingPedalingCadenceRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord wrap(android.health.connect.datatypes.CyclingPedalingCadenceRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.CyclingPedalingCadenceRecord getReal() {
        return (android.health.connect.datatypes.CyclingPedalingCadenceRecord) real;
    }

    public android.health.connect.datatypes.CyclingPedalingCadenceRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.CyclingPedalingCadenceRecord) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.CyclingPedalingCadenceRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder wrap(android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder getReal() {
            return (android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder) real;
        }

        public android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, java.util.List arg3) {
            this(new android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.wrap(((android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder.wrap(((android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder.wrap(((android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder.wrap(((android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder.wrap(((android.health.connect.datatypes.CyclingPedalingCadenceRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
    public static final class CyclingPedalingCadenceRecordSample {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CyclingPedalingCadenceRecordSample(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample wrap(android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample getReal() {
            return (android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample) real;
        }

        public android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample unwrap() {
            return getReal();
        }

        public CyclingPedalingCadenceRecordSample(double arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample) real).equals(arg0);
        }

        public double getRevolutionsPerMinute() {
            return ((android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample) real).getRevolutionsPerMinute();
        }

        public java.time.Instant getTime() {
            return ((android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample) real).getTime();
        }

        public int hashCode() {
            return ((android.health.connect.datatypes.CyclingPedalingCadenceRecord.CyclingPedalingCadenceRecordSample) real).hashCode();
        }

    }
}
