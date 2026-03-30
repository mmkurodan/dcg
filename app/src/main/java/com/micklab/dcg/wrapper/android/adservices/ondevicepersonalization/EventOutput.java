// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class EventOutput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EventOutput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput wrap(android.adservices.ondevicepersonalization.EventOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.EventOutput getReal() {
        return (android.adservices.ondevicepersonalization.EventOutput) real;
    }

    public android.adservices.ondevicepersonalization.EventOutput unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.EventOutput) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord getEventLogRecord() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.wrap(((android.adservices.ondevicepersonalization.EventOutput) real).getEventLogRecord());
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.EventOutput) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput.Builder wrap(android.adservices.ondevicepersonalization.EventOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.EventOutput.Builder getReal() {
            return (android.adservices.ondevicepersonalization.EventOutput.Builder) real;
        }

        public android.adservices.ondevicepersonalization.EventOutput.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.EventOutput.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput.wrap(((android.adservices.ondevicepersonalization.EventOutput.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput.Builder setEventLogRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput.Builder.wrap(((android.adservices.ondevicepersonalization.EventOutput.Builder) real).setEventLogRecord(arg0 == null ? null : arg0.getReal()));
        }

    }
}
