// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class UiTranslationManager {
    private final android.view.translation.UiTranslationManager real;

    public UiTranslationManager(android.view.translation.UiTranslationManager real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.UiTranslationManager wrap(android.view.translation.UiTranslationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.UiTranslationManager(real);
    }

    public android.view.translation.UiTranslationManager unwrap() {
        return real;
    }

    public void registerUiTranslationStateCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.view.translation.UiTranslationStateCallback arg1) {
        real.registerUiTranslationStateCallback(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void unregisterUiTranslationStateCallback(com.micklab.dcg.wrapper.android.view.translation.UiTranslationStateCallback arg0) {
        real.unregisterUiTranslationStateCallback(arg0 == null ? null : arg0.unwrap());
    }

}
