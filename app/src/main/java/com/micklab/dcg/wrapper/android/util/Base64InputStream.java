// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Base64InputStream {
    private final android.util.Base64InputStream real;

    public Base64InputStream(android.util.Base64InputStream real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Base64InputStream wrap(android.util.Base64InputStream real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Base64InputStream(real);
    }

    public android.util.Base64InputStream unwrap() {
        return real;
    }

    public Base64InputStream(java.io.InputStream arg0, int arg1) {
        this(new android.util.Base64InputStream(arg0, arg1));
    }

    public int available() {
        return real.available();
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void mark(int arg0) {
        real.mark(arg0);
    }

    public boolean markSupported() {
        return real.markSupported();
    }

    public int read() throws java.io.IOException {
        return real.read();
    }

    public int read(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
        return real.read(arg0, arg1, arg2);
    }

    public void reset() {
        real.reset();
    }

    public long skip(long arg0) throws java.io.IOException {
        return real.skip(arg0);
    }

}
