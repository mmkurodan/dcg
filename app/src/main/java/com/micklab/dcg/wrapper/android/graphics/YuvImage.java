// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class YuvImage {
    private final android.graphics.YuvImage real;

    public YuvImage(android.graphics.YuvImage real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.YuvImage wrap(android.graphics.YuvImage real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.YuvImage(real);
    }

    public android.graphics.YuvImage unwrap() {
        return real;
    }

    public YuvImage(byte[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        this(new android.graphics.YuvImage(arg0, arg1, arg2, arg3, arg4));
    }

    public YuvImage(byte[] arg0, int arg1, int arg2, int arg3, int[] arg4, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg5) {
        this(new android.graphics.YuvImage(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap()));
    }

    public boolean compressToJpeg(com.micklab.dcg.wrapper.android.graphics.Rect arg0, int arg1, java.io.OutputStream arg2) {
        return real.compressToJpeg(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public boolean compressToJpegR(com.micklab.dcg.wrapper.android.graphics.YuvImage arg0, int arg1, java.io.OutputStream arg2) {
        return real.compressToJpegR(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(real.getColorSpace());
    }

    public int getHeight() {
        return real.getHeight();
    }

    public int[] getStrides() {
        return real.getStrides();
    }

    public int getWidth() {
        return real.getWidth();
    }

    public byte[] getYuvData() {
        return real.getYuvData();
    }

    public int getYuvFormat() {
        return real.getYuvFormat();
    }

}
