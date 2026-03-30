// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TranslationManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationManager wrap(android.view.translation.TranslationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationManager(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.TranslationManager getReal() {
        return (android.view.translation.TranslationManager) real;
    }

    public android.view.translation.TranslationManager unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getOnDeviceTranslationSettingsActivityIntent() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(((android.view.translation.TranslationManager) real).getOnDeviceTranslationSettingsActivityIntent());
    }

}
