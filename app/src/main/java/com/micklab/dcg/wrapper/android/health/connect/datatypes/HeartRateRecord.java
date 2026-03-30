// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class HeartRateRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HeartRateRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord wrap(android.health.connect.datatypes.HeartRateRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.HeartRateRecord getReal() {
        return (android.health.connect.datatypes.HeartRateRecord) real;
    }

    public android.health.connect.datatypes.HeartRateRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.HeartRateRecord) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.HeartRateRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder wrap(android.health.connect.datatypes.HeartRateRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.HeartRateRecord.Builder getReal() {
            return (android.health.connect.datatypes.HeartRateRecord.Builder) real;
        }

        public android.health.connect.datatypes.HeartRateRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, java.util.List arg3) {
            this(new android.health.connect.datatypes.HeartRateRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.wrap(((android.health.connect.datatypes.HeartRateRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder.wrap(((android.health.connect.datatypes.HeartRateRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder.wrap(((android.health.connect.datatypes.HeartRateRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder.wrap(((android.health.connect.datatypes.HeartRateRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder.wrap(((android.health.connect.datatypes.HeartRateRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
    public static final class HeartRateSample {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private HeartRateSample(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.HeartRateSample wrap(android.health.connect.datatypes.HeartRateRecord.HeartRateSample real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.HeartRateSample(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.HeartRateRecord.HeartRateSample getReal() {
            return (android.health.connect.datatypes.HeartRateRecord.HeartRateSample) real;
        }

        public android.health.connect.datatypes.HeartRateRecord.HeartRateSample unwrap() {
            return getReal();
        }

        public HeartRateSample(long arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.HeartRateRecord.HeartRateSample(arg0, arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.health.connect.datatypes.HeartRateRecord.HeartRateSample) real).equals(arg0);
        }

        public long getBeatsPerMinute() {
            return ((android.health.connect.datatypes.HeartRateRecord.HeartRateSample) real).getBeatsPerMinute();
        }

        public java.time.Instant getTime() {
            return ((android.health.connect.datatypes.HeartRateRecord.HeartRateSample) real).getTime();
        }

        public int hashCode() {
            return ((android.health.connect.datatypes.HeartRateRecord.HeartRateSample) real).hashCode();
        }

    }
}
