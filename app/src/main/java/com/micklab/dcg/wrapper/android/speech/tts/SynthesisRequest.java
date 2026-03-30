// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech.tts;

public final class SynthesisRequest {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SynthesisRequest(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.tts.SynthesisRequest wrap(android.speech.tts.SynthesisRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.SynthesisRequest(real, (__DcgwBridgeToken) null);
    }

    public android.speech.tts.SynthesisRequest getReal() {
        return (android.speech.tts.SynthesisRequest) real;
    }

    public android.speech.tts.SynthesisRequest unwrap() {
        return getReal();
    }

    public SynthesisRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.speech.tts.SynthesisRequest(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public SynthesisRequest(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.speech.tts.SynthesisRequest(arg0, arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public int getCallerUid() {
        return ((android.speech.tts.SynthesisRequest) real).getCallerUid();
    }

    public java.lang.CharSequence getCharSequenceText() {
        return ((android.speech.tts.SynthesisRequest) real).getCharSequenceText();
    }

    public java.lang.String getCountry() {
        return ((android.speech.tts.SynthesisRequest) real).getCountry();
    }

    public java.lang.String getLanguage() {
        return ((android.speech.tts.SynthesisRequest) real).getLanguage();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getParams() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(((android.speech.tts.SynthesisRequest) real).getParams());
    }

    public int getPitch() {
        return ((android.speech.tts.SynthesisRequest) real).getPitch();
    }

    public int getSpeechRate() {
        return ((android.speech.tts.SynthesisRequest) real).getSpeechRate();
    }

    public java.lang.String getText() {
        return ((android.speech.tts.SynthesisRequest) real).getText();
    }

    public java.lang.String getVariant() {
        return ((android.speech.tts.SynthesisRequest) real).getVariant();
    }

    public java.lang.String getVoiceName() {
        return ((android.speech.tts.SynthesisRequest) real).getVoiceName();
    }

}
