// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioProfile {
    private final android.media.AudioProfile real;

    public AudioProfile(android.media.AudioProfile real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioProfile wrap(android.media.AudioProfile real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioProfile(real);
    }

    public android.media.AudioProfile unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int[] getChannelIndexMasks() {
        return real.getChannelIndexMasks();
    }

    public int[] getChannelMasks() {
        return real.getChannelMasks();
    }

    public int getEncapsulationType() {
        return real.getEncapsulationType();
    }

    public int getFormat() {
        return real.getFormat();
    }

    public int[] getSampleRates() {
        return real.getSampleRates();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int AUDIO_ENCAPSULATION_TYPE_IEC61937 = android.media.AudioProfile.AUDIO_ENCAPSULATION_TYPE_IEC61937;
    public static final int AUDIO_ENCAPSULATION_TYPE_NONE = android.media.AudioProfile.AUDIO_ENCAPSULATION_TYPE_NONE;
    public static final int AUDIO_ENCAPSULATION_TYPE_PCM = android.media.AudioProfile.AUDIO_ENCAPSULATION_TYPE_PCM;

}
