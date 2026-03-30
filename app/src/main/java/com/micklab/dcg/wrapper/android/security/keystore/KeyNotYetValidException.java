// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyNotYetValidException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyNotYetValidException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyNotYetValidException wrap(android.security.keystore.KeyNotYetValidException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyNotYetValidException(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.KeyNotYetValidException getReal() {
        return (android.security.keystore.KeyNotYetValidException) real;
    }

    public android.security.keystore.KeyNotYetValidException unwrap() {
        return getReal();
    }

    public KeyNotYetValidException() {
        this(new android.security.keystore.KeyNotYetValidException(), (__DcgwBridgeToken) null);
    }

    public KeyNotYetValidException(java.lang.String arg0) {
        this(new android.security.keystore.KeyNotYetValidException(arg0), (__DcgwBridgeToken) null);
    }

    public KeyNotYetValidException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.KeyNotYetValidException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
