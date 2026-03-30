// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.opengl;

public final class ETC1 {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ETC1(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.opengl.ETC1 wrap(android.opengl.ETC1 real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.opengl.ETC1(real, (__DcgwBridgeToken) null);
    }

    public android.opengl.ETC1 getReal() {
        return (android.opengl.ETC1) real;
    }

    public android.opengl.ETC1 unwrap() {
        return getReal();
    }

    public ETC1() {
        this(new android.opengl.ETC1(), (__DcgwBridgeToken) null);
    }

    public static void decodeBlock(java.nio.Buffer arg0, java.nio.Buffer arg1) {
        android.opengl.ETC1.decodeBlock(arg0, arg1);
    }

    public static void decodeImage(java.nio.Buffer arg0, java.nio.Buffer arg1, int arg2, int arg3, int arg4, int arg5) {
        android.opengl.ETC1.decodeImage(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void encodeBlock(java.nio.Buffer arg0, int arg1, java.nio.Buffer arg2) {
        android.opengl.ETC1.encodeBlock(arg0, arg1, arg2);
    }

    public static void encodeImage(java.nio.Buffer arg0, int arg1, int arg2, int arg3, int arg4, java.nio.Buffer arg5) {
        android.opengl.ETC1.encodeImage(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public static void formatHeader(java.nio.Buffer arg0, int arg1, int arg2) {
        android.opengl.ETC1.formatHeader(arg0, arg1, arg2);
    }

    public static int getEncodedDataSize(int arg0, int arg1) {
        return android.opengl.ETC1.getEncodedDataSize(arg0, arg1);
    }

    public static int getHeight(java.nio.Buffer arg0) {
        return android.opengl.ETC1.getHeight(arg0);
    }

    public static int getWidth(java.nio.Buffer arg0) {
        return android.opengl.ETC1.getWidth(arg0);
    }

    public static boolean isValid(java.nio.Buffer arg0) {
        return android.opengl.ETC1.isValid(arg0);
    }

    public static final int DECODED_BLOCK_SIZE = android.opengl.ETC1.DECODED_BLOCK_SIZE;
    public static final int ENCODED_BLOCK_SIZE = android.opengl.ETC1.ENCODED_BLOCK_SIZE;
    public static final int ETC1_RGB8_OES = android.opengl.ETC1.ETC1_RGB8_OES;
    public static final int ETC_PKM_HEADER_SIZE = android.opengl.ETC1.ETC_PKM_HEADER_SIZE;

}
