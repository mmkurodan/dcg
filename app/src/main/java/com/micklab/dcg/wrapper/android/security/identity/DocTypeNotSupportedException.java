// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class DocTypeNotSupportedException {
    private final android.security.identity.DocTypeNotSupportedException real;

    public DocTypeNotSupportedException(android.security.identity.DocTypeNotSupportedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.DocTypeNotSupportedException wrap(android.security.identity.DocTypeNotSupportedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.DocTypeNotSupportedException(real);
    }

    public android.security.identity.DocTypeNotSupportedException unwrap() {
        return real;
    }

    public DocTypeNotSupportedException(java.lang.String arg0) {
        this(new android.security.identity.DocTypeNotSupportedException(arg0));
    }

    public DocTypeNotSupportedException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.DocTypeNotSupportedException(arg0, arg1));
    }

}
