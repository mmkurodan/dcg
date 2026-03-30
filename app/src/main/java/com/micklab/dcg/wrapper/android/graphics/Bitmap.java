// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class Bitmap {
    private final android.graphics.Bitmap real;

    public Bitmap(android.graphics.Bitmap real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap wrap(android.graphics.Bitmap real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Bitmap(real);
    }

    public android.graphics.Bitmap unwrap() {
        return real;
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap asShared() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.asShared());
    }

    public boolean compress(com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat arg0, int arg1, java.io.OutputStream arg2) {
        return real.compress(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap copy(com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg0, boolean arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.copy(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public void copyPixelsFromBuffer(java.nio.Buffer arg0) {
        real.copyPixelsFromBuffer(arg0);
    }

    public void copyPixelsToBuffer(java.nio.Buffer arg0) {
        real.copyPixelsToBuffer(arg0);
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.graphics.Picture arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg2) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0, arg1, arg2 == null ? null : arg2.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.graphics.Picture arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(int[] arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0, arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg2, boolean arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg3, boolean arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0, int[] arg1, int arg2, int arg3, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4 == null ? null : arg4.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1, int arg2, int arg3, int arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg2, boolean arg3, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg4) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0, arg1, arg2 == null ? null : arg2.unwrap(), arg3, arg4 == null ? null : arg4.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(int[] arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg5) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0, arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0, int arg1, int arg2, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg3, boolean arg4, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg5) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3 == null ? null : arg3.unwrap(), arg4, arg5 == null ? null : arg5.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg6) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5, arg6 == null ? null : arg6.unwrap()));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1, int arg2, int arg3, int arg4, com.micklab.dcg.wrapper.android.graphics.Matrix arg5, boolean arg6) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createBitmap(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3, arg4, arg5 == null ? null : arg5.unwrap(), arg6));
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap createScaledBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, int arg1, int arg2, boolean arg3) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.createScaledBitmap(arg0 == null ? null : arg0.unwrap(), arg1, arg2, arg3));
    }

    public int describeContents() {
        return real.describeContents();
    }

    public void eraseColor(int arg0) {
        real.eraseColor(arg0);
    }

    public void eraseColor(long arg0) {
        real.eraseColor(arg0);
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap extractAlpha() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.extractAlpha());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap extractAlpha(com.micklab.dcg.wrapper.android.graphics.Paint arg0, int[] arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.extractAlpha(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public int getAllocationByteCount() {
        return real.getAllocationByteCount();
    }

    public int getByteCount() {
        return real.getByteCount();
    }

    public com.micklab.dcg.wrapper.android.graphics.Color getColor(int arg0, int arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Color.wrap(real.getColor(arg0, arg1));
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorSpace getColorSpace() {
        return com.micklab.dcg.wrapper.android.graphics.ColorSpace.wrap(real.getColorSpace());
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap.Config getConfig() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.Config.wrap(real.getConfig());
    }

    public int getDensity() {
        return real.getDensity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Gainmap getGainmap() {
        return com.micklab.dcg.wrapper.android.graphics.Gainmap.wrap(real.getGainmap());
    }

    public int getGenerationId() {
        return real.getGenerationId();
    }

    public com.micklab.dcg.wrapper.android.hardware.HardwareBuffer getHardwareBuffer() {
        return com.micklab.dcg.wrapper.android.hardware.HardwareBuffer.wrap(real.getHardwareBuffer());
    }

    public int getHeight() {
        return real.getHeight();
    }

    public byte[] getNinePatchChunk() {
        return real.getNinePatchChunk();
    }

    public int getPixel(int arg0, int arg1) {
        return real.getPixel(arg0, arg1);
    }

    public void getPixels(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        real.getPixels(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public int getRowBytes() {
        return real.getRowBytes();
    }

    public int getScaledHeight(int arg0) {
        return real.getScaledHeight(arg0);
    }

    public int getScaledHeight(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        return real.getScaledHeight(arg0 == null ? null : arg0.unwrap());
    }

    public int getScaledHeight(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        return real.getScaledHeight(arg0 == null ? null : arg0.unwrap());
    }

    public int getScaledWidth(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        return real.getScaledWidth(arg0 == null ? null : arg0.unwrap());
    }

    public int getScaledWidth(int arg0) {
        return real.getScaledWidth(arg0);
    }

    public int getScaledWidth(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        return real.getScaledWidth(arg0 == null ? null : arg0.unwrap());
    }

    public int getWidth() {
        return real.getWidth();
    }

    public boolean hasAlpha() {
        return real.hasAlpha();
    }

    public boolean hasGainmap() {
        return real.hasGainmap();
    }

    public boolean hasMipMap() {
        return real.hasMipMap();
    }

    public boolean isMutable() {
        return real.isMutable();
    }

    public boolean isPremultiplied() {
        return real.isPremultiplied();
    }

    public boolean isRecycled() {
        return real.isRecycled();
    }

    public void prepareToDraw() {
        real.prepareToDraw();
    }

    public void reconfigure(int arg0, int arg1, com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg2) {
        real.reconfigure(arg0, arg1, arg2 == null ? null : arg2.unwrap());
    }

    public void recycle() {
        real.recycle();
    }

    public boolean sameAs(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        return real.sameAs(arg0 == null ? null : arg0.unwrap());
    }

    public void setColorSpace(com.micklab.dcg.wrapper.android.graphics.ColorSpace arg0) {
        real.setColorSpace(arg0 == null ? null : arg0.unwrap());
    }

    public void setConfig(com.micklab.dcg.wrapper.android.graphics.Bitmap.Config arg0) {
        real.setConfig(arg0 == null ? null : arg0.unwrap());
    }

    public void setDensity(int arg0) {
        real.setDensity(arg0);
    }

    public void setGainmap(com.micklab.dcg.wrapper.android.graphics.Gainmap arg0) {
        real.setGainmap(arg0 == null ? null : arg0.unwrap());
    }

    public void setHasAlpha(boolean arg0) {
        real.setHasAlpha(arg0);
    }

    public void setHasMipMap(boolean arg0) {
        real.setHasMipMap(arg0);
    }

    public void setHeight(int arg0) {
        real.setHeight(arg0);
    }

    public void setPixel(int arg0, int arg1, int arg2) {
        real.setPixel(arg0, arg1, arg2);
    }

    public void setPixels(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        real.setPixels(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public void setPremultiplied(boolean arg0) {
        real.setPremultiplied(arg0);
    }

    public void setWidth(int arg0) {
        real.setWidth(arg0);
    }

    public static com.micklab.dcg.wrapper.android.graphics.Bitmap wrapHardwareBuffer(com.micklab.dcg.wrapper.android.hardware.HardwareBuffer arg0, com.micklab.dcg.wrapper.android.graphics.ColorSpace arg1) {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(android.graphics.Bitmap.wrapHardwareBuffer(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void writeToParcel(com.micklab.dcg.wrapper.android.os.Parcel arg0, int arg1) {
        real.writeToParcel(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public static final int DENSITY_NONE = android.graphics.Bitmap.DENSITY_NONE;

    public static final class CompressFormat {
        private final android.graphics.Bitmap.CompressFormat real;

        public CompressFormat(android.graphics.Bitmap.CompressFormat real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat wrap(android.graphics.Bitmap.CompressFormat real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Bitmap.CompressFormat(real);
        }

        public android.graphics.Bitmap.CompressFormat unwrap() {
            return real;
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
        private final android.graphics.Bitmap.Config real;

        public Config(android.graphics.Bitmap.Config real) {
            this.real = real;
        }

        public static com.micklab.dcg.wrapper.android.graphics.Bitmap.Config wrap(android.graphics.Bitmap.Config real) {
            return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.Bitmap.Config(real);
        }

        public android.graphics.Bitmap.Config unwrap() {
            return real;
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
