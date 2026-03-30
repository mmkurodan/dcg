// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.session;

public final class MediaSession {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaSession(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.session.MediaSession wrap(android.media.session.MediaSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSession(real, (__DcgwBridgeToken) null);
    }

    public android.media.session.MediaSession getReal() {
        return (android.media.session.MediaSession) real;
    }

    public android.media.session.MediaSession unwrap() {
        return getReal();
    }

    public MediaSession(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        this(new android.media.session.MediaSession(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public MediaSession(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        this(new android.media.session.MediaSession(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaController getController() {
        return com.micklab.dcg.wrapper.android.media.session.MediaController.wrap(((android.media.session.MediaSession) real).getController());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo.wrap(((android.media.session.MediaSession) real).getCurrentControllerInfo());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSession.Token getSessionToken() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSession.Token.wrap(((android.media.session.MediaSession) real).getSessionToken());
    }

    public boolean isActive() {
        return ((android.media.session.MediaSession) real).isActive();
    }

    public void release() {
        ((android.media.session.MediaSession) real).release();
    }

    public void sendSessionEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.media.session.MediaSession) real).sendSessionEvent(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setActive(boolean arg0) {
        ((android.media.session.MediaSession) real).setActive(arg0);
    }

    public void setCallback(com.micklab.dcg.wrapper.android.media.session.MediaSession.Callback arg0) {
        ((android.media.session.MediaSession) real).setCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setCallback(com.micklab.dcg.wrapper.android.media.session.MediaSession.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.session.MediaSession) real).setCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.media.session.MediaSession) real).setExtras(arg0 == null ? null : arg0.getReal());
    }

    public void setFlags(int arg0) {
        ((android.media.session.MediaSession) real).setFlags(arg0);
    }

    public void setMediaButtonBroadcastReceiver(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        ((android.media.session.MediaSession) real).setMediaButtonBroadcastReceiver(arg0 == null ? null : arg0.getReal());
    }

    public void setMediaButtonReceiver(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        ((android.media.session.MediaSession) real).setMediaButtonReceiver(arg0 == null ? null : arg0.getReal());
    }

    public void setMetadata(com.micklab.dcg.wrapper.android.media.MediaMetadata arg0) {
        ((android.media.session.MediaSession) real).setMetadata(arg0 == null ? null : arg0.getReal());
    }

    public void setPlaybackState(com.micklab.dcg.wrapper.android.media.session.PlaybackState arg0) {
        ((android.media.session.MediaSession) real).setPlaybackState(arg0 == null ? null : arg0.getReal());
    }

    public void setPlaybackToLocal(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) {
        ((android.media.session.MediaSession) real).setPlaybackToLocal(arg0 == null ? null : arg0.getReal());
    }

    public void setPlaybackToRemote(com.micklab.dcg.wrapper.android.media.VolumeProvider arg0) {
        ((android.media.session.MediaSession) real).setPlaybackToRemote(arg0 == null ? null : arg0.getReal());
    }

    public void setQueueTitle(java.lang.CharSequence arg0) {
        ((android.media.session.MediaSession) real).setQueueTitle(arg0);
    }

    public void setRatingType(int arg0) {
        ((android.media.session.MediaSession) real).setRatingType(arg0);
    }

    public void setSessionActivity(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        ((android.media.session.MediaSession) real).setSessionActivity(arg0 == null ? null : arg0.getReal());
    }

    public static final int FLAG_HANDLES_MEDIA_BUTTONS = android.media.session.MediaSession.FLAG_HANDLES_MEDIA_BUTTONS;
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = android.media.session.MediaSession.FLAG_HANDLES_TRANSPORT_CONTROLS;

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSession.Callback wrap(android.media.session.MediaSession.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSession.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.media.session.MediaSession.Callback getReal() {
            return (android.media.session.MediaSession.Callback) real;
        }

        public android.media.session.MediaSession.Callback unwrap() {
            return getReal();
        }

        public void onCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.ResultReceiver arg2) {
            ((android.media.session.MediaSession.Callback) real).onCommand(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
        }

        public void onCustomAction(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.session.MediaSession.Callback) real).onCustomAction(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onFastForward() {
            ((android.media.session.MediaSession.Callback) real).onFastForward();
        }

        public boolean onMediaButtonEvent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            return ((android.media.session.MediaSession.Callback) real).onMediaButtonEvent(arg0 == null ? null : arg0.getReal());
        }

        public void onPause() {
            ((android.media.session.MediaSession.Callback) real).onPause();
        }

        public void onPlay() {
            ((android.media.session.MediaSession.Callback) real).onPlay();
        }

        public void onPlayFromMediaId(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.session.MediaSession.Callback) real).onPlayFromMediaId(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onPlayFromSearch(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.session.MediaSession.Callback) real).onPlayFromSearch(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onPlayFromUri(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.session.MediaSession.Callback) real).onPlayFromUri(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onPrepare() {
            ((android.media.session.MediaSession.Callback) real).onPrepare();
        }

        public void onPrepareFromMediaId(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.session.MediaSession.Callback) real).onPrepareFromMediaId(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onPrepareFromSearch(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.session.MediaSession.Callback) real).onPrepareFromSearch(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onPrepareFromUri(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.session.MediaSession.Callback) real).onPrepareFromUri(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onRewind() {
            ((android.media.session.MediaSession.Callback) real).onRewind();
        }

        public void onSeekTo(long arg0) {
            ((android.media.session.MediaSession.Callback) real).onSeekTo(arg0);
        }

        public void onSetPlaybackSpeed(float arg0) {
            ((android.media.session.MediaSession.Callback) real).onSetPlaybackSpeed(arg0);
        }

        public void onSetRating(com.micklab.dcg.wrapper.android.media.Rating arg0) {
            ((android.media.session.MediaSession.Callback) real).onSetRating(arg0 == null ? null : arg0.getReal());
        }

        public void onSkipToNext() {
            ((android.media.session.MediaSession.Callback) real).onSkipToNext();
        }

        public void onSkipToPrevious() {
            ((android.media.session.MediaSession.Callback) real).onSkipToPrevious();
        }

        public void onSkipToQueueItem(long arg0) {
            ((android.media.session.MediaSession.Callback) real).onSkipToQueueItem(arg0);
        }

        public void onStop() {
            ((android.media.session.MediaSession.Callback) real).onStop();
        }

    }
    public static final class QueueItem {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private QueueItem(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSession.QueueItem wrap(android.media.session.MediaSession.QueueItem real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSession.QueueItem(real, (__DcgwBridgeToken) null);
        }

        public android.media.session.MediaSession.QueueItem getReal() {
            return (android.media.session.MediaSession.QueueItem) real;
        }

        public android.media.session.MediaSession.QueueItem unwrap() {
            return getReal();
        }

        public QueueItem(com.micklab.dcg.wrapper.android.media.MediaDescription arg0, long arg1) {
            this(new android.media.session.MediaSession.QueueItem(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
        }

        public int describeContents() {
            return ((android.media.session.MediaSession.QueueItem) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.media.session.MediaSession.QueueItem) real).equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription getDescription() {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.wrap(((android.media.session.MediaSession.QueueItem) real).getDescription());
        }

        public long getQueueId() {
            return ((android.media.session.MediaSession.QueueItem) real).getQueueId();
        }

        public java.lang.String toString() {
            return ((android.media.session.MediaSession.QueueItem) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.media.session.MediaSession.QueueItem) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int UNKNOWN_ID = android.media.session.MediaSession.QueueItem.UNKNOWN_ID;

    }
    public static final class Token {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Token(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSession.Token wrap(android.media.session.MediaSession.Token real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSession.Token(real, (__DcgwBridgeToken) null);
        }

        public android.media.session.MediaSession.Token getReal() {
            return (android.media.session.MediaSession.Token) real;
        }

        public android.media.session.MediaSession.Token unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.media.session.MediaSession.Token) real).describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return ((android.media.session.MediaSession.Token) real).equals(arg0);
        }

        public int hashCode() {
            return ((android.media.session.MediaSession.Token) real).hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.media.session.MediaSession.Token) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }


    }
}
