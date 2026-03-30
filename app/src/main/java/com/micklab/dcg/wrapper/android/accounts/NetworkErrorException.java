// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.accounts;

public final class NetworkErrorException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NetworkErrorException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.accounts.NetworkErrorException wrap(android.accounts.NetworkErrorException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.accounts.NetworkErrorException(real, (__DcgwBridgeToken) null);
    }

    public android.accounts.NetworkErrorException getReal() {
        return (android.accounts.NetworkErrorException) real;
    }

    public android.accounts.NetworkErrorException unwrap() {
        return getReal();
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
