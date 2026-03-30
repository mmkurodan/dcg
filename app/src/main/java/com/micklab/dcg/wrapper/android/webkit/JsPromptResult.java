// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class JsPromptResult {
    private final android.webkit.JsPromptResult real;

    public JsPromptResult(android.webkit.JsPromptResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.JsPromptResult wrap(android.webkit.JsPromptResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.JsPromptResult(real);
    }

    public android.webkit.JsPromptResult unwrap() {
        return real;
    }

    public void confirm(java.lang.String arg0) {
        real.confirm(arg0);
    }

}
