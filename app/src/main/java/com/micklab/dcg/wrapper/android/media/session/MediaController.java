// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.session;

public final class MediaController {
    private final android.media.session.MediaController real;

    public MediaController(android.media.session.MediaController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.session.MediaController wrap(android.media.session.MediaController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaController(real);
    }

    public android.media.session.MediaController unwrap() {
        return real;
    }

    public MediaController(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.media.session.MediaSession.Token arg1) {
        this(new android.media.session.MediaController(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void adjustVolume(int arg0, int arg1) {
        real.adjustVolume(arg0, arg1);
    }

    public boolean dispatchMediaButtonEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchMediaButtonEvent(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getExtras());
    }

    public long getFlags() {
        return real.getFlags();
    }

    public com.micklab.dcg.wrapper.android.media.MediaMetadata getMetadata() {
        return com.micklab.dcg.wrapper.android.media.MediaMetadata.wrap(real.getMetadata());
    }

    public java.lang.String getPackageName() {
        return real.getPackageName();
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaController.PlaybackInfo getPlaybackInfo() {
        return com.micklab.dcg.wrapper.android.media.session.MediaController.PlaybackInfo.wrap(real.getPlaybackInfo());
    }

    public com.micklab.dcg.wrapper.android.media.session.PlaybackState getPlaybackState() {
        return com.micklab.dcg.wrapper.android.media.session.PlaybackState.wrap(real.getPlaybackState());
    }

    public java.lang.CharSequence getQueueTitle() {
        return real.getQueueTitle();
    }

    public int getRatingType() {
        return real.getRatingType();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getSessionActivity() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getSessionActivity());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getSessionInfo() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getSessionInfo());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSession.Token getSessionToken() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSession.Token.wrap(real.getSessionToken());
    }

    public java.lang.String getTag() {
        return real.getTag();
    }

    public android.media.session.MediaController.TransportControls getTransportControls() {
        return real.getTransportControls();
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.media.session.MediaController.Callback arg0) {
        real.registerCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.media.session.MediaController.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        real.registerCallback(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void sendCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.ResultReceiver arg2) {
        real.sendCommand(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public void setVolumeTo(int arg0, int arg1) {
        real.setVolumeTo(arg0, arg1);
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.media.session.MediaController.Callback arg0) {
        real.unregisterCallback(arg0 == null ? null : arg0.unwrap());
    }

    public static final class Callback {
        private final android.media.session.MediaController.Callback real;

        public Callback(android.media.session.MediaController.Callback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaController.Callback wrap(android.media.session.MediaController.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaController.Callback(real);
        }

        public android.media.session.MediaController.Callback unwrap() {
            return real;
        }

        public void onAudioInfoChanged(com.micklab.dcg.wrapper.android.media.session.MediaController.PlaybackInfo arg0) {
            real.onAudioInfoChanged(arg0 == null ? null : arg0.unwrap());
        }

        public void onExtrasChanged(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            real.onExtrasChanged(arg0 == null ? null : arg0.unwrap());
        }

        public void onMetadataChanged(com.micklab.dcg.wrapper.android.media.MediaMetadata arg0) {
            real.onMetadataChanged(arg0 == null ? null : arg0.unwrap());
        }

        public void onPlaybackStateChanged(com.micklab.dcg.wrapper.android.media.session.PlaybackState arg0) {
            real.onPlaybackStateChanged(arg0 == null ? null : arg0.unwrap());
        }

        public void onQueueTitleChanged(java.lang.CharSequence arg0) {
            real.onQueueTitleChanged(arg0);
        }

        public void onSessionDestroyed() {
            real.onSessionDestroyed();
        }

        public void onSessionEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onSessionEvent(arg0, arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class PlaybackInfo {
        private final android.media.session.MediaController.PlaybackInfo real;

        public PlaybackInfo(android.media.session.MediaController.PlaybackInfo real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaController.PlaybackInfo wrap(android.media.session.MediaController.PlaybackInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaController.PlaybackInfo(real);
        }

        public android.media.session.MediaController.PlaybackInfo unwrap() {
            return real;
        }

        public int describeContents() {
            return real.describeContents();
        }

        public com.micklab.dcg.wrapper.android.media.AudioAttributes getAudioAttributes() {
            return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(real.getAudioAttributes());
        }

        public int getCurrentVolume() {
            return real.getCurrentVolume();
        }

        public int getMaxVolume() {
            return real.getMaxVolume();
        }

        public int getPlaybackType() {
            return real.getPlaybackType();
        }

        public int getVolumeControl() {
            return real.getVolumeControl();
        }

        public java.lang.String getVolumeControlId() {
            return real.getVolumeControlId();
        }

        public java.lang.String toString() {
            return real.toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public static final int PLAYBACK_TYPE_LOCAL = android.media.session.MediaController.PlaybackInfo.PLAYBACK_TYPE_LOCAL;
        public static final int PLAYBACK_TYPE_REMOTE = android.media.session.MediaController.PlaybackInfo.PLAYBACK_TYPE_REMOTE;

    }
}
