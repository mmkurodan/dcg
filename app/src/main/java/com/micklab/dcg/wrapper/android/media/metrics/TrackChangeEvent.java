// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class TrackChangeEvent {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TrackChangeEvent(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent wrap(android.media.metrics.TrackChangeEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent(real, (__DcgwBridgeToken) null);
    }

    public android.media.metrics.TrackChangeEvent getReal() {
        return (android.media.metrics.TrackChangeEvent) real;
    }

    public android.media.metrics.TrackChangeEvent unwrap() {
        return getReal();
    }

    public int describeContents() {
        return ((android.media.metrics.TrackChangeEvent) real).describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return ((android.media.metrics.TrackChangeEvent) real).equals(arg0);
    }

    public int getAudioSampleRate() {
        return ((android.media.metrics.TrackChangeEvent) real).getAudioSampleRate();
    }

    public int getBitrate() {
        return ((android.media.metrics.TrackChangeEvent) real).getBitrate();
    }

    public int getChannelCount() {
        return ((android.media.metrics.TrackChangeEvent) real).getChannelCount();
    }

    public java.lang.String getCodecName() {
        return ((android.media.metrics.TrackChangeEvent) real).getCodecName();
    }

    public java.lang.String getContainerMimeType() {
        return ((android.media.metrics.TrackChangeEvent) real).getContainerMimeType();
    }

    public int getHeight() {
        return ((android.media.metrics.TrackChangeEvent) real).getHeight();
    }

    public java.lang.String getLanguage() {
        return ((android.media.metrics.TrackChangeEvent) real).getLanguage();
    }

    public java.lang.String getLanguageRegion() {
        return ((android.media.metrics.TrackChangeEvent) real).getLanguageRegion();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getMetricsBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.metrics.TrackChangeEvent) real).getMetricsBundle());
    }

    public java.lang.String getSampleMimeType() {
        return ((android.media.metrics.TrackChangeEvent) real).getSampleMimeType();
    }

    public long getTimeSinceCreatedMillis() {
        return ((android.media.metrics.TrackChangeEvent) real).getTimeSinceCreatedMillis();
    }

    public int getTrackChangeReason() {
        return ((android.media.metrics.TrackChangeEvent) real).getTrackChangeReason();
    }

    public int getTrackState() {
        return ((android.media.metrics.TrackChangeEvent) real).getTrackState();
    }

    public int getTrackType() {
        return ((android.media.metrics.TrackChangeEvent) real).getTrackType();
    }

    public float getVideoFrameRate() {
        return ((android.media.metrics.TrackChangeEvent) real).getVideoFrameRate();
    }

    public int getWidth() {
        return ((android.media.metrics.TrackChangeEvent) real).getWidth();
    }

    public int hashCode() {
        return ((android.media.metrics.TrackChangeEvent) real).hashCode();
    }

    public java.lang.String toString() {
        return ((android.media.metrics.TrackChangeEvent) real).toString();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.media.metrics.TrackChangeEvent) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int TRACK_CHANGE_REASON_ADAPTIVE = android.media.metrics.TrackChangeEvent.TRACK_CHANGE_REASON_ADAPTIVE;
    public static final int TRACK_CHANGE_REASON_INITIAL = android.media.metrics.TrackChangeEvent.TRACK_CHANGE_REASON_INITIAL;
    public static final int TRACK_CHANGE_REASON_MANUAL = android.media.metrics.TrackChangeEvent.TRACK_CHANGE_REASON_MANUAL;
    public static final int TRACK_CHANGE_REASON_OTHER = android.media.metrics.TrackChangeEvent.TRACK_CHANGE_REASON_OTHER;
    public static final int TRACK_CHANGE_REASON_UNKNOWN = android.media.metrics.TrackChangeEvent.TRACK_CHANGE_REASON_UNKNOWN;
    public static final int TRACK_STATE_OFF = android.media.metrics.TrackChangeEvent.TRACK_STATE_OFF;
    public static final int TRACK_STATE_ON = android.media.metrics.TrackChangeEvent.TRACK_STATE_ON;
    public static final int TRACK_TYPE_AUDIO = android.media.metrics.TrackChangeEvent.TRACK_TYPE_AUDIO;
    public static final int TRACK_TYPE_TEXT = android.media.metrics.TrackChangeEvent.TRACK_TYPE_TEXT;
    public static final int TRACK_TYPE_VIDEO = android.media.metrics.TrackChangeEvent.TRACK_TYPE_VIDEO;

    public static final class Builder {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Builder(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder wrap(android.media.metrics.TrackChangeEvent.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder(real, (__DcgwBridgeToken) null);
        }

        public android.media.metrics.TrackChangeEvent.Builder getReal() {
            return (android.media.metrics.TrackChangeEvent.Builder) real;
        }

        public android.media.metrics.TrackChangeEvent.Builder unwrap() {
            return getReal();
        }

        public Builder(int arg0) {
            this(new android.media.metrics.TrackChangeEvent.Builder(arg0), (__DcgwBridgeToken) null);
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent build() {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).build());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setAudioSampleRate(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setAudioSampleRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setBitrate(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setBitrate(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setChannelCount(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setChannelCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setCodecName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setCodecName(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setContainerMimeType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setContainerMimeType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setHeight(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setHeight(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setLanguageRegion(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setLanguageRegion(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setMetricsBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setMetricsBundle(arg0 == null ? null : arg0.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setSampleMimeType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setSampleMimeType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setTimeSinceCreatedMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setTimeSinceCreatedMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setTrackChangeReason(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setTrackChangeReason(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setTrackState(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setTrackState(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setVideoFrameRate(float arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setVideoFrameRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setWidth(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(((android.media.metrics.TrackChangeEvent.Builder) real).setWidth(arg0));
        }

    }
}
