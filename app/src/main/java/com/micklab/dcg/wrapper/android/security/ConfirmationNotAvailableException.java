// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class ConfirmationNotAvailableException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ConfirmationNotAvailableException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.ConfirmationNotAvailableException wrap(android.security.ConfirmationNotAvailableException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.ConfirmationNotAvailableException(real, (__DcgwBridgeToken) null);
    }

    public android.security.ConfirmationNotAvailableException getReal() {
        return (android.security.ConfirmationNotAvailableException) real;
    }

    public android.security.ConfirmationNotAvailableException unwrap() {
        return getReal();
    }

    public ConfirmationNotAvailableException() {
        this(new android.security.ConfirmationNotAvailableException(), (__DcgwBridgeToken) null);
    }

    public ConfirmationNotAvailableException(java.lang.String arg0) {
        this(new android.security.ConfirmationNotAvailableException(arg0), (__DcgwBridgeToken) null);
    }

}
