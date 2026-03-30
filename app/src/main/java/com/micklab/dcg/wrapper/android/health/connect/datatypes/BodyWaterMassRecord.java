// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BodyWaterMassRecord {
    private final android.health.connect.datatypes.BodyWaterMassRecord real;

    public BodyWaterMassRecord(android.health.connect.datatypes.BodyWaterMassRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord wrap(android.health.connect.datatypes.BodyWaterMassRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord(real);
    }

    public android.health.connect.datatypes.BodyWaterMassRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass getBodyWaterMass() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass.wrap(real.getBodyWaterMass());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.BodyWaterMassRecord.Builder real;

        public Builder(android.health.connect.datatypes.BodyWaterMassRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.Builder wrap(android.health.connect.datatypes.BodyWaterMassRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.Builder(real);
        }

        public android.health.connect.datatypes.BodyWaterMassRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass arg2) {
            this(new android.health.connect.datatypes.BodyWaterMassRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BodyWaterMassRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
