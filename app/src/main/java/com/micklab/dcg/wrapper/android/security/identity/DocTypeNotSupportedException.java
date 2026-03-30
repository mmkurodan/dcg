// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class DocTypeNotSupportedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DocTypeNotSupportedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.DocTypeNotSupportedException wrap(android.security.identity.DocTypeNotSupportedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.DocTypeNotSupportedException(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.DocTypeNotSupportedException getReal() {
        return (android.security.identity.DocTypeNotSupportedException) real;
    }

    public android.security.identity.DocTypeNotSupportedException unwrap() {
        return getReal();
    }

    public DocTypeNotSupportedException(java.lang.String arg0) {
        this(new android.security.identity.DocTypeNotSupportedException(arg0), (__DcgwBridgeToken) null);
    }

    public DocTypeNotSupportedException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.DocTypeNotSupportedException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
