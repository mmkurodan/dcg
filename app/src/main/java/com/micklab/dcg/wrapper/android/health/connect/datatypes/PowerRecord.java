// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class PowerRecord {
    private final android.health.connect.datatypes.PowerRecord real;

    public PowerRecord(android.health.connect.datatypes.PowerRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord wrap(android.health.connect.datatypes.PowerRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord(real);
    }

    public android.health.connect.datatypes.PowerRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.PowerRecord.Builder real;

        public Builder(android.health.connect.datatypes.PowerRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder wrap(android.health.connect.datatypes.PowerRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder(real);
        }

        public android.health.connect.datatypes.PowerRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, java.util.List arg3) {
            this(new android.health.connect.datatypes.PowerRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
    public static final class PowerRecordSample {
        private final android.health.connect.datatypes.PowerRecord.PowerRecordSample real;

        public PowerRecordSample(android.health.connect.datatypes.PowerRecord.PowerRecordSample real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.PowerRecordSample wrap(android.health.connect.datatypes.PowerRecord.PowerRecordSample real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.PowerRecordSample(real);
        }

        public android.health.connect.datatypes.PowerRecord.PowerRecordSample unwrap() {
            return real;
        }

        public PowerRecordSample(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.PowerRecord.PowerRecordSample(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power getPower() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power.wrap(real.getPower());
        }

        public java.time.Instant getTime() {
            return real.getTime();
        }

        public int hashCode() {
            return real.hashCode();
        }

    }
}
