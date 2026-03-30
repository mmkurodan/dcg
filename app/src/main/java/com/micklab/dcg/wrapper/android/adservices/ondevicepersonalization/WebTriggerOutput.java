// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class WebTriggerOutput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebTriggerOutput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput wrap(android.adservices.ondevicepersonalization.WebTriggerOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.WebTriggerOutput getReal() {
        return (android.adservices.ondevicepersonalization.WebTriggerOutput) real;
    }

    public android.adservices.ondevicepersonalization.WebTriggerOutput unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.WebTriggerOutput) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord getRequestLogRecord() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.wrap(((android.adservices.ondevicepersonalization.WebTriggerOutput) real).getRequestLogRecord());
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.WebTriggerOutput) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.Builder wrap(android.adservices.ondevicepersonalization.WebTriggerOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.WebTriggerOutput.Builder getReal() {
            return (android.adservices.ondevicepersonalization.WebTriggerOutput.Builder) real;
        }

        public android.adservices.ondevicepersonalization.WebTriggerOutput.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.WebTriggerOutput.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.Builder addEventLogRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.Builder.wrap(((android.adservices.ondevicepersonalization.WebTriggerOutput.Builder) real).addEventLogRecord(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.wrap(((android.adservices.ondevicepersonalization.WebTriggerOutput.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.Builder setRequestLogRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.Builder.wrap(((android.adservices.ondevicepersonalization.WebTriggerOutput.Builder) real).setRequestLogRecord(arg0 == null ? null : arg0.getReal()));
        }

    }
}
