// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.quality;

public final class AmbientBacklightSettings {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AmbientBacklightSettings(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.quality.AmbientBacklightSettings wrap(android.media.quality.AmbientBacklightSettings real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.quality.AmbientBacklightSettings(real, (__DcgwBridgeToken) null);
    }

    public android.media.quality.AmbientBacklightSettings getReal() {
        return (android.media.quality.AmbientBacklightSettings) real;
    }

    public android.media.quality.AmbientBacklightSettings unwrap() {
        return getReal();
    }

    public AmbientBacklightSettings(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this(new android.media.quality.AmbientBacklightSettings(arg0, arg1, arg2, arg3, arg4, arg5, arg6), (__DcgwBridgeToken) null);
    }

    public int describeContents() {
        return ((android.media.quality.AmbientBacklightSettings) real).describeContents();
    }

    public int getColorFormat() {
        return ((android.media.quality.AmbientBacklightSettings) real).getColorFormat();
    }

    public int getHorizontalZonesCount() {
        return ((android.media.quality.AmbientBacklightSettings) real).getHorizontalZonesCount();
    }

    public int getMaxFps() {
        return ((android.media.quality.AmbientBacklightSettings) real).getMaxFps();
    }

    public int getSource() {
        return ((android.media.quality.AmbientBacklightSettings) real).getSource();
    }

    public int getThreshold() {
        return ((android.media.quality.AmbientBacklightSettings) real).getThreshold();
    }

    public int getVerticalZonesCount() {
        return ((android.media.quality.AmbientBacklightSettings) real).getVerticalZonesCount();
    }

    public boolean isLetterboxOmitted() {
        return ((android.media.quality.AmbientBacklightSettings) real).isLetterboxOmitted();
    }

    public java.lang.String toString() {
        return ((android.media.quality.AmbientBacklightSettings) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.quality.AmbientBacklightSettings) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int SOURCE_AUDIO = android.media.quality.AmbientBacklightSettings.SOURCE_AUDIO;
    public static final int SOURCE_AUDIO_VIDEO = android.media.quality.AmbientBacklightSettings.SOURCE_AUDIO_VIDEO;
    public static final int SOURCE_NONE = android.media.quality.AmbientBacklightSettings.SOURCE_NONE;
    public static final int SOURCE_VIDEO = android.media.quality.AmbientBacklightSettings.SOURCE_VIDEO;

}
