// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TvView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvView wrap(android.media.tv.TvView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvView(real, (__DcgwBridgeToken) null);
    }

    public android.media.tv.TvView getReal() {
        return (android.media.tv.TvView) real;
    }

    public android.media.tv.TvView unwrap() {
        return getReal();
    }

    public TvView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.media.tv.TvView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public TvView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.media.tv.TvView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public TvView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.media.tv.TvView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public boolean dispatchGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.media.tv.TvView) real).dispatchGenericMotionEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.media.tv.TvView) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.media.tv.TvView) real).dispatchTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.media.tv.TvView) real).dispatchTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean dispatchUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return ((android.media.tv.TvView) real).dispatchUnhandledInputEvent(arg0 == null ? null : arg0.getReal());
    }

    public void dispatchWindowFocusChanged(boolean arg0) {
        ((android.media.tv.TvView) real).dispatchWindowFocusChanged(arg0);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.media.tv.TvView) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public boolean gatherTransparentRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        return ((android.media.tv.TvView) real).gatherTransparentRegion(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.String getSelectedTrack(int arg0) {
        return ((android.media.tv.TvView) real).getSelectedTrack(arg0);
    }

    public boolean onUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return ((android.media.tv.TvView) real).onUnhandledInputEvent(arg0 == null ? null : arg0.getReal());
    }

    public void overrideTvAppAttributionSource(com.micklab.dcg.wrapper.android.content.AttributionSource arg0) {
        ((android.media.tv.TvView) real).overrideTvAppAttributionSource(arg0 == null ? null : arg0.getReal());
    }

    public void reset() {
        ((android.media.tv.TvView) real).reset();
    }

    public void selectAudioPresentation(int arg0, int arg1) {
        ((android.media.tv.TvView) real).selectAudioPresentation(arg0, arg1);
    }

    public void selectTrack(int arg0, java.lang.String arg1) {
        ((android.media.tv.TvView) real).selectTrack(arg0, arg1);
    }

    public void sendAppPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.media.tv.TvView) real).sendAppPrivateCommand(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setCallback(com.micklab.dcg.wrapper.android.media.tv.TvView.TvInputCallback arg0) {
        ((android.media.tv.TvView) real).setCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setCaptionEnabled(boolean arg0) {
        ((android.media.tv.TvView) real).setCaptionEnabled(arg0);
    }

    public void setInteractiveAppNotificationEnabled(boolean arg0) {
        ((android.media.tv.TvView) real).setInteractiveAppNotificationEnabled(arg0);
    }

    public void setOnUnhandledInputEventListener(com.micklab.dcg.wrapper.android.media.tv.TvView.OnUnhandledInputEventListener arg0) {
        ((android.media.tv.TvView) real).setOnUnhandledInputEventListener(arg0 == null ? null : arg0.getReal());
    }

    public void setStreamVolume(float arg0) {
        ((android.media.tv.TvView) real).setStreamVolume(arg0);
    }

    public void setTimeShiftPositionCallback(com.micklab.dcg.wrapper.android.media.tv.TvView.TimeShiftPositionCallback arg0) {
        ((android.media.tv.TvView) real).setTimeShiftPositionCallback(arg0 == null ? null : arg0.getReal());
    }

    public void setTvMessageEnabled(int arg0, boolean arg1) {
        ((android.media.tv.TvView) real).setTvMessageEnabled(arg0, arg1);
    }

    public void setZOrderMediaOverlay(boolean arg0) {
        ((android.media.tv.TvView) real).setZOrderMediaOverlay(arg0);
    }

    public void setZOrderOnTop(boolean arg0) {
        ((android.media.tv.TvView) real).setZOrderOnTop(arg0);
    }

    public void timeShiftPause() {
        ((android.media.tv.TvView) real).timeShiftPause();
    }

    public void timeShiftPlay(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        ((android.media.tv.TvView) real).timeShiftPlay(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void timeShiftResume() {
        ((android.media.tv.TvView) real).timeShiftResume();
    }

    public void timeShiftSeekTo(long arg0) {
        ((android.media.tv.TvView) real).timeShiftSeekTo(arg0);
    }

    public void timeShiftSetMode(int arg0) {
        ((android.media.tv.TvView) real).timeShiftSetMode(arg0);
    }

    public void timeShiftSetPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
        ((android.media.tv.TvView) real).timeShiftSetPlaybackParams(arg0 == null ? null : arg0.getReal());
    }

    public void tune(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        ((android.media.tv.TvView) real).tune(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void tune(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        ((android.media.tv.TvView) real).tune(arg0, arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal());
    }

    public static final class OnUnhandledInputEventListener {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private OnUnhandledInputEventListener(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvView.OnUnhandledInputEventListener wrap(android.media.tv.TvView.OnUnhandledInputEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvView.OnUnhandledInputEventListener(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvView.OnUnhandledInputEventListener getReal() {
            return (android.media.tv.TvView.OnUnhandledInputEventListener) real;
        }

        public android.media.tv.TvView.OnUnhandledInputEventListener unwrap() {
            return getReal();
        }

        public boolean onUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
            return ((android.media.tv.TvView.OnUnhandledInputEventListener) real).onUnhandledInputEvent(arg0 == null ? null : arg0.getReal());
        }

    }
    public static final class TimeShiftPositionCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TimeShiftPositionCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvView.TimeShiftPositionCallback wrap(android.media.tv.TvView.TimeShiftPositionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvView.TimeShiftPositionCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvView.TimeShiftPositionCallback getReal() {
            return (android.media.tv.TvView.TimeShiftPositionCallback) real;
        }

        public android.media.tv.TvView.TimeShiftPositionCallback unwrap() {
            return getReal();
        }

        public void onTimeShiftCurrentPositionChanged(java.lang.String arg0, long arg1) {
            ((android.media.tv.TvView.TimeShiftPositionCallback) real).onTimeShiftCurrentPositionChanged(arg0, arg1);
        }

        public void onTimeShiftStartPositionChanged(java.lang.String arg0, long arg1) {
            ((android.media.tv.TvView.TimeShiftPositionCallback) real).onTimeShiftStartPositionChanged(arg0, arg1);
        }

    }
    public static final class TvInputCallback {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private TvInputCallback(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvView.TvInputCallback wrap(android.media.tv.TvView.TvInputCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvView.TvInputCallback(real, (__DcgwBridgeToken) null);
        }

        public android.media.tv.TvView.TvInputCallback getReal() {
            return (android.media.tv.TvView.TvInputCallback) real;
        }

        public android.media.tv.TvView.TvInputCallback unwrap() {
            return getReal();
        }

        public void onAitInfoUpdated(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.tv.AitInfo arg1) {
            ((android.media.tv.TvView.TvInputCallback) real).onAitInfoUpdated(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onAudioPresentationSelected(java.lang.String arg0, int arg1, int arg2) {
            ((android.media.tv.TvView.TvInputCallback) real).onAudioPresentationSelected(arg0, arg1, arg2);
        }

        public void onAvailableSpeeds(java.lang.String arg0, float[] arg1) {
            ((android.media.tv.TvView.TvInputCallback) real).onAvailableSpeeds(arg0, arg1);
        }

        public void onChannelRetuned(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            ((android.media.tv.TvView.TvInputCallback) real).onChannelRetuned(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onConnectionFailed(java.lang.String arg0) {
            ((android.media.tv.TvView.TvInputCallback) real).onConnectionFailed(arg0);
        }

        public void onContentAllowed(java.lang.String arg0) {
            ((android.media.tv.TvView.TvInputCallback) real).onContentAllowed(arg0);
        }

        public void onContentBlocked(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.tv.TvContentRating arg1) {
            ((android.media.tv.TvView.TvInputCallback) real).onContentBlocked(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onCueingMessageAvailability(java.lang.String arg0, boolean arg1) {
            ((android.media.tv.TvView.TvInputCallback) real).onCueingMessageAvailability(arg0, arg1);
        }

        public void onDisconnected(java.lang.String arg0) {
            ((android.media.tv.TvView.TvInputCallback) real).onDisconnected(arg0);
        }

        public void onSignalStrengthUpdated(java.lang.String arg0, int arg1) {
            ((android.media.tv.TvView.TvInputCallback) real).onSignalStrengthUpdated(arg0, arg1);
        }

        public void onTimeShiftMode(java.lang.String arg0, int arg1) {
            ((android.media.tv.TvView.TvInputCallback) real).onTimeShiftMode(arg0, arg1);
        }

        public void onTimeShiftStatusChanged(java.lang.String arg0, int arg1) {
            ((android.media.tv.TvView.TvInputCallback) real).onTimeShiftStatusChanged(arg0, arg1);
        }

        public void onTrackSelected(java.lang.String arg0, int arg1, java.lang.String arg2) {
            ((android.media.tv.TvView.TvInputCallback) real).onTrackSelected(arg0, arg1, arg2);
        }

        public void onTuned(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            ((android.media.tv.TvView.TvInputCallback) real).onTuned(arg0, arg1 == null ? null : arg1.getReal());
        }

        public void onTvMessage(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            ((android.media.tv.TvView.TvInputCallback) real).onTvMessage(arg0, arg1, arg2 == null ? null : arg2.getReal());
        }

        public void onVideoAvailable(java.lang.String arg0) {
            ((android.media.tv.TvView.TvInputCallback) real).onVideoAvailable(arg0);
        }

        public void onVideoSizeChanged(java.lang.String arg0, int arg1, int arg2) {
            ((android.media.tv.TvView.TvInputCallback) real).onVideoSizeChanged(arg0, arg1, arg2);
        }

        public void onVideoUnavailable(java.lang.String arg0, int arg1) {
            ((android.media.tv.TvView.TvInputCallback) real).onVideoUnavailable(arg0, arg1);
        }

    }
}
