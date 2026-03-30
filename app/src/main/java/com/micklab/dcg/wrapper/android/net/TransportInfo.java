// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class TransportInfo {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private TransportInfo(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.TransportInfo wrap(android.net.TransportInfo real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.TransportInfo(real, (__DcgwBridgeToken) null);
    }

    public android.net.TransportInfo getReal() {
        return (android.net.TransportInfo) real;
    }

    public android.net.TransportInfo unwrap() {
        return getReal();
    }

}
