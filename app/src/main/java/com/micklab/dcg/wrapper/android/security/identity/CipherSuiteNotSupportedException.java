// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class CipherSuiteNotSupportedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CipherSuiteNotSupportedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.CipherSuiteNotSupportedException wrap(android.security.identity.CipherSuiteNotSupportedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.CipherSuiteNotSupportedException(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.CipherSuiteNotSupportedException getReal() {
        return (android.security.identity.CipherSuiteNotSupportedException) real;
    }

    public android.security.identity.CipherSuiteNotSupportedException unwrap() {
        return getReal();
    }

    public CipherSuiteNotSupportedException(java.lang.String arg0) {
        this(new android.security.identity.CipherSuiteNotSupportedException(arg0), (__DcgwBridgeToken) null);
    }

    public CipherSuiteNotSupportedException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.CipherSuiteNotSupportedException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
