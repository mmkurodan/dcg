// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.hardware;

public final class HardwareBuffer {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private HardwareBuffer(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.hardware.HardwareBuffer wrap(android.hardware.HardwareBuffer real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.hardware.HardwareBuffer(real, (__DcgwBridgeToken) null);
    }

    public android.hardware.HardwareBuffer getReal() {
        return (android.hardware.HardwareBuffer) real;
    }

    public android.hardware.HardwareBuffer unwrap() {
        return getReal();
    }

    public void close() {
        ((android.hardware.HardwareBuffer) real).close();
    }

    public static com.micklab.dcg.wrapper.android.hardware.HardwareBuffer create(int arg0, int arg1, int arg2, int arg3, long arg4) {
        return com.micklab.dcg.wrapper.android.hardware.HardwareBuffer.wrap(android.hardware.HardwareBuffer.create(arg0, arg1, arg2, arg3, arg4));
    }

    public int describeContents() {
        return ((android.hardware.HardwareBuffer) real).describeContents();
    }

    public int getFormat() {
        return ((android.hardware.HardwareBuffer) real).getFormat();
    }

    public int getHeight() {
        return ((android.hardware.HardwareBuffer) real).getHeight();
    }

    public long getId() {
        return ((android.hardware.HardwareBuffer) real).getId();
    }

    public int getLayers() {
        return ((android.hardware.HardwareBuffer) real).getLayers();
    }

    public long getUsage() {
        return ((android.hardware.HardwareBuffer) real).getUsage();
    }

    public int getWidth() {
        return ((android.hardware.HardwareBuffer) real).getWidth();
    }

    public boolean isClosed() {
        return ((android.hardware.HardwareBuffer) real).isClosed();
    }

    public static boolean isSupported(int arg0, int arg1, int arg2, int arg3, long arg4) {
        return android.hardware.HardwareBuffer.isSupported(arg0, arg1, arg2, arg3, arg4);
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.hardware.HardwareBuffer) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int BLOB = android.hardware.HardwareBuffer.BLOB;
    public static final int DS_24UI8 = android.hardware.HardwareBuffer.DS_24UI8;
    public static final int DS_FP32UI8 = android.hardware.HardwareBuffer.DS_FP32UI8;
    public static final int D_16 = android.hardware.HardwareBuffer.D_16;
    public static final int D_24 = android.hardware.HardwareBuffer.D_24;
    public static final int D_FP32 = android.hardware.HardwareBuffer.D_FP32;
    public static final int RGBA_10101010 = android.hardware.HardwareBuffer.RGBA_10101010;
    public static final int RGBA_1010102 = android.hardware.HardwareBuffer.RGBA_1010102;
    public static final int RGBA_8888 = android.hardware.HardwareBuffer.RGBA_8888;
    public static final int RGBA_FP16 = android.hardware.HardwareBuffer.RGBA_FP16;
    public static final int RGBX_8888 = android.hardware.HardwareBuffer.RGBX_8888;
    public static final int RGB_565 = android.hardware.HardwareBuffer.RGB_565;
    public static final int RGB_888 = android.hardware.HardwareBuffer.RGB_888;
    public static final int RG_1616 = android.hardware.HardwareBuffer.RG_1616;
    public static final int R_16 = android.hardware.HardwareBuffer.R_16;
    public static final int R_8 = android.hardware.HardwareBuffer.R_8;
    public static final int S_UI8 = android.hardware.HardwareBuffer.S_UI8;
    public static final long USAGE_COMPOSER_OVERLAY = android.hardware.HardwareBuffer.USAGE_COMPOSER_OVERLAY;
    public static final long USAGE_CPU_READ_OFTEN = android.hardware.HardwareBuffer.USAGE_CPU_READ_OFTEN;
    public static final long USAGE_CPU_READ_RARELY = android.hardware.HardwareBuffer.USAGE_CPU_READ_RARELY;
    public static final long USAGE_CPU_WRITE_OFTEN = android.hardware.HardwareBuffer.USAGE_CPU_WRITE_OFTEN;
    public static final long USAGE_CPU_WRITE_RARELY = android.hardware.HardwareBuffer.USAGE_CPU_WRITE_RARELY;
    public static final long USAGE_FRONT_BUFFER = android.hardware.HardwareBuffer.USAGE_FRONT_BUFFER;
    public static final long USAGE_GPU_COLOR_OUTPUT = android.hardware.HardwareBuffer.USAGE_GPU_COLOR_OUTPUT;
    public static final long USAGE_GPU_CUBE_MAP = android.hardware.HardwareBuffer.USAGE_GPU_CUBE_MAP;
    public static final long USAGE_GPU_DATA_BUFFER = android.hardware.HardwareBuffer.USAGE_GPU_DATA_BUFFER;
    public static final long USAGE_GPU_MIPMAP_COMPLETE = android.hardware.HardwareBuffer.USAGE_GPU_MIPMAP_COMPLETE;
    public static final long USAGE_GPU_SAMPLED_IMAGE = android.hardware.HardwareBuffer.USAGE_GPU_SAMPLED_IMAGE;
    public static final long USAGE_PROTECTED_CONTENT = android.hardware.HardwareBuffer.USAGE_PROTECTED_CONTENT;
    public static final long USAGE_SENSOR_DIRECT_DATA = android.hardware.HardwareBuffer.USAGE_SENSOR_DIRECT_DATA;
    public static final long USAGE_VIDEO_ENCODE = android.hardware.HardwareBuffer.USAGE_VIDEO_ENCODE;
    public static final int YCBCR_420_888 = android.hardware.HardwareBuffer.YCBCR_420_888;
    public static final int YCBCR_P010 = android.hardware.HardwareBuffer.YCBCR_P010;

}
