// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioMixerAttributes {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioMixerAttributes(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioMixerAttributes wrap(android.media.AudioMixerAttributes real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMixerAttributes(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioMixerAttributes getReal() {
        return (android.media.AudioMixerAttributes) real;
    }

    public android.media.AudioMixerAttributes unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.AudioMixerAttributes) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.AudioMixerAttributes) real).equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.AudioFormat getFormat() {
        return com.micklab.dcg.wrapper.android.media.AudioFormat.wrap(((android.media.AudioMixerAttributes) real).getFormat());
    }

    public int getMixerBehavior() {
        return ((android.media.AudioMixerAttributes) real).getMixerBehavior();
    }

    public int hashCode() {
        return ((android.media.AudioMixerAttributes) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.media.AudioMixerAttributes) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.AudioMixerAttributes) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int MIXER_BEHAVIOR_BIT_PERFECT = android.media.AudioMixerAttributes.MIXER_BEHAVIOR_BIT_PERFECT;
    public static final int MIXER_BEHAVIOR_DEFAULT = android.media.AudioMixerAttributes.MIXER_BEHAVIOR_DEFAULT;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioMixerAttributes.Builder wrap(android.media.AudioMixerAttributes.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioMixerAttributes.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioMixerAttributes.Builder getReal() {
            return (android.media.AudioMixerAttributes.Builder) real;
        }

        public android.media.AudioMixerAttributes.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.media.AudioFormat arg0) {
            this(new android.media.AudioMixerAttributes.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.AudioMixerAttributes build() {
            return com.micklab.dcg.wrapper.android.media.AudioMixerAttributes.wrap(((android.media.AudioMixerAttributes.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioMixerAttributes.Builder setMixerBehavior(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioMixerAttributes.Builder.wrap(((android.media.AudioMixerAttributes.Builder) real).setMixerBehavior(arg0));
        }

    }
}
