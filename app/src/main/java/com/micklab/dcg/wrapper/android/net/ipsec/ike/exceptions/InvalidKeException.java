// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class InvalidKeException {
    private final android.net.ipsec.ike.exceptions.InvalidKeException real;

    public InvalidKeException(android.net.ipsec.ike.exceptions.InvalidKeException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.InvalidKeException wrap(android.net.ipsec.ike.exceptions.InvalidKeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.InvalidKeException(real);
    }

    public android.net.ipsec.ike.exceptions.InvalidKeException unwrap() {
        return real;
    }

    public InvalidKeException(int arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.InvalidKeException#android.net.ipsec.ike.exceptions.InvalidKeException(int)");
    }

    public int getDhGroup() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.InvalidKeException#getDhGroup()");
    }

}
