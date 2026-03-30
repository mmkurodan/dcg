// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class KeyChainException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyChainException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.KeyChainException wrap(android.security.KeyChainException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyChainException(real, (__DcgwBridgeToken) null);
    }

    public android.security.KeyChainException getReal() {
        return (android.security.KeyChainException) real;
    }

    public android.security.KeyChainException unwrap() {
        return getReal();
    }

    public KeyChainException() {
        this(new android.security.KeyChainException(), (__DcgwBridgeToken) null);
    }

    public KeyChainException(java.lang.Throwable arg0) {
        this(new android.security.KeyChainException(arg0), (__DcgwBridgeToken) null);
    }

    public KeyChainException(java.lang.String arg0) {
        this(new android.security.KeyChainException(arg0), (__DcgwBridgeToken) null);
    }

    public KeyChainException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.KeyChainException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
