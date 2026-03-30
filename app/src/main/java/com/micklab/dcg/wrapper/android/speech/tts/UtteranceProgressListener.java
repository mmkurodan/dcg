// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech.tts;

public final class UtteranceProgressListener {
    private final android.speech.tts.UtteranceProgressListener real;

    public UtteranceProgressListener(android.speech.tts.UtteranceProgressListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.tts.UtteranceProgressListener wrap(android.speech.tts.UtteranceProgressListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.UtteranceProgressListener(real);
    }

    public android.speech.tts.UtteranceProgressListener unwrap() {
        return real;
    }

    public void onAudioAvailable(java.lang.String arg0, byte[] arg1) {
        real.onAudioAvailable(arg0, arg1);
    }

    public void onBeginSynthesis(java.lang.String arg0, int arg1, int arg2, int arg3) {
        real.onBeginSynthesis(arg0, arg1, arg2, arg3);
    }

    public void onDone(java.lang.String arg0) {
        real.onDone(arg0);
    }

    public void onError(java.lang.String arg0) {
        real.onError(arg0);
    }

    public void onError(java.lang.String arg0, int arg1) {
        real.onError(arg0, arg1);
    }

    public void onRangeStart(java.lang.String arg0, int arg1, int arg2, int arg3) {
        real.onRangeStart(arg0, arg1, arg2, arg3);
    }

    public void onStart(java.lang.String arg0) {
        real.onStart(arg0);
    }

    public void onStop(java.lang.String arg0, boolean arg1) {
        real.onStop(arg0, arg1);
    }

}
