// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class ConfirmationAlreadyPresentingException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConfirmationAlreadyPresentingException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.ConfirmationAlreadyPresentingException wrap(android.security.ConfirmationAlreadyPresentingException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.ConfirmationAlreadyPresentingException(real, (__DcgwBridgeToken) null);
    }

    public android.security.ConfirmationAlreadyPresentingException getReal() {
        return (android.security.ConfirmationAlreadyPresentingException) real;
    }

    public android.security.ConfirmationAlreadyPresentingException unwrap() {
        return getReal();
    }

    public ConfirmationAlreadyPresentingException() {
        this(new android.security.ConfirmationAlreadyPresentingException(), (__DcgwBridgeToken) null);
    }

    public ConfirmationAlreadyPresentingException(java.lang.String arg0) {
        this(new android.security.ConfirmationAlreadyPresentingException(arg0), (__DcgwBridgeToken) null);
    }

}
