// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class AttestedKeyPair {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AttestedKeyPair(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.AttestedKeyPair wrap(android.security.AttestedKeyPair real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.AttestedKeyPair(real, (__DcgwBridgeToken) null);
    }

    public android.security.AttestedKeyPair getReal() {
        return (android.security.AttestedKeyPair) real;
    }

    public android.security.AttestedKeyPair unwrap() {
        return getReal();
    }

    public AttestedKeyPair(java.security.KeyPair arg0, java.util.List arg1) {
        this(new android.security.AttestedKeyPair(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public java.security.KeyPair getKeyPair() {
        return ((android.security.AttestedKeyPair) real).getKeyPair();
    }

}
