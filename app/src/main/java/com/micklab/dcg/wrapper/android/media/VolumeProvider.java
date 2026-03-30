// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class VolumeProvider {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VolumeProvider(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.VolumeProvider wrap(android.media.VolumeProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.VolumeProvider(real, (__DcgwBridgeToken) null);
    }

    public android.media.VolumeProvider getReal() {
        return (android.media.VolumeProvider) real;
    }

    public android.media.VolumeProvider unwrap() {
        return getReal();
    }

    public int getCurrentVolume() {
        return ((android.media.VolumeProvider) real).getCurrentVolume();
    }

    public int getMaxVolume() {
        return ((android.media.VolumeProvider) real).getMaxVolume();
    }

    public int getVolumeControl() {
        return ((android.media.VolumeProvider) real).getVolumeControl();
    }

    public java.lang.String getVolumeControlId() {
        return ((android.media.VolumeProvider) real).getVolumeControlId();
    }

    public void onAdjustVolume(int arg0) {
        ((android.media.VolumeProvider) real).onAdjustVolume(arg0);
    }

    public void onSetVolumeTo(int arg0) {
        ((android.media.VolumeProvider) real).onSetVolumeTo(arg0);
    }

    public void setCurrentVolume(int arg0) {
        ((android.media.VolumeProvider) real).setCurrentVolume(arg0);
    }

    public static final int VOLUME_CONTROL_ABSOLUTE = android.media.VolumeProvider.VOLUME_CONTROL_ABSOLUTE;
    public static final int VOLUME_CONTROL_FIXED = android.media.VolumeProvider.VOLUME_CONTROL_FIXED;
    public static final int VOLUME_CONTROL_RELATIVE = android.media.VolumeProvider.VOLUME_CONTROL_RELATIVE;

}
