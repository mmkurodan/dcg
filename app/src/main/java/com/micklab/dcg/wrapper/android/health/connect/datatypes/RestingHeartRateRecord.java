// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class RestingHeartRateRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RestingHeartRateRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord wrap(android.health.connect.datatypes.RestingHeartRateRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.RestingHeartRateRecord getReal() {
        return (android.health.connect.datatypes.RestingHeartRateRecord) real;
    }

    public android.health.connect.datatypes.RestingHeartRateRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.RestingHeartRateRecord) real).equals(arg0);
    }

    public long getBeatsPerMinute() {
        return ((android.health.connect.datatypes.RestingHeartRateRecord) real).getBeatsPerMinute();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.RestingHeartRateRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.Builder wrap(android.health.connect.datatypes.RestingHeartRateRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.RestingHeartRateRecord.Builder getReal() {
            return (android.health.connect.datatypes.RestingHeartRateRecord.Builder) real;
        }

        public android.health.connect.datatypes.RestingHeartRateRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, long arg2) {
            this(new android.health.connect.datatypes.RestingHeartRateRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.wrap(((android.health.connect.datatypes.RestingHeartRateRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.Builder.wrap(((android.health.connect.datatypes.RestingHeartRateRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.Builder.wrap(((android.health.connect.datatypes.RestingHeartRateRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
