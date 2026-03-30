// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class TrainingExamplesOutput {
    private final android.adservices.ondevicepersonalization.TrainingExamplesOutput real;

    public TrainingExamplesOutput(android.adservices.ondevicepersonalization.TrainingExamplesOutput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput wrap(android.adservices.ondevicepersonalization.TrainingExamplesOutput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput(real);
    }

    public android.adservices.ondevicepersonalization.TrainingExamplesOutput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public static final class Builder {
        private final android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder real;

        public Builder(android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder wrap(android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder(real);
        }

        public android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder());
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder addTrainingExampleRecord(com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExampleRecord arg0) {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput.Builder.wrap(real.addTrainingExampleRecord(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput build() {
            return com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesOutput.wrap(real.build());
        }

    }
}
