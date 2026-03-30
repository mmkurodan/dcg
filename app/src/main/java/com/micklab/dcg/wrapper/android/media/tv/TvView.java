// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media.tv;

public final class TvView {
    private final android.media.tv.TvView real;

    public TvView(android.media.tv.TvView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.tv.TvView wrap(android.media.tv.TvView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvView(real);
    }

    public android.media.tv.TvView unwrap() {
        return real;
    }

    public TvView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.media.tv.TvView(arg0 == null ? null : arg0.unwrap()));
    }

    public TvView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.media.tv.TvView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public TvView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.media.tv.TvView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public boolean dispatchGenericMotionEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.dispatchGenericMotionEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean dispatchTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.dispatchTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean dispatchTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.dispatchTrackballEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean dispatchUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return real.dispatchUnhandledInputEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void dispatchWindowFocusChanged(boolean arg0) {
        real.dispatchWindowFocusChanged(arg0);
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public boolean gatherTransparentRegion(com.micklab.dcg.wrapper.android.graphics.Region arg0) {
        return real.gatherTransparentRegion(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.String getSelectedTrack(int arg0) {
        return real.getSelectedTrack(arg0);
    }

    public boolean onUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
        return real.onUnhandledInputEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void overrideTvAppAttributionSource(com.micklab.dcg.wrapper.android.content.AttributionSource arg0) {
        real.overrideTvAppAttributionSource(arg0 == null ? null : arg0.unwrap());
    }

    public void reset() {
        real.reset();
    }

    public void selectAudioPresentation(int arg0, int arg1) {
        real.selectAudioPresentation(arg0, arg1);
    }

    public void selectTrack(int arg0, java.lang.String arg1) {
        real.selectTrack(arg0, arg1);
    }

    public void sendAppPrivateCommand(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.sendAppPrivateCommand(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setCallback(com.micklab.dcg.wrapper.android.media.tv.TvView.TvInputCallback arg0) {
        real.setCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setCaptionEnabled(boolean arg0) {
        real.setCaptionEnabled(arg0);
    }

    public void setInteractiveAppNotificationEnabled(boolean arg0) {
        real.setInteractiveAppNotificationEnabled(arg0);
    }

    public void setOnUnhandledInputEventListener(com.micklab.dcg.wrapper.android.media.tv.TvView.OnUnhandledInputEventListener arg0) {
        real.setOnUnhandledInputEventListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setStreamVolume(float arg0) {
        real.setStreamVolume(arg0);
    }

    public void setTimeShiftPositionCallback(com.micklab.dcg.wrapper.android.media.tv.TvView.TimeShiftPositionCallback arg0) {
        real.setTimeShiftPositionCallback(arg0 == null ? null : arg0.unwrap());
    }

    public void setTvMessageEnabled(int arg0, boolean arg1) {
        real.setTvMessageEnabled(arg0, arg1);
    }

    public void setZOrderMediaOverlay(boolean arg0) {
        real.setZOrderMediaOverlay(arg0);
    }

    public void setZOrderOnTop(boolean arg0) {
        real.setZOrderOnTop(arg0);
    }

    public void timeShiftPause() {
        real.timeShiftPause();
    }

    public void timeShiftPlay(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        real.timeShiftPlay(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void timeShiftResume() {
        real.timeShiftResume();
    }

    public void timeShiftSeekTo(long arg0) {
        real.timeShiftSeekTo(arg0);
    }

    public void timeShiftSetMode(int arg0) {
        real.timeShiftSetMode(arg0);
    }

    public void timeShiftSetPlaybackParams(com.micklab.dcg.wrapper.android.media.PlaybackParams arg0) {
        real.timeShiftSetPlaybackParams(arg0 == null ? null : arg0.unwrap());
    }

    public void tune(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
        real.tune(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void tune(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
        real.tune(arg0, arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap());
    }

    public static final class OnUnhandledInputEventListener {
        private final android.media.tv.TvView.OnUnhandledInputEventListener real;

        public OnUnhandledInputEventListener(android.media.tv.TvView.OnUnhandledInputEventListener real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvView.OnUnhandledInputEventListener wrap(android.media.tv.TvView.OnUnhandledInputEventListener real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvView.OnUnhandledInputEventListener(real);
        }

        public android.media.tv.TvView.OnUnhandledInputEventListener unwrap() {
            return real;
        }

        public boolean onUnhandledInputEvent(com.micklab.dcg.wrapper.android.view.InputEvent arg0) {
            return real.onUnhandledInputEvent(arg0 == null ? null : arg0.unwrap());
        }

    }
    public static final class TimeShiftPositionCallback {
        private final android.media.tv.TvView.TimeShiftPositionCallback real;

        public TimeShiftPositionCallback(android.media.tv.TvView.TimeShiftPositionCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvView.TimeShiftPositionCallback wrap(android.media.tv.TvView.TimeShiftPositionCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvView.TimeShiftPositionCallback(real);
        }

        public android.media.tv.TvView.TimeShiftPositionCallback unwrap() {
            return real;
        }

        public void onTimeShiftCurrentPositionChanged(java.lang.String arg0, long arg1) {
            real.onTimeShiftCurrentPositionChanged(arg0, arg1);
        }

        public void onTimeShiftStartPositionChanged(java.lang.String arg0, long arg1) {
            real.onTimeShiftStartPositionChanged(arg0, arg1);
        }

    }
    public static final class TvInputCallback {
        private final android.media.tv.TvView.TvInputCallback real;

        public TvInputCallback(android.media.tv.TvView.TvInputCallback real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.media.tv.TvView.TvInputCallback wrap(android.media.tv.TvView.TvInputCallback real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.media.tv.TvView.TvInputCallback(real);
        }

        public android.media.tv.TvView.TvInputCallback unwrap() {
            return real;
        }

        public void onAitInfoUpdated(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.tv.AitInfo arg1) {
            real.onAitInfoUpdated(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onAudioPresentationSelected(java.lang.String arg0, int arg1, int arg2) {
            real.onAudioPresentationSelected(arg0, arg1, arg2);
        }

        public void onAvailableSpeeds(java.lang.String arg0, float[] arg1) {
            real.onAvailableSpeeds(arg0, arg1);
        }

        public void onChannelRetuned(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            real.onChannelRetuned(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onConnectionFailed(java.lang.String arg0) {
            real.onConnectionFailed(arg0);
        }

        public void onContentAllowed(java.lang.String arg0) {
            real.onContentAllowed(arg0);
        }

        public void onContentBlocked(java.lang.String arg0, com.micklab.dcg.wrapper.android.media.tv.TvContentRating arg1) {
            real.onContentBlocked(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onCueingMessageAvailability(java.lang.String arg0, boolean arg1) {
            real.onCueingMessageAvailability(arg0, arg1);
        }

        public void onDisconnected(java.lang.String arg0) {
            real.onDisconnected(arg0);
        }

        public void onSignalStrengthUpdated(java.lang.String arg0, int arg1) {
            real.onSignalStrengthUpdated(arg0, arg1);
        }

        public void onTimeShiftMode(java.lang.String arg0, int arg1) {
            real.onTimeShiftMode(arg0, arg1);
        }

        public void onTimeShiftStatusChanged(java.lang.String arg0, int arg1) {
            real.onTimeShiftStatusChanged(arg0, arg1);
        }

        public void onTrackSelected(java.lang.String arg0, int arg1, java.lang.String arg2) {
            real.onTrackSelected(arg0, arg1, arg2);
        }

        public void onTuned(java.lang.String arg0, com.micklab.dcg.wrapper.android.net.Uri arg1) {
            real.onTuned(arg0, arg1 == null ? null : arg1.unwrap());
        }

        public void onTvMessage(java.lang.String arg0, int arg1, com.micklab.dcg.wrapper.android.os.Bundle arg2) {
            real.onTvMessage(arg0, arg1, arg2 == null ? null : arg2.unwrap());
        }

        public void onVideoAvailable(java.lang.String arg0) {
            real.onVideoAvailable(arg0);
        }

        public void onVideoSizeChanged(java.lang.String arg0, int arg1, int arg2) {
            real.onVideoSizeChanged(arg0, arg1, arg2);
        }

        public void onVideoUnavailable(java.lang.String arg0, int arg1) {
            real.onVideoUnavailable(arg0, arg1);
        }

    }
}
