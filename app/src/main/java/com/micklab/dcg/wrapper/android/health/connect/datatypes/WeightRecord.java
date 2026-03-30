// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class WeightRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WeightRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord wrap(android.health.connect.datatypes.WeightRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.WeightRecord getReal() {
        return (android.health.connect.datatypes.WeightRecord) real;
    }

    public android.health.connect.datatypes.WeightRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.WeightRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass getWeight() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass.wrap(((android.health.connect.datatypes.WeightRecord) real).getWeight());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.WeightRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.Builder wrap(android.health.connect.datatypes.WeightRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.WeightRecord.Builder getReal() {
            return (android.health.connect.datatypes.WeightRecord.Builder) real;
        }

        public android.health.connect.datatypes.WeightRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass arg2) {
            this(new android.health.connect.datatypes.WeightRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.wrap(((android.health.connect.datatypes.WeightRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.Builder.wrap(((android.health.connect.datatypes.WeightRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.WeightRecord.Builder.wrap(((android.health.connect.datatypes.WeightRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
