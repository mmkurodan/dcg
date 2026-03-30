// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class StrongBoxUnavailableException {
    private final android.security.keystore.StrongBoxUnavailableException real;

    public StrongBoxUnavailableException(android.security.keystore.StrongBoxUnavailableException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.StrongBoxUnavailableException wrap(android.security.keystore.StrongBoxUnavailableException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.StrongBoxUnavailableException(real);
    }

    public android.security.keystore.StrongBoxUnavailableException unwrap() {
        return real;
    }

    public StrongBoxUnavailableException() {
        this(new android.security.keystore.StrongBoxUnavailableException());
    }

    public StrongBoxUnavailableException(java.lang.Throwable arg0) {
        this(new android.security.keystore.StrongBoxUnavailableException(arg0));
    }

    public StrongBoxUnavailableException(java.lang.String arg0) {
        this(new android.security.keystore.StrongBoxUnavailableException(arg0));
    }

    public StrongBoxUnavailableException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.StrongBoxUnavailableException(arg0, arg1));
    }

}
