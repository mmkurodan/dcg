// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.icu.util;

public final class ICUUncheckedIOException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ICUUncheckedIOException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.icu.util.ICUUncheckedIOException wrap(android.icu.util.ICUUncheckedIOException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.icu.util.ICUUncheckedIOException(real, (__DcgwBridgeToken) null);
    }

    public android.icu.util.ICUUncheckedIOException getReal() {
        return (android.icu.util.ICUUncheckedIOException) real;
    }

    public android.icu.util.ICUUncheckedIOException unwrap() {
        return getReal();
    }

    public ICUUncheckedIOException() {
        this(new android.icu.util.ICUUncheckedIOException(), (__DcgwBridgeToken) null);
    }

    public ICUUncheckedIOException(java.lang.Throwable arg0) {
        this(new android.icu.util.ICUUncheckedIOException(arg0), (__DcgwBridgeToken) null);
    }

    public ICUUncheckedIOException(java.lang.String arg0) {
        this(new android.icu.util.ICUUncheckedIOException(arg0), (__DcgwBridgeToken) null);
    }

    public ICUUncheckedIOException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.icu.util.ICUUncheckedIOException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
