// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net;

public final class Proxy {
    private final android.net.Proxy real;

    public Proxy(android.net.Proxy real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.Proxy wrap(android.net.Proxy real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.Proxy(real);
    }

    public android.net.Proxy unwrap() {
        return real;
    }

    public Proxy() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Proxy#android.net.Proxy()");
    }

    public static java.lang.String getDefaultHost() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Proxy#getDefaultHost()");
    }

    public static int getDefaultPort() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Proxy#getDefaultPort()");
    }

    public static java.lang.String getHost(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Proxy#getHost(android.content.Context)");
    }

    public static int getPort(com.micklab.dcg.wrapper.android.content.Context arg0) {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.Proxy#getPort(android.content.Context)");
    }


}
