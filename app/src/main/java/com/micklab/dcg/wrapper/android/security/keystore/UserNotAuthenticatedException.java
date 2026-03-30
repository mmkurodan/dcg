// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class UserNotAuthenticatedException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UserNotAuthenticatedException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.UserNotAuthenticatedException wrap(android.security.keystore.UserNotAuthenticatedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.UserNotAuthenticatedException(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.UserNotAuthenticatedException getReal() {
        return (android.security.keystore.UserNotAuthenticatedException) real;
    }

    public android.security.keystore.UserNotAuthenticatedException unwrap() {
        return getReal();
    }

    public UserNotAuthenticatedException() {
        this(new android.security.keystore.UserNotAuthenticatedException(), (__DcgwBridgeToken) null);
    }

    public UserNotAuthenticatedException(java.lang.String arg0) {
        this(new android.security.keystore.UserNotAuthenticatedException(arg0), (__DcgwBridgeToken) null);
    }

    public UserNotAuthenticatedException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.UserNotAuthenticatedException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
