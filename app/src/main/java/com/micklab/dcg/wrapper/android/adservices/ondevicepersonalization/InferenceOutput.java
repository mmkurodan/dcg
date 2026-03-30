// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class InferenceOutput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InferenceOutput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput wrap(android.adservices.ondevicepersonalization.InferenceOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.InferenceOutput getReal() {
        return (android.adservices.ondevicepersonalization.InferenceOutput) real;
    }

    public android.adservices.ondevicepersonalization.InferenceOutput unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.InferenceOutput) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.InferenceOutput) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput.Builder wrap(android.adservices.ondevicepersonalization.InferenceOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.InferenceOutput.Builder getReal() {
            return (android.adservices.ondevicepersonalization.InferenceOutput.Builder) real;
        }

        public android.adservices.ondevicepersonalization.InferenceOutput.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.InferenceOutput.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput.Builder addDataOutput(int arg0, java.lang.Object arg1) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput.Builder.wrap(((android.adservices.ondevicepersonalization.InferenceOutput.Builder) real).addDataOutput(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput.wrap(((android.adservices.ondevicepersonalization.InferenceOutput.Builder) real).build());
        }

    }
}
