// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class InetAddresses {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private InetAddresses(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.InetAddresses wrap(android.net.InetAddresses real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.InetAddresses(real, (__DcgwBridgeToken) null);
    }

    public android.net.InetAddresses getReal() {
        return (android.net.InetAddresses) real;
    }

    public android.net.InetAddresses unwrap() {
        return getReal();
    }

    public static boolean isNumericAddress(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.InetAddresses#isNumericAddress(java.lang.String)");
    }

    public static java.net.InetAddress parseNumericAddress(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.InetAddresses#parseNumericAddress(java.lang.String)");
    }

}
