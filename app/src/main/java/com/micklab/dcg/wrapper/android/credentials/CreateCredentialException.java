// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class CreateCredentialException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CreateCredentialException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.CreateCredentialException wrap(android.credentials.CreateCredentialException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CreateCredentialException(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.CreateCredentialException getReal() {
        return (android.credentials.CreateCredentialException) real;
    }

    public android.credentials.CreateCredentialException unwrap() {
        return getReal();
    }

    public CreateCredentialException(java.lang.String arg0) {
        this(new android.credentials.CreateCredentialException(arg0), (__DcgwBridgeToken) null);
    }

    public CreateCredentialException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.credentials.CreateCredentialException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public CreateCredentialException(java.lang.String arg0, java.lang.String arg1) {
        this(new android.credentials.CreateCredentialException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public CreateCredentialException(java.lang.String arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.credentials.CreateCredentialException(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public java.lang.String getType() {
        return ((android.credentials.CreateCredentialException) real).getType();
    }

    public static final java.lang.String TYPE_INTERRUPTED = android.credentials.CreateCredentialException.TYPE_INTERRUPTED;
    public static final java.lang.String TYPE_NO_CREATE_OPTIONS = android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS;
    public static final java.lang.String TYPE_UNKNOWN = android.credentials.CreateCredentialException.TYPE_UNKNOWN;
    public static final java.lang.String TYPE_USER_CANCELED = android.credentials.CreateCredentialException.TYPE_USER_CANCELED;

}
