// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class UserNotAuthenticatedException {
    private final android.security.keystore.UserNotAuthenticatedException real;

    public UserNotAuthenticatedException(android.security.keystore.UserNotAuthenticatedException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.UserNotAuthenticatedException wrap(android.security.keystore.UserNotAuthenticatedException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.UserNotAuthenticatedException(real);
    }

    public android.security.keystore.UserNotAuthenticatedException unwrap() {
        return real;
    }

    public UserNotAuthenticatedException() {
        this(new android.security.keystore.UserNotAuthenticatedException());
    }

    public UserNotAuthenticatedException(java.lang.String arg0) {
        this(new android.security.keystore.UserNotAuthenticatedException(arg0));
    }

    public UserNotAuthenticatedException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.UserNotAuthenticatedException(arg0, arg1));
    }

}
