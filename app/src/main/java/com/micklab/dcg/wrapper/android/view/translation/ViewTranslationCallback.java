// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.view.translation;

public final class ViewTranslationCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ViewTranslationCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.view.translation.ViewTranslationCallback wrap(android.view.translation.ViewTranslationCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.view.translation.ViewTranslationCallback(real, (__DcgwBridgeToken) null);
    }

    public android.view.translation.ViewTranslationCallback getReal() {
        return (android.view.translation.ViewTranslationCallback) real;
    }

    public android.view.translation.ViewTranslationCallback unwrap() {
        return getReal();
    }

    public boolean onClearTranslation(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.view.translation.ViewTranslationCallback) real).onClearTranslation(arg0 == null ? null : arg0.getReal());
    }

    public boolean onHideTranslation(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.view.translation.ViewTranslationCallback) real).onHideTranslation(arg0 == null ? null : arg0.getReal());
    }

    public boolean onShowTranslation(com.micklab.dcg.wrapper.android.view.View arg0) {
        return ((android.view.translation.ViewTranslationCallback) real).onShowTranslation(arg0 == null ? null : arg0.getReal());
    }

}
