// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class EventOutput {
    private final android.adservices.ondevicepersonalization.EventOutput real;

    public EventOutput(android.adservices.ondevicepersonalization.EventOutput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput wrap(android.adservices.ondevicepersonalization.EventOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput(real);
    }

    public android.adservices.ondevicepersonalization.EventOutput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord getEventLogRecord() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord.wrap(real.getEventLogRecord());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.adservices.ondevicepersonalization.EventOutput.Builder real;

        public Builder(android.adservices.ondevicepersonalization.EventOutput.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput.Builder wrap(android.adservices.ondevicepersonalization.EventOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput.Builder(real);
        }

        public android.adservices.ondevicepersonalization.EventOutput.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.EventOutput.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput.Builder setEventLogRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventOutput.Builder.wrap(real.setEventLogRecord(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
