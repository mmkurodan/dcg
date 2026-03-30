// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class DistanceRecord {
    private final android.health.connect.datatypes.DistanceRecord real;

    public DistanceRecord(android.health.connect.datatypes.DistanceRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord wrap(android.health.connect.datatypes.DistanceRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord(real);
    }

    public android.health.connect.datatypes.DistanceRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getDistance() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(real.getDistance());
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.DistanceRecord.Builder real;

        public Builder(android.health.connect.datatypes.DistanceRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder wrap(android.health.connect.datatypes.DistanceRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder(real);
        }

        public android.health.connect.datatypes.DistanceRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg3) {
            this(new android.health.connect.datatypes.DistanceRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
}
