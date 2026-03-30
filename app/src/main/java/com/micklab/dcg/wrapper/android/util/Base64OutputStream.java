// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Base64OutputStream {
    private final android.util.Base64OutputStream real;

    public Base64OutputStream(android.util.Base64OutputStream real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Base64OutputStream wrap(android.util.Base64OutputStream real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Base64OutputStream(real);
    }

    public android.util.Base64OutputStream unwrap() {
        return real;
    }

    public Base64OutputStream(java.io.OutputStream arg0, int arg1) {
        this(new android.util.Base64OutputStream(arg0, arg1));
    }

    public void close() throws java.io.IOException {
        real.close();
    }

    public void write(int arg0) throws java.io.IOException {
        real.write(arg0);
    }

    public void write(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
        real.write(arg0, arg1, arg2);
    }

}
