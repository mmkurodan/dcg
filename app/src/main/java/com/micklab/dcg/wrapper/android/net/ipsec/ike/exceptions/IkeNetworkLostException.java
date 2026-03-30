// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class IkeNetworkLostException {
    private final android.net.ipsec.ike.exceptions.IkeNetworkLostException real;

    public IkeNetworkLostException(android.net.ipsec.ike.exceptions.IkeNetworkLostException real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeNetworkLostException wrap(android.net.ipsec.ike.exceptions.IkeNetworkLostException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeNetworkLostException(real);
    }

    public android.net.ipsec.ike.exceptions.IkeNetworkLostException unwrap() {
        return real;
    }

    public IkeNetworkLostException(com.micklab.dcg.wrapper.android.net.Network arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeNetworkLostException#android.net.ipsec.ike.exceptions.IkeNetworkLostException(android.net.Network)");
    }

    public com.micklab.dcg.wrapper.android.net.Network getNetwork() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeNetworkLostException#getNetwork()");
    }

}
