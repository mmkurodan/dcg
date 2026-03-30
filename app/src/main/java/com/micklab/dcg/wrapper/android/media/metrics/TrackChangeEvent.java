// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class TrackChangeEvent {
    private final android.media.metrics.TrackChangeEvent real;

    public TrackChangeEvent(android.media.metrics.TrackChangeEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent wrap(android.media.metrics.TrackChangeEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent(real);
    }

    public android.media.metrics.TrackChangeEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public int getAudioSampleRate() {
        return real.getAudioSampleRate();
    }

    public int getBitrate() {
        return real.getBitrate();
    }

    public int getChannelCount() {
        return real.getChannelCount();
    }

    public java.lang.String getCodecName() {
        return real.getCodecName();
    }

    public java.lang.String getContainerMimeType() {
        return real.getContainerMimeType();
    }

    public int getHeight() {
        return real.getHeight();
    }

    public java.lang.String getLanguage() {
        return real.getLanguage();
    }

    public java.lang.String getLanguageRegion() {
        return real.getLanguageRegion();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getMetricsBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getMetricsBundle());
    }

    public java.lang.String getSampleMimeType() {
        return real.getSampleMimeType();
    }

    public long getTimeSinceCreatedMillis() {
        return real.getTimeSinceCreatedMillis();
    }

    public int getTrackChangeReason() {
        return real.getTrackChangeReason();
    }

    public int getTrackState() {
        return real.getTrackState();
    }

    public int getTrackType() {
        return real.getTrackType();
    }

    public float getVideoFrameRate() {
        return real.getVideoFrameRate();
    }

    public int getWidth() {
        return real.getWidth();
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
        private final android.media.metrics.TrackChangeEvent.Builder real;

        public Builder(android.media.metrics.TrackChangeEvent.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder wrap(android.media.metrics.TrackChangeEvent.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder(real);
        }

        public android.media.metrics.TrackChangeEvent.Builder unwrap() {
            return real;
        }

        public Builder(int arg0) {
            this(new android.media.metrics.TrackChangeEvent.Builder(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent build() {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setAudioSampleRate(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setAudioSampleRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setBitrate(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setBitrate(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setChannelCount(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setChannelCount(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setCodecName(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setCodecName(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setContainerMimeType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setContainerMimeType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setHeight(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setHeight(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setLanguage(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setLanguage(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setLanguageRegion(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setLanguageRegion(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setMetricsBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setMetricsBundle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setSampleMimeType(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setSampleMimeType(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setTimeSinceCreatedMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setTimeSinceCreatedMillis(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setTrackChangeReason(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setTrackChangeReason(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setTrackState(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setTrackState(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setVideoFrameRate(float arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setVideoFrameRate(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder setWidth(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.TrackChangeEvent.Builder.wrap(real.setWidth(arg0));
        }

    }
}
