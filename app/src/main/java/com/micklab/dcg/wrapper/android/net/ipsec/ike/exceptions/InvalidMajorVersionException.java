// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class InvalidMajorVersionException {
    private final android.net.ipsec.ike.exceptions.InvalidMajorVersionException real;

    public InvalidMajorVersionException(android.net.ipsec.ike.exceptions.InvalidMajorVersionException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.InvalidMajorVersionException wrap(android.net.ipsec.ike.exceptions.InvalidMajorVersionException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.InvalidMajorVersionException(real);
    }

    public android.net.ipsec.ike.exceptions.InvalidMajorVersionException unwrap() {
        return real;
    }

    public InvalidMajorVersionException(byte arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.InvalidMajorVersionException#android.net.ipsec.ike.exceptions.InvalidMajorVersionException(byte)");
    }

    public byte getMajorVersion() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.InvalidMajorVersionException#getMajorVersion()");
    }

}
