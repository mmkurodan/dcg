// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class OutputConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OutputConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.OutputConfiguration wrap(android.hardware.camera2.params.OutputConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.OutputConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.camera2.params.OutputConfiguration getReal() {
        return (android.hardware.camera2.params.OutputConfiguration) real;
    }

    public android.hardware.camera2.params.OutputConfiguration unwrap() {
        return getReal();
    }

    public OutputConfiguration(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public OutputConfiguration(int arg0, com.micklab.dcg.wrapper.android.view.Surface arg1) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public OutputConfiguration(com.micklab.dcg.wrapper.android.util.Size arg0, java.lang.Class arg1) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public OutputConfiguration(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public OutputConfiguration(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1, long arg2) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0, arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public OutputConfiguration(int arg0, int arg1, com.micklab.dcg.wrapper.android.util.Size arg2) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0, arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public OutputConfiguration(int arg0, int arg1, com.micklab.dcg.wrapper.android.util.Size arg2, long arg3) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3), (__DcgwBridgeToken) null);
    }

    public void addSensorPixelModeUsed(int arg0) {
        ((android.hardware.camera2.params.OutputConfiguration) real).addSensorPixelModeUsed(arg0);
    }

    public void addSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        ((android.hardware.camera2.params.OutputConfiguration) real).addSurface(arg0 == null ? null : arg0.getReal());
    }

    public int describeContents() {
        return ((android.hardware.camera2.params.OutputConfiguration) real).describeContents();
    }

    public void enableSurfaceSharing() {
        ((android.hardware.camera2.params.OutputConfiguration) real).enableSurfaceSharing();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.hardware.camera2.params.OutputConfiguration) real).equals(arg0);
    }

    public long getDynamicRangeProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.hardware.camera2.params.OutputConfiguration#getDynamicRangeProfile()");
    }

    public int getMaxSharedSurfaceCount() {
        return ((android.hardware.camera2.params.OutputConfiguration) real).getMaxSharedSurfaceCount();
    }

    public int getMirrorMode() {
        return ((android.hardware.camera2.params.OutputConfiguration) real).getMirrorMode();
    }

    public int getMirrorMode(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        return ((android.hardware.camera2.params.OutputConfiguration) real).getMirrorMode(arg0 == null ? null : arg0.getReal());
    }

    public long getStreamUseCase() {
        return ((android.hardware.camera2.params.OutputConfiguration) real).getStreamUseCase();
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(((android.hardware.camera2.params.OutputConfiguration) real).getSurface());
    }

    public int getSurfaceGroupId() {
        return ((android.hardware.camera2.params.OutputConfiguration) real).getSurfaceGroupId();
    }

    public int getTimestampBase() {
        return ((android.hardware.camera2.params.OutputConfiguration) real).getTimestampBase();
    }

    public int hashCode() {
        return ((android.hardware.camera2.params.OutputConfiguration) real).hashCode();
    }

    public boolean isReadoutTimestampEnabled() {
        return ((android.hardware.camera2.params.OutputConfiguration) real).isReadoutTimestampEnabled();
    }

    public void removeSensorPixelModeUsed(int arg0) {
        ((android.hardware.camera2.params.OutputConfiguration) real).removeSensorPixelModeUsed(arg0);
    }

    public void removeSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        ((android.hardware.camera2.params.OutputConfiguration) real).removeSurface(arg0 == null ? null : arg0.getReal());
    }

    public void setDynamicRangeProfile(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.hardware.camera2.params.OutputConfiguration#setDynamicRangeProfile(long)");
    }

    public void setMirrorMode(int arg0) {
        ((android.hardware.camera2.params.OutputConfiguration) real).setMirrorMode(arg0);
    }

    public void setMirrorMode(com.micklab.dcg.wrapper.android.view.Surface arg0, int arg1) {
        ((android.hardware.camera2.params.OutputConfiguration) real).setMirrorMode(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void setPhysicalCameraId(java.lang.String arg0) {
        ((android.hardware.camera2.params.OutputConfiguration) real).setPhysicalCameraId(arg0);
    }

    public void setReadoutTimestampEnabled(boolean arg0) {
        ((android.hardware.camera2.params.OutputConfiguration) real).setReadoutTimestampEnabled(arg0);
    }

    public void setStreamUseCase(long arg0) {
        ((android.hardware.camera2.params.OutputConfiguration) real).setStreamUseCase(arg0);
    }

    public void setTimestampBase(int arg0) {
        ((android.hardware.camera2.params.OutputConfiguration) real).setTimestampBase(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.camera2.params.OutputConfiguration) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int MIRROR_MODE_AUTO = android.hardware.camera2.params.OutputConfiguration.MIRROR_MODE_AUTO;
    public static final int MIRROR_MODE_H = android.hardware.camera2.params.OutputConfiguration.MIRROR_MODE_H;
    public static final int MIRROR_MODE_NONE = android.hardware.camera2.params.OutputConfiguration.MIRROR_MODE_NONE;
    public static final int MIRROR_MODE_V = android.hardware.camera2.params.OutputConfiguration.MIRROR_MODE_V;
    public static final int SURFACE_GROUP_ID_NONE = android.hardware.camera2.params.OutputConfiguration.SURFACE_GROUP_ID_NONE;
    public static final int TIMESTAMP_BASE_CHOREOGRAPHER_SYNCED = android.hardware.camera2.params.OutputConfiguration.TIMESTAMP_BASE_CHOREOGRAPHER_SYNCED;
    public static final int TIMESTAMP_BASE_DEFAULT = android.hardware.camera2.params.OutputConfiguration.TIMESTAMP_BASE_DEFAULT;
    public static final int TIMESTAMP_BASE_MONOTONIC = android.hardware.camera2.params.OutputConfiguration.TIMESTAMP_BASE_MONOTONIC;
    public static final int TIMESTAMP_BASE_REALTIME = android.hardware.camera2.params.OutputConfiguration.TIMESTAMP_BASE_REALTIME;
    public static final int TIMESTAMP_BASE_SENSOR = android.hardware.camera2.params.OutputConfiguration.TIMESTAMP_BASE_SENSOR;

}
