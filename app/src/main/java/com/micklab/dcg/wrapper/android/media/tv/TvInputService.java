// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvInputService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvInputService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvInputService wrap(android.media.tv.TvInputService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputService(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TvInputService getReal() {
        return (android.media.tv.TvInputService) real;
    }

    public android.media.tv.TvInputService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.media.tv.TvInputService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.media.tv.TvInputService.RecordingSession onCreateRecordingSession(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.tv.TvInputService.RecordingSession.wrap(((android.media.tv.TvInputService) real).onCreateRecordingSession(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.tv.TvInputService.RecordingSession onCreateRecordingSession(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.media.tv.TvInputService.RecordingSession.wrap(((android.media.tv.TvInputService) real).onCreateRecordingSession(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session onCreateSession(java.lang.String arg0) {
        return com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session.wrap(((android.media.tv.TvInputService) real).onCreateSession(arg0));
    }

    public com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session onCreateSession(java.lang.String arg0, java.lang.String arg1) {
        return com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session.wrap(((android.media.tv.TvInputService) real).onCreateSession(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session onCreateSession(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.content.AttributionSource arg2) {
        return com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session.wrap(((android.media.tv.TvInputService) real).onCreateSession(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static final int PRIORITY_HINT_USE_CASE_TYPE_BACKGROUND = android.media.tv.TvInputService.PRIORITY_HINT_USE_CASE_TYPE_BACKGROUND;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_LIVE = android.media.tv.TvInputService.PRIORITY_HINT_USE_CASE_TYPE_LIVE;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_PLAYBACK = android.media.tv.TvInputService.PRIORITY_HINT_USE_CASE_TYPE_PLAYBACK;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_RECORD = android.media.tv.TvInputService.PRIORITY_HINT_USE_CASE_TYPE_RECORD;
    public static final int PRIORITY_HINT_USE_CASE_TYPE_SCAN = android.media.tv.TvInputService.PRIORITY_HINT_USE_CASE_TYPE_SCAN;
    public static final java.lang.String SERVICE_INTERFACE = android.media.tv.TvInputService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.media.tv.TvInputService.SERVICE_META_DATA;

    public static final class HardwareSession {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private HardwareSession(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvInputService.HardwareSession wrap(android.media.tv.TvInputService.HardwareSession real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputService.HardwareSession(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvInputService.HardwareSession getReal() {
            return (android.media.tv.TvInputService.HardwareSession) real;
        }

        public android.media.tv.TvInputService.HardwareSession unwrap() {
            return getReal();
        }

        public java.lang.String getHardwareInputId() {
            return ((android.media.tv.TvInputService.HardwareSession) real).getHardwareInputId();
        }

        public void onHardwareVideoAvailable() {
            ((android.media.tv.TvInputService.HardwareSession) real).onHardwareVideoAvailable();
        }

        public void onHardwareVideoUnavailable(int arg0) {
            ((android.media.tv.TvInputService.HardwareSession) real).onHardwareVideoUnavailable(arg0);
        }

        public boolean onSetSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            return ((android.media.tv.TvInputService.HardwareSession) real).onSetSurface(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class RecordingSession {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private RecordingSession(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvInputService.RecordingSession wrap(android.media.tv.TvInputService.RecordingSession real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputService.RecordingSession(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvInputService.RecordingSession getReal() {
            return (android.media.tv.TvInputService.RecordingSession) real;
        }

        public android.media.tv.TvInputService.RecordingSession unwrap() {
            return getReal();
        }

        public void notifyError(int arg0) {
            ((android.media.tv.TvInputService.RecordingSession) real).notifyError(arg0);
        }

        public void notifyRecordingStopped(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.media.tv.TvInputService.RecordingSession) real).notifyRecordingStopped(arg0 == null ? null : arg0.getReal());
        }

        public void notifyTuned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.media.tv.TvInputService.RecordingSession) real).notifyTuned(arg0 == null ? null : arg0.getReal());
        }

        public void onAppPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.TvInputService.RecordingSession) real).onAppPrivateCommand(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onPauseRecording(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            ((android.media.tv.TvInputService.RecordingSession) real).onPauseRecording(arg0 == null ? null : arg0.getReal());
        }

        public void onRelease() {
            ((android.media.tv.TvInputService.RecordingSession) real).onRelease();
        }

        public void onResumeRecording(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
            ((android.media.tv.TvInputService.RecordingSession) real).onResumeRecording(arg0 == null ? null : arg0.getReal());
        }

        public void onStartRecording(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.media.tv.TvInputService.RecordingSession) real).onStartRecording(arg0 == null ? null : arg0.getReal());
        }

        public void onStartRecording(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.TvInputService.RecordingSession) real).onStartRecording(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onStopRecording() {
            ((android.media.tv.TvInputService.RecordingSession) real).onStopRecording();
        }

        public void onTune(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.media.tv.TvInputService.RecordingSession) real).onTune(arg0 == null ? null : arg0.getReal());
        }

        public void onTune(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.TvInputService.RecordingSession) real).onTune(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

    }
    public static final class Session {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Session(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session wrap(android.media.tv.TvInputService.Session real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvInputService.Session(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvInputService.Session getReal() {
            return (android.media.tv.TvInputService.Session) real;
        }

        public android.media.tv.TvInputService.Session unwrap() {
            return getReal();
        }

        public void layoutSurface(int arg0, int arg1, int arg2, int arg3) {
            ((android.media.tv.TvInputService.Session) real).layoutSurface(arg0, arg1, arg2, arg3);
        }

        public void notifyAdBufferConsumed(com.micklab.dcg.wrapper.android.media.tv.AdBuffer arg0) {
            ((android.media.tv.TvInputService.Session) real).notifyAdBufferConsumed(arg0 == null ? null : arg0.getReal());
        }

        public void notifyAdResponse(com.micklab.dcg.wrapper.android.media.tv.AdResponse arg0) {
            ((android.media.tv.TvInputService.Session) real).notifyAdResponse(arg0 == null ? null : arg0.getReal());
        }

        public void notifyAitInfoUpdated(com.micklab.dcg.wrapper.android.media.tv.AitInfo arg0) {
            ((android.media.tv.TvInputService.Session) real).notifyAitInfoUpdated(arg0 == null ? null : arg0.getReal());
        }

        public void notifyAudioPresentationSelected(int arg0, int arg1) {
            ((android.media.tv.TvInputService.Session) real).notifyAudioPresentationSelected(arg0, arg1);
        }

        public void notifyAvailableSpeeds(float[] arg0) {
            ((android.media.tv.TvInputService.Session) real).notifyAvailableSpeeds(arg0);
        }

        public void notifyBroadcastInfoResponse(com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoResponse arg0) {
            ((android.media.tv.TvInputService.Session) real).notifyBroadcastInfoResponse(arg0 == null ? null : arg0.getReal());
        }

        public void notifyChannelRetuned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.media.tv.TvInputService.Session) real).notifyChannelRetuned(arg0 == null ? null : arg0.getReal());
        }

        public void notifyContentAllowed() {
            ((android.media.tv.TvInputService.Session) real).notifyContentAllowed();
        }

        public void notifyContentBlocked(com.micklab.dcg.wrapper.android.media.tv.TvContentRating arg0) {
            ((android.media.tv.TvInputService.Session) real).notifyContentBlocked(arg0 == null ? null : arg0.getReal());
        }

        public void notifyCueingMessageAvailability(boolean arg0) {
            ((android.media.tv.TvInputService.Session) real).notifyCueingMessageAvailability(arg0);
        }

        public void notifySignalStrength(int arg0) {
            ((android.media.tv.TvInputService.Session) real).notifySignalStrength(arg0);
        }

        public void notifyTimeShiftMode(int arg0) {
            ((android.media.tv.TvInputService.Session) real).notifyTimeShiftMode(arg0);
        }

        public void notifyTimeShiftStatusChanged(int arg0) {
            ((android.media.tv.TvInputService.Session) real).notifyTimeShiftStatusChanged(arg0);
        }

        public void notifyTrackSelected(int arg0, java.lang.String arg1) {
            ((android.media.tv.TvInputService.Session) real).notifyTrackSelected(arg0, arg1);
        }

        public void notifyTuned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.media.tv.TvInputService.Session) real).notifyTuned(arg0 == null ? null : arg0.getReal());
        }

        public void notifyTvMessage(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.TvInputService.Session) real).notifyTvMessage(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void notifyVideoAvailable() {
            ((android.media.tv.TvInputService.Session) real).notifyVideoAvailable();
        }

        public void notifyVideoUnavailable(int arg0) {
            ((android.media.tv.TvInputService.Session) real).notifyVideoUnavailable(arg0);
        }

        public void onAdBufferReady(com.micklab.dcg.wrapper.android.media.tv.AdBuffer arg0) {
            ((android.media.tv.TvInputService.Session) real).onAdBufferReady(arg0 == null ? null : arg0.getReal());
        }

        public void onAppPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.TvInputService.Session) real).onAppPrivateCommand(arg0, arg1 == null ? null : arg1.getReal());
        }

        public com.micklab.dcg.wrapper.android.view.View onCreateOverlayView() {
            return com.micklab.dcg.wrapper.android.view.View.wrap(((android.media.tv.TvInputService.Session) real).onCreateOverlayView());
        }

        public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.media.tv.TvInputService.Session) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.media.tv.TvInputService.Session) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
        }

        public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.media.tv.TvInputService.Session) real).onKeyLongPress(arg0, arg1 == null ? null : arg1.getReal());
        }

        public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
            return ((android.media.tv.TvInputService.Session) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.media.tv.TvInputService.Session) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onOverlayViewSizeChanged(int arg0, int arg1) {
            ((android.media.tv.TvInputService.Session) real).onOverlayViewSizeChanged(arg0, arg1);
        }

        public void onRelease() {
            ((android.media.tv.TvInputService.Session) real).onRelease();
        }

        public void onRemoveBroadcastInfo(int arg0) {
            ((android.media.tv.TvInputService.Session) real).onRemoveBroadcastInfo(arg0);
        }

        public void onRequestAd(com.micklab.dcg.wrapper.android.media.tv.AdRequest arg0) {
            ((android.media.tv.TvInputService.Session) real).onRequestAd(arg0 == null ? null : arg0.getReal());
        }

        public void onRequestBroadcastInfo(com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoRequest arg0) {
            ((android.media.tv.TvInputService.Session) real).onRequestBroadcastInfo(arg0 == null ? null : arg0.getReal());
        }

        public boolean onSelectAudioPresentation(int arg0, int arg1) {
            return ((android.media.tv.TvInputService.Session) real).onSelectAudioPresentation(arg0, arg1);
        }

        public boolean onSelectTrack(int arg0, java.lang.String arg1) {
            return ((android.media.tv.TvInputService.Session) real).onSelectTrack(arg0, arg1);
        }

        public void onSetCaptionEnabled(boolean arg0) {
            ((android.media.tv.TvInputService.Session) real).onSetCaptionEnabled(arg0);
        }

        public void onSetInteractiveAppNotificationEnabled(boolean arg0) {
            ((android.media.tv.TvInputService.Session) real).onSetInteractiveAppNotificationEnabled(arg0);
        }

        public void onSetStreamVolume(float arg0) {
            ((android.media.tv.TvInputService.Session) real).onSetStreamVolume(arg0);
        }

        public boolean onSetSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            return ((android.media.tv.TvInputService.Session) real).onSetSurface(arg0 == null ? null : arg0.getReal());
        }

        public void onSetTvMessageEnabled(int arg0, boolean arg1) {
            ((android.media.tv.TvInputService.Session) real).onSetTvMessageEnabled(arg0, arg1);
        }

        public void onSurfaceChanged(int arg0, int arg1, int arg2) {
            ((android.media.tv.TvInputService.Session) real).onSurfaceChanged(arg0, arg1, arg2);
        }

        public long onTimeShiftGetCurrentPosition() {
            return ((android.media.tv.TvInputService.Session) real).onTimeShiftGetCurrentPosition();
        }

        public long onTimeShiftGetStartPosition() {
            return ((android.media.tv.TvInputService.Session) real).onTimeShiftGetStartPosition();
        }

        public void onTimeShiftPause() {
            ((android.media.tv.TvInputService.Session) real).onTimeShiftPause();
        }

        public void onTimeShiftPlay(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.media.tv.TvInputService.Session) real).onTimeShiftPlay(arg0 == null ? null : arg0.getReal());
        }

        public void onTimeShiftResume() {
            ((android.media.tv.TvInputService.Session) real).onTimeShiftResume();
        }

        public void onTimeShiftSeekTo(long arg0) {
            ((android.media.tv.TvInputService.Session) real).onTimeShiftSeekTo(arg0);
        }

        public void onTimeShiftSetMode(int arg0) {
            ((android.media.tv.TvInputService.Session) real).onTimeShiftSetMode(arg0);
        }

        public void onTimeShiftSetPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
            ((android.media.tv.TvInputService.Session) real).onTimeShiftSetPlaybackParams(arg0 == null ? null : arg0.getReal());
        }

        public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.media.tv.TvInputService.Session) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.media.tv.TvInputService.Session) real).onTrackballEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean onTune(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            return ((android.media.tv.TvInputService.Session) real).onTune(arg0 == null ? null : arg0.getReal());
        }

        public boolean onTune(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            return ((android.media.tv.TvInputService.Session) real).onTune(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public void onTvMessage(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.TvInputService.Session) real).onTvMessage(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onUnblockContent(com.micklab.dcg.wrapper.android.media.tv.TvContentRating arg0) {
            ((android.media.tv.TvInputService.Session) real).onUnblockContent(arg0 == null ? null : arg0.getReal());
        }

        public void setOverlayViewEnabled(boolean arg0) {
            ((android.media.tv.TvInputService.Session) real).setOverlayViewEnabled(arg0);
        }

    }
}
