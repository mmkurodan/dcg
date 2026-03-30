// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech.tts;

public final class SynthesisRequest {
    private final android.speech.tts.SynthesisRequest real;

    public SynthesisRequest(android.speech.tts.SynthesisRequest real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.tts.SynthesisRequest wrap(android.speech.tts.SynthesisRequest real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.SynthesisRequest(real);
    }

    public android.speech.tts.SynthesisRequest unwrap() {
        return real;
    }

    public SynthesisRequest(java.lang.String arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.speech.tts.SynthesisRequest(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public SynthesisRequest(java.lang.CharSequence arg0, com.micklab.dcg.wrapper.android.os.Bundle arg1) {
        this(new android.speech.tts.SynthesisRequest(arg0, arg1 == null ? null : arg1.unwrap()));
    }

    public int getCallerUid() {
        return real.getCallerUid();
    }

    public java.lang.CharSequence getCharSequenceText() {
        return real.getCharSequenceText();
    }

    public java.lang.String getCountry() {
        return real.getCountry();
    }

    public java.lang.String getLanguage() {
        return real.getLanguage();
    }

    public com.micklab.dcg.wrapper.android.os.Bundle getParams() {
        return com.micklab.dcg.wrapper.android.os.Bundle.wrap(real.getParams());
    }

    public int getPitch() {
        return real.getPitch();
    }

    public int getSpeechRate() {
        return real.getSpeechRate();
    }

    public java.lang.String getText() {
        return real.getText();
    }

    public java.lang.String getVariant() {
        return real.getVariant();
    }

    public java.lang.String getVoiceName() {
        return real.getVoiceName();
    }

}
