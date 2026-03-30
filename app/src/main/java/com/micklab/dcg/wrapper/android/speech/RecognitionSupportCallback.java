// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech;

public final class RecognitionSupportCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RecognitionSupportCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.RecognitionSupportCallback wrap(android.speech.RecognitionSupportCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.RecognitionSupportCallback(real, (__DcgwBridgeToken) null);
    }

    public android.speech.RecognitionSupportCallback getReal() {
        return (android.speech.RecognitionSupportCallback) real;
    }

    public android.speech.RecognitionSupportCallback unwrap() {
        return getReal();
    }

    public void onError(int arg0) {
        ((android.speech.RecognitionSupportCallback) real).onError(arg0);
    }

    public void onSupportResult(com.micklab.dcg.wrapper.android.speech.RecognitionSupport arg0) {
        ((android.speech.RecognitionSupportCallback) real).onSupportResult(arg0 == null ? null : arg0.getReal());
    }

}
