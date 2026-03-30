// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class LeanBodyMassRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private LeanBodyMassRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.LeanBodyMassRecord wrap(android.health.connect.datatypes.LeanBodyMassRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.LeanBodyMassRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.LeanBodyMassRecord getReal() {
        return (android.health.connect.datatypes.LeanBodyMassRecord) real;
    }

    public android.health.connect.datatypes.LeanBodyMassRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.LeanBodyMassRecord) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass getMass() {
        return com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass.wrap(((android.health.connect.datatypes.LeanBodyMassRecord) real).getMass());
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.LeanBodyMassRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.LeanBodyMassRecord.Builder wrap(android.health.connect.datatypes.LeanBodyMassRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.LeanBodyMassRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.LeanBodyMassRecord.Builder getReal() {
            return (android.health.connect.datatypes.LeanBodyMassRecord.Builder) real;
        }

        public android.health.connect.datatypes.LeanBodyMassRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, com.micklab.dcg.wrapper.android.health.connect.datatypes.units.Mass arg2) {
            this(new android.health.connect.datatypes.LeanBodyMassRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.LeanBodyMassRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.LeanBodyMassRecord.wrap(((android.health.connect.datatypes.LeanBodyMassRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.LeanBodyMassRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.LeanBodyMassRecord.Builder.wrap(((android.health.connect.datatypes.LeanBodyMassRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.LeanBodyMassRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.LeanBodyMassRecord.Builder.wrap(((android.health.connect.datatypes.LeanBodyMassRecord.Builder) real).setZoneOffset(arg0));
        }

    }
}
