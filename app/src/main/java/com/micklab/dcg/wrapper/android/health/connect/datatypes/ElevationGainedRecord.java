// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class ElevationGainedRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ElevationGainedRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord wrap(android.health.connect.datatypes.ElevationGainedRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.ElevationGainedRecord getReal() {
        return (android.health.connect.datatypes.ElevationGainedRecord) real;
    }

    public android.health.connect.datatypes.ElevationGainedRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.ElevationGainedRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getElevation() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(((android.health.connect.datatypes.ElevationGainedRecord) real).getElevation());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.ElevationGainedRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder wrap(android.health.connect.datatypes.ElevationGainedRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.ElevationGainedRecord.Builder getReal() {
            return (android.health.connect.datatypes.ElevationGainedRecord.Builder) real;
        }

        public android.health.connect.datatypes.ElevationGainedRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg3) {
            this(new android.health.connect.datatypes.ElevationGainedRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.wrap(((android.health.connect.datatypes.ElevationGainedRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder.wrap(((android.health.connect.datatypes.ElevationGainedRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder.wrap(((android.health.connect.datatypes.ElevationGainedRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder.wrap(((android.health.connect.datatypes.ElevationGainedRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.ElevationGainedRecord.Builder.wrap(((android.health.connect.datatypes.ElevationGainedRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
}
