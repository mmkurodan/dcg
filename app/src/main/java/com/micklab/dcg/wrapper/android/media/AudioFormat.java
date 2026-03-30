// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioFormat {
    private final android.media.AudioFormat real;

    public AudioFormat(android.media.AudioFormat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioFormat wrap(android.media.AudioFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioFormat(real);
    }

    public android.media.AudioFormat unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getChannelCount() {
        return real.getChannelCount();
    }

    public int getChannelIndexMask() {
        return real.getChannelIndexMask();
    }

    public int getChannelMask() {
        return real.getChannelMask();
    }

    public int getEncoding() {
        return real.getEncoding();
    }

    public int getFrameSizeInBytes() {
        return real.getFrameSizeInBytes();
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

    public static final int CHANNEL_CONFIGURATION_DEFAULT = android.media.AudioFormat.CHANNEL_CONFIGURATION_DEFAULT;
    public static final int CHANNEL_CONFIGURATION_INVALID = android.media.AudioFormat.CHANNEL_CONFIGURATION_INVALID;
    public static final int CHANNEL_CONFIGURATION_MONO = android.media.AudioFormat.CHANNEL_CONFIGURATION_MONO;
    public static final int CHANNEL_CONFIGURATION_STEREO = android.media.AudioFormat.CHANNEL_CONFIGURATION_STEREO;
    public static final int CHANNEL_INVALID = android.media.AudioFormat.CHANNEL_INVALID;
    public static final int CHANNEL_IN_BACK = android.media.AudioFormat.CHANNEL_IN_BACK;
    public static final int CHANNEL_IN_BACK_PROCESSED = android.media.AudioFormat.CHANNEL_IN_BACK_PROCESSED;
    public static final int CHANNEL_IN_DEFAULT = android.media.AudioFormat.CHANNEL_IN_DEFAULT;
    public static final int CHANNEL_IN_FRONT = android.media.AudioFormat.CHANNEL_IN_FRONT;
    public static final int CHANNEL_IN_FRONT_PROCESSED = android.media.AudioFormat.CHANNEL_IN_FRONT_PROCESSED;
    public static final int CHANNEL_IN_LEFT = android.media.AudioFormat.CHANNEL_IN_LEFT;
    public static final int CHANNEL_IN_LEFT_PROCESSED = android.media.AudioFormat.CHANNEL_IN_LEFT_PROCESSED;
    public static final int CHANNEL_IN_MONO = android.media.AudioFormat.CHANNEL_IN_MONO;
    public static final int CHANNEL_IN_PRESSURE = android.media.AudioFormat.CHANNEL_IN_PRESSURE;
    public static final int CHANNEL_IN_RIGHT = android.media.AudioFormat.CHANNEL_IN_RIGHT;
    public static final int CHANNEL_IN_RIGHT_PROCESSED = android.media.AudioFormat.CHANNEL_IN_RIGHT_PROCESSED;
    public static final int CHANNEL_IN_STEREO = android.media.AudioFormat.CHANNEL_IN_STEREO;
    public static final int CHANNEL_IN_VOICE_DNLINK = android.media.AudioFormat.CHANNEL_IN_VOICE_DNLINK;
    public static final int CHANNEL_IN_VOICE_UPLINK = android.media.AudioFormat.CHANNEL_IN_VOICE_UPLINK;
    public static final int CHANNEL_IN_X_AXIS = android.media.AudioFormat.CHANNEL_IN_X_AXIS;
    public static final int CHANNEL_IN_Y_AXIS = android.media.AudioFormat.CHANNEL_IN_Y_AXIS;
    public static final int CHANNEL_IN_Z_AXIS = android.media.AudioFormat.CHANNEL_IN_Z_AXIS;
    public static final int CHANNEL_OUT_5POINT1 = android.media.AudioFormat.CHANNEL_OUT_5POINT1;
    public static final int CHANNEL_OUT_5POINT1POINT2 = android.media.AudioFormat.CHANNEL_OUT_5POINT1POINT2;
    public static final int CHANNEL_OUT_5POINT1POINT4 = android.media.AudioFormat.CHANNEL_OUT_5POINT1POINT4;
    public static final int CHANNEL_OUT_6POINT1 = android.media.AudioFormat.CHANNEL_OUT_6POINT1;
    public static final int CHANNEL_OUT_7POINT1 = android.media.AudioFormat.CHANNEL_OUT_7POINT1;
    public static final int CHANNEL_OUT_7POINT1POINT2 = android.media.AudioFormat.CHANNEL_OUT_7POINT1POINT2;
    public static final int CHANNEL_OUT_7POINT1POINT4 = android.media.AudioFormat.CHANNEL_OUT_7POINT1POINT4;
    public static final int CHANNEL_OUT_7POINT1_SURROUND = android.media.AudioFormat.CHANNEL_OUT_7POINT1_SURROUND;
    public static final int CHANNEL_OUT_9POINT1POINT4 = android.media.AudioFormat.CHANNEL_OUT_9POINT1POINT4;
    public static final int CHANNEL_OUT_9POINT1POINT6 = android.media.AudioFormat.CHANNEL_OUT_9POINT1POINT6;
    public static final int CHANNEL_OUT_BACK_CENTER = android.media.AudioFormat.CHANNEL_OUT_BACK_CENTER;
    public static final int CHANNEL_OUT_BACK_LEFT = android.media.AudioFormat.CHANNEL_OUT_BACK_LEFT;
    public static final int CHANNEL_OUT_BACK_RIGHT = android.media.AudioFormat.CHANNEL_OUT_BACK_RIGHT;
    public static final int CHANNEL_OUT_BOTTOM_FRONT_CENTER = android.media.AudioFormat.CHANNEL_OUT_BOTTOM_FRONT_CENTER;
    public static final int CHANNEL_OUT_BOTTOM_FRONT_LEFT = android.media.AudioFormat.CHANNEL_OUT_BOTTOM_FRONT_LEFT;
    public static final int CHANNEL_OUT_BOTTOM_FRONT_RIGHT = android.media.AudioFormat.CHANNEL_OUT_BOTTOM_FRONT_RIGHT;
    public static final int CHANNEL_OUT_DEFAULT = android.media.AudioFormat.CHANNEL_OUT_DEFAULT;
    public static final int CHANNEL_OUT_FRONT_CENTER = android.media.AudioFormat.CHANNEL_OUT_FRONT_CENTER;
    public static final int CHANNEL_OUT_FRONT_LEFT = android.media.AudioFormat.CHANNEL_OUT_FRONT_LEFT;
    public static final int CHANNEL_OUT_FRONT_LEFT_OF_CENTER = android.media.AudioFormat.CHANNEL_OUT_FRONT_LEFT_OF_CENTER;
    public static final int CHANNEL_OUT_FRONT_RIGHT = android.media.AudioFormat.CHANNEL_OUT_FRONT_RIGHT;
    public static final int CHANNEL_OUT_FRONT_RIGHT_OF_CENTER = android.media.AudioFormat.CHANNEL_OUT_FRONT_RIGHT_OF_CENTER;
    public static final int CHANNEL_OUT_FRONT_WIDE_LEFT = android.media.AudioFormat.CHANNEL_OUT_FRONT_WIDE_LEFT;
    public static final int CHANNEL_OUT_FRONT_WIDE_RIGHT = android.media.AudioFormat.CHANNEL_OUT_FRONT_WIDE_RIGHT;
    public static final int CHANNEL_OUT_LOW_FREQUENCY = android.media.AudioFormat.CHANNEL_OUT_LOW_FREQUENCY;
    public static final int CHANNEL_OUT_LOW_FREQUENCY_2 = android.media.AudioFormat.CHANNEL_OUT_LOW_FREQUENCY_2;
    public static final int CHANNEL_OUT_MONO = android.media.AudioFormat.CHANNEL_OUT_MONO;
    public static final int CHANNEL_OUT_QUAD = android.media.AudioFormat.CHANNEL_OUT_QUAD;
    public static final int CHANNEL_OUT_SIDE_LEFT = android.media.AudioFormat.CHANNEL_OUT_SIDE_LEFT;
    public static final int CHANNEL_OUT_SIDE_RIGHT = android.media.AudioFormat.CHANNEL_OUT_SIDE_RIGHT;
    public static final int CHANNEL_OUT_STEREO = android.media.AudioFormat.CHANNEL_OUT_STEREO;
    public static final int CHANNEL_OUT_SURROUND = android.media.AudioFormat.CHANNEL_OUT_SURROUND;
    public static final int CHANNEL_OUT_TOP_BACK_CENTER = android.media.AudioFormat.CHANNEL_OUT_TOP_BACK_CENTER;
    public static final int CHANNEL_OUT_TOP_BACK_LEFT = android.media.AudioFormat.CHANNEL_OUT_TOP_BACK_LEFT;
    public static final int CHANNEL_OUT_TOP_BACK_RIGHT = android.media.AudioFormat.CHANNEL_OUT_TOP_BACK_RIGHT;
    public static final int CHANNEL_OUT_TOP_CENTER = android.media.AudioFormat.CHANNEL_OUT_TOP_CENTER;
    public static final int CHANNEL_OUT_TOP_FRONT_CENTER = android.media.AudioFormat.CHANNEL_OUT_TOP_FRONT_CENTER;
    public static final int CHANNEL_OUT_TOP_FRONT_LEFT = android.media.AudioFormat.CHANNEL_OUT_TOP_FRONT_LEFT;
    public static final int CHANNEL_OUT_TOP_FRONT_RIGHT = android.media.AudioFormat.CHANNEL_OUT_TOP_FRONT_RIGHT;
    public static final int CHANNEL_OUT_TOP_SIDE_LEFT = android.media.AudioFormat.CHANNEL_OUT_TOP_SIDE_LEFT;
    public static final int CHANNEL_OUT_TOP_SIDE_RIGHT = android.media.AudioFormat.CHANNEL_OUT_TOP_SIDE_RIGHT;
    public static final int ENCODING_AAC_ELD = android.media.AudioFormat.ENCODING_AAC_ELD;
    public static final int ENCODING_AAC_HE_V1 = android.media.AudioFormat.ENCODING_AAC_HE_V1;
    public static final int ENCODING_AAC_HE_V2 = android.media.AudioFormat.ENCODING_AAC_HE_V2;
    public static final int ENCODING_AAC_LC = android.media.AudioFormat.ENCODING_AAC_LC;
    public static final int ENCODING_AAC_XHE = android.media.AudioFormat.ENCODING_AAC_XHE;
    public static final int ENCODING_AC3 = android.media.AudioFormat.ENCODING_AC3;
    public static final int ENCODING_AC4 = android.media.AudioFormat.ENCODING_AC4;
    public static final int ENCODING_DEFAULT = android.media.AudioFormat.ENCODING_DEFAULT;
    public static final int ENCODING_DOLBY_MAT = android.media.AudioFormat.ENCODING_DOLBY_MAT;
    public static final int ENCODING_DOLBY_TRUEHD = android.media.AudioFormat.ENCODING_DOLBY_TRUEHD;
    public static final int ENCODING_DRA = android.media.AudioFormat.ENCODING_DRA;
    public static final int ENCODING_DSD = android.media.AudioFormat.ENCODING_DSD;
    public static final int ENCODING_DTS = android.media.AudioFormat.ENCODING_DTS;
    public static final int ENCODING_DTS_HD = android.media.AudioFormat.ENCODING_DTS_HD;
    public static final int ENCODING_DTS_HD_MA = android.media.AudioFormat.ENCODING_DTS_HD_MA;
    public static final int ENCODING_DTS_UHD = android.media.AudioFormat.ENCODING_DTS_UHD;
    public static final int ENCODING_DTS_UHD_P1 = android.media.AudioFormat.ENCODING_DTS_UHD_P1;
    public static final int ENCODING_DTS_UHD_P2 = android.media.AudioFormat.ENCODING_DTS_UHD_P2;
    public static final int ENCODING_E_AC3 = android.media.AudioFormat.ENCODING_E_AC3;
    public static final int ENCODING_E_AC3_JOC = android.media.AudioFormat.ENCODING_E_AC3_JOC;
    public static final int ENCODING_IEC61937 = android.media.AudioFormat.ENCODING_IEC61937;
    public static final int ENCODING_INVALID = android.media.AudioFormat.ENCODING_INVALID;
    public static final int ENCODING_MP3 = android.media.AudioFormat.ENCODING_MP3;
    public static final int ENCODING_MPEGH_BL_L3 = android.media.AudioFormat.ENCODING_MPEGH_BL_L3;
    public static final int ENCODING_MPEGH_BL_L4 = android.media.AudioFormat.ENCODING_MPEGH_BL_L4;
    public static final int ENCODING_MPEGH_LC_L3 = android.media.AudioFormat.ENCODING_MPEGH_LC_L3;
    public static final int ENCODING_MPEGH_LC_L4 = android.media.AudioFormat.ENCODING_MPEGH_LC_L4;
    public static final int ENCODING_OPUS = android.media.AudioFormat.ENCODING_OPUS;
    public static final int ENCODING_PCM_16BIT = android.media.AudioFormat.ENCODING_PCM_16BIT;
    public static final int ENCODING_PCM_24BIT_PACKED = android.media.AudioFormat.ENCODING_PCM_24BIT_PACKED;
    public static final int ENCODING_PCM_32BIT = android.media.AudioFormat.ENCODING_PCM_32BIT;
    public static final int ENCODING_PCM_8BIT = android.media.AudioFormat.ENCODING_PCM_8BIT;
    public static final int ENCODING_PCM_FLOAT = android.media.AudioFormat.ENCODING_PCM_FLOAT;
    public static final int SAMPLE_RATE_UNSPECIFIED = android.media.AudioFormat.SAMPLE_RATE_UNSPECIFIED;

    public static final class Builder {
        private final android.media.AudioFormat.Builder real;

        public Builder(android.media.AudioFormat.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioFormat.Builder wrap(android.media.AudioFormat.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioFormat.Builder(real);
        }

        public android.media.AudioFormat.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.media.AudioFormat.Builder());
        }

        public Builder(com.micklab.dcg.wrapper.android.media.AudioFormat arg0) {
            this(new android.media.AudioFormat.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFormat build() {
            return com.micklab.dcg.wrapper.android.media.AudioFormat.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioFormat.Builder setChannelIndexMask(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFormat.Builder.wrap(real.setChannelIndexMask(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFormat.Builder setChannelMask(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioFormat.Builder.wrap(real.setChannelMask(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFormat.Builder setEncoding(int arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioFormat.Builder.wrap(real.setEncoding(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioFormat.Builder setSampleRate(int arg0) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.AudioFormat.Builder.wrap(real.setSampleRate(arg0));
        }

    }
}
