// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.voice;

public final class VoiceInteractionService {
    private final android.service.voice.VoiceInteractionService real;

    public VoiceInteractionService(android.service.voice.VoiceInteractionService real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionService wrap(android.service.voice.VoiceInteractionService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionService(real);
    }

    public android.service.voice.VoiceInteractionService unwrap() {
        return real;
    }

    public VoiceInteractionService() {
        this(new android.service.voice.VoiceInteractionService());
    }

    public int getDisabledShowContext() {
        return real.getDisabledShowContext();
    }

    public static boolean isActiveService(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        return android.service.voice.VoiceInteractionService.isActiveService(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(real.onBind(arg0 == null ? null : arg0.unwrap()));
    }

    public void onLaunchVoiceAssistFromKeyguard() {
        real.onLaunchVoiceAssistFromKeyguard();
    }

    public void onPrepareToShowSession(com.micklab.dcg.wrapper.android.os.Bundle arg0, int arg1) {
        real.onPrepareToShowSession(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void onReady() {
        real.onReady();
    }

    public void onShowSessionFailed(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.onShowSessionFailed(arg0 == null ? null : arg0.unwrap());
    }

    public void onShutdown() {
        real.onShutdown();
    }

    public void setDisabledShowContext(int arg0) {
        real.setDisabledShowContext(arg0);
    }

    public void setUiHints(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        real.setUiHints(arg0 == null ? null : arg0.unwrap());
    }

    public void showSession(com.micklab.dcg.wrapper.android.os.Bundle arg0, int arg1) {
        real.showSession(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final java.lang.String SERVICE_INTERFACE = android.service.voice.VoiceInteractionService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.service.voice.VoiceInteractionService.SERVICE_META_DATA;

}
