// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class HydrationRecord {
    private final android.health.connect.datatypes.HydrationRecord real;

    public HydrationRecord(android.health.connect.datatypes.HydrationRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord wrap(android.health.connect.datatypes.HydrationRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord(real);
    }

    public android.health.connect.datatypes.HydrationRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume getVolume() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume.wrap(real.getVolume());
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.HydrationRecord.Builder real;

        public Builder(android.health.connect.datatypes.HydrationRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder wrap(android.health.connect.datatypes.HydrationRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder(real);
        }

        public android.health.connect.datatypes.HydrationRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume arg3) {
            this(new android.health.connect.datatypes.HydrationRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
}
