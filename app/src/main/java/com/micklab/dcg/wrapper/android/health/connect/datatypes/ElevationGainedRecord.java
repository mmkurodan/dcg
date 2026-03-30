// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ElevationGainedRecord {
    private final android.health.connect.datatypes.ElevationGainedRecord real;

    public ElevationGainedRecord(android.health.connect.datatypes.ElevationGainedRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord wrap(android.health.connect.datatypes.ElevationGainedRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord(real);
    }

    public android.health.connect.datatypes.ElevationGainedRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getElevation() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(real.getElevation());
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.ElevationGainedRecord.Builder real;

        public Builder(android.health.connect.datatypes.ElevationGainedRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder wrap(android.health.connect.datatypes.ElevationGainedRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder(real);
        }

        public android.health.connect.datatypes.ElevationGainedRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg3) {
            this(new android.health.connect.datatypes.ElevationGainedRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
}
