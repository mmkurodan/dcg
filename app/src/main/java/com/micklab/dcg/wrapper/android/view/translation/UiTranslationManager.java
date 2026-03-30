// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class UiTranslationManager {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UiTranslationManager(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.UiTranslationManager wrap(android.view.translation.UiTranslationManager real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.UiTranslationManager(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.UiTranslationManager getReal() {
        return (android.view.translation.UiTranslationManager) real;
    }

    public android.view.translation.UiTranslationManager unwrap() {
        return getReal();
    }

    public void registerUiTranslationStateCallback(java.util.concurrent.Executor arg0, com.micklab.dcg.wrapper.android.view.translation.UiTranslationStateCallback arg1) {
        ((android.view.translation.UiTranslationManager) real).registerUiTranslationStateCallback(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void unregisterUiTranslationStateCallback(com.micklab.dcg.wrapper.android.view.translation.UiTranslationStateCallback arg0) {
        ((android.view.translation.UiTranslationManager) real).unregisterUiTranslationStateCallback(arg0 == null ? null : arg0.getReal());
    }

}
