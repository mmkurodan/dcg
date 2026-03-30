// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class FloorsClimbedRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FloorsClimbedRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord wrap(android.health.connect.datatypes.FloorsClimbedRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.FloorsClimbedRecord getReal() {
        return (android.health.connect.datatypes.FloorsClimbedRecord) real;
    }

    public android.health.connect.datatypes.FloorsClimbedRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.FloorsClimbedRecord) real).equals(arg0);
    }

    public double getFloors() {
        return ((android.health.connect.datatypes.FloorsClimbedRecord) real).getFloors();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.FloorsClimbedRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder wrap(android.health.connect.datatypes.FloorsClimbedRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.FloorsClimbedRecord.Builder getReal() {
            return (android.health.connect.datatypes.FloorsClimbedRecord.Builder) real;
        }

        public android.health.connect.datatypes.FloorsClimbedRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, double arg3) {
            this(new android.health.connect.datatypes.FloorsClimbedRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.wrap(((android.health.connect.datatypes.FloorsClimbedRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder.wrap(((android.health.connect.datatypes.FloorsClimbedRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder.wrap(((android.health.connect.datatypes.FloorsClimbedRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder.wrap(((android.health.connect.datatypes.FloorsClimbedRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.FloorsClimbedRecord.Builder.wrap(((android.health.connect.datatypes.FloorsClimbedRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
}
