// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.service.voice;

public final class VoiceInteractionService {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VoiceInteractionService(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionService wrap(android.service.voice.VoiceInteractionService real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.service.voice.VoiceInteractionService(real, (__DcgwBridgeToken) null);
    }

    public android.service.voice.VoiceInteractionService getReal() {
        return (android.service.voice.VoiceInteractionService) real;
    }

    public android.service.voice.VoiceInteractionService unwrap() {
        return getReal();
    }

    public VoiceInteractionService() {
        this(new android.service.voice.VoiceInteractionService(), (__DcgwBridgeToken) null);
    }

    public int getDisabledShowContext() {
        return ((android.service.voice.VoiceInteractionService) real).getDisabledShowContext();
    }

    public static boolean isActiveService(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.content.ComponentName arg1) {
        return android.service.voice.VoiceInteractionService.isActiveService(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public com.micklab.dcg.wrapper.android.os.IBinder onBind(com.micklab.dcg.wrapper.android.content.Intent arg0) {
        return com.micklab.dcg.wrapper.android.os.IBinder.wrap(((android.service.voice.VoiceInteractionService) real).onBind(arg0 == null ? null : arg0.getReal()));
    }

    public void onLaunchVoiceAssistFromKeyguard() {
        ((android.service.voice.VoiceInteractionService) real).onLaunchVoiceAssistFromKeyguard();
    }

    public void onPrepareToShowSession(com.micklab.dcg.wrapper.android.os.Bundle arg0, int arg1) {
        ((android.service.voice.VoiceInteractionService) real).onPrepareToShowSession(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public void onReady() {
        ((android.service.voice.VoiceInteractionService) real).onReady();
    }

    public void onShowSessionFailed(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.service.voice.VoiceInteractionService) real).onShowSessionFailed(arg0 == null ? null : arg0.getReal());
    }

    public void onShutdown() {
        ((android.service.voice.VoiceInteractionService) real).onShutdown();
    }

    public void setDisabledShowContext(int arg0) {
        ((android.service.voice.VoiceInteractionService) real).setDisabledShowContext(arg0);
    }

    public void setUiHints(com.micklab.dcg.wrapper.android.os.Bundle arg0) {
        ((android.service.voice.VoiceInteractionService) real).setUiHints(arg0 == null ? null : arg0.getReal());
    }

    public void showSession(com.micklab.dcg.wrapper.android.os.Bundle arg0, int arg1) {
        ((android.service.voice.VoiceInteractionService) real).showSession(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final java.lang.String SERVICE_INTERFACE = android.service.voice.VoiceInteractionService.SERVICE_INTERFACE;
    public static final java.lang.String SERVICE_META_DATA = android.service.voice.VoiceInteractionService.SERVICE_META_DATA;

}
