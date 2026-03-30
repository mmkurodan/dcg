// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class FederatedComputeInput {
    private final android.adservices.ondevicepersonalization.FederatedComputeInput real;

    public FederatedComputeInput(android.adservices.ondevicepersonalization.FederatedComputeInput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput wrap(android.adservices.ondevicepersonalization.FederatedComputeInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput(real);
    }

    public android.adservices.ondevicepersonalization.FederatedComputeInput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getPopulationName() {
        return real.getPopulationName();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.adservices.ondevicepersonalization.FederatedComputeInput.Builder real;

        public Builder(android.adservices.ondevicepersonalization.FederatedComputeInput.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput.Builder wrap(android.adservices.ondevicepersonalization.FederatedComputeInput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput.Builder(real);
        }

        public android.adservices.ondevicepersonalization.FederatedComputeInput.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.FederatedComputeInput.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput.Builder setPopulationName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.FederatedComputeInput.Builder.wrap(real.setPopulationName(arg0));
        }

    }
}
