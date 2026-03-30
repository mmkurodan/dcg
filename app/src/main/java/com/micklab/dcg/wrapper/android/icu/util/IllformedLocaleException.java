// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class IllformedLocaleException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IllformedLocaleException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.IllformedLocaleException wrap(android.icu.util.IllformedLocaleException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.IllformedLocaleException(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.IllformedLocaleException getReal() {
        return (android.icu.util.IllformedLocaleException) real;
    }

    public android.icu.util.IllformedLocaleException unwrap() {
        return getReal();
    }

    public IllformedLocaleException() {
        this(new android.icu.util.IllformedLocaleException(), (__DcgwBridgeToken) null);
    }

    public IllformedLocaleException(java.lang.String arg0) {
        this(new android.icu.util.IllformedLocaleException(arg0), (__DcgwBridgeToken) null);
    }

    public IllformedLocaleException(java.lang.String arg0, int arg1) {
        this(new android.icu.util.IllformedLocaleException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int getErrorIndex() {
        return ((android.icu.util.IllformedLocaleException) real).getErrorIndex();
    }

}
