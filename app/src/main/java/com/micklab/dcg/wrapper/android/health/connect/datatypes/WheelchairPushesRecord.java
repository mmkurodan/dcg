// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class WheelchairPushesRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WheelchairPushesRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord wrap(android.health.connect.datatypes.WheelchairPushesRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.WheelchairPushesRecord getReal() {
        return (android.health.connect.datatypes.WheelchairPushesRecord) real;
    }

    public android.health.connect.datatypes.WheelchairPushesRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.WheelchairPushesRecord) real).equals(arg0);
    }

    public long getCount() {
        return ((android.health.connect.datatypes.WheelchairPushesRecord) real).getCount();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.WheelchairPushesRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder wrap(android.health.connect.datatypes.WheelchairPushesRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.WheelchairPushesRecord.Builder getReal() {
            return (android.health.connect.datatypes.WheelchairPushesRecord.Builder) real;
        }

        public android.health.connect.datatypes.WheelchairPushesRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, long arg3) {
            this(new android.health.connect.datatypes.WheelchairPushesRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.wrap(((android.health.connect.datatypes.WheelchairPushesRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder.wrap(((android.health.connect.datatypes.WheelchairPushesRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder.wrap(((android.health.connect.datatypes.WheelchairPushesRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder.wrap(((android.health.connect.datatypes.WheelchairPushesRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WheelchairPushesRecord.Builder.wrap(((android.health.connect.datatypes.WheelchairPushesRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
}
