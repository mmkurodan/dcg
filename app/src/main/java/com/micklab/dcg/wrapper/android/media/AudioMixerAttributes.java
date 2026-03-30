// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioMixerAttributes {
    private final android.media.AudioMixerAttributes real;

    public AudioMixerAttributes(android.media.AudioMixerAttributes real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioMixerAttributes wrap(android.media.AudioMixerAttributes real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMixerAttributes(real);
    }

    public android.media.AudioMixerAttributes unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.AudioFormat getFormat() {
        return com.micklab.dcg.wrapper.android.media.AudioFormat.wrap(real.getFormat());
    }

    public int getMixerBehavior() {
        return real.getMixerBehavior();
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

    public static final int MIXER_BEHAVIOR_BIT_PERFECT = android.media.AudioMixerAttributes.MIXER_BEHAVIOR_BIT_PERFECT;
    public static final int MIXER_BEHAVIOR_DEFAULT = android.media.AudioMixerAttributes.MIXER_BEHAVIOR_DEFAULT;

    public static final class Builder {
        private final android.media.AudioMixerAttributes.Builder real;

        public Builder(android.media.AudioMixerAttributes.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioMixerAttributes.Builder wrap(android.media.AudioMixerAttributes.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMixerAttributes.Builder(real);
        }

        public android.media.AudioMixerAttributes.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.media.AudioFormat arg0) {
            this(new android.media.AudioMixerAttributes.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioMixerAttributes build() {
            return com.micklab.dcg.wrapper.android.media.AudioMixerAttributes.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioMixerAttributes.Builder setMixerBehavior(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioMixerAttributes.Builder.wrap(real.setMixerBehavior(arg0));
        }

    }
}
