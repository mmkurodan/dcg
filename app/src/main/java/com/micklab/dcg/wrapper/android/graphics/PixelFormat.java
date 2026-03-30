// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class PixelFormat {
    private final android.graphics.PixelFormat real;

    public PixelFormat(android.graphics.PixelFormat real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.PixelFormat wrap(android.graphics.PixelFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.PixelFormat(real);
    }

    public android.graphics.PixelFormat unwrap() {
        return real;
    }

    public PixelFormat() {
        this(new android.graphics.PixelFormat());
    }

    public static boolean formatHasAlpha(int arg0) {
        return android.graphics.PixelFormat.formatHasAlpha(arg0);
    }

    public static void getPixelFormatInfo(int arg0, com.micklab.dcg.wrapper.android.graphics.PixelFormat arg1) {
        android.graphics.PixelFormat.getPixelFormatInfo(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public static final int A_8 = android.graphics.PixelFormat.A_8;
    public static final int JPEG = android.graphics.PixelFormat.JPEG;
    public static final int LA_88 = android.graphics.PixelFormat.LA_88;
    public static final int L_8 = android.graphics.PixelFormat.L_8;
    public static final int OPAQUE = android.graphics.PixelFormat.OPAQUE;
    public static final int RGBA_1010102 = android.graphics.PixelFormat.RGBA_1010102;
    public static final int RGBA_4444 = android.graphics.PixelFormat.RGBA_4444;
    public static final int RGBA_5551 = android.graphics.PixelFormat.RGBA_5551;
    public static final int RGBA_8888 = android.graphics.PixelFormat.RGBA_8888;
    public static final int RGBA_F16 = android.graphics.PixelFormat.RGBA_F16;
    public static final int RGBX_8888 = android.graphics.PixelFormat.RGBX_8888;
    public static final int RGB_332 = android.graphics.PixelFormat.RGB_332;
    public static final int RGB_565 = android.graphics.PixelFormat.RGB_565;
    public static final int RGB_888 = android.graphics.PixelFormat.RGB_888;
    public static final int TRANSLUCENT = android.graphics.PixelFormat.TRANSLUCENT;
    public static final int TRANSPARENT = android.graphics.PixelFormat.TRANSPARENT;
    public static final int UNKNOWN = android.graphics.PixelFormat.UNKNOWN;
    public static final int YCbCr_420_SP = android.graphics.PixelFormat.YCbCr_420_SP;
    public static final int YCbCr_422_I = android.graphics.PixelFormat.YCbCr_422_I;
    public static final int YCbCr_422_SP = android.graphics.PixelFormat.YCbCr_422_SP;

}
