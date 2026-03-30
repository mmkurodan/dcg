// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class TranslationManager {
    private final android.view.translation.TranslationManager real;

    public TranslationManager(android.view.translation.TranslationManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.TranslationManager wrap(android.view.translation.TranslationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.TranslationManager(real);
    }

    public android.view.translation.TranslationManager unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.app.PendingIntent getOnDeviceTranslationSettingsActivityIntent() {
        return com.micklab.dcg.wrapper.android.app.PendingIntent.wrap(real.getOnDeviceTranslationSettingsActivityIntent());
    }

}
