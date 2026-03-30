// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class NetworkSpecifier {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private NetworkSpecifier(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.NetworkSpecifier wrap(android.net.NetworkSpecifier real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.NetworkSpecifier(real, (__DcgwBridgeToken) null);
    }

    public android.net.NetworkSpecifier getReal() {
        return (android.net.NetworkSpecifier) real;
    }

    public android.net.NetworkSpecifier unwrap() {
        return getReal();
    }

}
