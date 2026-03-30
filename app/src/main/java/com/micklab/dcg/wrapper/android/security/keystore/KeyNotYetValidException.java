// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyNotYetValidException {
    private final android.security.keystore.KeyNotYetValidException real;

    public KeyNotYetValidException(android.security.keystore.KeyNotYetValidException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyNotYetValidException wrap(android.security.keystore.KeyNotYetValidException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyNotYetValidException(real);
    }

    public android.security.keystore.KeyNotYetValidException unwrap() {
        return real;
    }

    public KeyNotYetValidException() {
        this(new android.security.keystore.KeyNotYetValidException());
    }

    public KeyNotYetValidException(java.lang.String arg0) {
        this(new android.security.keystore.KeyNotYetValidException(arg0));
    }

    public KeyNotYetValidException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.KeyNotYetValidException(arg0, arg1));
    }

}
