// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class SSLSessionCache {
    private final android.net.SSLSessionCache real;

    public SSLSessionCache(android.net.SSLSessionCache real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.SSLSessionCache wrap(android.net.SSLSessionCache real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.SSLSessionCache(real);
    }

    public android.net.SSLSessionCache unwrap() {
        return real;
    }

    public SSLSessionCache(java.io.File arg0) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLSessionCache#android.net.SSLSessionCache(java.io.File)");
    }

    public SSLSessionCache(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.SSLSessionCache#android.net.SSLSessionCache(android.content.Context)");
    }

}
