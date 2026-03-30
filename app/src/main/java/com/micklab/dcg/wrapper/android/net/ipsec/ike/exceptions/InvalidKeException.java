// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class InvalidKeException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InvalidKeException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.InvalidKeException wrap(android.net.ipsec.ike.exceptions.InvalidKeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.InvalidKeException(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.exceptions.InvalidKeException getReal() {
        return (android.net.ipsec.ike.exceptions.InvalidKeException) real;
    }

    public android.net.ipsec.ike.exceptions.InvalidKeException unwrap() {
        return getReal();
    }

    public InvalidKeException(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.InvalidKeException#android.net.ipsec.ike.exceptions.InvalidKeException(int)");
    }

    public int getDhGroup() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.InvalidKeException#getDhGroup()");
    }

}
