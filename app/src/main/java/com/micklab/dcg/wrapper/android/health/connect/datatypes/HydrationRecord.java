// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class HydrationRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HydrationRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord wrap(android.health.connect.datatypes.HydrationRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.HydrationRecord getReal() {
        return (android.health.connect.datatypes.HydrationRecord) real;
    }

    public android.health.connect.datatypes.HydrationRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.HydrationRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume getVolume() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume.wrap(((android.health.connect.datatypes.HydrationRecord) real).getVolume());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.HydrationRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder wrap(android.health.connect.datatypes.HydrationRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.HydrationRecord.Builder getReal() {
            return (android.health.connect.datatypes.HydrationRecord.Builder) real;
        }

        public android.health.connect.datatypes.HydrationRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Volume arg3) {
            this(new android.health.connect.datatypes.HydrationRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.wrap(((android.health.connect.datatypes.HydrationRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder.wrap(((android.health.connect.datatypes.HydrationRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder.wrap(((android.health.connect.datatypes.HydrationRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder.wrap(((android.health.connect.datatypes.HydrationRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HydrationRecord.Builder.wrap(((android.health.connect.datatypes.HydrationRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
}
