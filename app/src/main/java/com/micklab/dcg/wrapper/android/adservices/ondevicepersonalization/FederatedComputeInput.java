// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class FederatedComputeInput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private FederatedComputeInput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput wrap(android.adservices.ondevicepersonalization.FederatedComputeInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.FederatedComputeInput getReal() {
        return (android.adservices.ondevicepersonalization.FederatedComputeInput) real;
    }

    public android.adservices.ondevicepersonalization.FederatedComputeInput unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.FederatedComputeInput) real).equals(arg0);
    }

    public java.lang.String getPopulationName() {
        return ((android.adservices.ondevicepersonalization.FederatedComputeInput) real).getPopulationName();
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.FederatedComputeInput) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput.Builder wrap(android.adservices.ondevicepersonalization.FederatedComputeInput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.FederatedComputeInput.Builder getReal() {
            return (android.adservices.ondevicepersonalization.FederatedComputeInput.Builder) real;
        }

        public android.adservices.ondevicepersonalization.FederatedComputeInput.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.FederatedComputeInput.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput.wrap(((android.adservices.ondevicepersonalization.FederatedComputeInput.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput.Builder setPopulationName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput.Builder.wrap(((android.adservices.ondevicepersonalization.FederatedComputeInput.Builder) real).setPopulationName(arg0));
        }

    }
}
