// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ssl;

public final class SSLEngines {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SSLEngines(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ssl.SSLEngines wrap(android.net.ssl.SSLEngines real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ssl.SSLEngines(real, (__DcgwBridgeToken) null);
    }

    public android.net.ssl.SSLEngines getReal() {
        return (android.net.ssl.SSLEngines) real;
    }

    public android.net.ssl.SSLEngines unwrap() {
        return getReal();
    }

    public static byte[] exportKeyingMaterial(javax.net.ssl.SSLEngine arg0, java.lang.String arg1, byte[] arg2, int arg3) throws javax.net.ssl.SSLException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ssl.SSLEngines#exportKeyingMaterial(javax.net.ssl.SSLEngine,java.lang.String,[B,int)");
    }

    public static boolean isSupportedEngine(javax.net.ssl.SSLEngine arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ssl.SSLEngines#isSupportedEngine(javax.net.ssl.SSLEngine)");
    }

    public static void setUseSessionTickets(javax.net.ssl.SSLEngine arg0, boolean arg1) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.ssl.SSLEngines#setUseSessionTickets(javax.net.ssl.SSLEngine,boolean)");
    }

}
