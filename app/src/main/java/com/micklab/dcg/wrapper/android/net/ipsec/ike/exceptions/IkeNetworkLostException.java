// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions;

public final class IkeNetworkLostException {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private IkeNetworkLostException(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeNetworkLostException wrap(android.net.ipsec.ike.exceptions.IkeNetworkLostException real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ipsec.ike.exceptions.IkeNetworkLostException(real, (__DcgwBridgeToken) null);
    }

    public android.net.ipsec.ike.exceptions.IkeNetworkLostException getReal() {
        return (android.net.ipsec.ike.exceptions.IkeNetworkLostException) real;
    }

    public android.net.ipsec.ike.exceptions.IkeNetworkLostException unwrap() {
        return getReal();
    }

    public IkeNetworkLostException(com.micklab.dcg.wrapper.android.net.Network arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeNetworkLostException#android.net.ipsec.ike.exceptions.IkeNetworkLostException(android.net.Network)");
    }

    public com.micklab.dcg.wrapper.android.net.Network getNetwork() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ipsec.ike.exceptions.IkeNetworkLostException#getNetwork()");
    }

}
