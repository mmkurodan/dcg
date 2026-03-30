// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class EncoderProfiles {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EncoderProfiles(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.EncoderProfiles wrap(android.media.EncoderProfiles real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.EncoderProfiles(real, (__DcgwBridgeToken) null);
    }

    public android.media.EncoderProfiles getReal() {
        return (android.media.EncoderProfiles) real;
    }

    public android.media.EncoderProfiles unwrap() {
        return getReal();
    }

    public int getDefaultDurationSeconds() {
        return ((android.media.EncoderProfiles) real).getDefaultDurationSeconds();
    }

    public int getRecommendedFileFormat() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.EncoderProfiles#getRecommendedFileFormat()");
    }

    public static final class AudioProfile {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private AudioProfile(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.EncoderProfiles.AudioProfile wrap(android.media.EncoderProfiles.AudioProfile real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.EncoderProfiles.AudioProfile(real, (__DcgwBridgeToken) null);
        }

        public android.media.EncoderProfiles.AudioProfile getReal() {
            return (android.media.EncoderProfiles.AudioProfile) real;
        }

        public android.media.EncoderProfiles.AudioProfile unwrap() {
            return getReal();
        }

        public int getBitrate() {
            return ((android.media.EncoderProfiles.AudioProfile) real).getBitrate();
        }

        public int getChannels() {
            return ((android.media.EncoderProfiles.AudioProfile) real).getChannels();
        }

        public int getCodec() {
            return ((android.media.EncoderProfiles.AudioProfile) real).getCodec();
        }

        public java.lang.String getMediaType() {
            return ((android.media.EncoderProfiles.AudioProfile) real).getMediaType();
        }

        public int getProfile() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.EncoderProfiles$AudioProfile#getProfile()");
        }

        public int getSampleRate() {
            return ((android.media.EncoderProfiles.AudioProfile) real).getSampleRate();
        }

    }
    public static final class VideoProfile {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private VideoProfile(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.EncoderProfiles.VideoProfile wrap(android.media.EncoderProfiles.VideoProfile real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.EncoderProfiles.VideoProfile(real, (__DcgwBridgeToken) null);
        }

        public android.media.EncoderProfiles.VideoProfile getReal() {
            return (android.media.EncoderProfiles.VideoProfile) real;
        }

        public android.media.EncoderProfiles.VideoProfile unwrap() {
            return getReal();
        }

        public int getBitDepth() {
            return ((android.media.EncoderProfiles.VideoProfile) real).getBitDepth();
        }

        public int getBitrate() {
            return ((android.media.EncoderProfiles.VideoProfile) real).getBitrate();
        }

        public int getChromaSubsampling() {
            return ((android.media.EncoderProfiles.VideoProfile) real).getChromaSubsampling();
        }

        public int getCodec() {
            return ((android.media.EncoderProfiles.VideoProfile) real).getCodec();
        }

        public int getFrameRate() {
            return ((android.media.EncoderProfiles.VideoProfile) real).getFrameRate();
        }

        public int getHdrFormat() {
            return ((android.media.EncoderProfiles.VideoProfile) real).getHdrFormat();
        }

        public int getHeight() {
            return ((android.media.EncoderProfiles.VideoProfile) real).getHeight();
        }

        public java.lang.String getMediaType() {
            return ((android.media.EncoderProfiles.VideoProfile) real).getMediaType();
        }

        public int getProfile() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.EncoderProfiles$VideoProfile#getProfile()");
        }

        public int getWidth() {
            return ((android.media.EncoderProfiles.VideoProfile) real).getWidth();
        }

        public static final int HDR_DOLBY_VISION = android.media.EncoderProfiles.VideoProfile.HDR_DOLBY_VISION;
        public static final int HDR_HDR10 = android.media.EncoderProfiles.VideoProfile.HDR_HDR10;
        public static final int HDR_HDR10PLUS = android.media.EncoderProfiles.VideoProfile.HDR_HDR10PLUS;
        public static final int HDR_HLG = android.media.EncoderProfiles.VideoProfile.HDR_HLG;
        public static final int HDR_NONE = android.media.EncoderProfiles.VideoProfile.HDR_NONE;
        public static final int YUV_420 = android.media.EncoderProfiles.VideoProfile.YUV_420;
        public static final int YUV_422 = android.media.EncoderProfiles.VideoProfile.YUV_422;
        public static final int YUV_444 = android.media.EncoderProfiles.VideoProfile.YUV_444;

    }
}
