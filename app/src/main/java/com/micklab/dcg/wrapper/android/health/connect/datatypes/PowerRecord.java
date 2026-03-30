// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class PowerRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PowerRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord wrap(android.health.connect.datatypes.PowerRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.PowerRecord getReal() {
        return (android.health.connect.datatypes.PowerRecord) real;
    }

    public android.health.connect.datatypes.PowerRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.PowerRecord) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.PowerRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder wrap(android.health.connect.datatypes.PowerRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.PowerRecord.Builder getReal() {
            return (android.health.connect.datatypes.PowerRecord.Builder) real;
        }

        public android.health.connect.datatypes.PowerRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, java.util.List arg3) {
            this(new android.health.connect.datatypes.PowerRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.wrap(((android.health.connect.datatypes.PowerRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder.wrap(((android.health.connect.datatypes.PowerRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder.wrap(((android.health.connect.datatypes.PowerRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder.wrap(((android.health.connect.datatypes.PowerRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.Builder.wrap(((android.health.connect.datatypes.PowerRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
    public static final class PowerRecordSample {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PowerRecordSample(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.PowerRecordSample wrap(android.health.connect.datatypes.PowerRecord.PowerRecordSample real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.PowerRecord.PowerRecordSample(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.PowerRecord.PowerRecordSample getReal() {
            return (android.health.connect.datatypes.PowerRecord.PowerRecordSample) real;
        }

        public android.health.connect.datatypes.PowerRecord.PowerRecordSample unwrap() {
            return getReal();
        }

        public PowerRecordSample(com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power arg0, java.time.Instant arg1) {
            this(new android.health.connect.datatypes.PowerRecord.PowerRecordSample(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.health.connect.datatypes.PowerRecord.PowerRecordSample) real).equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power getPower() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Power.wrap(((android.health.connect.datatypes.PowerRecord.PowerRecordSample) real).getPower());
        }

        public java.time.Instant getTime() {
            return ((android.health.connect.datatypes.PowerRecord.PowerRecordSample) real).getTime();
        }

        public int hashCode() {
            return ((android.health.connect.datatypes.PowerRecord.PowerRecordSample) real).hashCode();
        }

    }
}
