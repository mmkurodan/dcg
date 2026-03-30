// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class SpeedRecord {
    private final android.health.connect.datatypes.SpeedRecord real;

    public SpeedRecord(android.health.connect.datatypes.SpeedRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord wrap(android.health.connect.datatypes.SpeedRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord(real);
    }

    public android.health.connect.datatypes.SpeedRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.SpeedRecord.Builder real;

        public Builder(android.health.connect.datatypes.SpeedRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder wrap(android.health.connect.datatypes.SpeedRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder(real);
        }

        public android.health.connect.datatypes.SpeedRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, java.util.List arg3) {
            this(new android.health.connect.datatypes.SpeedRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
    public static final class SpeedRecordSample {
        private final android.health.connect.datatypes.SpeedRecord.SpeedRecordSample real;

        public SpeedRecordSample(android.health.connect.datatypes.SpeedRecord.SpeedRecordSample real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.SpeedRecordSample wrap(android.health.connect.datatypes.SpeedRecord.SpeedRecordSample real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.SpeedRecordSample(real);
        }

        public android.health.connect.datatypes.SpeedRecord.SpeedRecordSample unwrap() {
            return real;
        }

        public SpeedRecordSample(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.SpeedRecord.SpeedRecordSample(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity getSpeed() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity.wrap(real.getSpeed());
        }

        public java.time.Instant getTime() {
            return real.getTime();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
}
