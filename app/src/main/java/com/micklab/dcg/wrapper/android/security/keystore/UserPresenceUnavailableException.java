// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class UserPresenceUnavailableException {
    private final android.security.keystore.UserPresenceUnavailableException real;

    public UserPresenceUnavailableException(android.security.keystore.UserPresenceUnavailableException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.UserPresenceUnavailableException wrap(android.security.keystore.UserPresenceUnavailableException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.UserPresenceUnavailableException(real);
    }

    public android.security.keystore.UserPresenceUnavailableException unwrap() {
        return real;
    }

    public UserPresenceUnavailableException() {
        this(new android.security.keystore.UserPresenceUnavailableException());
    }

    public UserPresenceUnavailableException(java.lang.String arg0) {
        this(new android.security.keystore.UserPresenceUnavailableException(arg0));
    }

    public UserPresenceUnavailableException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.UserPresenceUnavailableException(arg0, arg1));
    }

}
