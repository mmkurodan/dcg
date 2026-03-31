// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.webkit;

public final class JavascriptInterface {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private JavascriptInterface(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.webkit.JavascriptInterface wrap(android.webkit.JavascriptInterface real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.webkit.JavascriptInterface(real, (__DcgwBridgeToken) null);
    }

    public android.webkit.JavascriptInterface getReal() {
        return (android.webkit.JavascriptInterface) real;
    }

    public android.webkit.JavascriptInterface unwrap() {
        return getReal();
    }

}
