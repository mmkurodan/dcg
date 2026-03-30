// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.session;

public final class MediaController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.session.MediaController wrap(android.media.session.MediaController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaController(real, (__DcgwBridgeToken) null);
    }

    public android.media.session.MediaController getReal() {
        return (android.media.session.MediaController) real;
    }

    public android.media.session.MediaController unwrap() {
        return getReal();
    }

    public MediaController(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.media.session.MediaSession.Token arg1) {
        this(new android.media.session.MediaController(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public void adjustVolume(int arg0, int arg1) {
        ((android.media.session.MediaController) real).adjustVolume(arg0, arg1);
    }

    public boolean dispatchMediaButtonEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.media.session.MediaController) real).dispatchMediaButtonEvent(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getExtras() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.session.MediaController) real).getExtras());
    }

    public long getFlags() {
        return ((android.media.session.MediaController) real).getFlags();
    }

    public com.micklab.dcg.wrapper.android.media.MediaMetadata getMetadata() {
        return com.micklab.dcg.wrapper.android.media.MediaMetadata.wrap(((android.media.session.MediaController) real).getMetadata());
    }

    public java.lang.String getPackageName() {
        return ((android.media.session.MediaController) real).getPackageName();
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaController.PlaybackInfo getPlaybackInfo() {
        return com.micklab.dcg.wrapper.android.media.session.MediaController.PlaybackInfo.wrap(((android.media.session.MediaController) real).getPlaybackInfo());
    }

    public com.micklab.dcg.wrapper.android.media.session.PlaybackState getPlaybackState() {
        return com.micklab.dcg.wrapper.android.media.session.PlaybackState.wrap(((android.media.session.MediaController) real).getPlaybackState());
    }

    public java.lang.CharSequence getQueueTitle() {
        return ((android.media.session.MediaController) real).getQueueTitle();
    }

    public int getRatingType() {
        return ((android.media.session.MediaController) real).getRatingType();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getSessionActivity() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.media.session.MediaController) real).getSessionActivity());
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getSessionInfo() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.media.session.MediaController) real).getSessionInfo());
    }

    public com.micklab.dcg.wrapper.android.media.session.MediaSession.Token getSessionToken() {
        return com.micklab.dcg.wrapper.android.media.session.MediaSession.Token.wrap(((android.media.session.MediaController) real).getSessionToken());
    }

    public java.lang.String getTag() {
        return ((android.media.session.MediaController) real).getTag();
    }

    public android.media.session.MediaController.TransportControls getTransportControls() {
        return ((android.media.session.MediaController) real).getTransportControls();
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.media.session.MediaController.Callback arg0) {
        ((android.media.session.MediaController) real).registerCallback(arg0 == null ? null : arg0.getReal());
    }

    public void registerCallback(com.micklab.dcg.wrapper.android.media.session.MediaController.Callback arg0, com.micklab.dcg.wrapper.android.os.Handler arg1) {
        ((android.media.session.MediaController) real).registerCallback(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void sendCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1, com.micklab.dcg.wrapper.android.os.ResultReceiver arg2) {
        ((android.media.session.MediaController) real).sendCommand(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public void setVolumeTo(int arg0, int arg1) {
        ((android.media.session.MediaController) real).setVolumeTo(arg0, arg1);
    }

    public void unregisterCallback(com.micklab.dcg.wrapper.android.media.session.MediaController.Callback arg0) {
        ((android.media.session.MediaController) real).unregisterCallback(arg0 == null ? null : arg0.getReal());
    }

    public static final class Callback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Callback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaController.Callback wrap(android.media.session.MediaController.Callback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaController.Callback(real, (__DcgwBridgeToken) null);
        }

        public android.media.session.MediaController.Callback getReal() {
            return (android.media.session.MediaController.Callback) real;
        }

        public android.media.session.MediaController.Callback unwrap() {
            return getReal();
        }

        public void onAudioInfoChanged(com.micklab.dcg.wrapper.android.media.session.MediaController.PlaybackInfo arg0) {
            ((android.media.session.MediaController.Callback) real).onAudioInfoChanged(arg0 == null ? null : arg0.getReal());
        }

        public void onExtrasChanged(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            ((android.media.session.MediaController.Callback) real).onExtrasChanged(arg0 == null ? null : arg0.getReal());
        }

        public void onMetadataChanged(com.micklab.dcg.wrapper.android.media.MediaMetadata arg0) {
            ((android.media.session.MediaController.Callback) real).onMetadataChanged(arg0 == null ? null : arg0.getReal());
        }

        public void onPlaybackStateChanged(com.micklab.dcg.wrapper.android.media.session.PlaybackState arg0) {
            ((android.media.session.MediaController.Callback) real).onPlaybackStateChanged(arg0 == null ? null : arg0.getReal());
        }

        public void onQueueTitleChanged(java.lang.CharSequence arg0) {
            ((android.media.session.MediaController.Callback) real).onQueueTitleChanged(arg0);
        }

        public void onSessionDestroyed() {
            ((android.media.session.MediaController.Callback) real).onSessionDestroyed();
        }

        public void onSessionEvent(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.session.MediaController.Callback) real).onSessionEvent(arg0, arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class PlaybackInfo {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private PlaybackInfo(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.session.MediaController.PlaybackInfo wrap(android.media.session.MediaController.PlaybackInfo real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.session.MediaController.PlaybackInfo(real, (__DcgwBridgeToken) null);
        }

        public android.media.session.MediaController.PlaybackInfo getReal() {
            return (android.media.session.MediaController.PlaybackInfo) real;
        }

        public android.media.session.MediaController.PlaybackInfo unwrap() {
            return getReal();
        }

        public int describeContents() {
            return ((android.media.session.MediaController.PlaybackInfo) real).describeContents();
        }

        public com.micklab.dcg.wrapper.android.media.AudioAttributes getAudioAttributes() {
            return com.micklab.dcg.wrapper.android.media.AudioAttributes.wrap(((android.media.session.MediaController.PlaybackInfo) real).getAudioAttributes());
        }

        public int getCurrentVolume() {
            return ((android.media.session.MediaController.PlaybackInfo) real).getCurrentVolume();
        }

        public int getMaxVolume() {
            return ((android.media.session.MediaController.PlaybackInfo) real).getMaxVolume();
        }

        public int getPlaybackType() {
            return ((android.media.session.MediaController.PlaybackInfo) real).getPlaybackType();
        }

        public int getVolumeControl() {
            return ((android.media.session.MediaController.PlaybackInfo) real).getVolumeControl();
        }

        public java.lang.String getVolumeControlId() {
            return ((android.media.session.MediaController.PlaybackInfo) real).getVolumeControlId();
        }

        public java.lang.String toString() {
            return ((android.media.session.MediaController.PlaybackInfo) real).toString();
        }

        public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
            ((android.media.session.MediaController.PlaybackInfo) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public static final int PLAYBACK_TYPE_LOCAL = android.media.session.MediaController.PlaybackInfo.PLAYBACK_TYPE_LOCAL;
        public static final int PLAYBACK_TYPE_REMOTE = android.media.session.MediaController.PlaybackInfo.PLAYBACK_TYPE_REMOTE;

    }
}
