// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class MenstruationFlowRecord {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MenstruationFlowRecord(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord wrap(android.health.connect.datatypes.MenstruationFlowRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.datatypes.MenstruationFlowRecord getReal() {
        return (android.health.connect.datatypes.MenstruationFlowRecord) real;
    }

    public android.health.connect.datatypes.MenstruationFlowRecord unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.health.connect.datatypes.MenstruationFlowRecord) real).equals(arg0);
    }

    public int getFlow() {
        return ((android.health.connect.datatypes.MenstruationFlowRecord) real).getFlow();
    }

    public int hashCode() {
        return ((android.health.connect.datatypes.MenstruationFlowRecord) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.Builder wrap(android.health.connect.datatypes.MenstruationFlowRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.MenstruationFlowRecord.Builder getReal() {
            return (android.health.connect.datatypes.MenstruationFlowRecord.Builder) real;
        }

        public android.health.connect.datatypes.MenstruationFlowRecord.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2) {
            this(new android.health.connect.datatypes.MenstruationFlowRecord.Builder(arg0 == null ? null : arg0.getReal(), arg1, arg2), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.wrap(((android.health.connect.datatypes.MenstruationFlowRecord.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.Builder.wrap(((android.health.connect.datatypes.MenstruationFlowRecord.Builder) real).clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.Builder.wrap(((android.health.connect.datatypes.MenstruationFlowRecord.Builder) real).setZoneOffset(arg0));
        }

    }
    public static final class MenstruationFlowType {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MenstruationFlowType(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType wrap(android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType getReal() {
            return (android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType) real;
        }

        public android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType unwrap() {
            return getReal();
        }

        public static final int FLOW_HEAVY = android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType.FLOW_HEAVY;
        public static final int FLOW_LIGHT = android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType.FLOW_LIGHT;
        public static final int FLOW_MEDIUM = android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType.FLOW_MEDIUM;
        public static final int FLOW_UNKNOWN = android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType.FLOW_UNKNOWN;

    }
}
