// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization;

public final class TrainingExamplesInput {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TrainingExamplesInput(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesInput wrap(android.adservices.ondevicepersonalization.TrainingExamplesInput real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.adservices.ondevicepersonalization.TrainingExamplesInput(real, (__DcgwBridgeToken) null);
    }

    public android.adservices.ondevicepersonalization.TrainingExamplesInput getReal() {
        return (android.adservices.ondevicepersonalization.TrainingExamplesInput) real;
    }

    public android.adservices.ondevicepersonalization.TrainingExamplesInput unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.TrainingExamplesInput) real).equals(arg0);
    }

    public java.lang.String getPopulationName() {
        return ((android.adservices.ondevicepersonalization.TrainingExamplesInput) real).getPopulationName();
    }

    public byte[] getResumptionToken() {
        return ((android.adservices.ondevicepersonalization.TrainingExamplesInput) real).getResumptionToken();
    }

    public java.lang.String getTaskName() {
        return ((android.adservices.ondevicepersonalization.TrainingExamplesInput) real).getTaskName();
    }

    public int hashCode() {
        return ((android.adservices.ondevicepersonalization.TrainingExamplesInput) real).hashCode();
    }

}
