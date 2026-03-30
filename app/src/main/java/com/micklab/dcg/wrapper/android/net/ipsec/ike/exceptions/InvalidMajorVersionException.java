// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class InvalidMajorVersionException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InvalidMajorVersionException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.InvalidMajorVersionException wrap(android.net.ipsec.ike.exceptions.InvalidMajorVersionException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.InvalidMajorVersionException(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.exceptions.InvalidMajorVersionException getReal() {
        return (android.net.ipsec.ike.exceptions.InvalidMajorVersionException) real;
    }

    public android.net.ipsec.ike.exceptions.InvalidMajorVersionException unwrap() {
        return getReal();
    }

    public InvalidMajorVersionException(byte arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.InvalidMajorVersionException#android.net.ipsec.ike.exceptions.InvalidMajorVersionException(byte)");
    }

    public byte getMajorVersion() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.InvalidMajorVersionException#getMajorVersion()");
    }

}
