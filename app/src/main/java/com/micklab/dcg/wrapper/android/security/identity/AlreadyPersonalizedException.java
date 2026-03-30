// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class AlreadyPersonalizedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private AlreadyPersonalizedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.AlreadyPersonalizedException wrap(android.security.identity.AlreadyPersonalizedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.AlreadyPersonalizedException(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.AlreadyPersonalizedException getReal() {
        return (android.security.identity.AlreadyPersonalizedException) real;
    }

    public android.security.identity.AlreadyPersonalizedException unwrap() {
        return getReal();
    }

    public AlreadyPersonalizedException(java.lang.String arg0) {
        this(new android.security.identity.AlreadyPersonalizedException(arg0), (__DcgwBridgeToken) null);
    }

    public AlreadyPersonalizedException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.AlreadyPersonalizedException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
