// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class ConfirmationCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConfirmationCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.ConfirmationCallback wrap(android.security.ConfirmationCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.ConfirmationCallback(real, (__DcgwBridgeToken) null);
    }

    public android.security.ConfirmationCallback getReal() {
        return (android.security.ConfirmationCallback) real;
    }

    public android.security.ConfirmationCallback unwrap() {
        return getReal();
    }

    public void onCanceled() {
        ((android.security.ConfirmationCallback) real).onCanceled();
    }

    public void onConfirmed(byte[] arg0) {
        ((android.security.ConfirmationCallback) real).onConfirmed(arg0);
    }

    public void onDismissed() {
        ((android.security.ConfirmationCallback) real).onDismissed();
    }

    public void onError(java.lang.Throwable arg0) {
        ((android.security.ConfirmationCallback) real).onError(arg0);
    }

}
