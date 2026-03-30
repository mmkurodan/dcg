// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech.tts;

public final class SynthesisCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SynthesisCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.tts.SynthesisCallback wrap(android.speech.tts.SynthesisCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.SynthesisCallback(real, (__DcgwBridgeToken) null);
    }

    public android.speech.tts.SynthesisCallback getReal() {
        return (android.speech.tts.SynthesisCallback) real;
    }

    public android.speech.tts.SynthesisCallback unwrap() {
        return getReal();
    }

    public int audioAvailable(byte[] arg0, int arg1, int arg2) {
        return ((android.speech.tts.SynthesisCallback) real).audioAvailable(arg0, arg1, arg2);
    }

    public int done() {
        return ((android.speech.tts.SynthesisCallback) real).done();
    }

    public void error() {
        ((android.speech.tts.SynthesisCallback) real).error();
    }

    public void error(int arg0) {
        ((android.speech.tts.SynthesisCallback) real).error(arg0);
    }

    public int getMaxBufferSize() {
        return ((android.speech.tts.SynthesisCallback) real).getMaxBufferSize();
    }

    public boolean hasFinished() {
        return ((android.speech.tts.SynthesisCallback) real).hasFinished();
    }

    public boolean hasStarted() {
        return ((android.speech.tts.SynthesisCallback) real).hasStarted();
    }

    public void rangeStart(int arg0, int arg1, int arg2) {
        ((android.speech.tts.SynthesisCallback) real).rangeStart(arg0, arg1, arg2);
    }

    public int start(int arg0, int arg1, int arg2) {
        return ((android.speech.tts.SynthesisCallback) real).start(arg0, arg1, arg2);
    }

}
