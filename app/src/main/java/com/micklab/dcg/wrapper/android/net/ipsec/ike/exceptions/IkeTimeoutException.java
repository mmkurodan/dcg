// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class IkeTimeoutException {
    private final android.net.ipsec.ike.exceptions.IkeTimeoutException real;

    public IkeTimeoutException(android.net.ipsec.ike.exceptions.IkeTimeoutException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeTimeoutException wrap(android.net.ipsec.ike.exceptions.IkeTimeoutException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeTimeoutException(real);
    }

    public android.net.ipsec.ike.exceptions.IkeTimeoutException unwrap() {
        return real;
    }

    public IkeTimeoutException(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeTimeoutException#android.net.ipsec.ike.exceptions.IkeTimeoutException(java.lang.String)");
    }

}
