// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.ssl;

public final class SSLEngines {
    private final android.net.ssl.SSLEngines real;

    public SSLEngines(android.net.ssl.SSLEngines real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.ssl.SSLEngines wrap(android.net.ssl.SSLEngines real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.ssl.SSLEngines(real);
    }

    public android.net.ssl.SSLEngines unwrap() {
        return real;
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
