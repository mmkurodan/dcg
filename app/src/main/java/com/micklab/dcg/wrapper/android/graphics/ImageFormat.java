// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class ImageFormat {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ImageFormat(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.ImageFormat wrap(android.graphics.ImageFormat real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.ImageFormat(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.ImageFormat getReal() {
        return (android.graphics.ImageFormat) real;
    }

    public android.graphics.ImageFormat unwrap() {
        return getReal();
    }

    public ImageFormat() {
        this(new android.graphics.ImageFormat(), (__DcgwBridgeToken) null);
    }

    public static int getBitsPerPixel(int arg0) {
        return android.graphics.ImageFormat.getBitsPerPixel(arg0);
    }

    public static final int DEPTH16 = android.graphics.ImageFormat.DEPTH16;
    public static final int DEPTH_JPEG = android.graphics.ImageFormat.DEPTH_JPEG;
    public static final int DEPTH_POINT_CLOUD = android.graphics.ImageFormat.DEPTH_POINT_CLOUD;
    public static final int FLEX_RGBA_8888 = android.graphics.ImageFormat.FLEX_RGBA_8888;
    public static final int FLEX_RGB_888 = android.graphics.ImageFormat.FLEX_RGB_888;
    public static final int HEIC = android.graphics.ImageFormat.HEIC;
    public static final int HEIC_ULTRAHDR = android.graphics.ImageFormat.HEIC_ULTRAHDR;
    public static final int JPEG = android.graphics.ImageFormat.JPEG;
    public static final int JPEG_R = android.graphics.ImageFormat.JPEG_R;
    public static final int NV16 = android.graphics.ImageFormat.NV16;
    public static final int NV21 = android.graphics.ImageFormat.NV21;
    public static final int PRIVATE = android.graphics.ImageFormat.PRIVATE;
    public static final int RAW10 = android.graphics.ImageFormat.RAW10;
    public static final int RAW12 = android.graphics.ImageFormat.RAW12;
    public static final int RAW_PRIVATE = android.graphics.ImageFormat.RAW_PRIVATE;
    public static final int RAW_SENSOR = android.graphics.ImageFormat.RAW_SENSOR;
    public static final int RGB_565 = android.graphics.ImageFormat.RGB_565;
    public static final int UNKNOWN = android.graphics.ImageFormat.UNKNOWN;
    public static final int Y8 = android.graphics.ImageFormat.Y8;
    public static final int YCBCR_P010 = android.graphics.ImageFormat.YCBCR_P010;
    public static final int YCBCR_P210 = android.graphics.ImageFormat.YCBCR_P210;
    public static final int YUV_420_888 = android.graphics.ImageFormat.YUV_420_888;
    public static final int YUV_422_888 = android.graphics.ImageFormat.YUV_422_888;
    public static final int YUV_444_888 = android.graphics.ImageFormat.YUV_444_888;
    public static final int YUY2 = android.graphics.ImageFormat.YUY2;
    public static final int YV12 = android.graphics.ImageFormat.YV12;

}
