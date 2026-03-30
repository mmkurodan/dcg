// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class GetCredentialException {
    private final android.credentials.GetCredentialException real;

    public GetCredentialException(android.credentials.GetCredentialException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.GetCredentialException wrap(android.credentials.GetCredentialException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.GetCredentialException(real);
    }

    public android.credentials.GetCredentialException unwrap() {
        return real;
    }

    public GetCredentialException(java.lang.String arg0) {
        this(new android.credentials.GetCredentialException(arg0));
    }

    public GetCredentialException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.credentials.GetCredentialException(arg0, arg1));
    }

    public GetCredentialException(java.lang.String arg0, java.lang.String arg1) {
        this(new android.credentials.GetCredentialException(arg0, arg1));
    }

    public GetCredentialException(java.lang.String arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.credentials.GetCredentialException(arg0, arg1, arg2));
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public static final java.lang.String TYPE_INTERRUPTED = android.credentials.GetCredentialException.TYPE_INTERRUPTED;
    public static final java.lang.String TYPE_NO_CREDENTIAL = android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL;
    public static final java.lang.String TYPE_UNKNOWN = android.credentials.GetCredentialException.TYPE_UNKNOWN;
    public static final java.lang.String TYPE_USER_CANCELED = android.credentials.GetCredentialException.TYPE_USER_CANCELED;

}
