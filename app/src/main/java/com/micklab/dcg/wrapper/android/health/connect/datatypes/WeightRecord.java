// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class WeightRecord {
    private final android.health.connect.datatypes.WeightRecord real;

    public WeightRecord(android.health.connect.datatypes.WeightRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord wrap(android.health.connect.datatypes.WeightRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord(real);
    }

    public android.health.connect.datatypes.WeightRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass getWeight() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass.wrap(real.getWeight());
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.WeightRecord.Builder real;

        public Builder(android.health.connect.datatypes.WeightRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.Builder wrap(android.health.connect.datatypes.WeightRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.Builder(real);
        }

        public android.health.connect.datatypes.WeightRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass arg2) {
            this(new android.health.connect.datatypes.WeightRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
