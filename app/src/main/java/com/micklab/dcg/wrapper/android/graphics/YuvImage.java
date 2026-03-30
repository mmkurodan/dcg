// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class YuvImage {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private YuvImage(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.YuvImage wrap(android.graphics.YuvImage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.YuvImage(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.YuvImage getReal() {
        return (android.graphics.YuvImage) real;
    }

    public android.graphics.YuvImage unwrap() {
        return getReal();
    }

    public YuvImage(byte[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        this(new android.graphics.YuvImage(arg0, arg1, arg2, arg3, arg4), (__DcgwBridgeToken) null);
    }

    public YuvImage(byte[] arg0, int arg1, int arg2, int arg3, int[] arg4, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg5) {
        this(new android.graphics.YuvImage(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()), (__DcgwBridgeToken) null);
    }

    public boolean compressToJpeg(com.micklab.dcg.wrapper.android.graphics.Rect arg0, int arg1, java.io.OutputStream arg2) {
        return ((android.graphics.YuvImage) real).compressToJpeg(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public boolean compressToJpegR(com.micklab.dcg.wrapper.android.graphics.YuvImage arg0, int arg1, java.io.OutputStream arg2) {
        return ((android.graphics.YuvImage) real).compressToJpegR(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(((android.graphics.YuvImage) real).getColorSpace());
    }

    public int getHeight() {
        return ((android.graphics.YuvImage) real).getHeight();
    }

    public int[] getStrides() {
        return ((android.graphics.YuvImage) real).getStrides();
    }

    public int getWidth() {
        return ((android.graphics.YuvImage) real).getWidth();
    }

    public byte[] getYuvData() {
        return ((android.graphics.YuvImage) real).getYuvData();
    }

    public int getYuvFormat() {
        return ((android.graphics.YuvImage) real).getYuvFormat();
    }

}
