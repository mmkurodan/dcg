// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class CreateCredentialException {
    private final android.credentials.CreateCredentialException real;

    public CreateCredentialException(android.credentials.CreateCredentialException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.CreateCredentialException wrap(android.credentials.CreateCredentialException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.CreateCredentialException(real);
    }

    public android.credentials.CreateCredentialException unwrap() {
        return real;
    }

    public CreateCredentialException(java.lang.String arg0) {
        this(new android.credentials.CreateCredentialException(arg0));
    }

    public CreateCredentialException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.credentials.CreateCredentialException(arg0, arg1));
    }

    public CreateCredentialException(java.lang.String arg0, java.lang.String arg1) {
        this(new android.credentials.CreateCredentialException(arg0, arg1));
    }

    public CreateCredentialException(java.lang.String arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.credentials.CreateCredentialException(arg0, arg1, arg2));
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public static final java.lang.String TYPE_INTERRUPTED = android.credentials.CreateCredentialException.TYPE_INTERRUPTED;
    public static final java.lang.String TYPE_NO_CREATE_OPTIONS = android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS;
    public static final java.lang.String TYPE_UNKNOWN = android.credentials.CreateCredentialException.TYPE_UNKNOWN;
    public static final java.lang.String TYPE_USER_CANCELED = android.credentials.CreateCredentialException.TYPE_USER_CANCELED;

}
