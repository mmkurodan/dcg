// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class KeyPermanentlyInvalidatedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private KeyPermanentlyInvalidatedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.KeyPermanentlyInvalidatedException wrap(android.security.keystore.KeyPermanentlyInvalidatedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.KeyPermanentlyInvalidatedException(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.KeyPermanentlyInvalidatedException getReal() {
        return (android.security.keystore.KeyPermanentlyInvalidatedException) real;
    }

    public android.security.keystore.KeyPermanentlyInvalidatedException unwrap() {
        return getReal();
    }

    public KeyPermanentlyInvalidatedException() {
        this(new android.security.keystore.KeyPermanentlyInvalidatedException(), (__DcgwBridgeToken) null);
    }

    public KeyPermanentlyInvalidatedException(java.lang.String arg0) {
        this(new android.security.keystore.KeyPermanentlyInvalidatedException(arg0), (__DcgwBridgeToken) null);
    }

    public KeyPermanentlyInvalidatedException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.KeyPermanentlyInvalidatedException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
