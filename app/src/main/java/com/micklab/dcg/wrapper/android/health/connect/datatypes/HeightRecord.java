// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class HeightRecord {
    private final android.health.connect.datatypes.HeightRecord real;

    public HeightRecord(android.health.connect.datatypes.HeightRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord wrap(android.health.connect.datatypes.HeightRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord(real);
    }

    public android.health.connect.datatypes.HeightRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getHeight() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(real.getHeight());
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.HeightRecord.Builder real;

        public Builder(android.health.connect.datatypes.HeightRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.Builder wrap(android.health.connect.datatypes.HeightRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.Builder(real);
        }

        public android.health.connect.datatypes.HeightRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg2) {
            this(new android.health.connect.datatypes.HeightRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
}
