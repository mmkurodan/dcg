// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class MultiResolutionStreamConfigurationMap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MultiResolutionStreamConfigurationMap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.MultiResolutionStreamConfigurationMap wrap(android.hardware.camera2.params.MultiResolutionStreamConfigurationMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.MultiResolutionStreamConfigurationMap(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.MultiResolutionStreamConfigurationMap getReal() {
        return (android.hardware.camera2.params.MultiResolutionStreamConfigurationMap) real;
    }

    public android.hardware.camera2.params.MultiResolutionStreamConfigurationMap unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.MultiResolutionStreamConfigurationMap) real).equals(arg0);
    }

    public int[] getInputFormats() {
        return ((android.hardware.camera2.params.MultiResolutionStreamConfigurationMap) real).getInputFormats();
    }

    public int[] getOutputFormats() {
        return ((android.hardware.camera2.params.MultiResolutionStreamConfigurationMap) real).getOutputFormats();
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.MultiResolutionStreamConfigurationMap) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.hardware.camera2.params.MultiResolutionStreamConfigurationMap) real).toString();
    }

}
