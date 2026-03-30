// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech.tts;

public final class TextToSpeechService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TextToSpeechService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.tts.TextToSpeechService wrap(android.speech.tts.TextToSpeechService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.TextToSpeechService(real, (__DcgwBridgeToken) null);
    }

    public android.speech.tts.TextToSpeechService getReal() {
        return (android.speech.tts.TextToSpeechService) real;
    }

    public android.speech.tts.TextToSpeechService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.speech.tts.TextToSpeechService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onCreate() {
        ((android.speech.tts.TextToSpeechService) real).onCreate();
    }

    public void onDestroy() {
        ((android.speech.tts.TextToSpeechService) real).onDestroy();
    }

    public java.lang.String onGetDefaultVoiceNameFor(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return ((android.speech.tts.TextToSpeechService) real).onGetDefaultVoiceNameFor(arg0, arg1, arg2);
    }

    public int onIsValidVoiceName(java.lang.String arg0) {
        return ((android.speech.tts.TextToSpeechService) real).onIsValidVoiceName(arg0);
    }

    public int onLoadVoice(java.lang.String arg0) {
        return ((android.speech.tts.TextToSpeechService) real).onLoadVoice(arg0);
    }

}
