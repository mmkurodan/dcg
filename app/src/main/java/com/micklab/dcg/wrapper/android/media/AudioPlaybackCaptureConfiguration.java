// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioPlaybackCaptureConfiguration {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AudioPlaybackCaptureConfiguration(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration wrap(android.media.AudioPlaybackCaptureConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration(real, (__DcgwBridgeToken) null);
    }

    public android.media.AudioPlaybackCaptureConfiguration getReal() {
        return (android.media.AudioPlaybackCaptureConfiguration) real;
    }

    public android.media.AudioPlaybackCaptureConfiguration unwrap() {
        return getReal();
    }

    public int[] getExcludeUids() {
        return ((android.media.AudioPlaybackCaptureConfiguration) real).getExcludeUids();
    }

    public int[] getExcludeUsages() {
        return ((android.media.AudioPlaybackCaptureConfiguration) real).getExcludeUsages();
    }

    public int[] getMatchingUids() {
        return ((android.media.AudioPlaybackCaptureConfiguration) real).getMatchingUids();
    }

    public int[] getMatchingUsages() {
        return ((android.media.AudioPlaybackCaptureConfiguration) real).getMatchingUsages();
    }

    public com.micklab.dcg.wrapper.android.media.projection.MediaProjection getMediaProjection() {
        return com.micklab.dcg.wrapper.android.media.projection.MediaProjection.wrap(((android.media.AudioPlaybackCaptureConfiguration) real).getMediaProjection());
    }

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder wrap(android.media.AudioPlaybackCaptureConfiguration.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.AudioPlaybackCaptureConfiguration.Builder getReal() {
            return (android.media.AudioPlaybackCaptureConfiguration.Builder) real;
        }

        public android.media.AudioPlaybackCaptureConfiguration.Builder unwrap() {
            return getReal();
        }

        public Builder(com.micklab.dcg.wrapper.android.media.projection.MediaProjection arg0) {
            this(new android.media.AudioPlaybackCaptureConfiguration.Builder(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder addMatchingUid(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder.wrap(((android.media.AudioPlaybackCaptureConfiguration.Builder) real).addMatchingUid(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder addMatchingUsage(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder.wrap(((android.media.AudioPlaybackCaptureConfiguration.Builder) real).addMatchingUsage(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration build() {
            return com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.wrap(((android.media.AudioPlaybackCaptureConfiguration.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder excludeUid(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder.wrap(((android.media.AudioPlaybackCaptureConfiguration.Builder) real).excludeUid(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder excludeUsage(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder.wrap(((android.media.AudioPlaybackCaptureConfiguration.Builder) real).excludeUsage(arg0));
        }

    }
}
