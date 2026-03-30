// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BodyFatRecord {
    private final android.health.connect.datatypes.BodyFatRecord real;

    public BodyFatRecord(android.health.connect.datatypes.BodyFatRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord wrap(android.health.connect.datatypes.BodyFatRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord(real);
    }

    public android.health.connect.datatypes.BodyFatRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage getPercentage() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage.wrap(real.getPercentage());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.BodyFatRecord.Builder real;

        public Builder(android.health.connect.datatypes.BodyFatRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.Builder wrap(android.health.connect.datatypes.BodyFatRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.Builder(real);
        }

        public android.health.connect.datatypes.BodyFatRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Percentage arg2) {
            this(new android.health.connect.datatypes.BodyFatRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyFatRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
