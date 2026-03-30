// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.credentials;

public final class ClearCredentialStateException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ClearCredentialStateException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.credentials.ClearCredentialStateException wrap(android.credentials.ClearCredentialStateException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.credentials.ClearCredentialStateException(real, (__DcgwBridgeToken) null);
    }

    public android.credentials.ClearCredentialStateException getReal() {
        return (android.credentials.ClearCredentialStateException) real;
    }

    public android.credentials.ClearCredentialStateException unwrap() {
        return getReal();
    }

    public ClearCredentialStateException(java.lang.String arg0) {
        this(new android.credentials.ClearCredentialStateException(arg0), (__DcgwBridgeToken) null);
    }

    public ClearCredentialStateException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.credentials.ClearCredentialStateException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public ClearCredentialStateException(java.lang.String arg0, java.lang.String arg1) {
        this(new android.credentials.ClearCredentialStateException(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public ClearCredentialStateException(java.lang.String arg0, java.lang.String arg1, java.lang.Throwable arg2) {
        this(new android.credentials.ClearCredentialStateException(arg0, arg1, arg2), (__DcgwBridgeToken) null);
    }

    public java.lang.String getType() {
        return ((android.credentials.ClearCredentialStateException) real).getType();
    }

    public static final java.lang.String TYPE_UNKNOWN = android.credentials.ClearCredentialStateException.TYPE_UNKNOWN;

}
