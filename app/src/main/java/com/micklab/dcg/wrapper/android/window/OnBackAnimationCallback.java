// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class OnBackAnimationCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OnBackAnimationCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.OnBackAnimationCallback wrap(android.window.OnBackAnimationCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.OnBackAnimationCallback(real, (__DcgwBridgeToken) null);
    }

    public android.window.OnBackAnimationCallback getReal() {
        return (android.window.OnBackAnimationCallback) real;
    }

    public android.window.OnBackAnimationCallback unwrap() {
        return getReal();
    }

    public void onBackCancelled() {
        ((android.window.OnBackAnimationCallback) real).onBackCancelled();
    }

    public void onBackProgressed(com.micklab.dcg.wrapper.android.window.BackEvent arg0) {
        ((android.window.OnBackAnimationCallback) real).onBackProgressed(arg0 == null ? null : arg0.getReal());
    }

    public void onBackStarted(com.micklab.dcg.wrapper.android.window.BackEvent arg0) {
        ((android.window.OnBackAnimationCallback) real).onBackStarted(arg0 == null ? null : arg0.getReal());
    }

}
