// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothLeAudioCodecConfig {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BluetoothLeAudioCodecConfig(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig wrap(android.bluetooth.BluetoothLeAudioCodecConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig(real, (__DcgwBridgeToken) null);
    }

    public android.bluetooth.BluetoothLeAudioCodecConfig getReal() {
        return (android.bluetooth.BluetoothLeAudioCodecConfig) real;
    }

    public android.bluetooth.BluetoothLeAudioCodecConfig unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).equals(arg0);
    }

    public int getBitsPerSample() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).getBitsPerSample();
    }

    public int getChannelCount() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).getChannelCount();
    }

    public java.lang.String getCodecName() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).getCodecName();
    }

    public int getCodecPriority() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).getCodecPriority();
    }

    public int getCodecType() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).getCodecType();
    }

    public int getFrameDuration() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).getFrameDuration();
    }

    public int getMaxOctetsPerFrame() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).getMaxOctetsPerFrame();
    }

    public int getMinOctetsPerFrame() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).getMinOctetsPerFrame();
    }

    public int getOctetsPerFrame() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).getOctetsPerFrame();
    }

    public int getSampleRate() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).getSampleRate();
    }

    public int hashCode() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.bluetooth.BluetoothLeAudioCodecConfig) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.bluetooth.BluetoothLeAudioCodecConfig) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int BITS_PER_SAMPLE_16 = android.bluetooth.BluetoothLeAudioCodecConfig.BITS_PER_SAMPLE_16;
    public static final int BITS_PER_SAMPLE_24 = android.bluetooth.BluetoothLeAudioCodecConfig.BITS_PER_SAMPLE_24;
    public static final int BITS_PER_SAMPLE_32 = android.bluetooth.BluetoothLeAudioCodecConfig.BITS_PER_SAMPLE_32;
    public static final int BITS_PER_SAMPLE_NONE = android.bluetooth.BluetoothLeAudioCodecConfig.BITS_PER_SAMPLE_NONE;
    public static final int CHANNEL_COUNT_1 = android.bluetooth.BluetoothLeAudioCodecConfig.CHANNEL_COUNT_1;
    public static final int CHANNEL_COUNT_2 = android.bluetooth.BluetoothLeAudioCodecConfig.CHANNEL_COUNT_2;
    public static final int CHANNEL_COUNT_NONE = android.bluetooth.BluetoothLeAudioCodecConfig.CHANNEL_COUNT_NONE;
    public static final int CODEC_PRIORITY_DEFAULT = android.bluetooth.BluetoothLeAudioCodecConfig.CODEC_PRIORITY_DEFAULT;
    public static final int CODEC_PRIORITY_DISABLED = android.bluetooth.BluetoothLeAudioCodecConfig.CODEC_PRIORITY_DISABLED;
    public static final int CODEC_PRIORITY_HIGHEST = android.bluetooth.BluetoothLeAudioCodecConfig.CODEC_PRIORITY_HIGHEST;
    public static final int FRAME_DURATION_10000 = android.bluetooth.BluetoothLeAudioCodecConfig.FRAME_DURATION_10000;
    public static final int FRAME_DURATION_7500 = android.bluetooth.BluetoothLeAudioCodecConfig.FRAME_DURATION_7500;
    public static final int FRAME_DURATION_NONE = android.bluetooth.BluetoothLeAudioCodecConfig.FRAME_DURATION_NONE;
    public static final int SAMPLE_RATE_11025 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_11025;
    public static final int SAMPLE_RATE_16000 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_16000;
    public static final int SAMPLE_RATE_176400 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_176400;
    public static final int SAMPLE_RATE_192000 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_192000;
    public static final int SAMPLE_RATE_22050 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_22050;
    public static final int SAMPLE_RATE_24000 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_24000;
    public static final int SAMPLE_RATE_32000 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_32000;
    public static final int SAMPLE_RATE_384000 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_384000;
    public static final int SAMPLE_RATE_44100 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_44100;
    public static final int SAMPLE_RATE_48000 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_48000;
    public static final int SAMPLE_RATE_8000 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_8000;
    public static final int SAMPLE_RATE_88200 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_88200;
    public static final int SAMPLE_RATE_96000 = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_96000;
    public static final int SAMPLE_RATE_NONE = android.bluetooth.BluetoothLeAudioCodecConfig.SAMPLE_RATE_NONE;
    public static final int SOURCE_CODEC_TYPE_INVALID = android.bluetooth.BluetoothLeAudioCodecConfig.SOURCE_CODEC_TYPE_INVALID;
    public static final int SOURCE_CODEC_TYPE_LC3 = android.bluetooth.BluetoothLeAudioCodecConfig.SOURCE_CODEC_TYPE_LC3;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder wrap(android.bluetooth.BluetoothLeAudioCodecConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.bluetooth.BluetoothLeAudioCodecConfig.Builder getReal() {
            return (android.bluetooth.BluetoothLeAudioCodecConfig.Builder) real;
        }

        public android.bluetooth.BluetoothLeAudioCodecConfig.Builder unwrap() {
            return getReal();
        }

        public Builder() {
            this(new android.bluetooth.BluetoothLeAudioCodecConfig.Builder(), (__DcgwBridgeToken) null);
        }

        public Builder(com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig arg0) {
            this(new android.bluetooth.BluetoothLeAudioCodecConfig.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig build() {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.wrap(((android.bluetooth.BluetoothLeAudioCodecConfig.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setBitsPerSample(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(((android.bluetooth.BluetoothLeAudioCodecConfig.Builder) real).setBitsPerSample(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setChannelCount(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(((android.bluetooth.BluetoothLeAudioCodecConfig.Builder) real).setChannelCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setCodecPriority(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(((android.bluetooth.BluetoothLeAudioCodecConfig.Builder) real).setCodecPriority(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setCodecType(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(((android.bluetooth.BluetoothLeAudioCodecConfig.Builder) real).setCodecType(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setFrameDuration(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(((android.bluetooth.BluetoothLeAudioCodecConfig.Builder) real).setFrameDuration(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setMaxOctetsPerFrame(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(((android.bluetooth.BluetoothLeAudioCodecConfig.Builder) real).setMaxOctetsPerFrame(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setMinOctetsPerFrame(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(((android.bluetooth.BluetoothLeAudioCodecConfig.Builder) real).setMinOctetsPerFrame(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setOctetsPerFrame(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(((android.bluetooth.BluetoothLeAudioCodecConfig.Builder) real).setOctetsPerFrame(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setSampleRate(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(((android.bluetooth.BluetoothLeAudioCodecConfig.Builder) real).setSampleRate(arg0));
        }

    }
}
