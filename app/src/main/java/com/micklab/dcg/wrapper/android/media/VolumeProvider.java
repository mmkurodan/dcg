// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class VolumeProvider {
    private final android.media.VolumeProvider real;

    public VolumeProvider(android.media.VolumeProvider real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.VolumeProvider wrap(android.media.VolumeProvider real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.VolumeProvider(real);
    }

    public android.media.VolumeProvider unwrap() {
        return real;
    }

    public int getCurrentVolume() {
        return real.getCurrentVolume();
    }

    public int getMaxVolume() {
        return real.getMaxVolume();
    }

    public int getVolumeControl() {
        return real.getVolumeControl();
    }

    public java.lang.String getVolumeControlId() {
        return real.getVolumeControlId();
    }

    public void onAdjustVolume(int arg0) {
        real.onAdjustVolume(arg0);
    }

    public void onSetVolumeTo(int arg0) {
        real.onSetVolumeTo(arg0);
    }

    public void setCurrentVolume(int arg0) {
        real.setCurrentVolume(arg0);
    }

    public static final int VOLUME_CONTROL_ABSOLUTE = android.media.VolumeProvider.VOLUME_CONTROL_ABSOLUTE;
    public static final int VOLUME_CONTROL_FIXED = android.media.VolumeProvider.VOLUME_CONTROL_FIXED;
    public static final int VOLUME_CONTROL_RELATIVE = android.media.VolumeProvider.VOLUME_CONTROL_RELATIVE;

}
