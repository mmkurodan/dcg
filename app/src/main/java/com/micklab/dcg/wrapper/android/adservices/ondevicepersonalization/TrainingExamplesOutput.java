// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class TrainingExamplesOutput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TrainingExamplesOutput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput wrap(android.adservices.ondevicepersonalization.TrainingExamplesOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.TrainingExamplesOutput getReal() {
        return (android.adservices.ondevicepersonalization.TrainingExamplesOutput) real;
    }

    public android.adservices.ondevicepersonalization.TrainingExamplesOutput unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.TrainingExamplesOutput) real).equals(arg0);
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.TrainingExamplesOutput) real).hashCode();
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder wrap(android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder getReal() {
            return (android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder) real;
        }

        public android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder(), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder addTrainingExampleRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder.wrap(((android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder) real).addTrainingExampleRecord(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput.wrap(((android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder) real).build());
        }

    }
}
