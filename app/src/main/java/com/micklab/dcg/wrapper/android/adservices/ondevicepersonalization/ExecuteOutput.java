// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class ExecuteOutput {
    private final android.adservices.ondevicepersonalization.ExecuteOutput real;

    public ExecuteOutput(android.adservices.ondevicepersonalization.ExecuteOutput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput wrap(android.adservices.ondevicepersonalization.ExecuteOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput(real);
    }

    public android.adservices.ondevicepersonalization.ExecuteOutput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public byte[] getOutputData() {
        return real.getOutputData();
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig getRenderingConfig() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.wrap(real.getRenderingConfig());
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord getRequestLogRecord() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.wrap(real.getRequestLogRecord());
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.adservices.ondevicepersonalization.ExecuteOutput.Builder real;

        public Builder(android.adservices.ondevicepersonalization.ExecuteOutput.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder wrap(android.adservices.ondevicepersonalization.ExecuteOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder(real);
        }

        public android.adservices.ondevicepersonalization.ExecuteOutput.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.ExecuteOutput.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder addEventLogRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder.wrap(real.addEventLogRecord(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder setOutputData(byte... arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder.wrap(real.setOutputData(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder setRenderingConfig(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder.wrap(real.setRenderingConfig(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder setRequestLogRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder.wrap(real.setRequestLogRecord(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
