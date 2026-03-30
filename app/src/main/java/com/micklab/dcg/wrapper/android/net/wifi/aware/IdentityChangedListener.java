// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class IdentityChangedListener {
    private final android.net.wifi.aware.IdentityChangedListener real;

    public IdentityChangedListener(android.net.wifi.aware.IdentityChangedListener real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.IdentityChangedListener wrap(android.net.wifi.aware.IdentityChangedListener real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.IdentityChangedListener(real);
    }

    public android.net.wifi.aware.IdentityChangedListener unwrap() {
        return real;
    }

    public IdentityChangedListener() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.IdentityChangedListener#android.net.wifi.aware.IdentityChangedListener()");
    }

    public void onClusterIdChanged(int arg0, com.micklab.dcg.wrapper.android.net.MacAddress arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.IdentityChangedListener#onClusterIdChanged(int,android.net.MacAddress)");
    }

    public void onIdentityChanged(byte[] arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.IdentityChangedListener#onIdentityChanged([B)");
    }


}
