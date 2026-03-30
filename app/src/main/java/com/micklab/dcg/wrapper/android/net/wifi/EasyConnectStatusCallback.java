// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi;

public final class EasyConnectStatusCallback {
    private final android.net.wifi.EasyConnectStatusCallback real;

    public EasyConnectStatusCallback(android.net.wifi.EasyConnectStatusCallback real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.EasyConnectStatusCallback wrap(android.net.wifi.EasyConnectStatusCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.EasyConnectStatusCallback(real);
    }

    public android.net.wifi.EasyConnectStatusCallback unwrap() {
        return real;
    }


}
