// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech.tts;

public final class SynthesisCallback {
    private final android.speech.tts.SynthesisCallback real;

    public SynthesisCallback(android.speech.tts.SynthesisCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.tts.SynthesisCallback wrap(android.speech.tts.SynthesisCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.SynthesisCallback(real);
    }

    public android.speech.tts.SynthesisCallback unwrap() {
        return real;
    }

    public int audioAvailable(byte[] arg0, int arg1, int arg2) {
        return real.audioAvailable(arg0, arg1, arg2);
    }

    public int done() {
        return real.done();
    }

    public void error() {
        real.error();
    }

    public void error(int arg0) {
        real.error(arg0);
    }

    public int getMaxBufferSize() {
        return real.getMaxBufferSize();
    }

    public boolean hasFinished() {
        return real.hasFinished();
    }

    public boolean hasStarted() {
        return real.hasStarted();
    }

    public void rangeStart(int arg0, int arg1, int arg2) {
        real.rangeStart(arg0, arg1, arg2);
    }

    public int start(int arg0, int arg1, int arg2) {
        return real.start(arg0, arg1, arg2);
    }

}
