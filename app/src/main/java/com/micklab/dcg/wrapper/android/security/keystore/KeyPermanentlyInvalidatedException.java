// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyPermanentlyInvalidatedException {
    private final android.security.keystore.KeyPermanentlyInvalidatedException real;

    public KeyPermanentlyInvalidatedException(android.security.keystore.KeyPermanentlyInvalidatedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyPermanentlyInvalidatedException wrap(android.security.keystore.KeyPermanentlyInvalidatedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyPermanentlyInvalidatedException(real);
    }

    public android.security.keystore.KeyPermanentlyInvalidatedException unwrap() {
        return real;
    }

    public KeyPermanentlyInvalidatedException() {
        this(new android.security.keystore.KeyPermanentlyInvalidatedException());
    }

    public KeyPermanentlyInvalidatedException(java.lang.String arg0) {
        this(new android.security.keystore.KeyPermanentlyInvalidatedException(arg0));
    }

    public KeyPermanentlyInvalidatedException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.KeyPermanentlyInvalidatedException(arg0, arg1));
    }

}
