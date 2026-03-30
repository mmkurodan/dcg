// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi;

public final class EasyConnectStatusCallback {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private EasyConnectStatusCallback(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.EasyConnectStatusCallback wrap(android.net.wifi.EasyConnectStatusCallback real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.EasyConnectStatusCallback(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.EasyConnectStatusCallback getReal() {
        return (android.net.wifi.EasyConnectStatusCallback) real;
    }

    public android.net.wifi.EasyConnectStatusCallback unwrap() {
        return getReal();
    }


}
