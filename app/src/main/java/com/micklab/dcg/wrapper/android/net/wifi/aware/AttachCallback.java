// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.aware;

public final class AttachCallback {
    private final android.net.wifi.aware.AttachCallback real;

    public AttachCallback(android.net.wifi.aware.AttachCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.aware.AttachCallback wrap(android.net.wifi.aware.AttachCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.aware.AttachCallback(real);
    }

    public android.net.wifi.aware.AttachCallback unwrap() {
        return real;
    }

    public AttachCallback() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.AttachCallback#android.net.wifi.aware.AttachCallback()");
    }

    public void onAttachFailed() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.AttachCallback#onAttachFailed()");
    }

    public void onAttached(com.micklab.dcg.wrapper.android.net.wifi.aware.WifiAwareSession arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.AttachCallback#onAttached(android.net.wifi.aware.WifiAwareSession)");
    }

    public void onAwareSessionTerminated() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.wifi.aware.AttachCallback#onAwareSessionTerminated()");
    }

}
