// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Base64InputStream {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Base64InputStream(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Base64InputStream wrap(android.util.Base64InputStream real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Base64InputStream(real, (__DcgwBridgeToken) null);
    }

    public android.util.Base64InputStream getReal() {
        return (android.util.Base64InputStream) real;
    }

    public android.util.Base64InputStream unwrap() {
        return getReal();
    }

    public Base64InputStream(java.io.InputStream arg0, int arg1) {
        this(new android.util.Base64InputStream(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public int available() {
        return ((android.util.Base64InputStream) real).available();
    }

    public void close() throws java.io.IOException {
        ((android.util.Base64InputStream) real).close();
    }

    public void mark(int arg0) {
        ((android.util.Base64InputStream) real).mark(arg0);
    }

    public boolean markSupported() {
        return ((android.util.Base64InputStream) real).markSupported();
    }

    public int read() throws java.io.IOException {
        return ((android.util.Base64InputStream) real).read();
    }

    public int read(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
        return ((android.util.Base64InputStream) real).read(arg0, arg1, arg2);
    }

    public void reset() {
        ((android.util.Base64InputStream) real).reset();
    }

    public long skip(long arg0) throws java.io.IOException {
        return ((android.util.Base64InputStream) real).skip(arg0);
    }

}
