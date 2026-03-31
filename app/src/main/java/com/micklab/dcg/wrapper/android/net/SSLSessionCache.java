// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class SSLSessionCache {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private SSLSessionCache(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.SSLSessionCache wrap(android.net.SSLSessionCache real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.SSLSessionCache(real, (__DcgwBridgeToken) null);
    }

    public android.net.SSLSessionCache getReal() {
        return (android.net.SSLSessionCache) real;
    }

    public android.net.SSLSessionCache unwrap() {
        return getReal();
    }

    public SSLSessionCache(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLSessionCache#android.net.SSLSessionCache(android.content.Context)");
    }

    public SSLSessionCache(java.io.File arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLSessionCache#android.net.SSLSessionCache(java.io.File)");
    }

}
