// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Bitmap {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private Bitmap(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap wrap(android.graphics.Bitmap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Bitmap(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.Bitmap getReal() {
        return (android.graphics.Bitmap) real;
    }

    public android.graphics.Bitmap unwrap() {
        return getReal();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap asShared() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.graphics.Bitmap) real).asShared());
    }

    public boolean compress(com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat arg0, int arg1, java.io.OutputStream arg2) {
        return ((android.graphics.Bitmap) real).compress(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap copy(com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.graphics.Bitmap) real).copy(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public void copyPixelsFromBuffer(java.nio.Buffer arg0) {
        ((android.graphics.Bitmap) real).copyPixelsFromBuffer(arg0);
    }

    public void copyPixelsToBuffer(java.nio.Buffer arg0) {
        ((android.graphics.Bitmap) real).copyPixelsToBuffer(arg0);
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.graphics.Picture arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0, arg1, arg2 == null ? null : arg2.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg2, boolean arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(int[] arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0, arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.graphics.Picture arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg2, boolean arg3, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0, arg1, arg2 == null ? null : arg2.getReal(), arg3, arg4 == null ? null : arg4.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0, int[] arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4 == null ? null : arg4.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg3, boolean arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(int[] arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg5) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg3, boolean arg4, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg5) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3 == null ? null : arg3.getReal(), arg4, arg5 == null ? null : arg5.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg6) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.getReal()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Matrix arg5, boolean arg6) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.getReal(), arg6));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createScaledBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1, int arg2, boolean arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createScaledBitmap(arg0 == null ? null : arg0.getReal(), arg1, arg2, arg3));
    }

    public int describeContents() {
        return ((android.graphics.Bitmap) real).describeContents();
    }

    public void eraseColor(int arg0) {
        ((android.graphics.Bitmap) real).eraseColor(arg0);
    }

    public void eraseColor(long arg0) {
        ((android.graphics.Bitmap) real).eraseColor(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap extractAlpha() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.graphics.Bitmap) real).extractAlpha());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap extractAlpha(com.micklab.dcg.wrapper.android.graphics.Paint arg0, int[] arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.graphics.Bitmap) real).extractAlpha(arg0 == null ? null : arg0.getReal(), arg1));
    }

    public int getAllocationByteCount() {
        return ((android.graphics.Bitmap) real).getAllocationByteCount();
    }

    public int getByteCount() {
        return ((android.graphics.Bitmap) real).getByteCount();
    }

    public com.micklab.dcg.wrapper.android.graphics.Color getColor(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(((android.graphics.Bitmap) real).getColor(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(((android.graphics.Bitmap) real).getColorSpace());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap.Config getConfig() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.wrap(((android.graphics.Bitmap) real).getConfig());
    }

    public int getDensity() {
        return ((android.graphics.Bitmap) real).getDensity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Gainmap getGainmap() {
        return com.micklab.dcg.wrapper.android.graphics.Gainmap.wrap(((android.graphics.Bitmap) real).getGainmap());
    }

    public int getGenerationId() {
        return ((android.graphics.Bitmap) real).getGenerationId();
    }

    public com.micklab.dcg.wrapper.android.hardware.HardwareBuffer getHardwareBuffer() {
        return com.micklab.dcg.wrapper.android.hardware.HardwareBuffer.wrap(((android.graphics.Bitmap) real).getHardwareBuffer());
    }

    public int getHeight() {
        return ((android.graphics.Bitmap) real).getHeight();
    }

    public byte[] getNinePatchChunk() {
        return ((android.graphics.Bitmap) real).getNinePatchChunk();
    }

    public int getPixel(int arg0, int arg1) {
        return ((android.graphics.Bitmap) real).getPixel(arg0, arg1);
    }

    public void getPixels(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ((android.graphics.Bitmap) real).getPixels(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public int getRowBytes() {
        return ((android.graphics.Bitmap) real).getRowBytes();
    }

    public int getScaledHeight(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        return ((android.graphics.Bitmap) real).getScaledHeight(arg0 == null ? null : arg0.getReal());
    }

    public int getScaledHeight(int arg0) {
        return ((android.graphics.Bitmap) real).getScaledHeight(arg0);
    }

    public int getScaledHeight(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        return ((android.graphics.Bitmap) real).getScaledHeight(arg0 == null ? null : arg0.getReal());
    }

    public int getScaledWidth(int arg0) {
        return ((android.graphics.Bitmap) real).getScaledWidth(arg0);
    }

    public int getScaledWidth(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        return ((android.graphics.Bitmap) real).getScaledWidth(arg0 == null ? null : arg0.getReal());
    }

    public int getScaledWidth(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        return ((android.graphics.Bitmap) real).getScaledWidth(arg0 == null ? null : arg0.getReal());
    }

    public int getWidth() {
        return ((android.graphics.Bitmap) real).getWidth();
    }

    public boolean hasAlpha() {
        return ((android.graphics.Bitmap) real).hasAlpha();
    }

    public boolean hasGainmap() {
        return ((android.graphics.Bitmap) real).hasGainmap();
    }

    public boolean hasMipMap() {
        return ((android.graphics.Bitmap) real).hasMipMap();
    }

    public boolean isMutable() {
        return ((android.graphics.Bitmap) real).isMutable();
    }

    public boolean isPremultiplied() {
        return ((android.graphics.Bitmap) real).isPremultiplied();
    }

    public boolean isRecycled() {
        return ((android.graphics.Bitmap) real).isRecycled();
    }

    public void prepareToDraw() {
        ((android.graphics.Bitmap) real).prepareToDraw();
    }

    public void reconfigure(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg2) {
        ((android.graphics.Bitmap) real).reconfigure(arg0, arg1, arg2 == null ? null : arg2.getReal());
    }

    public void recycle() {
        ((android.graphics.Bitmap) real).recycle();
    }

    public boolean sameAs(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return ((android.graphics.Bitmap) real).sameAs(arg0 == null ? null : arg0.getReal());
    }

    public void setColorSpace(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0) {
        ((android.graphics.Bitmap) real).setColorSpace(arg0 == null ? null : arg0.getReal());
    }

    public void setConfig(com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg0) {
        ((android.graphics.Bitmap) real).setConfig(arg0 == null ? null : arg0.getReal());
    }

    public void setDensity(int arg0) {
        ((android.graphics.Bitmap) real).setDensity(arg0);
    }

    public void setGainmap(com.micklab.dcg.wrapper.android.graphics.Gainmap arg0) {
        ((android.graphics.Bitmap) real).setGainmap(arg0 == null ? null : arg0.getReal());
    }

    public void setHasAlpha(boolean arg0) {
        ((android.graphics.Bitmap) real).setHasAlpha(arg0);
    }

    public void setHasMipMap(boolean arg0) {
        ((android.graphics.Bitmap) real).setHasMipMap(arg0);
    }

    public void setHeight(int arg0) {
        ((android.graphics.Bitmap) real).setHeight(arg0);
    }

    public void setPixel(int arg0, int arg1, int arg2) {
        ((android.graphics.Bitmap) real).setPixel(arg0, arg1, arg2);
    }

    public void setPixels(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ((android.graphics.Bitmap) real).setPixels(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public void setPremultiplied(boolean arg0) {
        ((android.graphics.Bitmap) real).setPremultiplied(arg0);
    }

    public void setWidth(int arg0) {
        ((android.graphics.Bitmap) real).setWidth(arg0);
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap wrapHardwareBuffer(com.micklab.dcg.wrapper.android.hardware.HardwareBuffer arg0, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.wrapHardwareBuffer(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()));
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        ((android.graphics.Bitmap) real).writeToParcel(arg0 == null ? null : arg0.getReal(), arg1);
    }

    public static final int DENSITY_NONE = android.graphics.Bitmap.DENSITY_NONE;

    public static final class CompressFormat {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private CompressFormat(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat wrap(android.graphics.Bitmap.CompressFormat real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Bitmap.CompressFormat getReal() {
            return (android.graphics.Bitmap.CompressFormat) real;
        }

        public android.graphics.Bitmap.CompressFormat unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat.wrap(android.graphics.Bitmap.CompressFormat.valueOf(arg0));
        }

        public static android.graphics.Bitmap.CompressFormat[] values() {
            return android.graphics.Bitmap.CompressFormat.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat JPEG = com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat.wrap(android.graphics.Bitmap.CompressFormat.JPEG);
        public static final com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat PNG = com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat.wrap(android.graphics.Bitmap.CompressFormat.PNG);
        public static final com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat WEBP = com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat.wrap(android.graphics.Bitmap.CompressFormat.WEBP);
        public static final com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat WEBP_LOSSLESS = com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat.wrap(android.graphics.Bitmap.CompressFormat.WEBP_LOSSLESS);
        public static final com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat WEBP_LOSSY = com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat.wrap(android.graphics.Bitmap.CompressFormat.WEBP_LOSSY);

    }
    public static final class Config {
        private static final class __DcgwBridgeToken {
        }

        private final java.lang.Object real;

        private Config(java.lang.Object real, __DcgwBridgeToken token) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Bitmap.Config wrap(android.graphics.Bitmap.Config real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Bitmap.Config(real, (__DcgwBridgeToken) null);
        }

        public android.graphics.Bitmap.Config getReal() {
            return (android.graphics.Bitmap.Config) real;
        }

        public android.graphics.Bitmap.Config unwrap() {
            return getReal();
        }

        public static com.micklab.dcg.wrapper.android.graphics.Bitmap.Config valueOf(java.lang.String arg0) {
            return com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.wrap(android.graphics.Bitmap.Config.valueOf(arg0));
        }

        public static android.graphics.Bitmap.Config[] values() {
            return android.graphics.Bitmap.Config.values();
        }

        public static final com.micklab.dcg.wrapper.android.graphics.Bitmap.Config ALPHA_8 = com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.wrap(android.graphics.Bitmap.Config.ALPHA_8);
        public static final com.micklab.dcg.wrapper.android.graphics.Bitmap.Config ARGB_4444 = com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.wrap(android.graphics.Bitmap.Config.ARGB_4444);
        public static final com.micklab.dcg.wrapper.android.graphics.Bitmap.Config ARGB_8888 = com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.wrap(android.graphics.Bitmap.Config.ARGB_8888);
        public static final com.micklab.dcg.wrapper.android.graphics.Bitmap.Config HARDWARE = com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.wrap(android.graphics.Bitmap.Config.HARDWARE);
        public static final com.micklab.dcg.wrapper.android.graphics.Bitmap.Config RGBA_1010102 = com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.wrap(android.graphics.Bitmap.Config.RGBA_1010102);
        public static final com.micklab.dcg.wrapper.android.graphics.Bitmap.Config RGBA_F16 = com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.wrap(android.graphics.Bitmap.Config.RGBA_F16);
        public static final com.micklab.dcg.wrapper.android.graphics.Bitmap.Config RGB_565 = com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.wrap(android.graphics.Bitmap.Config.RGB_565);

    }
}
