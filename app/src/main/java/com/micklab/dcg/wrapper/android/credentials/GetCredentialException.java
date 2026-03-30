// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class GetCredentialException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private GetCredentialException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.GetCredentialException wrap(android.credentials.GetCredentialException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.GetCredentialException(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.GetCredentialException getReal() {
        return (android.credentials.GetCredentialException) real;
    }

    public android.credentials.GetCredentialException unwrap() {
        return getReal();
    }

    public GetCredentialException(java.lang.String arg0) {
        this(new android.credentials.GetCredentialException(arg0), (__DcgwBridgeToken) null);
    }

    public GetCredentialException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.credentials.GetCredentialException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public GetCredentialException(java.lang.String arg0, java.lang.String arg1) {
        this(new android.credentials.GetCredentialException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public GetCredentialException(java.lang.String arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.credentials.GetCredentialException(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public java.lang.String getType() {
        return ((android.credentials.GetCredentialException) real).getType();
    }

    public static final java.lang.String TYPE_INTERRUPTED = android.credentials.GetCredentialException.TYPE_INTERRUPTED;
    public static final java.lang.String TYPE_NO_CREDENTIAL = android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL;
    public static final java.lang.String TYPE_UNKNOWN = android.credentials.GetCredentialException.TYPE_UNKNOWN;
    public static final java.lang.String TYPE_USER_CANCELED = android.credentials.GetCredentialException.TYPE_USER_CANCELED;

}
