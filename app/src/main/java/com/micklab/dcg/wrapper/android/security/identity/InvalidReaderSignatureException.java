// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class InvalidReaderSignatureException {
    private final android.security.identity.InvalidReaderSignatureException real;

    public InvalidReaderSignatureException(android.security.identity.InvalidReaderSignatureException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.InvalidReaderSignatureException wrap(android.security.identity.InvalidReaderSignatureException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.InvalidReaderSignatureException(real);
    }

    public android.security.identity.InvalidReaderSignatureException unwrap() {
        return real;
    }

    public InvalidReaderSignatureException(java.lang.String arg0) {
        this(new android.security.identity.InvalidReaderSignatureException(arg0));
    }

    public InvalidReaderSignatureException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.InvalidReaderSignatureException(arg0, arg1));
    }

}
