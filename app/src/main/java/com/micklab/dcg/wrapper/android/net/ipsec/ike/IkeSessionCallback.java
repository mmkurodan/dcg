// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike;

public final class IkeSessionCallback {
    private final android.net.ipsec.ike.IkeSessionCallback real;

    public IkeSessionCallback(android.net.ipsec.ike.IkeSessionCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionCallback wrap(android.net.ipsec.ike.IkeSessionCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionCallback(real);
    }

    public android.net.ipsec.ike.IkeSessionCallback unwrap() {
        return real;
    }

    public void onClosed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionCallback#onClosed()");
    }

    public void onClosedWithException(com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeException arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionCallback#onClosedWithException(android.net.ipsec.ike.exceptions.IkeException)");
    }

    public void onError(com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeException arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionCallback#onError(android.net.ipsec.ike.exceptions.IkeException)");
    }

    public void onOpened(com.micklab.dcg.wrapper.android.net.ipsec.ike.IkeSessionConfiguration arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.IkeSessionCallback#onOpened(android.net.ipsec.ike.IkeSessionConfiguration)");
    }

}
