// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class HeightRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HeightRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord wrap(android.health.connect.datatypes.HeightRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.HeightRecord getReal() {
        return (android.health.connect.datatypes.HeightRecord) real;
    }

    public android.health.connect.datatypes.HeightRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.HeightRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length getHeight() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length.wrap(((android.health.connect.datatypes.HeightRecord) real).getHeight());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.HeightRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.Builder wrap(android.health.connect.datatypes.HeightRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.HeightRecord.Builder getReal() {
            return (android.health.connect.datatypes.HeightRecord.Builder) real;
        }

        public android.health.connect.datatypes.HeightRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Length arg2) {
            this(new android.health.connect.datatypes.HeightRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.wrap(((android.health.connect.datatypes.HeightRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.Builder.wrap(((android.health.connect.datatypes.HeightRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.HeightRecord.Builder.wrap(((android.health.connect.datatypes.HeightRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
