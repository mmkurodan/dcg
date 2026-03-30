// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.metrics;

public final class PlaybackStateEvent {
    private final android.media.metrics.PlaybackStateEvent real;

    public PlaybackStateEvent(android.media.metrics.PlaybackStateEvent real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent wrap(android.media.metrics.PlaybackStateEvent real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent(real);
    }

    public android.media.metrics.PlaybackStateEvent unwrap() {
        return real;
    }

    public int describeContents() {
        return real.describeContents();
    }

    public boolean equals(java.lang.Object arg0) {
        return real.equals(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getMetricsBundle() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getMetricsBundle());
    }

    public int getState() {
        return real.getState();
    }

    public long getTimeSinceCreatedMillis() {
        return real.getTimeSinceCreatedMillis();
    }

    public int hashCode() {
        return real.hashCode();
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int STATE_ABANDONED = android.media.metrics.PlaybackStateEvent.STATE_ABANDONED;
    public static final int STATE_BUFFERING = android.media.metrics.PlaybackStateEvent.STATE_BUFFERING;
    public static final int STATE_ENDED = android.media.metrics.PlaybackStateEvent.STATE_ENDED;
    public static final int STATE_FAILED = android.media.metrics.PlaybackStateEvent.STATE_FAILED;
    public static final int STATE_INTERRUPTED_BY_AD = android.media.metrics.PlaybackStateEvent.STATE_INTERRUPTED_BY_AD;
    public static final int STATE_JOINING_BACKGROUND = android.media.metrics.PlaybackStateEvent.STATE_JOINING_BACKGROUND;
    public static final int STATE_JOINING_FOREGROUND = android.media.metrics.PlaybackStateEvent.STATE_JOINING_FOREGROUND;
    public static final int STATE_NOT_STARTED = android.media.metrics.PlaybackStateEvent.STATE_NOT_STARTED;
    public static final int STATE_PAUSED = android.media.metrics.PlaybackStateEvent.STATE_PAUSED;
    public static final int STATE_PAUSED_BUFFERING = android.media.metrics.PlaybackStateEvent.STATE_PAUSED_BUFFERING;
    public static final int STATE_PLAYING = android.media.metrics.PlaybackStateEvent.STATE_PLAYING;
    public static final int STATE_SEEKING = android.media.metrics.PlaybackStateEvent.STATE_SEEKING;
    public static final int STATE_STOPPED = android.media.metrics.PlaybackStateEvent.STATE_STOPPED;
    public static final int STATE_SUPPRESSED = android.media.metrics.PlaybackStateEvent.STATE_SUPPRESSED;
    public static final int STATE_SUPPRESSED_BUFFERING = android.media.metrics.PlaybackStateEvent.STATE_SUPPRESSED_BUFFERING;

    public static final class Builder {
        private final android.media.metrics.PlaybackStateEvent.Builder real;

        public Builder(android.media.metrics.PlaybackStateEvent.Builder real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent.Builder wrap(android.media.metrics.PlaybackStateEvent.Builder real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent.Builder(real);
        }

        public android.media.metrics.PlaybackStateEvent.Builder unwrap() {
            return real;
        }

        public Builder() {
            this(new android.media.metrics.PlaybackStateEvent.Builder());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent build() {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent.wrap(real.build());
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent.Builder setMetricsBundle(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent.Builder.wrap(real.setMetricsBundle(arg0 == null ? null : arg0.unwrap()));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent.Builder setState(int arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent.Builder.wrap(real.setState(arg0));
        }

        public com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent.Builder setTimeSinceCreatedMillis(long arg0) {
            return com.micklab.dcg.wrapper.android.media.metrics.PlaybackStateEvent.Builder.wrap(real.setTimeSinceCreatedMillis(arg0));
        }

    }
}
