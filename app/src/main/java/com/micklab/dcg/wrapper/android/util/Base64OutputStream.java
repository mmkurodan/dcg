// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Base64OutputStream {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Base64OutputStream(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Base64OutputStream wrap(android.util.Base64OutputStream real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Base64OutputStream(real, (__DcgwBridgeToken) null);
    }

    public android.util.Base64OutputStream getReal() {
        return (android.util.Base64OutputStream) real;
    }

    public android.util.Base64OutputStream unwrap() {
        return getReal();
    }

    public Base64OutputStream(java.io.OutputStream arg0, int arg1) {
        this(new android.util.Base64OutputStream(arg0, arg1), (__DcgwBridgeToken) null);
    }

    public void close() throws java.io.IOException {
        ((android.util.Base64OutputStream) real).close();
    }

    public void write(int arg0) throws java.io.IOException {
        ((android.util.Base64OutputStream) real).write(arg0);
    }

    public void write(byte[] arg0, int arg1, int arg2) throws java.io.IOException {
        ((android.util.Base64OutputStream) real).write(arg0, arg1, arg2);
    }

}
