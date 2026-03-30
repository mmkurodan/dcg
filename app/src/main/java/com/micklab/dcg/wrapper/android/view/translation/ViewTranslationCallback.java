// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class ViewTranslationCallback {
    private final android.view.translation.ViewTranslationCallback real;

    public ViewTranslationCallback(android.view.translation.ViewTranslationCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.ViewTranslationCallback wrap(android.view.translation.ViewTranslationCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.ViewTranslationCallback(real);
    }

    public android.view.translation.ViewTranslationCallback unwrap() {
        return real;
    }

    public boolean onClearTranslation(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.onClearTranslation(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onHideTranslation(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.onHideTranslation(arg0 == null ? null : arg0.unwrap());
    }

    public boolean onShowTranslation(com.micklab.dcg.wrapper.android.view.View arg0) {
        return real.onShowTranslation(arg0 == null ? null : arg0.unwrap());
    }

}
