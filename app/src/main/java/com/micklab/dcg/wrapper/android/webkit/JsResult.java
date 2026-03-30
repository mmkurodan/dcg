// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class JsResult {
    private final android.webkit.JsResult real;

    public JsResult(android.webkit.JsResult real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.JsResult wrap(android.webkit.JsResult real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.JsResult(real);
    }

    public android.webkit.JsResult unwrap() {
        return real;
    }

    public void cancel() {
        real.cancel();
    }

    public void confirm() {
        real.confirm();
    }

}
