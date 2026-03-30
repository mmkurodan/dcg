// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.util;

public final class Base64 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Base64(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.util.Base64 wrap(android.util.Base64 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.util.Base64(real, (__DcgwBridgeToken) null);
    }

    public android.util.Base64 getReal() {
        return (android.util.Base64) real;
    }

    public android.util.Base64 unwrap() {
        return getReal();
    }

    public static byte[] decode(byte[] arg0, int arg1) {
        return android.util.Base64.decode(arg0, arg1);
    }

    public static byte[] decode(java.lang.String arg0, int arg1) {
        return android.util.Base64.decode(arg0, arg1);
    }

    public static byte[] decode(byte[] arg0, int arg1, int arg2, int arg3) {
        return android.util.Base64.decode(arg0, arg1, arg2, arg3);
    }

    public static byte[] encode(byte[] arg0, int arg1) {
        return android.util.Base64.encode(arg0, arg1);
    }

    public static byte[] encode(byte[] arg0, int arg1, int arg2, int arg3) {
        return android.util.Base64.encode(arg0, arg1, arg2, arg3);
    }

    public static java.lang.String encodeToString(byte[] arg0, int arg1) {
        return android.util.Base64.encodeToString(arg0, arg1);
    }

    public static java.lang.String encodeToString(byte[] arg0, int arg1, int arg2, int arg3) {
        return android.util.Base64.encodeToString(arg0, arg1, arg2, arg3);
    }

    public static final int CRLF = android.util.Base64.CRLF;
    public static final int DEFAULT = android.util.Base64.DEFAULT;
    public static final int NO_CLOSE = android.util.Base64.NO_CLOSE;
    public static final int NO_PADDING = android.util.Base64.NO_PADDING;
    public static final int NO_WRAP = android.util.Base64.NO_WRAP;
    public static final int URL_SAFE = android.util.Base64.URL_SAFE;

}
