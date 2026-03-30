// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ssl;

public final class SSLSockets {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SSLSockets(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ssl.SSLSockets wrap(android.net.ssl.SSLSockets real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ssl.SSLSockets(real, (__DcgwBridgeToken) null);
    }

    public android.net.ssl.SSLSockets getReal() {
        return (android.net.ssl.SSLSockets) real;
    }

    public android.net.ssl.SSLSockets unwrap() {
        return getReal();
    }

    public static byte[] exportKeyingMaterial(javax.net.ssl.SSLSocket arg0, java.lang.String arg1, byte[] arg2, int arg3) throws javax.net.ssl.SSLException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ssl.SSLSockets#exportKeyingMaterial(javax.net.ssl.SSLSocket,java.lang.String,[B,int)");
    }

    public static boolean isSupportedSocket(javax.net.ssl.SSLSocket arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ssl.SSLSockets#isSupportedSocket(javax.net.ssl.SSLSocket)");
    }

    public static void setUseSessionTickets(javax.net.ssl.SSLSocket arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ssl.SSLSockets#setUseSessionTickets(javax.net.ssl.SSLSocket,boolean)");
    }

}
