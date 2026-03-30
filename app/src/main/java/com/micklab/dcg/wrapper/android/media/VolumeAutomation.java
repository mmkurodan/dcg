// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class VolumeAutomation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VolumeAutomation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.VolumeAutomation wrap(android.media.VolumeAutomation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.VolumeAutomation(real, (__DcgwBridgeToken) null);
    }

    public android.media.VolumeAutomation getReal() {
        return (android.media.VolumeAutomation) real;
    }

    public android.media.VolumeAutomation unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.media.VolumeShaper createVolumeShaper(com.micklab.dcg.wrapper.android.media.VolumeShaper.Configuration arg0) {
        return com.micklab.dcg.wrapper.android.media.VolumeShaper.wrap(((android.media.VolumeAutomation) real).createVolumeShaper(arg0 == null ? null : arg0.getReal()));
    }

}
