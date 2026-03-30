// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class StepsRecord {
    private final android.health.connect.datatypes.StepsRecord real;

    public StepsRecord(android.health.connect.datatypes.StepsRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord wrap(android.health.connect.datatypes.StepsRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord(real);
    }

    public android.health.connect.datatypes.StepsRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getCount() {
        return real.getCount();
    }

    public int hashCode() {
        return real.hashCode();
    }


    public static final class Builder {
        private final android.health.connect.datatypes.StepsRecord.Builder real;

        public Builder(android.health.connect.datatypes.StepsRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder wrap(android.health.connect.datatypes.StepsRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder(real);
        }

        public android.health.connect.datatypes.StepsRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, long arg3) {
            this(new android.health.connect.datatypes.StepsRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
}
