// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class UiTranslationStateCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UiTranslationStateCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.UiTranslationStateCallback wrap(android.view.translation.UiTranslationStateCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.UiTranslationStateCallback(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.UiTranslationStateCallback getReal() {
        return (android.view.translation.UiTranslationStateCallback) real;
    }

    public android.view.translation.UiTranslationStateCallback unwrap() {
        return getReal();
    }

    public void onFinished() {
        ((android.view.translation.UiTranslationStateCallback) real).onFinished();
    }

    public void onFinished(java.lang.String arg0) {
        ((android.view.translation.UiTranslationStateCallback) real).onFinished(arg0);
    }

    public void onPaused() {
        ((android.view.translation.UiTranslationStateCallback) real).onPaused();
    }

    public void onPaused(java.lang.String arg0) {
        ((android.view.translation.UiTranslationStateCallback) real).onPaused(arg0);
    }

    public void onResumed(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        ((android.view.translation.UiTranslationStateCallback) real).onResumed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onResumed(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1, java.lang.String arg2) {
        ((android.view.translation.UiTranslationStateCallback) real).onResumed(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

    public void onStarted(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        ((android.view.translation.UiTranslationStateCallback) real).onStarted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void onStarted(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1, java.lang.String arg2) {
        ((android.view.translation.UiTranslationStateCallback) real).onStarted(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2);
    }

}
