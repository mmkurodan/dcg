// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class RecognitionListener {
    private final android.speech.RecognitionListener real;

    public RecognitionListener(android.speech.RecognitionListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.RecognitionListener wrap(android.speech.RecognitionListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionListener(real);
    }

    public android.speech.RecognitionListener unwrap() {
        return real;
    }

    public void onBeginningOfSpeech() {
        real.onBeginningOfSpeech();
    }

    public void onBufferReceived(byte[] arg0) {
        real.onBufferReceived(arg0);
    }

    public void onEndOfSegmentedSession() {
        real.onEndOfSegmentedSession();
    }

    public void onEndOfSpeech() {
        real.onEndOfSpeech();
    }

    public void onError(int arg0) {
        real.onError(arg0);
    }

    public void onEvent(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        real.onEvent(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onLanguageDetection(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onLanguageDetection(arg0 == null ? null : arg0.unwrap());
    }

    public void onPartialResults(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onPartialResults(arg0 == null ? null : arg0.unwrap());
    }

    public void onReadyForSpeech(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onReadyForSpeech(arg0 == null ? null : arg0.unwrap());
    }

    public void onResults(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onResults(arg0 == null ? null : arg0.unwrap());
    }

    public void onRmsChanged(float arg0) {
        real.onRmsChanged(arg0);
    }

    public void onSegmentResults(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onSegmentResults(arg0 == null ? null : arg0.unwrap());
    }

}
