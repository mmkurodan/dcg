// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class ConfirmationAlreadyPresentingException {
    private final android.security.ConfirmationAlreadyPresentingException real;

    public ConfirmationAlreadyPresentingException(android.security.ConfirmationAlreadyPresentingException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.ConfirmationAlreadyPresentingException wrap(android.security.ConfirmationAlreadyPresentingException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.ConfirmationAlreadyPresentingException(real);
    }

    public android.security.ConfirmationAlreadyPresentingException unwrap() {
        return real;
    }

    public ConfirmationAlreadyPresentingException() {
        this(new android.security.ConfirmationAlreadyPresentingException());
    }

    public ConfirmationAlreadyPresentingException(java.lang.String arg0) {
        this(new android.security.ConfirmationAlreadyPresentingException(arg0));
    }

}
