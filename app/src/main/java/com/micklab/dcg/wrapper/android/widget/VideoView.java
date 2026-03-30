// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class VideoView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VideoView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.VideoView wrap(android.widget.VideoView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.VideoView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.VideoView getReal() {
        return (android.widget.VideoView) real;
    }

    public android.widget.VideoView unwrap() {
        return getReal();
    }

    public VideoView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.VideoView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public VideoView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.VideoView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public VideoView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.VideoView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public VideoView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.VideoView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void addSubtitleSource(java.io.InputStream arg0, com.micklab.dcg.wrapper.android.media.MediaFormat arg1) {
        ((android.widget.VideoView) real).addSubtitleSource(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean canPause() {
        return ((android.widget.VideoView) real).canPause();
    }

    public boolean canSeekBackward() {
        return ((android.widget.VideoView) real).canSeekBackward();
    }

    public boolean canSeekForward() {
        return ((android.widget.VideoView) real).canSeekForward();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.widget.VideoView) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.VideoView) real).getAccessibilityClassName();
    }

    public int getAudioSessionId() {
        return ((android.widget.VideoView) real).getAudioSessionId();
    }

    public int getBufferPercentage() {
        return ((android.widget.VideoView) real).getBufferPercentage();
    }

    public int getCurrentPosition() {
        return ((android.widget.VideoView) real).getCurrentPosition();
    }

    public int getDuration() {
        return ((android.widget.VideoView) real).getDuration();
    }

    public boolean isPlaying() {
        return ((android.widget.VideoView) real).isPlaying();
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return ((android.widget.VideoView) real).onKeyDown(arg0, arg1 == null ? null : arg1.getReal());
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.VideoView) real).onTouchEvent(arg0 == null ? null : arg0.getReal());
    }

    public boolean onTrackballEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return ((android.widget.VideoView) real).onTrackballEvent(arg0 == null ? null : arg0.getReal());
    }

    public void pause() {
        ((android.widget.VideoView) real).pause();
    }

    public int resolveAdjustedSize(int arg0, int arg1) {
        return ((android.widget.VideoView) real).resolveAdjustedSize(arg0, arg1);
    }

    public void resume() {
        ((android.widget.VideoView) real).resume();
    }

    public void seekTo(int arg0) {
        ((android.widget.VideoView) real).seekTo(arg0);
    }

    public void setAudioAttributes(com.micklab.dcg.wrapper.android.media.AudioAttributes arg0) {
        ((android.widget.VideoView) real).setAudioAttributes(arg0 == null ? null : arg0.getReal());
    }

    public void setAudioFocusRequest(int arg0) {
        ((android.widget.VideoView) real).setAudioFocusRequest(arg0);
    }

    public void setMediaController(com.micklab.dcg.wrapper.android.widget.MediaController arg0) {
        ((android.widget.VideoView) real).setMediaController(arg0 == null ? null : arg0.getReal());
    }

    public void setOnCompletionListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnCompletionListener arg0) {
        ((android.widget.VideoView) real).setOnCompletionListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnErrorListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnErrorListener arg0) {
        ((android.widget.VideoView) real).setOnErrorListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnInfoListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnInfoListener arg0) {
        ((android.widget.VideoView) real).setOnInfoListener(arg0 == null ? null : arg0.getReal());
    }

    public void setOnPreparedListener(com.micklab.dcg.wrapper.android.media.MediaPlayer.OnPreparedListener arg0) {
        ((android.widget.VideoView) real).setOnPreparedListener(arg0 == null ? null : arg0.getReal());
    }

    public void setVideoPath(java.lang.String arg0) {
        ((android.widget.VideoView) real).setVideoPath(arg0);
    }

    public void setVideoURI(com.micklab.dcg.wrapper.android.net.Uri arg0) {
        ((android.widget.VideoView) real).setVideoURI(arg0 == null ? null : arg0.getReal());
    }

    public void start() {
        ((android.widget.VideoView) real).start();
    }

    public void stopPlayback() {
        ((android.widget.VideoView) real).stopPlayback();
    }

    public void suspend() {
        ((android.widget.VideoView) real).suspend();
    }

}
