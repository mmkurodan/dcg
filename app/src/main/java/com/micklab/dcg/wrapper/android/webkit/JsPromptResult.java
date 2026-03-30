// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class JsPromptResult {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JsPromptResult(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.JsPromptResult wrap(android.webkit.JsPromptResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.JsPromptResult(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.JsPromptResult getReal() {
        return (android.webkit.JsPromptResult) real;
    }

    public android.webkit.JsPromptResult unwrap() {
        return getReal();
    }

    public void confirm(java.lang.String arg0) {
        ((android.webkit.JsPromptResult) real).confirm(arg0);
    }

}
