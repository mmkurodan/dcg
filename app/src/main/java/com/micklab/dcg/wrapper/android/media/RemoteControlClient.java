// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class RemoteControlClient {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RemoteControlClient(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.RemoteControlClient wrap(android.media.RemoteControlClient real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteControlClient(real, (__DcgwBridgeToken) null);
    }

    public android.media.RemoteControlClient getReal() {
        return (android.media.RemoteControlClient) real;
    }

    public android.media.RemoteControlClient unwrap() {
        return getReal();
    }

    public RemoteControlClient(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        this(new android.media.RemoteControlClient(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public RemoteControlClient(com.micklab.dcg.wrapper.android.app.PendingIntent arg0, com.micklab.dcg.wrapper.android.os.Looper arg1) {
        this(new android.media.RemoteControlClient(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.media.RemoteControlClient.MetadataEditor editMetadata(boolean arg0) {
        return com.micklab.dcg.wrapper.android.media.RemoteControlClient.MetadataEditor.wrap(((android.media.RemoteControlClient) real).editMetadata(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSession getMediaSession() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSession.wrap(((android.media.RemoteControlClient) real).getMediaSession());
    }

    public void setMetadataUpdateListener(com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnMetadataUpdateListener arg0) {
        ((android.media.RemoteControlClient) real).setMetadataUpdateListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnGetPlaybackPositionListener(com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnGetPlaybackPositionListener arg0) {
        ((android.media.RemoteControlClient) real).setOnGetPlaybackPositionListener(arg0 == null ? null : arg0.getReal());
    }

    public void setPlaybackPositionUpdateListener(com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnPlaybackPositionUpdateListener arg0) {
        ((android.media.RemoteControlClient) real).setPlaybackPositionUpdateListener(arg0 == null ? null : arg0.getReal());
    }

    public void setPlaybackState(int arg0) {
        ((android.media.RemoteControlClient) real).setPlaybackState(arg0);
    }

    public void setPlaybackState(int arg0, long arg1, float arg2) {
        ((android.media.RemoteControlClient) real).setPlaybackState(arg0, arg1, arg2);
    }

    public void setTransportControlFlags(int arg0) {
        ((android.media.RemoteControlClient) real).setTransportControlFlags(arg0);
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

    public static final class MetadataEditor {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MetadataEditor(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RemoteControlClient.MetadataEditor wrap(android.media.RemoteControlClient.MetadataEditor real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteControlClient.MetadataEditor(real, (__DcgwBridgeToken) null);
        }

        public android.media.RemoteControlClient.MetadataEditor getReal() {
            return (android.media.RemoteControlClient.MetadataEditor) real;
        }

        public android.media.RemoteControlClient.MetadataEditor unwrap() {
            return getReal();
        }

        public void apply() {
            ((android.media.RemoteControlClient.MetadataEditor) real).apply();
        }

        public void clear() {
            ((android.media.RemoteControlClient.MetadataEditor) real).clear();
        }

        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            return ((android.media.RemoteControlClient.MetadataEditor) real).clone();
        }

        public com.micklab.dcg.wrapper.android.media.RemoteControlClient.MetadataEditor putBitmap(int arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.RemoteControlClient.MetadataEditor.wrap(((android.media.RemoteControlClient.MetadataEditor) real).putBitmap(arg0, arg1 == null ? null : arg1.getReal()));
        }

        public com.micklab.dcg.wrapper.android.media.RemoteControlClient.MetadataEditor putLong(int arg0, long arg1) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.RemoteControlClient.MetadataEditor.wrap(((android.media.RemoteControlClient.MetadataEditor) real).putLong(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.media.RemoteControlClient.MetadataEditor putObject(int arg0, java.lang.Object arg1) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.RemoteControlClient.MetadataEditor.wrap(((android.media.RemoteControlClient.MetadataEditor) real).putObject(arg0, arg1));
        }

        public com.micklab.dcg.wrapper.android.media.RemoteControlClient.MetadataEditor putString(int arg0, java.lang.String arg1) throws java.lang.IllegalArgumentException {
            return com.micklab.dcg.wrapper.android.media.RemoteControlClient.MetadataEditor.wrap(((android.media.RemoteControlClient.MetadataEditor) real).putString(arg0, arg1));
        }

        public static final int BITMAP_KEY_ARTWORK = android.media.RemoteControlClient.MetadataEditor.BITMAP_KEY_ARTWORK;

    }
    public static final class OnGetPlaybackPositionListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnGetPlaybackPositionListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnGetPlaybackPositionListener wrap(android.media.RemoteControlClient.OnGetPlaybackPositionListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnGetPlaybackPositionListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.RemoteControlClient.OnGetPlaybackPositionListener getReal() {
            return (android.media.RemoteControlClient.OnGetPlaybackPositionListener) real;
        }

        public android.media.RemoteControlClient.OnGetPlaybackPositionListener unwrap() {
            return getReal();
        }

        public long onGetPlaybackPosition() {
            return ((android.media.RemoteControlClient.OnGetPlaybackPositionListener) real).onGetPlaybackPosition();
        }

    }
    public static final class OnMetadataUpdateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnMetadataUpdateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnMetadataUpdateListener wrap(android.media.RemoteControlClient.OnMetadataUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnMetadataUpdateListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.RemoteControlClient.OnMetadataUpdateListener getReal() {
            return (android.media.RemoteControlClient.OnMetadataUpdateListener) real;
        }

        public android.media.RemoteControlClient.OnMetadataUpdateListener unwrap() {
            return getReal();
        }

        public void onMetadataUpdate(int arg0, java.lang.Object arg1) {
            ((android.media.RemoteControlClient.OnMetadataUpdateListener) real).onMetadataUpdate(arg0, arg1);
        }

    }
    public static final class OnPlaybackPositionUpdateListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnPlaybackPositionUpdateListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnPlaybackPositionUpdateListener wrap(android.media.RemoteControlClient.OnPlaybackPositionUpdateListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.RemoteControlClient.OnPlaybackPositionUpdateListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.RemoteControlClient.OnPlaybackPositionUpdateListener getReal() {
            return (android.media.RemoteControlClient.OnPlaybackPositionUpdateListener) real;
        }

        public android.media.RemoteControlClient.OnPlaybackPositionUpdateListener unwrap() {
            return getReal();
        }

        public void onPlaybackPositionUpdate(long arg0) {
            ((android.media.RemoteControlClient.OnPlaybackPositionUpdateListener) real).onPlaybackPositionUpdate(arg0);
        }

    }
}
