// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioProfile {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioProfile(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioProfile wrap(android.media.AudioProfile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioProfile(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioProfile getReal() {
        return (android.media.AudioProfile) real;
    }

    public android.media.AudioProfile unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.AudioProfile) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.AudioProfile) real).equals(arg0);
    }

    public int[] getChannelIndexMasks() {
        return ((android.media.AudioProfile) real).getChannelIndexMasks();
    }

    public int[] getChannelMasks() {
        return ((android.media.AudioProfile) real).getChannelMasks();
    }

    public int getEncapsulationType() {
        return ((android.media.AudioProfile) real).getEncapsulationType();
    }

    public int getFormat() {
        return ((android.media.AudioProfile) real).getFormat();
    }

    public int[] getSampleRates() {
        return ((android.media.AudioProfile) real).getSampleRates();
    }

    public int hashCode() {
        return ((android.media.AudioProfile) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.media.AudioProfile) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.AudioProfile) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int AUDIO_ENCAPSULATION_TYPE_IEC61937 = android.media.AudioProfile.AUDIO_ENCAPSULATION_TYPE_IEC61937;
    public static final int AUDIO_ENCAPSULATION_TYPE_NONE = android.media.AudioProfile.AUDIO_ENCAPSULATION_TYPE_NONE;
    public static final int AUDIO_ENCAPSULATION_TYPE_PCM = android.media.AudioProfile.AUDIO_ENCAPSULATION_TYPE_PCM;

}
