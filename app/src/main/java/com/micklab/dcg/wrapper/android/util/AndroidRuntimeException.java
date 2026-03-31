// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class AndroidRuntimeException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AndroidRuntimeException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.AndroidRuntimeException wrap(android.util.AndroidRuntimeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.AndroidRuntimeException(real, (__DcgwBridgeToken) null);
    }

    public android.util.AndroidRuntimeException getReal() {
        return (android.util.AndroidRuntimeException) real;
    }

    public android.util.AndroidRuntimeException unwrap() {
        return getReal();
    }

    public AndroidRuntimeException() {
        this(new android.util.AndroidRuntimeException(), (__DcgwBridgeToken) null);
    }

    public AndroidRuntimeException(java.lang.String arg0) {
        this(new android.util.AndroidRuntimeException(arg0), (__DcgwBridgeToken) null);
    }

    public AndroidRuntimeException(java.lang.Exception arg0) {
        this(new android.util.AndroidRuntimeException(arg0), (__DcgwBridgeToken) null);
    }

    public AndroidRuntimeException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.util.AndroidRuntimeException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
