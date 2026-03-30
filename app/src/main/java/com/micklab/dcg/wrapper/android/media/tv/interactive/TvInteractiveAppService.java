// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv.interactive;

public final class TvInteractiveAppService {
    private final android.media.tv.interactive.TvInteractiveAppService real;

    public TvInteractiveAppService(android.media.tv.interactive.TvInteractiveAppService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppService wrap(android.media.tv.interactive.TvInteractiveAppService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppService(real);
    }

    public android.media.tv.interactive.TvInteractiveAppService unwrap() {
        return real;
    }

    public void notifyStateChanged(int arg0, int arg1, int arg2) {
        real.notifyStateChanged(arg0, arg1, arg2);
    }

    public void onAppLinkCommand(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onAppLinkCommand(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppService.Session onCreateSession(java.lang.String arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppService.Session.wrap(real.onCreateSession(arg0, arg1));
    }

    public void onRegisterAppLinkInfo(com.micklab.dcg.wrapper.android.media.tv.interactive.AppLinkInfo arg0) {
        real.onRegisterAppLinkInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void onUnregisterAppLinkInfo(com.micklab.dcg.wrapper.android.media.tv.interactive.AppLinkInfo arg0) {
        real.onUnregisterAppLinkInfo(arg0 == null ? null : arg0.unwrap());
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
        private final android.media.tv.interactive.TvInteractiveAppService.Session real;

        public Session(android.media.tv.interactive.TvInteractiveAppService.Session real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppService.Session wrap(android.media.tv.interactive.TvInteractiveAppService.Session real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppService.Session(real);
        }

        public android.media.tv.interactive.TvInteractiveAppService.Session unwrap() {
            return real;
        }

        public boolean isMediaViewEnabled() {
            return real.isMediaViewEnabled();
        }

        public void layoutSurface(int arg0, int arg1, int arg2, int arg3) {
            real.layoutSurface(arg0, arg1, arg2, arg3);
        }

        public void notifyAdBufferReady(com.micklab.dcg.wrapper.android.media.tv.AdBuffer arg0) {
            real.notifyAdBufferReady(arg0 == null ? null : arg0.unwrap());
        }

        public void notifyBiInteractiveAppCreated(com.micklab.dcg.wrapper.android.net.Uri arg0, java.lang.String arg1) {
            real.notifyBiInteractiveAppCreated(arg0 == null ? null : arg0.unwrap(), arg1);
        }

        public void notifySessionStateChanged(int arg0, int arg1) {
            real.notifySessionStateChanged(arg0, arg1);
        }

        public void notifyTeletextAppStateChanged(int arg0) {
            real.notifyTeletextAppStateChanged(arg0);
        }

        public void onAdBufferConsumed(com.micklab.dcg.wrapper.android.media.tv.AdBuffer arg0) {
            real.onAdBufferConsumed(arg0 == null ? null : arg0.unwrap());
        }

        public void onAdResponse(com.micklab.dcg.wrapper.android.media.tv.AdResponse arg0) {
            real.onAdResponse(arg0 == null ? null : arg0.unwrap());
        }

        public void onAvailableSpeeds(float[] arg0) {
            real.onAvailableSpeeds(arg0);
        }

        public void onBroadcastInfoResponse(com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoResponse arg0) {
            real.onBroadcastInfoResponse(arg0 == null ? null : arg0.unwrap());
        }

        public void onContentAllowed() {
            real.onContentAllowed();
        }

        public void onContentBlocked(com.micklab.dcg.wrapper.android.media.tv.TvContentRating arg0) {
            real.onContentBlocked(arg0 == null ? null : arg0.unwrap());
        }

        public void onCreateBiInteractiveAppRequest(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onCreateBiInteractiveAppRequest(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
        }

        public com.micklab.dcg.wrapper.android.view.View onCreateMediaView() {
            return com.micklab.dcg.wrapper.android.view.View.wrap(real.onCreateMediaView());
        }

        public void onCurrentChannelLcn(int arg0) {
            real.onCurrentChannelLcn(arg0);
        }

        public void onCurrentChannelUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.onCurrentChannelUri(arg0 == null ? null : arg0.unwrap());
        }

        public void onCurrentTvInputId(java.lang.String arg0) {
            real.onCurrentTvInputId(arg0);
        }

        public void onCurrentVideoBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            real.onCurrentVideoBounds(arg0 == null ? null : arg0.unwrap());
        }

        public void onDestroyBiInteractiveAppRequest(java.lang.String arg0) {
            real.onDestroyBiInteractiveAppRequest(arg0);
        }

        public void onError(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onError(arg0, arg1 == null ? null : arg1.unwrap());
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

        public void onMediaViewSizeChanged(int arg0, int arg1) {
            real.onMediaViewSizeChanged(arg0, arg1);
        }

        public void onRecordingConnectionFailed(java.lang.String arg0, java.lang.String arg1) {
            real.onRecordingConnectionFailed(arg0, arg1);
        }

        public void onRecordingDisconnected(java.lang.String arg0, java.lang.String arg1) {
            real.onRecordingDisconnected(arg0, arg1);
        }

        public void onRecordingError(java.lang.String arg0, int arg1) {
            real.onRecordingError(arg0, arg1);
        }

        public void onRecordingScheduled(java.lang.String arg0, java.lang.String arg1) {
            real.onRecordingScheduled(arg0, arg1);
        }

        public void onRecordingStarted(java.lang.String arg0, java.lang.String arg1) {
            real.onRecordingStarted(arg0, arg1);
        }

        public void onRecordingStopped(java.lang.String arg0) {
            real.onRecordingStopped(arg0);
        }

        public void onRecordingTuned(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            real.onRecordingTuned(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onRelease() {
            real.onRelease();
        }

        public void onResetInteractiveApp() {
            real.onResetInteractiveApp();
        }

        public boolean onSetSurface(com.micklab.dcg.wrapper.android.view.Surface arg0) {
            return real.onSetSurface(arg0 == null ? null : arg0.unwrap());
        }

        public void onSetTeletextAppEnabled(boolean arg0) {
            real.onSetTeletextAppEnabled(arg0);
        }

        public void onSignalStrength(int arg0) {
            real.onSignalStrength(arg0);
        }

        public void onSigningResult(java.lang.String arg0, byte[] arg1) {
            real.onSigningResult(arg0, arg1);
        }

        public void onStartInteractiveApp() {
            real.onStartInteractiveApp();
        }

        public void onStopInteractiveApp() {
            real.onStopInteractiveApp();
        }

        public void onStreamVolume(float arg0) {
            real.onStreamVolume(arg0);
        }

        public void onSurfaceChanged(int arg0, int arg1, int arg2) {
            real.onSurfaceChanged(arg0, arg1, arg2);
        }

        public void onTimeShiftCurrentPositionChanged(java.lang.String arg0, long arg1) {
            real.onTimeShiftCurrentPositionChanged(arg0, arg1);
        }

        public void onTimeShiftMode(int arg0) {
            real.onTimeShiftMode(arg0);
        }

        public void onTimeShiftPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
            real.onTimeShiftPlaybackParams(arg0 == null ? null : arg0.unwrap());
        }

        public void onTimeShiftStartPositionChanged(java.lang.String arg0, long arg1) {
            real.onTimeShiftStartPositionChanged(arg0, arg1);
        }

        public void onTimeShiftStatusChanged(java.lang.String arg0, int arg1) {
            real.onTimeShiftStatusChanged(arg0, arg1);
        }

        public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
        }

        public void onTrackSelected(int arg0, java.lang.String arg1) {
            real.onTrackSelected(arg0, arg1);
        }

        public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
            return real.onTrackballEvent(arg0 == null ? null : arg0.unwrap());
        }

        public void onTuned(com.micklab.dcg.wrapper.android.net.Uri arg0) {
            real.onTuned(arg0 == null ? null : arg0.unwrap());
        }

        public void onTvMessage(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.onTvMessage(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onTvRecordingInfo(com.micklab.dcg.wrapper.android.media.tv.TvRecordingInfo arg0) {
            real.onTvRecordingInfo(arg0 == null ? null : arg0.unwrap());
        }

        public void onVideoAvailable() {
            real.onVideoAvailable();
        }

        public void onVideoUnavailable(int arg0) {
            real.onVideoUnavailable(arg0);
        }

        public void removeBroadcastInfo(int arg0) {
            real.removeBroadcastInfo(arg0);
        }

        public void requestAd(com.micklab.dcg.wrapper.android.media.tv.AdRequest arg0) {
            real.requestAd(arg0 == null ? null : arg0.unwrap());
        }

        public void requestAvailableSpeeds() {
            real.requestAvailableSpeeds();
        }

        public void requestBroadcastInfo(com.micklab.dcg.wrapper.android.media.tv.BroadcastInfoRequest arg0) {
            real.requestBroadcastInfo(arg0 == null ? null : arg0.unwrap());
        }

        public void requestCurrentChannelLcn() {
            real.requestCurrentChannelLcn();
        }

        public void requestCurrentChannelUri() {
            real.requestCurrentChannelUri();
        }

        public void requestCurrentTvInputId() {
            real.requestCurrentTvInputId();
        }

        public void requestCurrentVideoBounds() {
            real.requestCurrentVideoBounds();
        }

        public void requestScheduleRecording(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, com.micklab.dcg.wrapper.android.os.Bundle arg4) {
            real.requestScheduleRecording(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap());
        }

        public void requestScheduleRecording(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2, long arg3, long arg4, int arg5, com.micklab.dcg.wrapper.android.os.Bundle arg6) {
            real.requestScheduleRecording(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap());
        }

        public void requestSigning(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, byte[] arg3) {
            real.requestSigning(arg0, arg1, arg2, arg3);
        }

        public void requestStartRecording(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            real.requestStartRecording(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void requestStopRecording(java.lang.String arg0) {
            real.requestStopRecording(arg0);
        }

        public void requestStreamVolume() {
            real.requestStreamVolume();
        }

        public void requestTimeShiftMode() {
            real.requestTimeShiftMode();
        }

        public void requestTrackInfoList() {
            real.requestTrackInfoList();
        }

        public void requestTvRecordingInfo(java.lang.String arg0) {
            real.requestTvRecordingInfo(arg0);
        }

        public void requestTvRecordingInfoList(int arg0) {
            real.requestTvRecordingInfoList(arg0);
        }

        public void sendPlaybackCommandRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.sendPlaybackCommandRequest(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void sendTimeShiftCommandRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
            real.sendTimeShiftCommandRequest(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void setMediaViewEnabled(boolean arg0) {
            real.setMediaViewEnabled(arg0);
        }

        public void setTvRecordingInfo(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.tv.TvRecordingInfo arg1) {
            real.setTvRecordingInfo(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void setVideoBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
            real.setVideoBounds(arg0 == null ? null : arg0.unwrap());
        }

    }
}
