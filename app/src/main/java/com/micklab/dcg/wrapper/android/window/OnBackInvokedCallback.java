// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.window;

public final class OnBackInvokedCallback {
    private final android.window.OnBackInvokedCallback real;

    public OnBackInvokedCallback(android.window.OnBackInvokedCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.window.OnBackInvokedCallback wrap(android.window.OnBackInvokedCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.window.OnBackInvokedCallback(real);
    }

    public android.window.OnBackInvokedCallback unwrap() {
        return real;
    }

    public void onBackInvoked() {
        real.onBackInvoked();
    }

}
