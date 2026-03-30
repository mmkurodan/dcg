// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.media;

public final class MediaActionSound {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MediaActionSound(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.media.MediaActionSound wrap(android.media.MediaActionSound real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.media.MediaActionSound(real, (__DcgwBridgeToken) null);
    }

    public android.media.MediaActionSound getReal() {
        return (android.media.MediaActionSound) real;
    }

    public android.media.MediaActionSound unwrap() {
        return getReal();
    }

    public MediaActionSound() {
        this(new android.media.MediaActionSound(), (__DcgwBridgeToken) null);
    }

    public void load(int arg0) {
        ((android.media.MediaActionSound) real).load(arg0);
    }

    public static boolean mustPlayShutterSound() {
        return android.media.MediaActionSound.mustPlayShutterSound();
    }

    public void play(int arg0) {
        ((android.media.MediaActionSound) real).play(arg0);
    }

    public void release() {
        ((android.media.MediaActionSound) real).release();
    }

    public static final int FOCUS_COMPLETE = android.media.MediaActionSound.FOCUS_COMPLETE;
    public static final int SHUTTER_CLICK = android.media.MediaActionSound.SHUTTER_CLICK;
    public static final int START_VIDEO_RECORDING = android.media.MediaActionSound.START_VIDEO_RECORDING;
    public static final int STOP_VIDEO_RECORDING = android.media.MediaActionSound.STOP_VIDEO_RECORDING;

}
