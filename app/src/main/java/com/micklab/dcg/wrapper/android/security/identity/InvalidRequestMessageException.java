// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.identity;

public final class InvalidRequestMessageException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InvalidRequestMessageException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.identity.InvalidRequestMessageException wrap(android.security.identity.InvalidRequestMessageException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.identity.InvalidRequestMessageException(real, (__DcgwBridgeToken) null);
    }

    public android.security.identity.InvalidRequestMessageException getReal() {
        return (android.security.identity.InvalidRequestMessageException) real;
    }

    public android.security.identity.InvalidRequestMessageException unwrap() {
        return getReal();
    }

    public InvalidRequestMessageException(java.lang.String arg0) {
        this(new android.security.identity.InvalidRequestMessageException(arg0), (__DcgwBridgeToken) null);
    }

    public InvalidRequestMessageException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.identity.InvalidRequestMessageException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
