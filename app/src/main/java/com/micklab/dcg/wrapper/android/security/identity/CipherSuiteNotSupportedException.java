// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class CipherSuiteNotSupportedException {
    private final android.security.identity.CipherSuiteNotSupportedException real;

    public CipherSuiteNotSupportedException(android.security.identity.CipherSuiteNotSupportedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.CipherSuiteNotSupportedException wrap(android.security.identity.CipherSuiteNotSupportedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.CipherSuiteNotSupportedException(real);
    }

    public android.security.identity.CipherSuiteNotSupportedException unwrap() {
        return real;
    }

    public CipherSuiteNotSupportedException(java.lang.String arg0) {
        this(new android.security.identity.CipherSuiteNotSupportedException(arg0));
    }

    public CipherSuiteNotSupportedException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.CipherSuiteNotSupportedException(arg0, arg1));
    }

}
