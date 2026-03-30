// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.health.connect;

public final class ReadRecordsRequestUsingIds {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ReadRecordsRequestUsingIds(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequestUsingIds wrap(android.health.connect.ReadRecordsRequestUsingIds real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequestUsingIds(real, (__DcgwBridgeToken) null);
    }

    public android.health.connect.ReadRecordsRequestUsingIds getReal() {
        return (android.health.connect.ReadRecordsRequestUsingIds) real;
    }

    public android.health.connect.ReadRecordsRequestUsingIds unwrap() {
        return getReal();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequestUsingIds.Builder wrap(android.health.connect.ReadRecordsRequestUsingIds.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.health.connect.ReadRecordsRequestUsingIds.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.health.connect.ReadRecordsRequestUsingIds.Builder getReal() {
            return (android.health.connect.ReadRecordsRequestUsingIds.Builder) real;
        }

        public android.health.connect.ReadRecordsRequestUsingIds.Builder unwrap() {
            return getReal();
        }

        public Builder(java.lang.Class arg0) {
            this(new android.health.connect.ReadRecordsRequestUsingIds.Builder(arg0), (__DcgwBridgeToken) null);
        }

    }
}
