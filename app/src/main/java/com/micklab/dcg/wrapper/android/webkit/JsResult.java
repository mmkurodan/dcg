// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class JsResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JsResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.JsResult wrap(android.webkit.JsResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.JsResult(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.JsResult getReal() {
        return (android.webkit.JsResult) real;
    }

    public android.webkit.JsResult unwrap() {
        return getReal();
    }

    public void cancel() {
        ((android.webkit.JsResult) real).cancel();
    }

    public void confirm() {
        ((android.webkit.JsResult) real).confirm();
    }

}
