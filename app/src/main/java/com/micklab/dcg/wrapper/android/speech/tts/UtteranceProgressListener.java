// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech.tts;

public final class UtteranceProgressListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UtteranceProgressListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.tts.UtteranceProgressListener wrap(android.speech.tts.UtteranceProgressListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.UtteranceProgressListener(real, (__DcgwBridgeToken) null);
    }

    public android.speech.tts.UtteranceProgressListener getReal() {
        return (android.speech.tts.UtteranceProgressListener) real;
    }

    public android.speech.tts.UtteranceProgressListener unwrap() {
        return getReal();
    }

    public void onAudioAvailable(java.lang.String arg0, byte[] arg1) {
        ((android.speech.tts.UtteranceProgressListener) real).onAudioAvailable(arg0, arg1);
    }

    public void onBeginSynthesis(java.lang.String arg0, int arg1, int arg2, int arg3) {
        ((android.speech.tts.UtteranceProgressListener) real).onBeginSynthesis(arg0, arg1, arg2, arg3);
    }

    public void onDone(java.lang.String arg0) {
        ((android.speech.tts.UtteranceProgressListener) real).onDone(arg0);
    }

    public void onError(java.lang.String arg0) {
        ((android.speech.tts.UtteranceProgressListener) real).onError(arg0);
    }

    public void onError(java.lang.String arg0, int arg1) {
        ((android.speech.tts.UtteranceProgressListener) real).onError(arg0, arg1);
    }

    public void onRangeStart(java.lang.String arg0, int arg1, int arg2, int arg3) {
        ((android.speech.tts.UtteranceProgressListener) real).onRangeStart(arg0, arg1, arg2, arg3);
    }

    public void onStart(java.lang.String arg0) {
        ((android.speech.tts.UtteranceProgressListener) real).onStart(arg0);
    }

    public void onStop(java.lang.String arg0, boolean arg1) {
        ((android.speech.tts.UtteranceProgressListener) real).onStop(arg0, arg1);
    }

}
