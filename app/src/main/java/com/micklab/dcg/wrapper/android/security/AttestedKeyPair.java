// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class AttestedKeyPair {
    private final android.security.AttestedKeyPair real;

    public AttestedKeyPair(android.security.AttestedKeyPair real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.AttestedKeyPair wrap(android.security.AttestedKeyPair real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.AttestedKeyPair(real);
    }

    public android.security.AttestedKeyPair unwrap() {
        return real;
    }

    public AttestedKeyPair(java.security.KeyPair arg0, java.util.List arg1) {
        this(new android.security.AttestedKeyPair(arg0, arg1));
    }

    public java.security.KeyPair getKeyPair() {
        return real.getKeyPair();
    }

}
