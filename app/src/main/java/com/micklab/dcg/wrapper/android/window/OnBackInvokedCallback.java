// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class OnBackInvokedCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private OnBackInvokedCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.OnBackInvokedCallback wrap(android.window.OnBackInvokedCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.OnBackInvokedCallback(real, (__DcgwBridgeToken) null);
    }

    public android.window.OnBackInvokedCallback getReal() {
        return (android.window.OnBackInvokedCallback) real;
    }

    public android.window.OnBackInvokedCallback unwrap() {
        return getReal();
    }

    public void onBackInvoked() {
        ((android.window.OnBackInvokedCallback) real).onBackInvoked();
    }

}
