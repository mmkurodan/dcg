// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.session;

public final class MediaSession {
    private final android.media.session.MediaSession real;

    public MediaSession(android.media.session.MediaSession real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.session.MediaSession wrap(android.media.session.MediaSession real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSession(real);
    }

    public android.media.session.MediaSession unwrap() {
        return real;
    }

    public MediaSession(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1) {
        this(new android.media.session.MediaSession(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public MediaSession(com.micklab.dcg.wrapper.android.content.Context arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        this(new android.media.session.MediaSession(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaController getController() {
        return com.micklab.dcg.wrapper.android.media.session.MediaController.wrap(real.getController());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo getCurrentControllerInfo() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSessionManager.RemoteUserInfo.wrap(real.getCurrentControllerInfo());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSession.Token getSessionToken() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSession.Token.wrap(real.getSessionToken());
    }

    public boolean isActive() {
        return real.isActive();
    }

    public void release() {
        real.release();
    }

    public void sendSessionEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.sendSessionEvent(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setActive(boolean arg0) {
        real.setActive(arg0);
    }

    public void setCallback(com.micklab.dcg.wrapper.android.media.session.MediaSession.Callback arg0) {
        real.setCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setCallback(com.micklab.dcg.wrapper.android.media.session.MediaSession.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.setCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setExtras(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.setExtras(arg0 == null ? null : arg0.unwrap());
    }

    public void setFlags(int arg0) {
        real.setFlags(arg0);
    }

    public void setMediaButtonBroadcastReceiver(com.micklab.dcg.wrapper.android.content.ComponentName arg0) {
        real.setMediaButtonBroadcastReceiver(arg0 == null ? null : arg0.unwrap());
    }

    public void setMediaButtonReceiver(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        real.setMediaButtonReceiver(arg0 == null ? null : arg0.unwrap());
    }

    public void setMetadata(com.micklab.dcg.wrapper.android.media.MediaMetadata arg0) {
        real.setMetadata(arg0 == null ? null : arg0.unwrap());
    }

    public void setPlaybackState(com.micklab.dcg.wrapper.android.media.session.PlaybackState arg0) {
        real.setPlaybackState(arg0 == null ? null : arg0.unwrap());
    }

    public void setPlaybackToLocal(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) {
        real.setPlaybackToLocal(arg0 == null ? null : arg0.unwrap());
    }

    public void setPlaybackToRemote(com.micklab.dcg.wrapper.android.media.VolumeProvider arg0) {
        real.setPlaybackToRemote(arg0 == null ? null : arg0.unwrap());
    }

    public void setQueueTitle(java.lang.CharSequence arg0) {
        real.setQueueTitle(arg0);
    }

    public void setRatingType(int arg0) {
        real.setRatingType(arg0);
    }

    public void setSessionActivity(com.micklab.dcg.wrapper.android.app.PendingIntent arg0) {
        real.setSessionActivity(arg0 == null ? null : arg0.unwrap());
    }

    public static final int FLAG_HANDLES_MEDIA_BUTTONS = android.media.session.MediaSession.FLAG_HANDLES_MEDIA_BUTTONS;
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = android.media.session.MediaSession.FLAG_HANDLES_TRANSPORT_CONTROLS;

    public static final class Callback {
        private final android.media.session.MediaSession.Callback real;

        public Callback(android.media.session.MediaSession.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSession.Callback wrap(android.media.session.MediaSession.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSession.Callback(real);
        }

        public android.media.session.MediaSession.Callback unwrap() {
            return real;
        }

        public void onCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.ResultReceiver arg2) {
            real.onCommand(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
        }

        public void onCustomAction(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onCustomAction(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onFastForward() {
            real.onFastForward();
        }

        public boolean onMediaButtonEvent(com.micklab.dcg.wrapper.android.content.Intent arg0) {
            return real.onMediaButtonEvent(arg0 == null ? null : arg0.unwrap());
        }

        public void onPause() {
            real.onPause();
        }

        public void onPlay() {
            real.onPlay();
        }

        public void onPlayFromMediaId(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onPlayFromMediaId(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onPlayFromSearch(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onPlayFromSearch(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onPlayFromUri(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onPlayFromUri(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onPrepare() {
            real.onPrepare();
        }

        public void onPrepareFromMediaId(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onPrepareFromMediaId(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onPrepareFromSearch(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onPrepareFromSearch(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onPrepareFromUri(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onPrepareFromUri(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onRewind() {
            real.onRewind();
        }

        public void onSeekTo(long arg0) {
            real.onSeekTo(arg0);
        }

        public void onSetPlaybackSpeed(float arg0) {
            real.onSetPlaybackSpeed(arg0);
        }

        public void onSetRating(com.micklab.dcg.wrapper.android.media.Rating arg0) {
            real.onSetRating(arg0 == null ? null : arg0.unwrap());
        }

        public void onSkipToNext() {
            real.onSkipToNext();
        }

        public void onSkipToPrevious() {
            real.onSkipToPrevious();
        }

        public void onSkipToQueueItem(long arg0) {
            real.onSkipToQueueItem(arg0);
        }

        public void onStop() {
            real.onStop();
        }

    }
    public static final class QueueItem {
        private final android.media.session.MediaSession.QueueItem real;

        public QueueItem(android.media.session.MediaSession.QueueItem real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSession.QueueItem wrap(android.media.session.MediaSession.QueueItem real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSession.QueueItem(real);
        }

        public android.media.session.MediaSession.QueueItem unwrap() {
            return real;
        }

        public QueueItem(com.micklab.dcg.wrapper.android.media.MediaDescription arg0, long arg1) {
            this(new android.media.session.MediaSession.QueueItem(arg0 == null ? null : arg0.unwrap(), arg1));
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public com.micklab.dcg.wrapper.android.media.MediaDescription getDescription() {
            return com.micklab.dcg.wrapper.android.media.MediaDescription.wrap(real.getDescription());
        }

        public long getQueueId() {
            return real.getQueueId();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int UNKNOWN_ID = android.media.session.MediaSession.QueueItem.UNKNOWN_ID;

    }
    public static final class Token {
        private final android.media.session.MediaSession.Token real;

        public Token(android.media.session.MediaSession.Token real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaSession.Token wrap(android.media.session.MediaSession.Token real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaSession.Token(real);
        }

        public android.media.session.MediaSession.Token unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public boolean equals(java.lang.Object arg0) {
            return real.equals(arg0);
        }

        public int hashCode() {
            return real.hashCode();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }


    }
}
