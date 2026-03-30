// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.net.http;

public final class HttpResponseCache {
    private final android.net.http.HttpResponseCache real;

    public HttpResponseCache(android.net.http.HttpResponseCache real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.net.http.HttpResponseCache wrap(android.net.http.HttpResponseCache real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.net.http.HttpResponseCache(real);
    }

    public android.net.http.HttpResponseCache unwrap() {
        return real;
    }

    public void close() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpResponseCache#close()");
    }

    public void delete() throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpResponseCache#delete()");
    }

    public void flush() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpResponseCache#flush()");
    }

    public int getHitCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpResponseCache#getHitCount()");
    }

    public static com.micklab.dcg.wrapper.android.net.http.HttpResponseCache getInstalled() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpResponseCache#getInstalled()");
    }

    public int getNetworkCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpResponseCache#getNetworkCount()");
    }

    public int getRequestCount() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpResponseCache#getRequestCount()");
    }

    public static com.micklab.dcg.wrapper.android.net.http.HttpResponseCache install(java.io.File arg0, long arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpResponseCache#install(java.io.File,long)");
    }

    public long maxSize() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpResponseCache#maxSize()");
    }

    public java.net.CacheRequest put(java.net.URI arg0, java.net.URLConnection arg1) throws java.io.IOException {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpResponseCache#put(java.net.URI,java.net.URLConnection)");
    }

    public long size() {
        throw new UnsupportedOperationException("Blocked by wrapper security policy: android.net.http.HttpResponseCache#size()");
    }

}
