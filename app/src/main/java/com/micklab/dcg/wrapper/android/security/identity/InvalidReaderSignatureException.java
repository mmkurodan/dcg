// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class InvalidReaderSignatureException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InvalidReaderSignatureException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.InvalidReaderSignatureException wrap(android.security.identity.InvalidReaderSignatureException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.InvalidReaderSignatureException(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.InvalidReaderSignatureException getReal() {
        return (android.security.identity.InvalidReaderSignatureException) real;
    }

    public android.security.identity.InvalidReaderSignatureException unwrap() {
        return getReal();
    }

    public InvalidReaderSignatureException(java.lang.String arg0) {
        this(new android.security.identity.InvalidReaderSignatureException(arg0), (__DcgwBridgeToken) null);
    }

    public InvalidReaderSignatureException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.InvalidReaderSignatureException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
