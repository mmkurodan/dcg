// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware.camera2.params;

public final class OutputConfiguration {
    private final android.hardware.camera2.params.OutputConfiguration real;

    public OutputConfiguration(android.hardware.camera2.params.OutputConfiguration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.camera2.params.OutputConfiguration wrap(android.hardware.camera2.params.OutputConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.camera2.params.OutputConfiguration(real);
    }

    public android.hardware.camera2.params.OutputConfiguration unwrap() {
        return real;
    }

    public OutputConfiguration(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0 == null ? null : arg0.unwrap()));
    }

    public OutputConfiguration(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public OutputConfiguration(int arg0, com.micklab.dcg.wrapper.android.view.Surface arg1) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public OutputConfiguration(com.micklab.dcg.wrapper.android.util.Size arg0, java.lang.Class arg1) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public OutputConfiguration(int arg0, int arg1, com.micklab.dcg.wrapper.android.util.Size arg2) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public OutputConfiguration(int arg0, com.micklab.dcg.wrapper.android.util.Size arg1, long arg2) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0, arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public OutputConfiguration(int arg0, int arg1, com.micklab.dcg.wrapper.android.util.Size arg2, long arg3) {
        this(new android.hardware.camera2.params.OutputConfiguration(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public void addSensorPixelModeUsed(int arg0) {
        real.addSensorPixelModeUsed(arg0);
    }

    public void addSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        real.addSurface(arg0 == null ? null : arg0.unwrap());
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void enableSurfaceSharing() {
        real.enableSurfaceSharing();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public long getDynamicRangeProfile() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.hardware.camera2.params.OutputConfiguration#getDynamicRangeProfile()");
    }

    public int getMaxSharedSurfaceCount() {
        return real.getMaxSharedSurfaceCount();
    }

    public int getMirrorMode() {
        return real.getMirrorMode();
    }

    public long getStreamUseCase() {
        return real.getStreamUseCase();
    }

    public com.micklab.dcg.wrapper.android.view.Surface getSurface() {
        return com.micklab.dcg.wrapper.android.view.Surface.wrap(real.getSurface());
    }

    public int getSurfaceGroupId() {
        return real.getSurfaceGroupId();
    }

    public int getTimestampBase() {
        return real.getTimestampBase();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isReadoutTimestampEnabled() {
        return real.isReadoutTimestampEnabled();
    }

    public void removeSensorPixelModeUsed(int arg0) {
        real.removeSensorPixelModeUsed(arg0);
    }

    public void removeSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
        real.removeSurface(arg0 == null ? null : arg0.unwrap());
    }

    public void setDynamicRangeProfile(long arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.hardware.camera2.params.OutputConfiguration#setDynamicRangeProfile(long)");
    }

    public void setMirrorMode(int arg0) {
        real.setMirrorMode(arg0);
    }

    public void setPhysicalCameraId(java.lang.String arg0) {
        real.setPhysicalCameraId(arg0);
    }

    public void setReadoutTimestampEnabled(boolean arg0) {
        real.setReadoutTimestampEnabled(arg0);
    }

    public void setStreamUseCase(long arg0) {
        real.setStreamUseCase(arg0);
    }

    public void setTimestampBase(int arg0) {
        real.setTimestampBase(arg0);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
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
