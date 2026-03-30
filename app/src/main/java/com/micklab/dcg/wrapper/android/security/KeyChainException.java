// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class KeyChainException {
    private final android.security.KeyChainException real;

    public KeyChainException(android.security.KeyChainException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.KeyChainException wrap(android.security.KeyChainException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.KeyChainException(real);
    }

    public android.security.KeyChainException unwrap() {
        return real;
    }

    public KeyChainException() {
        this(new android.security.KeyChainException());
    }

    public KeyChainException(java.lang.Throwable arg0) {
        this(new android.security.KeyChainException(arg0));
    }

    public KeyChainException(java.lang.String arg0) {
        this(new android.security.KeyChainException(arg0));
    }

    public KeyChainException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.KeyChainException(arg0, arg1));
    }

}
