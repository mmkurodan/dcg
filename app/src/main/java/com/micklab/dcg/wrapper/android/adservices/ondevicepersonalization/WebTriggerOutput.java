// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class WebTriggerOutput {
    private final android.adservices.ondevicepersonalization.WebTriggerOutput real;

    public WebTriggerOutput(android.adservices.ondevicepersonalization.WebTriggerOutput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput wrap(android.adservices.ondevicepersonalization.WebTriggerOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput(real);
    }

    public android.adservices.ondevicepersonalization.WebTriggerOutput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord getRequestLogRecord() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.wrap(real.getRequestLogRecord());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.adservices.ondevicepersonalization.WebTriggerOutput.Builder real;

        public Builder(android.adservices.ondevicepersonalization.WebTriggerOutput.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.Builder wrap(android.adservices.ondevicepersonalization.WebTriggerOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.Builder(real);
        }

        public android.adservices.ondevicepersonalization.WebTriggerOutput.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.WebTriggerOutput.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.Builder addEventLogRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.Builder.wrap(real.addEventLogRecord(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.Builder setRequestLogRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.WebTriggerOutput.Builder.wrap(real.setRequestLogRecord(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
