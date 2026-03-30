// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv.interactive;

public final class TvInteractiveAppView {
    private final android.media.tv.interactive.TvInteractiveAppView real;

    public TvInteractiveAppView(android.media.tv.interactive.TvInteractiveAppView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView wrap(android.media.tv.interactive.TvInteractiveAppView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView(real);
    }

    public android.media.tv.interactive.TvInteractiveAppView unwrap() {
        return real;
    }

    public TvInteractiveAppView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.media.tv.interactive.TvInteractiveAppView(arg0 == null ? null : arg0.unwrap()));
    }

    public TvInteractiveAppView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.media.tv.interactive.TvInteractiveAppView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public TvInteractiveAppView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.media.tv.interactive.TvInteractiveAppView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public void clearCallback() {
        real.clearCallback();
    }

    public void clearOnUnhandledInputEventListener() {
        real.clearOnUnhandledInputEventListener();
    }

    public void createBiInteractiveApp(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.createBiInteractiveApp(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void destroyBiInteractiveApp(java.lang.String arg0) {
        real.destroyBiInteractiveApp(arg0);
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean dispatchUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return real.dispatchUnhandledInputEvent(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener getOnUnhandledInputEventListener() {
        return com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener.wrap(real.getOnUnhandledInputEventListener());
    }

    public void notifyError(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.notifyError(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void notifyRecordingScheduled(java.lang.String arg0, java.lang.String arg1) {
        real.notifyRecordingScheduled(arg0, arg1);
    }

    public void notifyRecordingStarted(java.lang.String arg0, java.lang.String arg1) {
        real.notifyRecordingStarted(arg0, arg1);
    }

    public void notifyRecordingStopped(java.lang.String arg0) {
        real.notifyRecordingStopped(arg0);
    }

    public void notifyTimeShiftCurrentPositionChanged(java.lang.String arg0, long arg1) {
        real.notifyTimeShiftCurrentPositionChanged(arg0, arg1);
    }

    public void notifyTimeShiftPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
        real.notifyTimeShiftPlaybackParams(arg0 == null ? null : arg0.unwrap());
    }

    public void notifyTimeShiftStartPositionChanged(java.lang.String arg0, long arg1) {
        real.notifyTimeShiftStartPositionChanged(arg0, arg1);
    }

    public void notifyTimeShiftStatusChanged(java.lang.String arg0, int arg1) {
        real.notifyTimeShiftStatusChanged(arg0, arg1);
    }

    public void notifyTvMessage(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.notifyTvMessage(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onAttachedToWindow() {
        real.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        real.onDetachedFromWindow();
    }

    public void onLayout(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        real.onLayout(arg0, arg1, arg2, arg3, arg4);
    }

    public void onMeasure(int arg0, int arg1) {
        real.onMeasure(arg0, arg1);
    }

    public boolean onUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return real.onUnhandledInputEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void onVisibilityChanged(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        real.onVisibilityChanged(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void prepareInteractiveApp(java.lang.String arg0, int arg1) {
        real.prepareInteractiveApp(arg0, arg1);
    }

    public void reset() {
        real.reset();
    }

    public void resetInteractiveApp() {
        real.resetInteractiveApp();
    }

    public void sendAvailableSpeeds(float[] arg0) {
        real.sendAvailableSpeeds(arg0);
    }

    public void sendCurrentChannelLcn(int arg0) {
        real.sendCurrentChannelLcn(arg0);
    }

    public void sendCurrentChannelUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        real.sendCurrentChannelUri(arg0 == null ? null : arg0.unwrap());
    }

    public void sendCurrentTvInputId(java.lang.String arg0) {
        real.sendCurrentTvInputId(arg0);
    }

    public void sendCurrentVideoBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.sendCurrentVideoBounds(arg0 == null ? null : arg0.unwrap());
    }

    public void sendSigningResult(java.lang.String arg0, byte[] arg1) {
        real.sendSigningResult(arg0, arg1);
    }

    public void sendStreamVolume(float arg0) {
        real.sendStreamVolume(arg0);
    }

    public void sendTimeShiftMode(int arg0) {
        real.sendTimeShiftMode(arg0);
    }

    public void sendTvRecordingInfo(com.micklab.dcg.wrapper.android.media.tv.TvRecordingInfo arg0) {
        real.sendTvRecordingInfo(arg0 == null ? null : arg0.unwrap());
    }

    public void setCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback arg1) {
        real.setCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setOnUnhandledInputEventListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener arg1) {
        real.setOnUnhandledInputEventListener(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setTeletextAppEnabled(boolean arg0) {
        real.setTeletextAppEnabled(arg0);
    }

    public int setTvView(com.micklab.dcg.wrapper.android.media.tv.TvView arg0) {
        return real.setTvView(arg0 == null ? null : arg0.unwrap());
    }

    public void startInteractiveApp() {
        real.startInteractiveApp();
    }

    public void stopInteractiveApp() {
        real.stopInteractiveApp();
    }

    public static final java.lang.String BI_INTERACTIVE_APP_KEY_ALIAS = android.media.tv.interactive.TvInteractiveAppView.BI_INTERACTIVE_APP_KEY_ALIAS;
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_CERTIFICATE = android.media.tv.interactive.TvInteractiveAppView.BI_INTERACTIVE_APP_KEY_CERTIFICATE;
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_HTTP_ADDITIONAL_HEADERS = android.media.tv.interactive.TvInteractiveAppView.BI_INTERACTIVE_APP_KEY_HTTP_ADDITIONAL_HEADERS;
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_HTTP_USER_AGENT = android.media.tv.interactive.TvInteractiveAppView.BI_INTERACTIVE_APP_KEY_HTTP_USER_AGENT;
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_PRIVATE_KEY = android.media.tv.interactive.TvInteractiveAppView.BI_INTERACTIVE_APP_KEY_PRIVATE_KEY;
    public static final java.lang.String ERROR_KEY_METHOD_NAME = android.media.tv.interactive.TvInteractiveAppView.ERROR_KEY_METHOD_NAME;

    public static final class OnUnhandledInputEventListener {
        private final android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener real;

        public OnUnhandledInputEventListener(android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener wrap(android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener(real);
        }

        public android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener unwrap() {
            return real;
        }

        public boolean onUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
            return real.onUnhandledInputEvent(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class TvInteractiveAppCallback {
        private final android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback real;

        public TvInteractiveAppCallback(android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback wrap(android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback(real);
        }

        public android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback unwrap() {
            return real;
        }

        public void onBiInteractiveAppCreated(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String arg2) {
            real.onBiInteractiveAppCreated(arg0, arg1 == null ? null : arg1.unwrap(), arg2);
        }

        public void onPlaybackCommandRequest(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            real.onPlaybackCommandRequest(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void onRequestAvailableSpeeds(java.lang.String arg0) {
            real.onRequestAvailableSpeeds(arg0);
        }

        public void onRequestCurrentChannelLcn(java.lang.String arg0) {
            real.onRequestCurrentChannelLcn(arg0);
        }

        public void onRequestCurrentChannelUri(java.lang.String arg0) {
            real.onRequestCurrentChannelUri(arg0);
        }

        public void onRequestCurrentTvInputId(java.lang.String arg0) {
            real.onRequestCurrentTvInputId(arg0);
        }

        public void onRequestCurrentVideoBounds(java.lang.String arg0) {
            real.onRequestCurrentVideoBounds(arg0);
        }

        public void onRequestScheduleRecording(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, com.micklab.dcg.wrapper.android.net.Uri arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) {
            real.onRequestScheduleRecording(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4 == null ? null : arg4.unwrap(), arg5 == null ? null : arg5.unwrap());
        }

        public void onRequestScheduleRecording(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, long arg4, long arg5, int arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
            real.onRequestScheduleRecording(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5, arg6, arg7 == null ? null : arg7.unwrap());
        }

        public void onRequestSigning(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, byte[] arg4) {
            real.onRequestSigning(arg0, arg1, arg2, arg3, arg4);
        }

        public void onRequestStartRecording(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
            real.onRequestStartRecording(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void onRequestStopRecording(java.lang.String arg0, java.lang.String arg1) {
            real.onRequestStopRecording(arg0, arg1);
        }

        public void onRequestStreamVolume(java.lang.String arg0) {
            real.onRequestStreamVolume(arg0);
        }

        public void onRequestTimeShiftMode(java.lang.String arg0) {
            real.onRequestTimeShiftMode(arg0);
        }

        public void onRequestTrackInfoList(java.lang.String arg0) {
            real.onRequestTrackInfoList(arg0);
        }

        public void onRequestTvRecordingInfo(java.lang.String arg0, java.lang.String arg1) {
            real.onRequestTvRecordingInfo(arg0, arg1);
        }

        public void onRequestTvRecordingInfoList(java.lang.String arg0, int arg1) {
            real.onRequestTvRecordingInfoList(arg0, arg1);
        }

        public void onSetTvRecordingInfo(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.media.tv.TvRecordingInfo arg2) {
            real.onSetTvRecordingInfo(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void onSetVideoBounds(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
            real.onSetVideoBounds(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onStateChanged(java.lang.String arg0, int arg1, int arg2) {
            real.onStateChanged(arg0, arg1, arg2);
        }

        public void onTeletextAppStateChanged(java.lang.String arg0, int arg1) {
            real.onTeletextAppStateChanged(arg0, arg1);
        }

        public void onTimeShiftCommandRequest(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            real.onTimeShiftCommandRequest(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

    }
}
