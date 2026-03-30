// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class TrainingExamplesInput {
    private final android.adservices.ondevicepersonalization.TrainingExamplesInput real;

    public TrainingExamplesInput(android.adservices.ondevicepersonalization.TrainingExamplesInput real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesInput wrap(android.adservices.ondevicepersonalization.TrainingExamplesInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesInput(real);
    }

    public android.adservices.ondevicepersonalization.TrainingExamplesInput unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public java.lang.String getPopulationName() {
        return real.getPopulationName();
    }

    public byte[] getResumptionToken() {
        return real.getResumptionToken();
    }

    public java.lang.String getTaskName() {
        return real.getTaskName();
    }

    public int hashCode() {
        return real.hashCode();
    }

}
