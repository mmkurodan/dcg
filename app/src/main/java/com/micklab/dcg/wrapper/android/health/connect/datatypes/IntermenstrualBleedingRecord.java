// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class IntermenstrualBleedingRecord {
    private final android.health.connect.datatypes.IntermenstrualBleedingRecord real;

    public IntermenstrualBleedingRecord(android.health.connect.datatypes.IntermenstrualBleedingRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord wrap(android.health.connect.datatypes.IntermenstrualBleedingRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord(real);
    }

    public android.health.connect.datatypes.IntermenstrualBleedingRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder real;

        public Builder(android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder wrap(android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder(real);
        }

        public android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.IntermenstrualBleedingRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
