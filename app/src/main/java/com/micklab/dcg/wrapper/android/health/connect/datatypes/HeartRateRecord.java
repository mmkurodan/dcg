// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class HeartRateRecord {
    private final android.health.connect.datatypes.HeartRateRecord real;

    public HeartRateRecord(android.health.connect.datatypes.HeartRateRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord wrap(android.health.connect.datatypes.HeartRateRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord(real);
    }

    public android.health.connect.datatypes.HeartRateRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.HeartRateRecord.Builder real;

        public Builder(android.health.connect.datatypes.HeartRateRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder wrap(android.health.connect.datatypes.HeartRateRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder(real);
        }

        public android.health.connect.datatypes.HeartRateRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, java.util.List arg3) {
            this(new android.health.connect.datatypes.HeartRateRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
    public static final class HeartRateSample {
        private final android.health.connect.datatypes.HeartRateRecord.HeartRateSample real;

        public HeartRateSample(android.health.connect.datatypes.HeartRateRecord.HeartRateSample real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.HeartRateSample wrap(android.health.connect.datatypes.HeartRateRecord.HeartRateSample real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeartRateRecord.HeartRateSample(real);
        }

        public android.health.connect.datatypes.HeartRateRecord.HeartRateSample unwrap() {
            return real;
        }

        public HeartRateSample(long arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.HeartRateRecord.HeartRateSample(arg0, arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public long getBeatsPerMinute() {
            return real.getBeatsPerMinute();
        }

        public java.time.Instant getTime() {
            return real.getTime();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
}
