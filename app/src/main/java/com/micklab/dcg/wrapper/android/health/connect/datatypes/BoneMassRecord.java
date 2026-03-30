// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class BoneMassRecord {
    private final android.health.connect.datatypes.BoneMassRecord real;

    public BoneMassRecord(android.health.connect.datatypes.BoneMassRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord wrap(android.health.connect.datatypes.BoneMassRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord(real);
    }

    public android.health.connect.datatypes.BoneMassRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass getMass() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass.wrap(real.getMass());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.BoneMassRecord.Builder real;

        public Builder(android.health.connect.datatypes.BoneMassRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.Builder wrap(android.health.connect.datatypes.BoneMassRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.Builder(real);
        }

        public android.health.connect.datatypes.BoneMassRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass arg2) {
            this(new android.health.connect.datatypes.BoneMassRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.BoneMassRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
