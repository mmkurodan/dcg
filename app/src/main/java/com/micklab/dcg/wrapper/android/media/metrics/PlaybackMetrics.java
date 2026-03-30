// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class PlaybackMetrics {
    private final android.media.metrics.PlaybackMetrics real;

    public PlaybackMetrics(android.media.metrics.PlaybackMetrics real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics wrap(android.media.metrics.PlaybackMetrics real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics(real);
    }

    public android.media.metrics.PlaybackMetrics unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getAudioUnderrunCount() {
        return real.getAudioUnderrunCount();
    }

    public int getContentType() {
        return real.getContentType();
    }

    public byte[] getDrmSessionId() {
        return real.getDrmSessionId();
    }

    public int getDrmType() {
        return real.getDrmType();
    }

    public long[] getExperimentIds() {
        return real.getExperimentIds();
    }

    public long getLocalBytesRead() {
        return real.getLocalBytesRead();
    }

    public long getMediaDurationMillis() {
        return real.getMediaDurationMillis();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getMetricsBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getMetricsBundle());
    }

    public long getNetworkBytesRead() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.metrics.PlaybackMetrics#getNetworkBytesRead()");
    }

    public long getNetworkTransferDurationMillis() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.metrics.PlaybackMetrics#getNetworkTransferDurationMillis()");
    }

    public int getPlaybackType() {
        return real.getPlaybackType();
    }

    public java.lang.String getPlayerName() {
        return real.getPlayerName();
    }

    public java.lang.String getPlayerVersion() {
        return real.getPlayerVersion();
    }

    public int getStreamSource() {
        return real.getStreamSource();
    }

    public int getStreamType() {
        return real.getStreamType();
    }

    public int getVideoFramesDropped() {
        return real.getVideoFramesDropped();
    }

    public int getVideoFramesPlayed() {
        return real.getVideoFramesPlayed();
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

    public static final int CONTENT_TYPE_AD = android.media.metrics.PlaybackMetrics.CONTENT_TYPE_AD;
    public static final int CONTENT_TYPE_MAIN = android.media.metrics.PlaybackMetrics.CONTENT_TYPE_MAIN;
    public static final int CONTENT_TYPE_OTHER = android.media.metrics.PlaybackMetrics.CONTENT_TYPE_OTHER;
    public static final int CONTENT_TYPE_UNKNOWN = android.media.metrics.PlaybackMetrics.CONTENT_TYPE_UNKNOWN;
    public static final int DRM_TYPE_CLEARKEY = android.media.metrics.PlaybackMetrics.DRM_TYPE_CLEARKEY;
    public static final int DRM_TYPE_NONE = android.media.metrics.PlaybackMetrics.DRM_TYPE_NONE;
    public static final int DRM_TYPE_OTHER = android.media.metrics.PlaybackMetrics.DRM_TYPE_OTHER;
    public static final int DRM_TYPE_PLAY_READY = android.media.metrics.PlaybackMetrics.DRM_TYPE_PLAY_READY;
    public static final int DRM_TYPE_WIDEVINE_L1 = android.media.metrics.PlaybackMetrics.DRM_TYPE_WIDEVINE_L1;
    public static final int DRM_TYPE_WIDEVINE_L3 = android.media.metrics.PlaybackMetrics.DRM_TYPE_WIDEVINE_L3;
    public static final int DRM_TYPE_WV_L3_FALLBACK = android.media.metrics.PlaybackMetrics.DRM_TYPE_WV_L3_FALLBACK;
    public static final int PLAYBACK_TYPE_LIVE = android.media.metrics.PlaybackMetrics.PLAYBACK_TYPE_LIVE;
    public static final int PLAYBACK_TYPE_OTHER = android.media.metrics.PlaybackMetrics.PLAYBACK_TYPE_OTHER;
    public static final int PLAYBACK_TYPE_UNKNOWN = android.media.metrics.PlaybackMetrics.PLAYBACK_TYPE_UNKNOWN;
    public static final int PLAYBACK_TYPE_VOD = android.media.metrics.PlaybackMetrics.PLAYBACK_TYPE_VOD;
    public static final int STREAM_SOURCE_DEVICE = android.media.metrics.PlaybackMetrics.STREAM_SOURCE_DEVICE;
    public static final int STREAM_SOURCE_MIXED = android.media.metrics.PlaybackMetrics.STREAM_SOURCE_MIXED;
    public static final int STREAM_SOURCE_UNKNOWN = android.media.metrics.PlaybackMetrics.STREAM_SOURCE_UNKNOWN;
    public static final int STREAM_TYPE_DASH = android.media.metrics.PlaybackMetrics.STREAM_TYPE_DASH;
    public static final int STREAM_TYPE_HLS = android.media.metrics.PlaybackMetrics.STREAM_TYPE_HLS;
    public static final int STREAM_TYPE_OTHER = android.media.metrics.PlaybackMetrics.STREAM_TYPE_OTHER;
    public static final int STREAM_TYPE_PROGRESSIVE = android.media.metrics.PlaybackMetrics.STREAM_TYPE_PROGRESSIVE;
    public static final int STREAM_TYPE_SS = android.media.metrics.PlaybackMetrics.STREAM_TYPE_SS;
    public static final int STREAM_TYPE_UNKNOWN = android.media.metrics.PlaybackMetrics.STREAM_TYPE_UNKNOWN;

    public static final class Builder {
        private final android.media.metrics.PlaybackMetrics.Builder real;

        public Builder(android.media.metrics.PlaybackMetrics.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder wrap(android.media.metrics.PlaybackMetrics.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder(real);
        }

        public android.media.metrics.PlaybackMetrics.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.media.metrics.PlaybackMetrics.Builder());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder addExperimentId(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.addExperimentId(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics build() {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setAudioUnderrunCount(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setAudioUnderrunCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setContentType(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setContentType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setDrmSessionId(byte[] arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setDrmSessionId(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setDrmType(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setDrmType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setLocalBytesRead(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setLocalBytesRead(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setMediaDurationMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setMediaDurationMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setMetricsBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setMetricsBundle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setNetworkBytesRead(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.metrics.PlaybackMetrics$Builder#setNetworkBytesRead(long)");
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setNetworkTransferDurationMillis(long arg0) {
            throw new UnsupportedOperationException("Blocked by wrapper security policy: android.media.metrics.PlaybackMetrics$Builder#setNetworkTransferDurationMillis(long)");
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setPlaybackType(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setPlaybackType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setPlayerName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setPlayerName(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setPlayerVersion(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setPlayerVersion(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setStreamSource(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setStreamSource(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setStreamType(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setStreamType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setVideoFramesDropped(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setVideoFramesDropped(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder setVideoFramesPlayed(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackMetrics.Builder.wrap(real.setVideoFramesPlayed(arg0));
        }

    }
}
