// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.voice;

public final class VoiceInteractionSessionService {
    private final android.service.voice.VoiceInteractionSessionService real;

    public VoiceInteractionSessionService(android.service.voice.VoiceInteractionSessionService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSessionService wrap(android.service.voice.VoiceInteractionSessionService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSessionService(real);
    }

    public android.service.voice.VoiceInteractionSessionService unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        real.onConfigurationChanged(arg0 == null ? null : arg0.unwrap());
    }

    public void onCreate() {
        real.onCreate();
    }

    public void onLowMemory() {
        real.onLowMemory();
    }

    public com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession onNewSession(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.wrap(real.onNewSession(arg0 == null ? null : arg0.unwrap()));
    }

    public void onTrimMemory(int arg0) {
        real.onTrimMemory(arg0);
    }

}
