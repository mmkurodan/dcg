// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.bluetooth;

public final class BluetoothCodecConfig {
    private final android.bluetooth.BluetoothCodecConfig real;

    public BluetoothCodecConfig(android.bluetooth.BluetoothCodecConfig real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig wrap(android.bluetooth.BluetoothCodecConfig real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig(real);
    }

    public android.bluetooth.BluetoothCodecConfig unwrap() {
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

    public int getChannelMode() {
        return real.getChannelMode();
    }

    public int getCodecPriority() {
        return real.getCodecPriority();
    }

    public long getCodecSpecific1() {
        return real.getCodecSpecific1();
    }

    public long getCodecSpecific2() {
        return real.getCodecSpecific2();
    }

    public long getCodecSpecific3() {
        return real.getCodecSpecific3();
    }

    public long getCodecSpecific4() {
        return real.getCodecSpecific4();
    }

    public int getCodecType() {
        return real.getCodecType();
    }

    public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecType getExtendedCodecType() {
        return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecType.wrap(real.getExtendedCodecType());
    }

    public int getSampleRate() {
        return real.getSampleRate();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public boolean isMandatoryCodec() {
        return real.isMandatoryCodec();
    }

    public java.lang.String toString() {
        return real.toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int BITS_PER_SAMPLE_16 = android.bluetooth.BluetoothCodecConfig.BITS_PER_SAMPLE_16;
    public static final int BITS_PER_SAMPLE_24 = android.bluetooth.BluetoothCodecConfig.BITS_PER_SAMPLE_24;
    public static final int BITS_PER_SAMPLE_32 = android.bluetooth.BluetoothCodecConfig.BITS_PER_SAMPLE_32;
    public static final int BITS_PER_SAMPLE_NONE = android.bluetooth.BluetoothCodecConfig.BITS_PER_SAMPLE_NONE;
    public static final int CHANNEL_MODE_MONO = android.bluetooth.BluetoothCodecConfig.CHANNEL_MODE_MONO;
    public static final int CHANNEL_MODE_NONE = android.bluetooth.BluetoothCodecConfig.CHANNEL_MODE_NONE;
    public static final int CHANNEL_MODE_STEREO = android.bluetooth.BluetoothCodecConfig.CHANNEL_MODE_STEREO;
    public static final int CODEC_PRIORITY_DEFAULT = android.bluetooth.BluetoothCodecConfig.CODEC_PRIORITY_DEFAULT;
    public static final int CODEC_PRIORITY_DISABLED = android.bluetooth.BluetoothCodecConfig.CODEC_PRIORITY_DISABLED;
    public static final int CODEC_PRIORITY_HIGHEST = android.bluetooth.BluetoothCodecConfig.CODEC_PRIORITY_HIGHEST;
    public static final int SAMPLE_RATE_176400 = android.bluetooth.BluetoothCodecConfig.SAMPLE_RATE_176400;
    public static final int SAMPLE_RATE_192000 = android.bluetooth.BluetoothCodecConfig.SAMPLE_RATE_192000;
    public static final int SAMPLE_RATE_44100 = android.bluetooth.BluetoothCodecConfig.SAMPLE_RATE_44100;
    public static final int SAMPLE_RATE_48000 = android.bluetooth.BluetoothCodecConfig.SAMPLE_RATE_48000;
    public static final int SAMPLE_RATE_88200 = android.bluetooth.BluetoothCodecConfig.SAMPLE_RATE_88200;
    public static final int SAMPLE_RATE_96000 = android.bluetooth.BluetoothCodecConfig.SAMPLE_RATE_96000;
    public static final int SAMPLE_RATE_NONE = android.bluetooth.BluetoothCodecConfig.SAMPLE_RATE_NONE;
    public static final int SOURCE_CODEC_TYPE_AAC = android.bluetooth.BluetoothCodecConfig.SOURCE_CODEC_TYPE_AAC;
    public static final int SOURCE_CODEC_TYPE_APTX = android.bluetooth.BluetoothCodecConfig.SOURCE_CODEC_TYPE_APTX;
    public static final int SOURCE_CODEC_TYPE_APTX_HD = android.bluetooth.BluetoothCodecConfig.SOURCE_CODEC_TYPE_APTX_HD;
    public static final int SOURCE_CODEC_TYPE_INVALID = android.bluetooth.BluetoothCodecConfig.SOURCE_CODEC_TYPE_INVALID;
    public static final int SOURCE_CODEC_TYPE_LC3 = android.bluetooth.BluetoothCodecConfig.SOURCE_CODEC_TYPE_LC3;
    public static final int SOURCE_CODEC_TYPE_LDAC = android.bluetooth.BluetoothCodecConfig.SOURCE_CODEC_TYPE_LDAC;
    public static final int SOURCE_CODEC_TYPE_OPUS = android.bluetooth.BluetoothCodecConfig.SOURCE_CODEC_TYPE_OPUS;
    public static final int SOURCE_CODEC_TYPE_SBC = android.bluetooth.BluetoothCodecConfig.SOURCE_CODEC_TYPE_SBC;

    public static final class Builder {
        private final android.bluetooth.BluetoothCodecConfig.Builder real;

        public Builder(android.bluetooth.BluetoothCodecConfig.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder wrap(android.bluetooth.BluetoothCodecConfig.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder(real);
        }

        public android.bluetooth.BluetoothCodecConfig.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.bluetooth.BluetoothCodecConfig.Builder());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig build() {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder setBitsPerSample(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder.wrap(real.setBitsPerSample(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder setChannelMode(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder.wrap(real.setChannelMode(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder setCodecPriority(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder.wrap(real.setCodecPriority(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder setCodecSpecific1(long arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder.wrap(real.setCodecSpecific1(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder setCodecSpecific2(long arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder.wrap(real.setCodecSpecific2(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder setCodecSpecific3(long arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder.wrap(real.setCodecSpecific3(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder setCodecSpecific4(long arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder.wrap(real.setCodecSpecific4(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder setCodecType(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder.wrap(real.setCodecType(arg0));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder setExtendedCodecType(com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecType arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder.wrap(real.setExtendedCodecType(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder setSampleRate(int arg0) {
            return com.micklab.dcg.wrapper.android.bluetooth.BluetoothCodecConfig.Builder.wrap(real.setSampleRate(arg0));
        }

    }
}
