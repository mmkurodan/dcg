// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class MenstruationPeriodRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MenstruationPeriodRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord wrap(android.health.connect.datatypes.MenstruationPeriodRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.MenstruationPeriodRecord getReal() {
        return (android.health.connect.datatypes.MenstruationPeriodRecord) real;
    }

    public android.health.connect.datatypes.MenstruationPeriodRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.MenstruationPeriodRecord) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.MenstruationPeriodRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder wrap(android.health.connect.datatypes.MenstruationPeriodRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.MenstruationPeriodRecord.Builder getReal() {
            return (android.health.connect.datatypes.MenstruationPeriodRecord.Builder) real;
        }

        public android.health.connect.datatypes.MenstruationPeriodRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2) {
            this(new android.health.connect.datatypes.MenstruationPeriodRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.wrap(((android.health.connect.datatypes.MenstruationPeriodRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder.wrap(((android.health.connect.datatypes.MenstruationPeriodRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder.wrap(((android.health.connect.datatypes.MenstruationPeriodRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder.wrap(((android.health.connect.datatypes.MenstruationPeriodRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationPeriodRecord.Builder.wrap(((android.health.connect.datatypes.MenstruationPeriodRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
}
