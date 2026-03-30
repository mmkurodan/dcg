// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class DistanceRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DistanceRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord wrap(android.health.connect.datatypes.DistanceRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.DistanceRecord getReal() {
        return (android.health.connect.datatypes.DistanceRecord) real;
    }

    public android.health.connect.datatypes.DistanceRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.DistanceRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getDistance() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(((android.health.connect.datatypes.DistanceRecord) real).getDistance());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.DistanceRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder wrap(android.health.connect.datatypes.DistanceRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.DistanceRecord.Builder getReal() {
            return (android.health.connect.datatypes.DistanceRecord.Builder) real;
        }

        public android.health.connect.datatypes.DistanceRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg3) {
            this(new android.health.connect.datatypes.DistanceRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.wrap(((android.health.connect.datatypes.DistanceRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder.wrap(((android.health.connect.datatypes.DistanceRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder.wrap(((android.health.connect.datatypes.DistanceRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder.wrap(((android.health.connect.datatypes.DistanceRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.DistanceRecord.Builder.wrap(((android.health.connect.datatypes.DistanceRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
}
