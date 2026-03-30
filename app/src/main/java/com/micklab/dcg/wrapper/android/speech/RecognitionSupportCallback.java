// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class RecognitionSupportCallback {
    private final android.speech.RecognitionSupportCallback real;

    public RecognitionSupportCallback(android.speech.RecognitionSupportCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.RecognitionSupportCallback wrap(android.speech.RecognitionSupportCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionSupportCallback(real);
    }

    public android.speech.RecognitionSupportCallback unwrap() {
        return real;
    }

    public void onError(int arg0) {
        real.onError(arg0);
    }

    public void onSupportResult(com.micklab.dcg.wrapper.android.speech.RecognitionSupport arg0) {
        real.onSupportResult(arg0 == null ? null : arg0.unwrap());
    }

}
