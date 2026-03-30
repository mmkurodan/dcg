// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class StreamConfigurationMap {
    private final android.hardware.camera2.params.StreamConfigurationMap real;

    public StreamConfigurationMap(android.hardware.camera2.params.StreamConfigurationMap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.StreamConfigurationMap wrap(android.hardware.camera2.params.StreamConfigurationMap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.StreamConfigurationMap(real);
    }

    public android.hardware.camera2.params.StreamConfigurationMap unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public android.util.Size[] getHighResolutionOutputSizes(int arg0) {
        return real.getHighResolutionOutputSizes(arg0);
    }

    public android.util.Size[] getHighSpeedVideoSizes() {
        return real.getHighSpeedVideoSizes();
    }

    public int[] getInputFormats() {
        return real.getInputFormats();
    }

    public android.util.Size[] getInputSizes(int arg0) {
        return real.getInputSizes(arg0);
    }

    public int[] getOutputFormats() {
        return real.getOutputFormats();
    }

    public long getOutputMinFrameDuration(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1) {
        return real.getOutputMinFrameDuration(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public android.util.Size[] getOutputSizes(int arg0) {
        return real.getOutputSizes(arg0);
    }

    public long getOutputStallDuration(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1) {
        return real.getOutputStallDuration(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public int[] getValidOutputFormatsForInput(int arg0) {
        return real.getValidOutputFormatsForInput(arg0);
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isOutputSupportedFor(int arg0) {
        return real.isOutputSupportedFor(arg0);
    }

    public boolean isOutputSupportedFor(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        return real.isOutputSupportedFor(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String toString() {
        return real.toString();
    }

}
