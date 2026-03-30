// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security;

public final class ConfirmationNotAvailableException {
    private final android.security.ConfirmationNotAvailableException real;

    public ConfirmationNotAvailableException(android.security.ConfirmationNotAvailableException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.ConfirmationNotAvailableException wrap(android.security.ConfirmationNotAvailableException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.ConfirmationNotAvailableException(real);
    }

    public android.security.ConfirmationNotAvailableException unwrap() {
        return real;
    }

    public ConfirmationNotAvailableException() {
        this(new android.security.ConfirmationNotAvailableException());
    }

    public ConfirmationNotAvailableException(java.lang.String arg0) {
        this(new android.security.ConfirmationNotAvailableException(arg0));
    }

}
