// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv.interactive;

public final class TvInteractiveAppService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvInteractiveAppService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppService wrap(android.media.tv.interactive.TvInteractiveAppService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppService(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.interactive.TvInteractiveAppService getReal() {
        return (android.media.tv.interactive.TvInteractiveAppService) real;
    }

    public android.media.tv.interactive.TvInteractiveAppService unwrap() {
        return getReal();
    }

    public void notifyStateChanged(int arg0, int arg1, int arg2) {
        ((android.media.tv.interactive.TvInteractiveAppService) real).notifyStateChanged(arg0, arg1, arg2);
    }

    public void onAppLinkCommand(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.media.tv.interactive.TvInteractiveAppService) real).onAppLinkCommand(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.media.tv.interactive.TvInteractiveAppService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppService.Session onCreateSession(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppService.Session.wrap(((android.media.tv.interactive.TvInteractiveAppService) real).onCreateSession(arg0, arg1));
    }

    public void onRegisterAppLinkInfo(com.micklab.dcg.wrapper.android.media.tv.interactive.AppLinkInfo arg0) {
        ((android.media.tv.interactive.TvInteractiveAppService) real).onRegisterAppLinkInfo(arg0 == null ? null : arg0.getReal());
    }

    public void onUnregisterAppLinkInfo(com.micklab.dcg.wrapper.android.media.tv.interactive.AppLinkInfo arg0) {
        ((android.media.tv.interactive.TvInteractiveAppService) real).onUnregisterAppLinkInfo(arg0 == null ? null : arg0.getReal());
    }

    public static final java.lang.String COMMAND_PARAMETER_KEY_CHANGE_CHANNEL_QUIETLY = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_KEY_CHANGE_CHANNEL_QUIETLY;
    public static final java.lang.String COMMAND_PARAMETER_KEY_CHANNEL_URI = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_KEY_CHANNEL_URI;
    public static final java.lang.String COMMAND_PARAMETER_KEY_INPUT_ID = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_KEY_INPUT_ID;
    public static final java.lang.String COMMAND_PARAMETER_KEY_PLAYBACK_PARAMS = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_KEY_PLAYBACK_PARAMS;
    public static final java.lang.String COMMAND_PARAMETER_KEY_PROGRAM_URI = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_KEY_PROGRAM_URI;
    public static final java.lang.String COMMAND_PARAMETER_KEY_STOP_MODE = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_KEY_STOP_MODE;
    public static final java.lang.String COMMAND_PARAMETER_KEY_TIME_POSITION = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_KEY_TIME_POSITION;
    public static final java.lang.String COMMAND_PARAMETER_KEY_TIME_SHIFT_MODE = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_KEY_TIME_SHIFT_MODE;
    public static final java.lang.String COMMAND_PARAMETER_KEY_TRACK_ID = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_KEY_TRACK_ID;
    public static final java.lang.String COMMAND_PARAMETER_KEY_TRACK_TYPE = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_KEY_TRACK_TYPE;
    public static final java.lang.String COMMAND_PARAMETER_KEY_VOLUME = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_KEY_VOLUME;
    public static final int COMMAND_PARAMETER_VALUE_STOP_MODE_BLANK = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_VALUE_STOP_MODE_BLANK;
    public static final int COMMAND_PARAMETER_VALUE_STOP_MODE_FREEZE = android.media.tv.interactive.TvInteractiveAppService.COMMAND_PARAMETER_VALUE_STOP_MODE_FREEZE;
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_SELECT_TRACK = android.media.tv.interactive.TvInteractiveAppService.PLAYBACK_COMMAND_TYPE_SELECT_TRACK;
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_SET_STREAM_VOLUME = android.media.tv.interactive.TvInteractiveAppService.PLAYBACK_COMMAND_TYPE_SET_STREAM_VOLUME;
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_STOP = android.media.tv.interactive.TvInteractiveAppService.PLAYBACK_COMMAND_TYPE_STOP;
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_TUNE = android.media.tv.interactive.TvInteractiveAppService.PLAYBACK_COMMAND_TYPE_TUNE;
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_TUNE_NEXT = android.media.tv.interactive.TvInteractiveAppService.PLAYBACK_COMMAND_TYPE_TUNE_NEXT;
    public static final java.lang.String PLAYBACK_COMMAND_TYPE_TUNE_PREV = android.media.tv.interactive.TvInteractiveAppService.PLAYBACK_COMMAND_TYPE_TUNE_PREV;
    public static final java.lang.String SERVICE_INTERFACE = android.media.tv.interactive.TvInteractiveAppService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.media.tv.interactive.TvInteractiveAppService.SERVICE_META_DATA;
    public static final java.lang.String TIME_SHIFT_COMMAND_TYPE_PAUSE = android.media.tv.interactive.TvInteractiveAppService.TIME_SHIFT_COMMAND_TYPE_PAUSE;
    public static final java.lang.String TIME_SHIFT_COMMAND_TYPE_PLAY = android.media.tv.interactive.TvInteractiveAppService.TIME_SHIFT_COMMAND_TYPE_PLAY;
    public static final java.lang.String TIME_SHIFT_COMMAND_TYPE_RESUME = android.media.tv.interactive.TvInteractiveAppService.TIME_SHIFT_COMMAND_TYPE_RESUME;
    public static final java.lang.String TIME_SHIFT_COMMAND_TYPE_SEEK_TO = android.media.tv.interactive.TvInteractiveAppService.TIME_SHIFT_COMMAND_TYPE_SEEK_TO;
    public static final java.lang.String TIME_SHIFT_COMMAND_TYPE_SET_MODE = android.media.tv.interactive.TvInteractiveAppService.TIME_SHIFT_COMMAND_TYPE_SET_MODE;
    public static final java.lang.String TIME_SHIFT_COMMAND_TYPE_SET_PLAYBACK_PARAMS = android.media.tv.interactive.TvInteractiveAppService.TIME_SHIFT_COMMAND_TYPE_SET_PLAYBACK_PARAMS;

    public static final class Session {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Session(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppService.Session wrap(android.media.tv.interactive.TvInteractiveAppService.Session real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppService.Session(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.interactive.TvInteractiveAppService.Session getReal() {
            return (android.media.tv.interactive.TvInteractiveAppService.Session) real;
        }

        public android.media.tv.interactive.TvInteractiveAppService.Session unwrap() {
            return getReal();
        }

        public boolean isMediaViewEnabled() {
            return ((android.media.tv.interactive.TvInteractiveAppService.Session) real).isMediaViewEnabled();
        }

        public void layoutSurface(int arg0, int arg1, int arg2, int arg3) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).layoutSurface(arg0, arg1, arg2, arg3);
        }

        public void notifyAdBufferReady(com.micklab.dcg.wrapper.android.media.tv.AdBuffer arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).notifyAdBufferReady(arg0 == null ? null : arg0.getReal());
        }

        public void notifyBiInteractiveAppCreated(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).notifyBiInteractiveAppCreated(arg0 == null ? null : arg0.getReal(), arg1);
        }

        public void notifySessionStateChanged(int arg0, int arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).notifySessionStateChanged(arg0, arg1);
        }

        public void notifyTeletextAppStateChanged(int arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).notifyTeletextAppStateChanged(arg0);
        }

        public void onAdBufferConsumed(com.micklab.dcg.wrapper.android.media.tv.AdBuffer arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onAdBufferConsumed(arg0 == null ? null : arg0.getReal());
        }

        public void onAdResponse(com.micklab.dcg.wrapper.android.media.tv.AdResponse arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onAdResponse(arg0 == null ? null : arg0.getReal());
        }

        public void onAvailableSpeeds(float[] arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onAvailableSpeeds(arg0);
        }

        public void onBroadcastInfoResponse(com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoResponse arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onBroadcastInfoResponse(arg0 == null ? null : arg0.getReal());
        }

        public void onContentAllowed() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onContentAllowed();
        }

        public void onContentBlocked(com.micklab.dcg.wrapper.android.media.tv.TvContentRating arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onContentBlocked(arg0 == null ? null : arg0.getReal());
        }

        public void onCreateBiInteractiveAppRequest(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onCreateBiInteractiveAppRequest(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
        }

        public com.micklab.dcg.wrapper.android.view.View onCreateMediaView() {
            return com.micklab.dcg.wrapper.android.view.View.wrap(((android.media.tv.interactive.TvInteractiveAppService.Session) real).onCreateMediaView());
        }

        public void onCurrentChannelLcn(int arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onCurrentChannelLcn(arg0);
        }

        public void onCurrentChannelUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onCurrentChannelUri(arg0 == null ? null : arg0.getReal());
        }

        public void onCurrentTvInputId(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onCurrentTvInputId(arg0);
        }

        public void onCurrentVideoBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onCurrentVideoBounds(arg0 == null ? null : arg0.getReal());
        }

        public void onDestroyBiInteractiveAppRequest(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onDestroyBiInteractiveAppRequest(arg0);
        }

        public void onError(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onError(arg0, arg1 == null ? null : arg1.getReal());
        }

        public boolean onGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onGenericMotionEvent(arg0 == null ? null : arg0.getReal());
        }

        public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
        }

        public boolean onKeyLongPress(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onKeyLongPress(arg0, arg1 == null ? null : arg1.getReal());
        }

        public boolean onKeyMultiple(int arg0, int arg1, com.micklab.dcg.wrapper.android.view.KeyEvent arg2) {
            return ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onKeyMultiple(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public boolean onKeyUp(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
            return ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onKeyUp(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onMediaViewSizeChanged(int arg0, int arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onMediaViewSizeChanged(arg0, arg1);
        }

        public void onRecordingConnectionFailed(java.lang.String arg0, java.lang.String arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onRecordingConnectionFailed(arg0, arg1);
        }

        public void onRecordingDisconnected(java.lang.String arg0, java.lang.String arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onRecordingDisconnected(arg0, arg1);
        }

        public void onRecordingError(java.lang.String arg0, int arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onRecordingError(arg0, arg1);
        }

        public void onRecordingScheduled(java.lang.String arg0, java.lang.String arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onRecordingScheduled(arg0, arg1);
        }

        public void onRecordingStarted(java.lang.String arg0, java.lang.String arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onRecordingStarted(arg0, arg1);
        }

        public void onRecordingStopped(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onRecordingStopped(arg0);
        }

        public void onRecordingTuned(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onRecordingTuned(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onRelease() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onRelease();
        }

        public void onResetInteractiveApp() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onResetInteractiveApp();
        }

        public boolean onSetSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            return ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onSetSurface(arg0 == null ? null : arg0.getReal());
        }

        public void onSetTeletextAppEnabled(boolean arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onSetTeletextAppEnabled(arg0);
        }

        public void onSignalStrength(int arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onSignalStrength(arg0);
        }

        public void onSigningResult(java.lang.String arg0, byte[] arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onSigningResult(arg0, arg1);
        }

        public void onStartInteractiveApp() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onStartInteractiveApp();
        }

        public void onStopInteractiveApp() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onStopInteractiveApp();
        }

        public void onStreamVolume(float arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onStreamVolume(arg0);
        }

        public void onSurfaceChanged(int arg0, int arg1, int arg2) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onSurfaceChanged(arg0, arg1, arg2);
        }

        public void onTimeShiftCurrentPositionChanged(java.lang.String arg0, long arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onTimeShiftCurrentPositionChanged(arg0, arg1);
        }

        public void onTimeShiftMode(int arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onTimeShiftMode(arg0);
        }

        public void onTimeShiftPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onTimeShiftPlaybackParams(arg0 == null ? null : arg0.getReal());
        }

        public void onTimeShiftStartPositionChanged(java.lang.String arg0, long arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onTimeShiftStartPositionChanged(arg0, arg1);
        }

        public void onTimeShiftStatusChanged(java.lang.String arg0, int arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onTimeShiftStatusChanged(arg0, arg1);
        }

        public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
        }

        public void onTrackSelected(int arg0, java.lang.String arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onTrackSelected(arg0, arg1);
        }

        public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onTrackballEvent(arg0 == null ? null : arg0.getReal());
        }

        public void onTuned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onTuned(arg0 == null ? null : arg0.getReal());
        }

        public void onTvMessage(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onTvMessage(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onTvRecordingInfo(com.micklab.dcg.wrapper.android.media.tv.TvRecordingInfo arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onTvRecordingInfo(arg0 == null ? null : arg0.getReal());
        }

        public void onVideoAvailable() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onVideoAvailable();
        }

        public void onVideoUnavailable(int arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).onVideoUnavailable(arg0);
        }

        public void removeBroadcastInfo(int arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).removeBroadcastInfo(arg0);
        }

        public void requestAd(com.micklab.dcg.wrapper.android.media.tv.AdRequest arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestAd(arg0 == null ? null : arg0.getReal());
        }

        public void requestAvailableSpeeds() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestAvailableSpeeds();
        }

        public void requestBroadcastInfo(com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoRequest arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestBroadcastInfo(arg0 == null ? null : arg0.getReal());
        }

        public void requestCurrentChannelLcn() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestCurrentChannelLcn();
        }

        public void requestCurrentChannelUri() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestCurrentChannelUri();
        }

        public void requestCurrentTvInputId() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestCurrentTvInputId();
        }

        public void requestCurrentVideoBounds() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestCurrentVideoBounds();
        }

        public void requestScheduleRecording(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestScheduleRecording(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal());
        }

        public void requestScheduleRecording(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, long arg3, long arg4, int arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestScheduleRecording(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4, arg5, arg6 == null ? null : arg6.getReal());
        }

        public void requestSigning(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, byte[] arg3) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestSigning(arg0, arg1, arg2, arg3);
        }

        public void requestStartRecording(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestStartRecording(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void requestStopRecording(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestStopRecording(arg0);
        }

        public void requestStreamVolume() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestStreamVolume();
        }

        public void requestTimeShiftMode() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestTimeShiftMode();
        }

        public void requestTrackInfoList() {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestTrackInfoList();
        }

        public void requestTvRecordingInfo(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestTvRecordingInfo(arg0);
        }

        public void requestTvRecordingInfoList(int arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).requestTvRecordingInfoList(arg0);
        }

        public void sendPlaybackCommandRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).sendPlaybackCommandRequest(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void sendTimeShiftCommandRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).sendTimeShiftCommandRequest(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void setMediaViewEnabled(boolean arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).setMediaViewEnabled(arg0);
        }

        public void setTvRecordingInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.tv.TvRecordingInfo arg1) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).setTvRecordingInfo(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void setVideoBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            ((android.media.tv.interactive.TvInteractiveAppService.Session) real).setVideoBounds(arg0 == null ? null : arg0.getReal());
        }

    }
}
