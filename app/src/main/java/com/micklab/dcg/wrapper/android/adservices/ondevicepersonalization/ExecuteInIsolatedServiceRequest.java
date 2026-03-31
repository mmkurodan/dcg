// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class ExecuteInIsolatedServiceRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ExecuteInIsolatedServiceRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest wrap(android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest getReal() {
        return (android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest) real;
    }

    public android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.PersistableBundle getAppParams() {
        return com.micklab.dcg.wrapper.android.os.PersistableBundle.wrap(((android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest) real).getAppParams());
    }

    public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec getOutputSpec() {
        return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec.wrap(((android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest) real).getOutputSpec());
    }

    public com.micklab.dcg.wrapper.android.content.ComponentName getService() {
        return com.micklab.dcg.wrapper.android.content.ComponentName.wrap(((android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest) real).getService());
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder wrap(android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder getReal() {
            return (android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder) real;
        }

        public android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
            this(new android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.wrap(((android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder setAppParams(com.micklab.dcg.wrapper.android.os.PersistableBundle arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder.wrap(((android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder) real).setAppParams(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder setOutputSpec(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder.wrap(((android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.Builder) real).setOutputSpec(arg0 == null ? null : arg0.getReal()));
        }

    }
    public static final class OutputSpec {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OutputSpec(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec wrap(android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec getReal() {
            return (android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec) real;
        }

        public android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec buildBestValueSpec(int arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec.wrap(android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec.buildBestValueSpec(arg0));
        }

        public int getMaxIntValue() {
            return ((android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec) real).getMaxIntValue();
        }

        public int getOutputType() {
            return ((android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec) real).getOutputType();
        }

        public static final com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec DEFAULT = com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec.wrap(android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec.DEFAULT);
        public static final int OUTPUT_TYPE_BEST_VALUE = android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec.OUTPUT_TYPE_BEST_VALUE;
        public static final int OUTPUT_TYPE_NULL = android.adservices.ondevicepersonalization.ExecuteInIsolatedServiceRequest.OutputSpec.OUTPUT_TYPE_NULL;

    }
}
