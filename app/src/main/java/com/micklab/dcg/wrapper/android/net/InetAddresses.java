// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class InetAddresses {
    private final android.net.InetAddresses real;

    public InetAddresses(android.net.InetAddresses real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.InetAddresses wrap(android.net.InetAddresses real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.InetAddresses(real);
    }

    public android.net.InetAddresses unwrap() {
        return real;
    }

    public static boolean isNumericAddress(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.InetAddresses#isNumericAddress(java.lang.String)");
    }

    public static java.net.InetAddress parseNumericAddress(java.lang.String arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.InetAddresses#parseNumericAddress(java.lang.String)");
    }

}
