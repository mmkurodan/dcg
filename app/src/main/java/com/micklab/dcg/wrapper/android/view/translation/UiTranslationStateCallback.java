// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class UiTranslationStateCallback {
    private final android.view.translation.UiTranslationStateCallback real;

    public UiTranslationStateCallback(android.view.translation.UiTranslationStateCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.UiTranslationStateCallback wrap(android.view.translation.UiTranslationStateCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.UiTranslationStateCallback(real);
    }

    public android.view.translation.UiTranslationStateCallback unwrap() {
        return real;
    }

    public void onFinished() {
        real.onFinished();
    }

    public void onFinished(java.lang.String arg0) {
        real.onFinished(arg0);
    }

    public void onPaused() {
        real.onPaused();
    }

    public void onPaused(java.lang.String arg0) {
        real.onPaused(arg0);
    }

    public void onResumed(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        real.onResumed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onResumed(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1, java.lang.String arg2) {
        real.onResumed(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

    public void onStarted(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1) {
        real.onStarted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void onStarted(com.micklab.dcg.wrapper.android.icu.util.ULocale arg0, com.micklab.dcg.wrapper.android.icu.util.ULocale arg1, java.lang.String arg2) {
        real.onStarted(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2);
    }

}
