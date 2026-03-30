// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv.interactive;

public final class TvInteractiveAppView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvInteractiveAppView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView wrap(android.media.tv.interactive.TvInteractiveAppView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.interactive.TvInteractiveAppView getReal() {
        return (android.media.tv.interactive.TvInteractiveAppView) real;
    }

    public android.media.tv.interactive.TvInteractiveAppView unwrap() {
        return getReal();
    }

    public TvInteractiveAppView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.media.tv.interactive.TvInteractiveAppView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TvInteractiveAppView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.media.tv.interactive.TvInteractiveAppView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TvInteractiveAppView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.media.tv.interactive.TvInteractiveAppView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public void clearCallback() {
        ((android.media.tv.interactive.TvInteractiveAppView) real).clearCallback();
    }

    public void clearOnUnhandledInputEventListener() {
        ((android.media.tv.interactive.TvInteractiveAppView) real).clearOnUnhandledInputEventListener();
    }

    public void createBiInteractiveApp(com.micklab.dcg.wrapper.android.net.Uri arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).createBiInteractiveApp(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void destroyBiInteractiveApp(java.lang.String arg0) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).destroyBiInteractiveApp(arg0);
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.media.tv.interactive.TvInteractiveAppView) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return ((android.media.tv.interactive.TvInteractiveAppView) real).dispatchUnhandledInputEvent(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener getOnUnhandledInputEventListener() {
        return com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener.wrap(((android.media.tv.interactive.TvInteractiveAppView) real).getOnUnhandledInputEventListener());
    }

    public void notifyError(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).notifyError(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void notifyRecordingScheduled(java.lang.String arg0, java.lang.String arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).notifyRecordingScheduled(arg0, arg1);
    }

    public void notifyRecordingStarted(java.lang.String arg0, java.lang.String arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).notifyRecordingStarted(arg0, arg1);
    }

    public void notifyRecordingStopped(java.lang.String arg0) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).notifyRecordingStopped(arg0);
    }

    public void notifyTimeShiftCurrentPositionChanged(java.lang.String arg0, long arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).notifyTimeShiftCurrentPositionChanged(arg0, arg1);
    }

    public void notifyTimeShiftPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).notifyTimeShiftPlaybackParams(arg0 == null ? null : arg0.getReal());
    }

    public void notifyTimeShiftStartPositionChanged(java.lang.String arg0, long arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).notifyTimeShiftStartPositionChanged(arg0, arg1);
    }

    public void notifyTimeShiftStatusChanged(java.lang.String arg0, int arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).notifyTimeShiftStatusChanged(arg0, arg1);
    }

    public void notifyTvMessage(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).notifyTvMessage(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onAttachedToWindow() {
        ((android.media.tv.interactive.TvInteractiveAppView) real).onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        ((android.media.tv.interactive.TvInteractiveAppView) real).onDetachedFromWindow();
    }

    public void onLayout(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).onLayout(arg0, arg1, arg2, arg3, arg4);
    }

    public void onMeasure(int arg0, int arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).onMeasure(arg0, arg1);
    }

    public boolean onUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return ((android.media.tv.interactive.TvInteractiveAppView) real).onUnhandledInputEvent(arg0 == null ? null : arg0.getReal());
    }

    public void onVisibilityChanged(com.micklab.dcg.wrapper.android.view.View arg0, int arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).onVisibilityChanged(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void prepareInteractiveApp(java.lang.String arg0, int arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).prepareInteractiveApp(arg0, arg1);
    }

    public void reset() {
        ((android.media.tv.interactive.TvInteractiveAppView) real).reset();
    }

    public void resetInteractiveApp() {
        ((android.media.tv.interactive.TvInteractiveAppView) real).resetInteractiveApp();
    }

    public void sendAvailableSpeeds(float[] arg0) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).sendAvailableSpeeds(arg0);
    }

    public void sendCurrentChannelLcn(int arg0) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).sendCurrentChannelLcn(arg0);
    }

    public void sendCurrentChannelUri(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).sendCurrentChannelUri(arg0 == null ? null : arg0.getReal());
    }

    public void sendCurrentTvInputId(java.lang.String arg0) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).sendCurrentTvInputId(arg0);
    }

    public void sendCurrentVideoBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).sendCurrentVideoBounds(arg0 == null ? null : arg0.getReal());
    }

    public void sendSigningResult(java.lang.String arg0, byte[] arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).sendSigningResult(arg0, arg1);
    }

    public void sendStreamVolume(float arg0) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).sendStreamVolume(arg0);
    }

    public void sendTimeShiftMode(int arg0) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).sendTimeShiftMode(arg0);
    }

    public void sendTvRecordingInfo(com.micklab.dcg.wrapper.android.media.tv.TvRecordingInfo arg0) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).sendTvRecordingInfo(arg0 == null ? null : arg0.getReal());
    }

    public void setCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).setCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setOnUnhandledInputEventListener(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener arg1) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).setOnUnhandledInputEventListener(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setTeletextAppEnabled(boolean arg0) {
        ((android.media.tv.interactive.TvInteractiveAppView) real).setTeletextAppEnabled(arg0);
    }

    public int setTvView(com.micklab.dcg.wrapper.android.media.tv.TvView arg0) {
        return ((android.media.tv.interactive.TvInteractiveAppView) real).setTvView(arg0 == null ? null : arg0.getReal());
    }

    public void startInteractiveApp() {
        ((android.media.tv.interactive.TvInteractiveAppView) real).startInteractiveApp();
    }

    public void stopInteractiveApp() {
        ((android.media.tv.interactive.TvInteractiveAppView) real).stopInteractiveApp();
    }

    public static final java.lang.String BI_INTERACTIVE_APP_KEY_ALIAS = android.media.tv.interactive.TvInteractiveAppView.BI_INTERACTIVE_APP_KEY_ALIAS;
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_CERTIFICATE = android.media.tv.interactive.TvInteractiveAppView.BI_INTERACTIVE_APP_KEY_CERTIFICATE;
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_HTTP_ADDITIONAL_HEADERS = android.media.tv.interactive.TvInteractiveAppView.BI_INTERACTIVE_APP_KEY_HTTP_ADDITIONAL_HEADERS;
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_HTTP_USER_AGENT = android.media.tv.interactive.TvInteractiveAppView.BI_INTERACTIVE_APP_KEY_HTTP_USER_AGENT;
    public static final java.lang.String BI_INTERACTIVE_APP_KEY_PRIVATE_KEY = android.media.tv.interactive.TvInteractiveAppView.BI_INTERACTIVE_APP_KEY_PRIVATE_KEY;
    public static final java.lang.String ERROR_KEY_METHOD_NAME = android.media.tv.interactive.TvInteractiveAppView.ERROR_KEY_METHOD_NAME;

    public static final class OnUnhandledInputEventListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnUnhandledInputEventListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener wrap(android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener getReal() {
            return (android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener) real;
        }

        public android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener unwrap() {
            return getReal();
        }

        public boolean onUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
            return ((android.media.tv.interactive.TvInteractiveAppView.OnUnhandledInputEventListener) real).onUnhandledInputEvent(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class TvInteractiveAppCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TvInteractiveAppCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback wrap(android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback getReal() {
            return (android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real;
        }

        public android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback unwrap() {
            return getReal();
        }

        public void onBiInteractiveAppCreated(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, java.lang.String arg2) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onBiInteractiveAppCreated(arg0, arg1 == null ? null : arg1.getReal(), arg2);
        }

        public void onPlaybackCommandRequest(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onPlaybackCommandRequest(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public void onRequestAvailableSpeeds(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestAvailableSpeeds(arg0);
        }

        public void onRequestCurrentChannelLcn(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestCurrentChannelLcn(arg0);
        }

        public void onRequestCurrentChannelUri(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestCurrentChannelUri(arg0);
        }

        public void onRequestCurrentTvInputId(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestCurrentTvInputId(arg0);
        }

        public void onRequestCurrentVideoBounds(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestCurrentVideoBounds(arg0);
        }

        public void onRequestScheduleRecording(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, com.micklab.dcg.wrapper.android.net.Uri arg4, com.micklab.dcg.wrapper.android.os.Bundle arg5) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestScheduleRecording(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4 == null ? null : arg4.getReal(), arg5 == null ? null : arg5.getReal());
        }

        public void onRequestScheduleRecording(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, com.micklab.dcg.wrapper.android.net.Uri arg3, long arg4, long arg5, int arg6, com.micklab.dcg.wrapper.android.os.Bundle arg7) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestScheduleRecording(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5, arg6, arg7 == null ? null : arg7.getReal());
        }

        public void onRequestSigning(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, byte[] arg4) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestSigning(arg0, arg1, arg2, arg3, arg4);
        }

        public void onRequestStartRecording(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.net.Uri arg2) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestStartRecording(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public void onRequestStopRecording(java.lang.String arg0, java.lang.String arg1) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestStopRecording(arg0, arg1);
        }

        public void onRequestStreamVolume(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestStreamVolume(arg0);
        }

        public void onRequestTimeShiftMode(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestTimeShiftMode(arg0);
        }

        public void onRequestTrackInfoList(java.lang.String arg0) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestTrackInfoList(arg0);
        }

        public void onRequestTvRecordingInfo(java.lang.String arg0, java.lang.String arg1) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestTvRecordingInfo(arg0, arg1);
        }

        public void onRequestTvRecordingInfoList(java.lang.String arg0, int arg1) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onRequestTvRecordingInfoList(arg0, arg1);
        }

        public void onSetTvRecordingInfo(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.media.tv.TvRecordingInfo arg2) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onSetTvRecordingInfo(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public void onSetVideoBounds(java.lang.String arg0, com.micklab.dcg.wrapper.android.graphics.Rect arg1) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onSetVideoBounds(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onStateChanged(java.lang.String arg0, int arg1, int arg2) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onStateChanged(arg0, arg1, arg2);
        }

        public void onTeletextAppStateChanged(java.lang.String arg0, int arg1) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onTeletextAppStateChanged(arg0, arg1);
        }

        public void onTimeShiftCommandRequest(java.lang.String arg0, java.lang.String arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            ((android.media.tv.interactive.TvInteractiveAppView.TvInteractiveAppCallback) real).onTimeShiftCommandRequest(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

    }
}
