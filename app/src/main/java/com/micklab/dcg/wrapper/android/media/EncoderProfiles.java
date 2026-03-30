// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class EncoderProfiles {
    private final android.media.EncoderProfiles real;

    public EncoderProfiles(android.media.EncoderProfiles real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.EncoderProfiles wrap(android.media.EncoderProfiles real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.EncoderProfiles(real);
    }

    public android.media.EncoderProfiles unwrap() {
        return real;
    }

    public int getDefaultDurationSeconds() {
        return real.getDefaultDurationSeconds();
    }

    public int getRecommendedFileFormat() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.EncoderProfiles#getRecommendedFileFormat()");
    }

    public static final class AudioProfile {
        private final android.media.EncoderProfiles.AudioProfile real;

        public AudioProfile(android.media.EncoderProfiles.AudioProfile real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.EncoderProfiles.AudioProfile wrap(android.media.EncoderProfiles.AudioProfile real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.EncoderProfiles.AudioProfile(real);
        }

        public android.media.EncoderProfiles.AudioProfile unwrap() {
            return real;
        }

        public int getBitrate() {
            return real.getBitrate();
        }

        public int getChannels() {
            return real.getChannels();
        }

        public int getCodec() {
            return real.getCodec();
        }

        public java.lang.String getMediaType() {
            return real.getMediaType();
        }

        public int getProfile() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.EncoderProfiles$AudioProfile#getProfile()");
        }

        public int getSampleRate() {
            return real.getSampleRate();
        }

    }
    public static final class VideoProfile {
        private final android.media.EncoderProfiles.VideoProfile real;

        public VideoProfile(android.media.EncoderProfiles.VideoProfile real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.EncoderProfiles.VideoProfile wrap(android.media.EncoderProfiles.VideoProfile real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.EncoderProfiles.VideoProfile(real);
        }

        public android.media.EncoderProfiles.VideoProfile unwrap() {
            return real;
        }

        public int getBitDepth() {
            return real.getBitDepth();
        }

        public int getBitrate() {
            return real.getBitrate();
        }

        public int getChromaSubsampling() {
            return real.getChromaSubsampling();
        }

        public int getCodec() {
            return real.getCodec();
        }

        public int getFrameRate() {
            return real.getFrameRate();
        }

        public int getHdrFormat() {
            return real.getHdrFormat();
        }

        public int getHeight() {
            return real.getHeight();
        }

        public java.lang.String getMediaType() {
            return real.getMediaType();
        }

        public int getProfile() {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.EncoderProfiles$VideoProfile#getProfile()");
        }

        public int getWidth() {
            return real.getWidth();
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
