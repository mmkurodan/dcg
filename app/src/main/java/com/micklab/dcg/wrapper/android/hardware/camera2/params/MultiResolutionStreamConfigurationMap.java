// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class MultiResolutionStreamConfigurationMap {
    private final android.hardware.camera2.params.MultiResolutionStreamConfigurationMap real;

    public MultiResolutionStreamConfigurationMap(android.hardware.camera2.params.MultiResolutionStreamConfigurationMap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.MultiResolutionStreamConfigurationMap wrap(android.hardware.camera2.params.MultiResolutionStreamConfigurationMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.MultiResolutionStreamConfigurationMap(real);
    }

    public android.hardware.camera2.params.MultiResolutionStreamConfigurationMap unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int[] getInputFormats() {
        return real.getInputFormats();
    }

    public int[] getOutputFormats() {
        return real.getOutputFormats();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
