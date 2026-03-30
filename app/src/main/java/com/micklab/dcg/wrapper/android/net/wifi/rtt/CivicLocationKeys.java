// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.wifi.rtt;

public final class CivicLocationKeys {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CivicLocationKeys(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.wifi.rtt.CivicLocationKeys wrap(android.net.wifi.rtt.CivicLocationKeys real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.wifi.rtt.CivicLocationKeys(real, (__DcgwBridgeToken) null);
    }

    public android.net.wifi.rtt.CivicLocationKeys getReal() {
        return (android.net.wifi.rtt.CivicLocationKeys) real;
    }

    public android.net.wifi.rtt.CivicLocationKeys unwrap() {
        return getReal();
    }


}
