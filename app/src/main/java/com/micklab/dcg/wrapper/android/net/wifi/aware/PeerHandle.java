// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class PeerHandle {
    private final android.net.wifi.aware.PeerHandle real;

    public PeerHandle(android.net.wifi.aware.PeerHandle real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle wrap(android.net.wifi.aware.PeerHandle real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.PeerHandle(real);
    }

    public android.net.wifi.aware.PeerHandle unwrap() {
        return real;
    }

    public boolean equals(java.lang.Object arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.PeerHandle#equals(java.lang.Object)");
    }

    public int hashCode() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.PeerHandle#hashCode()");
    }

}
