// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.security.keystore;

public final class UserPresenceUnavailableException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private UserPresenceUnavailableException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.security.keystore.UserPresenceUnavailableException wrap(android.security.keystore.UserPresenceUnavailableException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.security.keystore.UserPresenceUnavailableException(real, (__DcgwBridgeToken) null);
    }

    public android.security.keystore.UserPresenceUnavailableException getReal() {
        return (android.security.keystore.UserPresenceUnavailableException) real;
    }

    public android.security.keystore.UserPresenceUnavailableException unwrap() {
        return getReal();
    }

    public UserPresenceUnavailableException() {
        this(new android.security.keystore.UserPresenceUnavailableException(), (__DcgwBridgeToken) null);
    }

    public UserPresenceUnavailableException(java.lang.String arg0) {
        this(new android.security.keystore.UserPresenceUnavailableException(arg0), (__DcgwBridgeToken) null);
    }

    public UserPresenceUnavailableException(java.lang.String arg0, java.lang.Throwable arg1) {
        this(new android.security.keystore.UserPresenceUnavailableException(arg0, arg1), (__DcgwBridgeToken) null);
    }

}
