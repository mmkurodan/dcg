// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.voice;

public final class VoiceInteractionSessionService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VoiceInteractionSessionService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSessionService wrap(android.service.voice.VoiceInteractionSessionService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSessionService(real, (__DcgwBridgeToken) null);
    }

    public android.service.voice.VoiceInteractionSessionService getReal() {
        return (android.service.voice.VoiceInteractionSessionService) real;
    }

    public android.service.voice.VoiceInteractionSessionService unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.voice.VoiceInteractionSessionService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onConfigurationChanged(com.micklab.dcg.wrapper.android.content.res.Configuration arg0) {
        ((android.service.voice.VoiceInteractionSessionService) real).onConfigurationChanged(arg0 == null ? null : arg0.getReal());
    }

    public void onCreate() {
        ((android.service.voice.VoiceInteractionSessionService) real).onCreate();
    }

    public void onLowMemory() {
        ((android.service.voice.VoiceInteractionSessionService) real).onLowMemory();
    }

    public com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession onNewSession(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        return com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionSession.wrap(((android.service.voice.VoiceInteractionSessionService) real).onNewSession(arg0 == null ? null : arg0.getReal()));
    }

    public void onTrimMemory(int arg0) {
        ((android.service.voice.VoiceInteractionSessionService) real).onTrimMemory(arg0);
    }

}
