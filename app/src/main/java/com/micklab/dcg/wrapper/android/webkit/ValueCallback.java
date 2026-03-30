// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class ValueCallback {
    private final android.webkit.ValueCallback real;

    public ValueCallback(android.webkit.ValueCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.ValueCallback wrap(android.webkit.ValueCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.ValueCallback(real);
    }

    public android.webkit.ValueCallback unwrap() {
        return real;
    }

    public void onReceiveValue(java.lang.Object arg0) {
        real.onReceiveValue(arg0);
    }

}
