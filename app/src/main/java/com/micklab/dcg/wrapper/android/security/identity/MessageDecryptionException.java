// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class MessageDecryptionException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private MessageDecryptionException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.MessageDecryptionException wrap(android.security.identity.MessageDecryptionException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.MessageDecryptionException(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.MessageDecryptionException getReal() {
        return (android.security.identity.MessageDecryptionException) real;
    }

    public android.security.identity.MessageDecryptionException unwrap() {
        return getReal();
    }

    public MessageDecryptionException(java.lang.String arg0) {
        this(new android.security.identity.MessageDecryptionException(arg0), (__DcgwBridgeToken) null);
    }

    public MessageDecryptionException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.MessageDecryptionException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
