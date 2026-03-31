// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class AndroidException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AndroidException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.AndroidException wrap(android.util.AndroidException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.AndroidException(real, (__DcgwBridgeToken) null);
    }

    public android.util.AndroidException getReal() {
        return (android.util.AndroidException) real;
    }

    public android.util.AndroidException unwrap() {
        return getReal();
    }

    public AndroidException() {
        this(new android.util.AndroidException(), (__DcgwBridgeToken) null);
    }

    public AndroidException(java.lang.String arg0) {
        this(new android.util.AndroidException(arg0), (__DcgwBridgeToken) null);
    }

    public AndroidException(java.lang.Exception arg0) {
        this(new android.util.AndroidException(arg0), (__DcgwBridgeToken) null);
    }

    public AndroidException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.util.AndroidException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
