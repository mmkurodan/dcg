// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class ConfirmationCallback {
    private final android.security.ConfirmationCallback real;

    public ConfirmationCallback(android.security.ConfirmationCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.ConfirmationCallback wrap(android.security.ConfirmationCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.ConfirmationCallback(real);
    }

    public android.security.ConfirmationCallback unwrap() {
        return real;
    }

    public void onCanceled() {
        real.onCanceled();
    }

    public void onConfirmed(byte[] arg0) {
        real.onConfirmed(arg0);
    }

    public void onDismissed() {
        real.onDismissed();
    }

    public void onError(java.lang.Throwable arg0) {
        real.onError(arg0);
    }

}
