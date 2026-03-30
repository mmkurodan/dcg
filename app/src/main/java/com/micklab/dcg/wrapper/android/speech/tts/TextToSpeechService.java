// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.speech.tts;

public final class TextToSpeechService {
    private final android.speech.tts.TextToSpeechService real;

    public TextToSpeechService(android.speech.tts.TextToSpeechService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.speech.tts.TextToSpeechService wrap(android.speech.tts.TextToSpeechService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.speech.tts.TextToSpeechService(real);
    }

    public android.speech.tts.TextToSpeechService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onCreate() {
        real.onCreate();
    }

    public void onDestroy() {
        real.onDestroy();
    }

    public java.lang.String onGetDefaultVoiceNameFor(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) {
        return real.onGetDefaultVoiceNameFor(arg0, arg1, arg2);
    }

    public int onIsValidVoiceName(java.lang.String arg0) {
        return real.onIsValidVoiceName(arg0);
    }

    public int onLoadVoice(java.lang.String arg0) {
        return real.onLoadVoice(arg0);
    }

}
