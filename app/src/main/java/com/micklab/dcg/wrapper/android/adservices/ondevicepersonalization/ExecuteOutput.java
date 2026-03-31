// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class ExecuteOutput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExecuteOutput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput wrap(android.adservices.ondevicepersonalization.ExecuteOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.ExecuteOutput getReal() {
        return (android.adservices.ondevicepersonalization.ExecuteOutput) real;
    }

    public android.adservices.ondevicepersonalization.ExecuteOutput unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.ExecuteOutput) real).equals(arg0);
    }

    public int getBestValue() {
        return ((android.adservices.ondevicepersonalization.ExecuteOutput) real).getBestValue();
    }

    public byte[] getOutputData() {
        return ((android.adservices.ondevicepersonalization.ExecuteOutput) real).getOutputData();
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig getRenderingConfig() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig.wrap(((android.adservices.ondevicepersonalization.ExecuteOutput) real).getRenderingConfig());
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord getRequestLogRecord() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord.wrap(((android.adservices.ondevicepersonalization.ExecuteOutput) real).getRequestLogRecord());
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.ExecuteOutput) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder wrap(android.adservices.ondevicepersonalization.ExecuteOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.ExecuteOutput.Builder getReal() {
            return (android.adservices.ondevicepersonalization.ExecuteOutput.Builder) real;
        }

        public android.adservices.ondevicepersonalization.ExecuteOutput.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.ExecuteOutput.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder addEventLogRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.EventLogRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder.wrap(((android.adservices.ondevicepersonalization.ExecuteOutput.Builder) real).addEventLogRecord(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.wrap(((android.adservices.ondevicepersonalization.ExecuteOutput.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder setBestValue(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder.wrap(((android.adservices.ondevicepersonalization.ExecuteOutput.Builder) real).setBestValue(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder setOutputData(byte... arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder.wrap(((android.adservices.ondevicepersonalization.ExecuteOutput.Builder) real).setOutputData(arg0));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder setRenderingConfig(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RenderingConfig arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder.wrap(((android.adservices.ondevicepersonalization.ExecuteOutput.Builder) real).setRenderingConfig(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder setRequestLogRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.RequestLogRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteOutput.Builder.wrap(((android.adservices.ondevicepersonalization.ExecuteOutput.Builder) real).setRequestLogRecord(arg0 == null ? null : arg0.getReal()));
        }

    }
}
