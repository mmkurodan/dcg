// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class ValueCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ValueCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.ValueCallback wrap(android.webkit.ValueCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.ValueCallback(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.ValueCallback getReal() {
        return (android.webkit.ValueCallback) real;
    }

    public android.webkit.ValueCallback unwrap() {
        return getReal();
    }

    public void onReceiveValue(java.lang.Object arg0) {
        ((android.webkit.ValueCallback) real).onReceiveValue(arg0);
    }

}
