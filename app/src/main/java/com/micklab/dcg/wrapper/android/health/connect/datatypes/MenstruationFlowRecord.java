// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect.datatypes;

public final class MenstruationFlowRecord {
    private final android.health.connect.datatypes.MenstruationFlowRecord real;

    public MenstruationFlowRecord(android.health.connect.datatypes.MenstruationFlowRecord real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord wrap(android.health.connect.datatypes.MenstruationFlowRecord real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord(real);
    }

    public android.health.connect.datatypes.MenstruationFlowRecord unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getFlow() {
        return real.getFlow();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.health.connect.datatypes.MenstruationFlowRecord.Builder real;

        public Builder(android.health.connect.datatypes.MenstruationFlowRecord.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.Builder wrap(android.health.connect.datatypes.MenstruationFlowRecord.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.Builder(real);
        }

        public android.health.connect.datatypes.MenstruationFlowRecord.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.health.connect.datatypes.Metadata arg0, java.time.Instant arg1, int arg2) {
            this(new android.health.connect.datatypes.MenstruationFlowRecord.Builder(arg0 == null ? null : arg0.unwrap(), arg1, arg2));
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord build() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.Builder clearZoneOffset() {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.Builder.wrap(real.clearZoneOffset());
        }

        public com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.Builder setZoneOffset(java.time.ZoneOffset arg0) {
            return com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.Builder.wrap(real.setZoneOffset(arg0));
        }

    }
    public static final class MenstruationFlowType {
        private final android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType real;

        public MenstruationFlowType(android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType wrap(android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType(real);
        }

        public android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType unwrap() {
            return real;
        }

        public static final int FLOW_HEAVY = android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType.FLOW_HEAVY;
        public static final int FLOW_LIGHT = android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType.FLOW_LIGHT;
        public static final int FLOW_MEDIUM = android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType.FLOW_MEDIUM;
        public static final int FLOW_UNKNOWN = android.health.connect.datatypes.MenstruationFlowRecord.MenstruationFlowType.FLOW_UNKNOWN;

    }
}
