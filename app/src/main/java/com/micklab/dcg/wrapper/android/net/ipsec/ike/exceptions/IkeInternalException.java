// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class IkeInternalException {
    private final android.net.ipsec.ike.exceptions.IkeInternalException real;

    public IkeInternalException(android.net.ipsec.ike.exceptions.IkeInternalException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeInternalException wrap(android.net.ipsec.ike.exceptions.IkeInternalException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeInternalException(real);
    }

    public android.net.ipsec.ike.exceptions.IkeInternalException unwrap() {
        return real;
    }

    public IkeInternalException(java.lang.Throwable arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeInternalException#android.net.ipsec.ike.exceptions.IkeInternalException(java.lang.Throwable)");
    }

    public IkeInternalException(java.lang.String arg0, java.lang.Throwable arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeInternalException#android.net.ipsec.ike.exceptions.IkeInternalException(java.lang.String,java.lang.Throwable)");
    }

}
