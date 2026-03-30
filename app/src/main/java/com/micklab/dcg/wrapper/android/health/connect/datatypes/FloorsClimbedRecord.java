// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class FloorsClimbedRecord {
    private final android.health.connect.datatypes.FloorsClimbedRecord real;

    public FloorsClimbedRecord(android.health.connect.datatypes.FloorsClimbedRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord wrap(android.health.connect.datatypes.FloorsClimbedRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord(real);
    }

    public android.health.connect.datatypes.FloorsClimbedRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public double getFloors() {
        return real.getFloors();
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.FloorsClimbedRecord.Builder real;

        public Builder(android.health.connect.datatypes.FloorsClimbedRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder wrap(android.health.connect.datatypes.FloorsClimbedRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder(real);
        }

        public android.health.connect.datatypes.FloorsClimbedRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, double arg3) {
            this(new android.health.connect.datatypes.FloorsClimbedRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
}
