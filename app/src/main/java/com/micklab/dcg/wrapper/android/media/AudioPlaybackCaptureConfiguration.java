// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class AudioPlaybackCaptureConfiguration {
    private final android.media.AudioPlaybackCaptureConfiguration real;

    public AudioPlaybackCaptureConfiguration(android.media.AudioPlaybackCaptureConfiguration real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration wrap(android.media.AudioPlaybackCaptureConfiguration real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration(real);
    }

    public android.media.AudioPlaybackCaptureConfiguration unwrap() {
        return real;
    }

    public int[] getExcludeUids() {
        return real.getExcludeUids();
    }

    public int[] getExcludeUsages() {
        return real.getExcludeUsages();
    }

    public int[] getMatchingUids() {
        return real.getMatchingUids();
    }

    public int[] getMatchingUsages() {
        return real.getMatchingUsages();
    }

    public com.micklab.dcg.wrapper.android.media.projection.MediaProjection getMediaProjection() {
        return com.micklab.dcg.wrapper.android.media.projection.MediaProjection.wrap(real.getMediaProjection());
    }

    public static final class Builder {
        private final android.media.AudioPlaybackCaptureConfiguration.Builder real;

        public Builder(android.media.AudioPlaybackCaptureConfiguration.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder wrap(android.media.AudioPlaybackCaptureConfiguration.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder(real);
        }

        public android.media.AudioPlaybackCaptureConfiguration.Builder unwrap() {
            return real;
        }

        public Builder(com.micklab.dcg.wrapper.android.media.projection.MediaProjection arg0) {
            this(new android.media.AudioPlaybackCaptureConfiguration.Builder(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder addMatchingUid(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder.wrap(real.addMatchingUid(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder addMatchingUsage(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder.wrap(real.addMatchingUsage(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration build() {
            return com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder excludeUid(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder.wrap(real.excludeUid(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder excludeUsage(int arg0) {
            return com.micklab.dcg.wrapper.android.media.AudioPlaybackCaptureConfiguration.Builder.wrap(real.excludeUsage(arg0));
        }

    }
}
