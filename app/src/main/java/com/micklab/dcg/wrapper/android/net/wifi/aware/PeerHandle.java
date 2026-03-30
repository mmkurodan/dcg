// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class PeerHandle {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private PeerHandle(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle wrap(android.net.wifi.aware.PeerHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.aware.PeerHandle getReal() {
        return (android.net.wifi.aware.PeerHandle) real;
    }

    public android.net.wifi.aware.PeerHandle unwrap() {
        return getReal();
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.PeerHandle#equals(java.lang.Object)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.PeerHandle#hashCode()");
    }

}
