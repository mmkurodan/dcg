// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.os.strictmode;

public final class WebViewMethodCalledOnWrongThreadViolation {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private WebViewMethodCalledOnWrongThreadViolation(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation wrap(android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation(real, (__DcgwBridgeToken) null);
    }

    public android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation getReal() {
        return (android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation) real;
    }

    public android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation unwrap() {
        return getReal();
    }

}
