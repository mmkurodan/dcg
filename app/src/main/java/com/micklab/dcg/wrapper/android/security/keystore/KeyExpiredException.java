// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyExpiredException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyExpiredException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyExpiredException wrap(android.security.keystore.KeyExpiredException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyExpiredException(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.KeyExpiredException getReal() {
        return (android.security.keystore.KeyExpiredException) real;
    }

    public android.security.keystore.KeyExpiredException unwrap() {
        return getReal();
    }

    public KeyExpiredException() {
        this(new android.security.keystore.KeyExpiredException(), (__DcgwBridgeToken) null);
    }

    public KeyExpiredException(java.lang.String arg0) {
        this(new android.security.keystore.KeyExpiredException(arg0), (__DcgwBridgeToken) null);
    }

    public KeyExpiredException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.KeyExpiredException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
