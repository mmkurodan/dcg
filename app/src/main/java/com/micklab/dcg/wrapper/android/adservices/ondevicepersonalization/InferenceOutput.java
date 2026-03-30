// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class InferenceOutput {
    private final android.adservices.ondevicepersonalization.InferenceOutput real;

    public InferenceOutput(android.adservices.ondevicepersonalization.InferenceOutput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput wrap(android.adservices.ondevicepersonalization.InferenceOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput(real);
    }

    public android.adservices.ondevicepersonalization.InferenceOutput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.adservices.ondevicepersonalization.InferenceOutput.Builder real;

        public Builder(android.adservices.ondevicepersonalization.InferenceOutput.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput.Builder wrap(android.adservices.ondevicepersonalization.InferenceOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput.Builder(real);
        }

        public android.adservices.ondevicepersonalization.InferenceOutput.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.InferenceOutput.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput.Builder addDataOutput(int arg0, java.lang.Object arg1) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput.Builder.wrap(real.addDataOutput(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.InferenceOutput.wrap(real.build());
        }

    }
}
