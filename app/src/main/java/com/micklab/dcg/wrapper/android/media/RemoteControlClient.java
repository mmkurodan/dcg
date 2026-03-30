// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class RemoteControlClient {
    private final android.media.RemoteControlClient real;

    public RemoteControlClient(android.media.RemoteControlClient real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.RemoteControlClient wrap(android.media.RemoteControlClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteControlClient(real);
    }

    public android.media.RemoteControlClient unwrap() {
        return real;
    }

    public RemoteControlClient(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        this(new android.media.RemoteControlClient(arg0 == null ? null : arg0.unwrap()));
    }

    public RemoteControlClient(com.micklab.dcg.wrapper.android.app.PendingIntent arg0, com.micklab.dcg.wrapper.android.os.Looper arg1) {
        this(new android.media.RemoteControlClient(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public android.media.RemoteControlClient.MetadataEditor editMetadata(boolean arg0) {
        return real.editMetadata(arg0);
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSession getMediaSession() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSession.wrap(real.getMediaSession());
    }

    public void setMetadataUpdateListener(com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnMetadataUpdateListener arg0) {
        real.setMetadataUpdateListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnGetPlaybackPositionListener(com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnGetPlaybackPositionListener arg0) {
        real.setOnGetPlaybackPositionListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPlaybackPositionUpdateListener(com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnPlaybackPositionUpdateListener arg0) {
        real.setPlaybackPositionUpdateListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setPlaybackState(int arg0) {
        real.setPlaybackState(arg0);
    }

    public void setPlaybackState(int arg0, long arg1, float arg2) {
        real.setPlaybackState(arg0, arg1, arg2);
    }

    public void setTransportControlFlags(int arg0) {
        real.setTransportControlFlags(arg0);
    }

    public static final int FLAG_KEY_MEDIA_FAST_FORWARD = android.media.RemoteControlClient.FLAG_KEY_MEDIA_FAST_FORWARD;
    public static final int FLAG_KEY_MEDIA_NEXT = android.media.RemoteControlClient.FLAG_KEY_MEDIA_NEXT;
    public static final int FLAG_KEY_MEDIA_PAUSE = android.media.RemoteControlClient.FLAG_KEY_MEDIA_PAUSE;
    public static final int FLAG_KEY_MEDIA_PLAY = android.media.RemoteControlClient.FLAG_KEY_MEDIA_PLAY;
    public static final int FLAG_KEY_MEDIA_PLAY_PAUSE = android.media.RemoteControlClient.FLAG_KEY_MEDIA_PLAY_PAUSE;
    public static final int FLAG_KEY_MEDIA_POSITION_UPDATE = android.media.RemoteControlClient.FLAG_KEY_MEDIA_POSITION_UPDATE;
    public static final int FLAG_KEY_MEDIA_PREVIOUS = android.media.RemoteControlClient.FLAG_KEY_MEDIA_PREVIOUS;
    public static final int FLAG_KEY_MEDIA_RATING = android.media.RemoteControlClient.FLAG_KEY_MEDIA_RATING;
    public static final int FLAG_KEY_MEDIA_REWIND = android.media.RemoteControlClient.FLAG_KEY_MEDIA_REWIND;
    public static final int FLAG_KEY_MEDIA_STOP = android.media.RemoteControlClient.FLAG_KEY_MEDIA_STOP;
    public static final int PLAYSTATE_BUFFERING = android.media.RemoteControlClient.PLAYSTATE_BUFFERING;
    public static final int PLAYSTATE_ERROR = android.media.RemoteControlClient.PLAYSTATE_ERROR;
    public static final int PLAYSTATE_FAST_FORWARDING = android.media.RemoteControlClient.PLAYSTATE_FAST_FORWARDING;
    public static final int PLAYSTATE_PAUSED = android.media.RemoteControlClient.PLAYSTATE_PAUSED;
    public static final int PLAYSTATE_PLAYING = android.media.RemoteControlClient.PLAYSTATE_PLAYING;
    public static final int PLAYSTATE_REWINDING = android.media.RemoteControlClient.PLAYSTATE_REWINDING;
    public static final int PLAYSTATE_SKIPPING_BACKWARDS = android.media.RemoteControlClient.PLAYSTATE_SKIPPING_BACKWARDS;
    public static final int PLAYSTATE_SKIPPING_FORWARDS = android.media.RemoteControlClient.PLAYSTATE_SKIPPING_FORWARDS;
    public static final int PLAYSTATE_STOPPED = android.media.RemoteControlClient.PLAYSTATE_STOPPED;

    public static final class OnGetPlaybackPositionListener {
        private final android.media.RemoteControlClient.OnGetPlaybackPositionListener real;

        public OnGetPlaybackPositionListener(android.media.RemoteControlClient.OnGetPlaybackPositionListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnGetPlaybackPositionListener wrap(android.media.RemoteControlClient.OnGetPlaybackPositionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnGetPlaybackPositionListener(real);
        }

        public android.media.RemoteControlClient.OnGetPlaybackPositionListener unwrap() {
            return real;
        }

        public long onGetPlaybackPosition() {
            return real.onGetPlaybackPosition();
        }

    }
    public static final class OnMetadataUpdateListener {
        private final android.media.RemoteControlClient.OnMetadataUpdateListener real;

        public OnMetadataUpdateListener(android.media.RemoteControlClient.OnMetadataUpdateListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnMetadataUpdateListener wrap(android.media.RemoteControlClient.OnMetadataUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnMetadataUpdateListener(real);
        }

        public android.media.RemoteControlClient.OnMetadataUpdateListener unwrap() {
            return real;
        }

        public void onMetadataUpdate(int arg0, java.lang.Object arg1) {
            real.onMetadataUpdate(arg0, arg1);
        }

    }
    public static final class OnPlaybackPositionUpdateListener {
        private final android.media.RemoteControlClient.OnPlaybackPositionUpdateListener real;

        public OnPlaybackPositionUpdateListener(android.media.RemoteControlClient.OnPlaybackPositionUpdateListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnPlaybackPositionUpdateListener wrap(android.media.RemoteControlClient.OnPlaybackPositionUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnPlaybackPositionUpdateListener(real);
        }

        public android.media.RemoteControlClient.OnPlaybackPositionUpdateListener unwrap() {
            return real;
        }

        public void onPlaybackPositionUpdate(long arg0) {
            real.onPlaybackPositionUpdate(arg0);
        }

    }
}
