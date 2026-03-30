// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class MediaController {
    private final android.widget.MediaController real;

    public MediaController(android.widget.MediaController real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.MediaController wrap(android.widget.MediaController real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.MediaController(real);
    }

    public android.widget.MediaController unwrap() {
        return real;
    }

    public MediaController(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.MediaController(arg0 == null ? null : arg0.unwrap()));
    }

    public MediaController(com.micklab.dcg.wrapper.android.content.Context arg0, boolean arg1) {
        this(new android.widget.MediaController(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public MediaController(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.MediaController(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public boolean dispatchKeyEvent(com.micklab.dcg.wrapper.android.view.KeyEvent arg0) {
        return real.dispatchKeyEvent(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public void hide() {
        real.hide();
    }

    public boolean isShowing() {
        return real.isShowing();
    }

    public void onFinishInflate() {
        real.onFinishInflate();
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTrackballEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void setAnchorView(com.micklab.dcg.wrapper.android.view.View arg0) {
        real.setAnchorView(arg0 == null ? null : arg0.unwrap());
    }

    public void setEnabled(boolean arg0) {
        real.setEnabled(arg0);
    }

    public void setMediaPlayer(com.micklab.dcg.wrapper.android.widget.MediaController.MediaPlayerControl arg0) {
        real.setMediaPlayer(arg0 == null ? null : arg0.unwrap());
    }

    public void setPrevNextListeners(com.micklab.dcg.wrapper.android.view.View.OnClickListener arg0, com.micklab.dcg.wrapper.android.view.View.OnClickListener arg1) {
        real.setPrevNextListeners(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void show() {
        real.show();
    }

    public void show(int arg0) {
        real.show(arg0);
    }

    public static final class MediaPlayerControl {
        private final android.widget.MediaController.MediaPlayerControl real;

        public MediaPlayerControl(android.widget.MediaController.MediaPlayerControl real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.widget.MediaController.MediaPlayerControl wrap(android.widget.MediaController.MediaPlayerControl real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.widget.MediaController.MediaPlayerControl(real);
        }

        public android.widget.MediaController.MediaPlayerControl unwrap() {
            return real;
        }

        public boolean canPause() {
            return real.canPause();
        }

        public boolean canSeekBackward() {
            return real.canSeekBackward();
        }

        public boolean canSeekForward() {
            return real.canSeekForward();
        }

        public int getAudioSessionId() {
            return real.getAudioSessionId();
        }

        public int getBufferPercentage() {
            return real.getBufferPercentage();
        }

        public int getCurrentPosition() {
            return real.getCurrentPosition();
        }

        public int getDuration() {
            return real.getDuration();
        }

        public boolean isPlaying() {
            return real.isPlaying();
        }

        public void pause() {
            real.pause();
        }

        public void seekTo(int arg0) {
            real.seekTo(arg0);
        }

        public void start() {
            real.start();
        }

    }
}
