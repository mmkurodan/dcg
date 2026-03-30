// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class WheelchairPushesRecord {
    private final android.health.connect.datatypes.WheelchairPushesRecord real;

    public WheelchairPushesRecord(android.health.connect.datatypes.WheelchairPushesRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord wrap(android.health.connect.datatypes.WheelchairPushesRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord(real);
    }

    public android.health.connect.datatypes.WheelchairPushesRecord unwrap() {
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
        private final android.health.connect.datatypes.WheelchairPushesRecord.Builder real;

        public Builder(android.health.connect.datatypes.WheelchairPushesRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder wrap(android.health.connect.datatypes.WheelchairPushesRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder(real);
        }

        public android.health.connect.datatypes.WheelchairPushesRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, long arg3) {
            this(new android.health.connect.datatypes.WheelchairPushesRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder.wrap(real.clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder.wrap(real.clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder.wrap(real.setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder.wrap(real.setStartZoneOffset(arg0));
        }

    }
}
