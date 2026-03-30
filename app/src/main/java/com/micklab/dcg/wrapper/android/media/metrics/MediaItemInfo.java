// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class MediaItemInfo {
    private final android.media.metrics.MediaItemInfo real;

    public MediaItemInfo(android.media.metrics.MediaItemInfo real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo wrap(android.media.metrics.MediaItemInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo(real);
    }

    public android.media.metrics.MediaItemInfo unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getAudioChannelCount() {
        return real.getAudioChannelCount();
    }

    public long getAudioSampleCount() {
        return real.getAudioSampleCount();
    }

    public int getAudioSampleRateHz() {
        return real.getAudioSampleRateHz();
    }

    public long getClipDurationMillis() {
        return real.getClipDurationMillis();
    }

    public java.lang.String getContainerMimeType() {
        return real.getContainerMimeType();
    }

    public long getDataTypes() {
        return real.getDataTypes();
    }

    public long getDurationMillis() {
        return real.getDurationMillis();
    }

    public int getSourceType() {
        return real.getSourceType();
    }

    public int getVideoDataSpace() {
        return real.getVideoDataSpace();
    }

    public float getVideoFrameRate() {
        return real.getVideoFrameRate();
    }

    public long getVideoSampleCount() {
        return real.getVideoSampleCount();
    }

    public com.micklab.dcg.wrapper.android.util.Size getVideoSize() {
        return com.micklab.dcg.wrapper.android.util.Size.wrap(real.getVideoSize());
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

    public static final long DATA_TYPE_AUDIO = android.media.metrics.MediaItemInfo.DATA_TYPE_AUDIO;
    public static final long DATA_TYPE_DEPTH = android.media.metrics.MediaItemInfo.DATA_TYPE_DEPTH;
    public static final long DATA_TYPE_GAIN_MAP = android.media.metrics.MediaItemInfo.DATA_TYPE_GAIN_MAP;
    public static final long DATA_TYPE_GAPLESS = android.media.metrics.MediaItemInfo.DATA_TYPE_GAPLESS;
    public static final long DATA_TYPE_HIGH_DYNAMIC_RANGE_VIDEO = android.media.metrics.MediaItemInfo.DATA_TYPE_HIGH_DYNAMIC_RANGE_VIDEO;
    public static final long DATA_TYPE_HIGH_FRAME_RATE = android.media.metrics.MediaItemInfo.DATA_TYPE_HIGH_FRAME_RATE;
    public static final long DATA_TYPE_IMAGE = android.media.metrics.MediaItemInfo.DATA_TYPE_IMAGE;
    public static final long DATA_TYPE_METADATA = android.media.metrics.MediaItemInfo.DATA_TYPE_METADATA;
    public static final long DATA_TYPE_SPATIAL_AUDIO = android.media.metrics.MediaItemInfo.DATA_TYPE_SPATIAL_AUDIO;
    public static final long DATA_TYPE_SPEED_SETTING_CUE_POINTS = android.media.metrics.MediaItemInfo.DATA_TYPE_SPEED_SETTING_CUE_POINTS;
    public static final long DATA_TYPE_VIDEO = android.media.metrics.MediaItemInfo.DATA_TYPE_VIDEO;
    public static final int SOURCE_TYPE_CAMERA = android.media.metrics.MediaItemInfo.SOURCE_TYPE_CAMERA;
    public static final int SOURCE_TYPE_EDITING_SESSION = android.media.metrics.MediaItemInfo.SOURCE_TYPE_EDITING_SESSION;
    public static final int SOURCE_TYPE_GALLERY = android.media.metrics.MediaItemInfo.SOURCE_TYPE_GALLERY;
    public static final int SOURCE_TYPE_GENERATED = android.media.metrics.MediaItemInfo.SOURCE_TYPE_GENERATED;
    public static final int SOURCE_TYPE_REMOTE_LIVE_STREAM = android.media.metrics.MediaItemInfo.SOURCE_TYPE_REMOTE_LIVE_STREAM;
    public static final int SOURCE_TYPE_UNSPECIFIED = android.media.metrics.MediaItemInfo.SOURCE_TYPE_UNSPECIFIED;
    public static final int VALUE_UNSPECIFIED = android.media.metrics.MediaItemInfo.VALUE_UNSPECIFIED;

    public static final class Builder {
        private final android.media.metrics.MediaItemInfo.Builder real;

        public Builder(android.media.metrics.MediaItemInfo.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder wrap(android.media.metrics.MediaItemInfo.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder(real);
        }

        public android.media.metrics.MediaItemInfo.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.media.metrics.MediaItemInfo.Builder());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder addCodecName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.addCodecName(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder addDataType(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.addDataType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder addSampleMimeType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.addSampleMimeType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo build() {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder setAudioChannelCount(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.setAudioChannelCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder setAudioSampleCount(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.setAudioSampleCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder setAudioSampleRateHz(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.setAudioSampleRateHz(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder setClipDurationMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.setClipDurationMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder setContainerMimeType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.setContainerMimeType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder setDurationMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.setDurationMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder setSourceType(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.setSourceType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder setVideoDataSpace(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.setVideoDataSpace(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder setVideoFrameRate(float arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.setVideoFrameRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder setVideoSampleCount(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.setVideoSampleCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder setVideoSize(com.micklab.dcg.wrapper.android.util.Size arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.MediaItemInfo.Builder.wrap(real.setVideoSize(arg0 == null ? null : arg0.unwrap()));
        }

    }
}
