// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvInputService {
    private final android.media.tv.TvInputService real;

    public TvInputService(android.media.tv.TvInputService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvInputService wrap(android.media.tv.TvInputService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputService(real);
    }

    public android.media.tv.TvInputService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.media.tv.TvInputService.RecordingSession onCreateRecordingSession(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.tv.TvInputService.RecordingSession.wrap(real.onCreateRecordingSession(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.tv.TvInputService.RecordingSession onCreateRecordingSession(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.media.tv.TvInputService.RecordingSession.wrap(real.onCreateRecordingSession(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session onCreateSession(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session.wrap(real.onCreateSession(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session onCreateSession(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session.wrap(real.onCreateSession(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session onCreateSession(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.AttributionSource arg2) {
        return com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session.wrap(real.onCreateSession(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static final int PRIORITY_HINT_USE_CASE_TYPE_BACKGROUND = android.media.tv.TvInputService.PRIORITY_HINT_USE_CASE_TYPE_BACKGROUND;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_LIVE = android.media.tv.TvInputService.PRIORITY_HINT_USE_CASE_TYPE_LIVE;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_PLAYBACK = android.media.tv.TvInputService.PRIORITY_HINT_USE_CASE_TYPE_PLAYBACK;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_RECORD = android.media.tv.TvInputService.PRIORITY_HINT_USE_CASE_TYPE_RECORD;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_SCAN = android.media.tv.TvInputService.PRIORITY_HINT_USE_CASE_TYPE_SCAN;
    public static final java.lang.String SERVICE_INTERFACE = android.media.tv.TvInputService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.media.tv.TvInputService.SERVICE_META_DATA;

    public static final class HardwareSession {
        private final android.media.tv.TvInputService.HardwareSession real;

        public HardwareSession(android.media.tv.TvInputService.HardwareSession real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvInputService.HardwareSession wrap(android.media.tv.TvInputService.HardwareSession real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputService.HardwareSession(real);
        }

        public android.media.tv.TvInputService.HardwareSession unwrap() {
            return real;
        }

        public java.lang.String getHardwareInputId() {
            return real.getHardwareInputId();
        }

        public void onHardwareVideoAvailable() {
            real.onHardwareVideoAvailable();
        }

        public void onHardwareVideoUnavailable(int arg0) {
            real.onHardwareVideoUnavailable(arg0);
        }

        public boolean onSetSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            return real.onSetSurface(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class RecordingSession {
        private final android.media.tv.TvInputService.RecordingSession real;

        public RecordingSession(android.media.tv.TvInputService.RecordingSession real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvInputService.RecordingSession wrap(android.media.tv.TvInputService.RecordingSession real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputService.RecordingSession(real);
        }

        public android.media.tv.TvInputService.RecordingSession unwrap() {
            return real;
        }

        public void notifyError(int arg0) {
            real.notifyError(arg0);
        }

        public void notifyRecordingStopped(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.notifyRecordingStopped(arg0 == null ? null : arg0.unwrap());
        }

        public void notifyTuned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.notifyTuned(arg0 == null ? null : arg0.unwrap());
        }

        public void onAppPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onAppPrivateCommand(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onPauseRecording(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            real.onPauseRecording(arg0 == null ? null : arg0.unwrap());
        }

        public void onRelease() {
            real.onRelease();
        }

        public void onResumeRecording(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            real.onResumeRecording(arg0 == null ? null : arg0.unwrap());
        }

        public void onStartRecording(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.onStartRecording(arg0 == null ? null : arg0.unwrap());
        }

        public void onStartRecording(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onStartRecording(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onStopRecording() {
            real.onStopRecording();
        }

        public void onTune(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.onTune(arg0 == null ? null : arg0.unwrap());
        }

        public void onTune(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onTune(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

    }
    public static final class Session {
        private final android.media.tv.TvInputService.Session real;

        public Session(android.media.tv.TvInputService.Session real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session wrap(android.media.tv.TvInputService.Session real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session(real);
        }

        public android.media.tv.TvInputService.Session unwrap() {
            return real;
        }

        public void layoutSurface(int arg0, int arg1, int arg2, int arg3) {
            real.layoutSurface(arg0, arg1, arg2, arg3);
        }

        public void notifyAdBufferConsumed(com.micklab.dcg.wrapper.android.media.tv.AdBuffer arg0) {
            real.notifyAdBufferConsumed(arg0 == null ? null : arg0.unwrap());
        }

        public void notifyAdResponse(com.micklab.dcg.wrapper.android.media.tv.AdResponse arg0) {
            real.notifyAdResponse(arg0 == null ? null : arg0.unwrap());
        }

        public void notifyAitInfoUpdated(com.micklab.dcg.wrapper.android.media.tv.AitInfo arg0) {
            real.notifyAitInfoUpdated(arg0 == null ? null : arg0.unwrap());
        }

        public void notifyAudioPresentationSelected(int arg0, int arg1) {
            real.notifyAudioPresentationSelected(arg0, arg1);
        }

        public void notifyAvailableSpeeds(float[] arg0) {
            real.notifyAvailableSpeeds(arg0);
        }

        public void notifyBroadcastInfoResponse(com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoResponse arg0) {
            real.notifyBroadcastInfoResponse(arg0 == null ? null : arg0.unwrap());
        }

        public void notifyChannelRetuned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.notifyChannelRetuned(arg0 == null ? null : arg0.unwrap());
        }

        public void notifyContentAllowed() {
            real.notifyContentAllowed();
        }

        public void notifyContentBlocked(com.micklab.dcg.wrapper.android.media.tv.TvContentRating arg0) {
            real.notifyContentBlocked(arg0 == null ? null : arg0.unwrap());
        }

        public void notifyCueingMessageAvailability(boolean arg0) {
            real.notifyCueingMessageAvailability(arg0);
        }

        public void notifySignalStrength(int arg0) {
            real.notifySignalStrength(arg0);
        }

        public void notifyTimeShiftMode(int arg0) {
            real.notifyTimeShiftMode(arg0);
        }

        public void notifyTimeShiftStatusChanged(int arg0) {
            real.notifyTimeShiftStatusChanged(arg0);
        }

        public void notifyTrackSelected(int arg0, java.lang.String arg1) {
            real.notifyTrackSelected(arg0, arg1);
        }

        public void notifyTuned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.notifyTuned(arg0 == null ? null : arg0.unwrap());
        }

        public void notifyTvMessage(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.notifyTvMessage(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void notifyVideoAvailable() {
            real.notifyVideoAvailable();
        }

        public void notifyVideoUnavailable(int arg0) {
            real.notifyVideoUnavailable(arg0);
        }

        public void onAdBufferReady(com.micklab.dcg.wrapper.android.media.tv.AdBuffer arg0) {
            real.onAdBufferReady(arg0 == null ? null : arg0.unwrap());
        }

        public void onAppPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onAppPrivateCommand(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public com.micklab.dcg.wrapper.android.view.View onCreateOverlayView() {
            return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateOverlayView());
        }

        public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return real.onKeyLongPress(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
            return real.onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

        public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return real.onKeyUp(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onOverlayViewSizeChanged(int arg0, int arg1) {
            real.onOverlayViewSizeChanged(arg0, arg1);
        }

        public void onRelease() {
            real.onRelease();
        }

        public void onRemoveBroadcastInfo(int arg0) {
            real.onRemoveBroadcastInfo(arg0);
        }

        public void onRequestAd(com.micklab.dcg.wrapper.android.media.tv.AdRequest arg0) {
            real.onRequestAd(arg0 == null ? null : arg0.unwrap());
        }

        public void onRequestBroadcastInfo(com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoRequest arg0) {
            real.onRequestBroadcastInfo(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onSelectAudioPresentation(int arg0, int arg1) {
            return real.onSelectAudioPresentation(arg0, arg1);
        }

        public boolean onSelectTrack(int arg0, java.lang.String arg1) {
            return real.onSelectTrack(arg0, arg1);
        }

        public void onSetCaptionEnabled(boolean arg0) {
            real.onSetCaptionEnabled(arg0);
        }

        public void onSetInteractiveAppNotificationEnabled(boolean arg0) {
            real.onSetInteractiveAppNotificationEnabled(arg0);
        }

        public void onSetStreamVolume(float arg0) {
            real.onSetStreamVolume(arg0);
        }

        public boolean onSetSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            return real.onSetSurface(arg0 == null ? null : arg0.unwrap());
        }

        public void onSetTvMessageEnabled(int arg0, boolean arg1) {
            real.onSetTvMessageEnabled(arg0, arg1);
        }

        public void onSurfaceChanged(int arg0, int arg1, int arg2) {
            real.onSurfaceChanged(arg0, arg1, arg2);
        }

        public long onTimeShiftGetCurrentPosition() {
            return real.onTimeShiftGetCurrentPosition();
        }

        public long onTimeShiftGetStartPosition() {
            return real.onTimeShiftGetStartPosition();
        }

        public void onTimeShiftPause() {
            real.onTimeShiftPause();
        }

        public void onTimeShiftPlay(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.onTimeShiftPlay(arg0 == null ? null : arg0.unwrap());
        }

        public void onTimeShiftResume() {
            real.onTimeShiftResume();
        }

        public void onTimeShiftSeekTo(long arg0) {
            real.onTimeShiftSeekTo(arg0);
        }

        public void onTimeShiftSetMode(int arg0) {
            real.onTimeShiftSetMode(arg0);
        }

        public void onTimeShiftSetPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
            real.onTimeShiftSetPlaybackParams(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onTrackballEvent(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onTune(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return real.onTune(arg0 == null ? null : arg0.unwrap());
        }

        public boolean onTune(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            return real.onTune(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public void onTvMessage(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onTvMessage(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onUnblockContent(com.micklab.dcg.wrapper.android.media.tv.TvContentRating arg0) {
            real.onUnblockContent(arg0 == null ? null : arg0.unwrap());
        }

        public void setOverlayViewEnabled(boolean arg0) {
            real.setOverlayViewEnabled(arg0);
        }

    }
}
