// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class StepsRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StepsRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord wrap(android.health.connect.datatypes.StepsRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.StepsRecord getReal() {
        return (android.health.connect.datatypes.StepsRecord) real;
    }

    public android.health.connect.datatypes.StepsRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.StepsRecord) real).equals(arg0);
    }

    public long getCount() {
        return ((android.health.connect.datatypes.StepsRecord) real).getCount();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.StepsRecord) real).hashCode();
    }


    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder wrap(android.health.connect.datatypes.StepsRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.StepsRecord.Builder getReal() {
            return (android.health.connect.datatypes.StepsRecord.Builder) real;
        }

        public android.health.connect.datatypes.StepsRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, java.time.Instant arg2, long arg3) {
            this(new android.health.connect.datatypes.StepsRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.wrap(((android.health.connect.datatypes.StepsRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder clearEndZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder.wrap(((android.health.connect.datatypes.StepsRecord.Builder) real).clearEndZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder clearStartZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder.wrap(((android.health.connect.datatypes.StepsRecord.Builder) real).clearStartZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder setEndZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder.wrap(((android.health.connect.datatypes.StepsRecord.Builder) real).setEndZoneOffset(arg0));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder setStartZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.StepsRecord.Builder.wrap(((android.health.connect.datatypes.StepsRecord.Builder) real).setStartZoneOffset(arg0));
        }

    }
}
