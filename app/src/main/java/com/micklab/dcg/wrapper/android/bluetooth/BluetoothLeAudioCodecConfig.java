// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothLeAudioCodecConfig {
    private final android.bluetooth.BluetoothLeAudioCodecConfig real;

    public BluetoothLeAudioCodecConfig(android.bluetooth.BluetoothLeAudioCodecConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig wrap(android.bluetooth.BluetoothLeAudioCodecConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig(real);
    }

    public android.bluetooth.BluetoothLeAudioCodecConfig unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getBitsPerSample() {
        return real.getBitsPerSample();
    }

    public int getChannelCount() {
        return real.getChannelCount();
    }

    public java.lang.String getCodecName() {
        return real.getCodecName();
    }

    public int getCodecPriority() {
        return real.getCodecPriority();
    }

    public int getCodecType() {
        return real.getCodecType();
    }

    public int getFrameDuration() {
        return real.getFrameDuration();
    }

    public int getMaxOctetsPerFrame() {
        return real.getMaxOctetsPerFrame();
    }

    public int getMinOctetsPerFrame() {
        return real.getMinOctetsPerFrame();
    }

    public int getOctetsPerFrame() {
        return real.getOctetsPerFrame();
    }

    public int getSampleRate() {
        return real.getSampleRate();
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
        private final android.bluetooth.BluetoothLeAudioCodecConfig.Builder real;

        public Builder(android.bluetooth.BluetoothLeAudioCodecConfig.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder wrap(android.bluetooth.BluetoothLeAudioCodecConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder(real);
        }

        public android.bluetooth.BluetoothLeAudioCodecConfig.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.bluetooth.BluetoothLeAudioCodecConfig.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig arg0) {
            this(new android.bluetooth.BluetoothLeAudioCodecConfig.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig build() {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setBitsPerSample(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(real.setBitsPerSample(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setChannelCount(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(real.setChannelCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setCodecPriority(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(real.setCodecPriority(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setCodecType(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(real.setCodecType(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setFrameDuration(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(real.setFrameDuration(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setMaxOctetsPerFrame(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(real.setMaxOctetsPerFrame(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setMinOctetsPerFrame(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(real.setMinOctetsPerFrame(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setOctetsPerFrame(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(real.setOctetsPerFrame(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder setSampleRate(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothLeAudioCodecConfig.Builder.wrap(real.setSampleRate(arg0));
        }

    }
}
