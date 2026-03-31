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

    public TrainingExamplesInput(java.lang.String arg0, java.lang.String arg1, byte[] arg2, java.lang.String arg3) {
        this(new android.adservices.ondevicepersonalization.TrainingExamplesInput(arg0, arg1, arg2, arg3), (__DcgwBridgeToken) null);
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.adservices.ondevicepersonalization.TrainingExamplesInput) real).equals(arg0);
    }

    public java.lang.String getCollectionName() {
        return ((android.adservices.ondevicepersonalization.TrainingExamplesInput) real).getCollectionName();
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
