// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class StreamConfigurationMap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private StreamConfigurationMap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.StreamConfigurationMap wrap(android.hardware.camera2.params.StreamConfigurationMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.StreamConfigurationMap(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.StreamConfigurationMap getReal() {
        return (android.hardware.camera2.params.StreamConfigurationMap) real;
    }

    public android.hardware.camera2.params.StreamConfigurationMap unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).equals(arg0);
    }

    public android.util.Size[] getHighResolutionOutputSizes(int arg0) {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).getHighResolutionOutputSizes(arg0);
    }

    public android.util.Size[] getHighSpeedVideoSizes() {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).getHighSpeedVideoSizes();
    }

    public int[] getInputFormats() {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).getInputFormats();
    }

    public android.util.Size[] getInputSizes(int arg0) {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).getInputSizes(arg0);
    }

    public int[] getOutputFormats() {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).getOutputFormats();
    }

    public long getOutputMinFrameDuration(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1) {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).getOutputMinFrameDuration(arg0, arg1 == null ? null : arg1.getReal());
    }

    public android.util.Size[] getOutputSizes(int arg0) {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).getOutputSizes(arg0);
    }

    public long getOutputStallDuration(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1) {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).getOutputStallDuration(arg0, arg1 == null ? null : arg1.getReal());
    }

    public int[] getValidOutputFormatsForInput(int arg0) {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).getValidOutputFormatsForInput(arg0);
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).hashCode();
    }

    public boolean isOutputSupportedFor(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).isOutputSupportedFor(arg0 == null ? null : arg0.getReal());
    }

    public boolean isOutputSupportedFor(int arg0) {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).isOutputSupportedFor(arg0);
    }

    public java.lang.String toString() {
        return ((android.hardware.camera2.params.StreamConfigurationMap) real).toString();
    }

}
