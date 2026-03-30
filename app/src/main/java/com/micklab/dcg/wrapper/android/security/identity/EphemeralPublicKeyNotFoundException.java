// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class EphemeralPublicKeyNotFoundException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EphemeralPublicKeyNotFoundException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.EphemeralPublicKeyNotFoundException wrap(android.security.identity.EphemeralPublicKeyNotFoundException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.EphemeralPublicKeyNotFoundException(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.EphemeralPublicKeyNotFoundException getReal() {
        return (android.security.identity.EphemeralPublicKeyNotFoundException) real;
    }

    public android.security.identity.EphemeralPublicKeyNotFoundException unwrap() {
        return getReal();
    }

    public EphemeralPublicKeyNotFoundException(java.lang.String arg0) {
        this(new android.security.identity.EphemeralPublicKeyNotFoundException(arg0), (__DcgwBridgeToken) null);
    }

    public EphemeralPublicKeyNotFoundException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.EphemeralPublicKeyNotFoundException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
