// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class ClearCredentialStateException {
    private final android.credentials.ClearCredentialStateException real;

    public ClearCredentialStateException(android.credentials.ClearCredentialStateException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.ClearCredentialStateException wrap(android.credentials.ClearCredentialStateException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.ClearCredentialStateException(real);
    }

    public android.credentials.ClearCredentialStateException unwrap() {
        return real;
    }

    public ClearCredentialStateException(java.lang.String arg0) {
        this(new android.credentials.ClearCredentialStateException(arg0));
    }

    public ClearCredentialStateException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.credentials.ClearCredentialStateException(arg0, arg1));
    }

    public ClearCredentialStateException(java.lang.String arg0, java.lang.String arg1) {
        this(new android.credentials.ClearCredentialStateException(arg0, arg1));
    }

    public ClearCredentialStateException(java.lang.String arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.credentials.ClearCredentialStateException(arg0, arg1, arg2));
    }

    public java.lang.String getType() {
        return real.getType();
    }

    public static final java.lang.String TYPE_UNKNOWN = android.credentials.ClearCredentialStateException.TYPE_UNKNOWN;

}
