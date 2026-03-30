// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class VolumeAutomation {
    private final android.media.VolumeAutomation real;

    public VolumeAutomation(android.media.VolumeAutomation real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.VolumeAutomation wrap(android.media.VolumeAutomation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.VolumeAutomation(real);
    }

    public android.media.VolumeAutomation unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.media.VolumeShaper createVolumeShaper(com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration arg0) {
        return com.micklab.dcg.wrapper.android.media.VolumeShaper.wrap(real.createVolumeShaper(arg0 == null ? null : arg0.unwrap()));
    }

}
