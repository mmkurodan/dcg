// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class MediaController {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaController(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.MediaController wrap(android.widget.MediaController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.MediaController(real, (__DcgwBridgeToken) null);
    }

    public android.widget.MediaController getReal() {
        return (android.widget.MediaController) real;
    }

    public android.widget.MediaController unwrap() {
        return getReal();
    }

    public MediaController(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.MediaController(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public MediaController(com.micklab.dcg.wrapper.android.content.Context arg0, boolean arg1) {
        this(new android.widget.MediaController(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public MediaController(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.MediaController(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return ((android.widget.MediaController) real).dispatchKeyEvent(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.MediaController) real).getAccessibilityClassName();
    }

    public void hide() {
        ((android.widget.MediaController) real).hide();
    }

    public boolean isShowing() {
        return ((android.widget.MediaController) real).isShowing();
    }

    public void onFinishInflate() {
        ((android.widget.MediaController) real).onFinishInflate();
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.MediaController) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.MediaController) real).onTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public void setAnchorView(com.micklab.dcg.wrapper.android.view.View arg0) {
        ((android.widget.MediaController) real).setAnchorView(arg0 == null ? null : arg0.getReal());
    }

    public void setEnabled(boolean arg0) {
        ((android.widget.MediaController) real).setEnabled(arg0);
    }

    public void setMediaPlayer(com.micklab.dcg.wrapper.android.widget.MediaController.MediaPlayerControl arg0) {
        ((android.widget.MediaController) real).setMediaPlayer(arg0 == null ? null : arg0.getReal());
    }

    public void setPrevNextListeners(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0, com.micklab.dcg.wrapper.android.view.View.OnClickListener arg1) {
        ((android.widget.MediaController) real).setPrevNextListeners(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void show() {
        ((android.widget.MediaController) real).show();
    }

    public void show(int arg0) {
        ((android.widget.MediaController) real).show(arg0);
    }

    public static final class MediaPlayerControl {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private MediaPlayerControl(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.MediaController.MediaPlayerControl wrap(android.widget.MediaController.MediaPlayerControl real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.MediaController.MediaPlayerControl(real, (__DcgwBridgeToken) null);
        }

        public android.widget.MediaController.MediaPlayerControl getReal() {
            return (android.widget.MediaController.MediaPlayerControl) real;
        }

        public android.widget.MediaController.MediaPlayerControl unwrap() {
            return getReal();
        }

        public boolean canPause() {
            return ((android.widget.MediaController.MediaPlayerControl) real).canPause();
        }

        public boolean canSeekBackward() {
            return ((android.widget.MediaController.MediaPlayerControl) real).canSeekBackward();
        }

        public boolean canSeekForward() {
            return ((android.widget.MediaController.MediaPlayerControl) real).canSeekForward();
        }

        public int getAudioSessionId() {
            return ((android.widget.MediaController.MediaPlayerControl) real).getAudioSessionId();
        }

        public int getBufferPercentage() {
            return ((android.widget.MediaController.MediaPlayerControl) real).getBufferPercentage();
        }

        public int getCurrentPosition() {
            return ((android.widget.MediaController.MediaPlayerControl) real).getCurrentPosition();
        }

        public int getDuration() {
            return ((android.widget.MediaController.MediaPlayerControl) real).getDuration();
        }

        public boolean isPlaying() {
            return ((android.widget.MediaController.MediaPlayerControl) real).isPlaying();
        }

        public void pause() {
            ((android.widget.MediaController.MediaPlayerControl) real).pause();
        }

        public void seekTo(int arg0) {
            ((android.widget.MediaController.MediaPlayerControl) real).seekTo(arg0);
        }

        public void start() {
            ((android.widget.MediaController.MediaPlayerControl) real).start();
        }

    }
}
