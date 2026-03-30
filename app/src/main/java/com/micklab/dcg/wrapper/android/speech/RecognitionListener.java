// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class RecognitionListener {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RecognitionListener(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.RecognitionListener wrap(android.speech.RecognitionListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionListener(real, (__DcgwBridgeToken) null);
    }

    public android.speech.RecognitionListener getReal() {
        return (android.speech.RecognitionListener) real;
    }

    public android.speech.RecognitionListener unwrap() {
        return getReal();
    }

    public void onBeginningOfSpeech() {
        ((android.speech.RecognitionListener) real).onBeginningOfSpeech();
    }

    public void onBufferReceived(byte[] arg0) {
        ((android.speech.RecognitionListener) real).onBufferReceived(arg0);
    }

    public void onEndOfSegmentedSession() {
        ((android.speech.RecognitionListener) real).onEndOfSegmentedSession();
    }

    public void onEndOfSpeech() {
        ((android.speech.RecognitionListener) real).onEndOfSpeech();
    }

    public void onError(int arg0) {
        ((android.speech.RecognitionListener) real).onError(arg0);
    }

    public void onEvent(int arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        ((android.speech.RecognitionListener) real).onEvent(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void onLanguageDetection(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.speech.RecognitionListener) real).onLanguageDetection(arg0 == null ? null : arg0.getReal());
    }

    public void onPartialResults(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.speech.RecognitionListener) real).onPartialResults(arg0 == null ? null : arg0.getReal());
    }

    public void onReadyForSpeech(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.speech.RecognitionListener) real).onReadyForSpeech(arg0 == null ? null : arg0.getReal());
    }

    public void onResults(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.speech.RecognitionListener) real).onResults(arg0 == null ? null : arg0.getReal());
    }

    public void onRmsChanged(float arg0) {
        ((android.speech.RecognitionListener) real).onRmsChanged(arg0);
    }

    public void onSegmentResults(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.speech.RecognitionListener) real).onSegmentResults(arg0 == null ? null : arg0.getReal());
    }

}
