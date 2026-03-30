// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class MessageDecryptionException {
    private final android.security.identity.MessageDecryptionException real;

    public MessageDecryptionException(android.security.identity.MessageDecryptionException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.MessageDecryptionException wrap(android.security.identity.MessageDecryptionException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.MessageDecryptionException(real);
    }

    public android.security.identity.MessageDecryptionException unwrap() {
        return real;
    }

    public MessageDecryptionException(java.lang.String arg0) {
        this(new android.security.identity.MessageDecryptionException(arg0));
    }

    public MessageDecryptionException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.MessageDecryptionException(arg0, arg1));
    }

}
