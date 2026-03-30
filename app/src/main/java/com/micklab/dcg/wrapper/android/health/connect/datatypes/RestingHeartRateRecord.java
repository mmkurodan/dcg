// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class RestingHeartRateRecord {
    private final android.health.connect.datatypes.RestingHeartRateRecord real;

    public RestingHeartRateRecord(android.health.connect.datatypes.RestingHeartRateRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord wrap(android.health.connect.datatypes.RestingHeartRateRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord(real);
    }

    public android.health.connect.datatypes.RestingHeartRateRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getBeatsPerMinute() {
        return real.getBeatsPerMinute();
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.RestingHeartRateRecord.Builder real;

        public Builder(android.health.connect.datatypes.RestingHeartRateRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.Builder wrap(android.health.connect.datatypes.RestingHeartRateRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.Builder(real);
        }

        public android.health.connect.datatypes.RestingHeartRateRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, long arg2) {
            this(new android.health.connect.datatypes.RestingHeartRateRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.RestingHeartRateRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
