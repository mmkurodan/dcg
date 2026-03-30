// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class SpeedRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SpeedRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord wrap(android.health.connect.datatypes.SpeedRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.SpeedRecord getReal() {
        return (android.health.connect.datatypes.SpeedRecord) real;
    }

    public android.health.connect.datatypes.SpeedRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.SpeedRecord) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.SpeedRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder wrap(android.health.connect.datatypes.SpeedRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.SpeedRecord.Builder getReal() {
            return (android.health.connect.datatypes.SpeedRecord.Builder) real;
        }

        public android.health.connect.datatypes.SpeedRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, java.util.List arg3) {
            this(new android.health.connect.datatypes.SpeedRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.wrap(((android.health.connect.datatypes.SpeedRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder.wrap(((android.health.connect.datatypes.SpeedRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder.wrap(((android.health.connect.datatypes.SpeedRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder.wrap(((android.health.connect.datatypes.SpeedRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.Builder.wrap(((android.health.connect.datatypes.SpeedRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
    public static final class SpeedRecordSample {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private SpeedRecordSample(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.SpeedRecordSample wrap(android.health.connect.datatypes.SpeedRecord.SpeedRecordSample real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.SpeedRecord.SpeedRecordSample(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.SpeedRecord.SpeedRecordSample getReal() {
            return (android.health.connect.datatypes.SpeedRecord.SpeedRecordSample) real;
        }

        public android.health.connect.datatypes.SpeedRecord.SpeedRecordSample unwrap() {
            return getReal();
        }

        public SpeedRecordSample(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.SpeedRecord.SpeedRecordSample(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.health.connect.datatypes.SpeedRecord.SpeedRecordSample) real).equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity getSpeed() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Velocity.wrap(((android.health.connect.datatypes.SpeedRecord.SpeedRecordSample) real).getSpeed());
        }

        public java.time.Instant getTime() {
            return ((android.health.connect.datatypes.SpeedRecord.SpeedRecordSample) real).getTime();
        }

        public int hashCode() {
            return ((android.health.connect.datatypes.SpeedRecord.SpeedRecordSample) real).hashCode();
        }

    }
}
