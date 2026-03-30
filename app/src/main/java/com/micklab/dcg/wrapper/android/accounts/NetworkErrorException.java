// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class NetworkErrorException {
    private final android.accounts.NetworkErrorException real;

    public NetworkErrorException(android.accounts.NetworkErrorException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.NetworkErrorException wrap(android.accounts.NetworkErrorException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.NetworkErrorException(real);
    }

    public android.accounts.NetworkErrorException unwrap() {
        return real;
    }

    public NetworkErrorException() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.accounts.NetworkErrorException#android.accounts.NetworkErrorException()");
    }

    public NetworkErrorException(java.lang.Throwable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.accounts.NetworkErrorException#android.accounts.NetworkErrorException(java.lang.Throwable)");
    }

    public NetworkErrorException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.accounts.NetworkErrorException#android.accounts.NetworkErrorException(java.lang.String)");
    }

    public NetworkErrorException(java.lang.String arg0, java.lang.Throwable arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.accounts.NetworkErrorException#android.accounts.NetworkErrorException(java.lang.String,java.lang.Throwable)");
    }

}
