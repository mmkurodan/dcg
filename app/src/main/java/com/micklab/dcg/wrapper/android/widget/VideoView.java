// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class VideoView {
    private final android.widget.VideoView real;

    public VideoView(android.widget.VideoView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.VideoView wrap(android.widget.VideoView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.VideoView(real);
    }

    public android.widget.VideoView unwrap() {
        return real;
    }

    public VideoView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.VideoView(arg0 == null ? null : arg0.unwrap()));
    }

    public VideoView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.VideoView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public VideoView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.VideoView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public VideoView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.VideoView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void addSubtitleSource(java.io.InputStream arg0, com.micklab.dcg.wrapper.android.media.MediaFormat arg1) {
        real.addSubtitleSource(arg0, arg1 == null ? null : arg1.unwrap());
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

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
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

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTrackballEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void pause() {
        real.pause();
    }

    public int resolveAdjustedSize(int arg0, int arg1) {
        return real.resolveAdjustedSize(arg0, arg1);
    }

    public void resume() {
        real.resume();
    }

    public void seekTo(int arg0) {
        real.seekTo(arg0);
    }

    public void setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) {
        real.setAudioAttributes(arg0 == null ? null : arg0.unwrap());
    }

    public void setAudioFocusRequest(int arg0) {
        real.setAudioFocusRequest(arg0);
    }

    public void setMediaController(com.micklab.dcg.wrapper.android.widget.MediaController arg0) {
        real.setMediaController(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnCompletionListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnCompletionListener arg0) {
        real.setOnCompletionListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnErrorListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnErrorListener arg0) {
        real.setOnErrorListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnInfoListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnInfoListener arg0) {
        real.setOnInfoListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setOnPreparedListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnPreparedListener arg0) {
        real.setOnPreparedListener(arg0 == null ? null : arg0.unwrap());
    }

    public void setVideoPath(java.lang.String arg0) {
        real.setVideoPath(arg0);
    }

    public void setVideoURI(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        real.setVideoURI(arg0 == null ? null : arg0.unwrap());
    }

    public void start() {
        real.start();
    }

    public void stopPlayback() {
        real.stopPlayback();
    }

    public void suspend() {
        real.suspend();
    }

}
