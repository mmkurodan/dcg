// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyExpiredException {
    private final android.security.keystore.KeyExpiredException real;

    public KeyExpiredException(android.security.keystore.KeyExpiredException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyExpiredException wrap(android.security.keystore.KeyExpiredException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyExpiredException(real);
    }

    public android.security.keystore.KeyExpiredException unwrap() {
        return real;
    }

    public KeyExpiredException() {
        this(new android.security.keystore.KeyExpiredException());
    }

    public KeyExpiredException(java.lang.String arg0) {
        this(new android.security.keystore.KeyExpiredException(arg0));
    }

    public KeyExpiredException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.KeyExpiredException(arg0, arg1));
    }

}
