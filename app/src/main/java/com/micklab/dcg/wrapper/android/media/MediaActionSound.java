// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaActionSound {
    private final android.media.MediaActionSound real;

    public MediaActionSound(android.media.MediaActionSound real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaActionSound wrap(android.media.MediaActionSound real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaActionSound(real);
    }

    public android.media.MediaActionSound unwrap() {
        return real;
    }

    public MediaActionSound() {
        this(new android.media.MediaActionSound());
    }

    public void load(int arg0) {
        real.load(arg0);
    }

    public static boolean mustPlayShutterSound() {
        return android.media.MediaActionSound.mustPlayShutterSound();
    }

    public void play(int arg0) {
        real.play(arg0);
    }

    public void release() {
        real.release();
    }

    public static final int FOCUS_COMPLETE = android.media.MediaActionSound.FOCUS_COMPLETE;
    public static final int SHUTTER_CLICK = android.media.MediaActionSound.SHUTTER_CLICK;
    public static final int START_VIDEO_RECORDING = android.media.MediaActionSound.START_VIDEO_RECORDING;
    public static final int STOP_VIDEO_RECORDING = android.media.MediaActionSound.STOP_VIDEO_RECORDING;

}
