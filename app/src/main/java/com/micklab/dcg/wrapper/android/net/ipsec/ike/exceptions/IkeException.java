// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class IkeException {
    private final android.net.ipsec.ike.exceptions.IkeException real;

    public IkeException(android.net.ipsec.ike.exceptions.IkeException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeException wrap(android.net.ipsec.ike.exceptions.IkeException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeException(real);
    }

    public android.net.ipsec.ike.exceptions.IkeException unwrap() {
        return real;
    }

}
