// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class InvalidRequestMessageException {
    private final android.security.identity.InvalidRequestMessageException real;

    public InvalidRequestMessageException(android.security.identity.InvalidRequestMessageException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.InvalidRequestMessageException wrap(android.security.identity.InvalidRequestMessageException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.InvalidRequestMessageException(real);
    }

    public android.security.identity.InvalidRequestMessageException unwrap() {
        return real;
    }

    public InvalidRequestMessageException(java.lang.String arg0) {
        this(new android.security.identity.InvalidRequestMessageException(arg0));
    }

    public InvalidRequestMessageException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.InvalidRequestMessageException(arg0, arg1));
    }

}
