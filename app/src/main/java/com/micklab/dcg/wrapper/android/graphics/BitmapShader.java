// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class BitmapShader {
    private final android.graphics.BitmapShader real;

    public BitmapShader(android.graphics.BitmapShader real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapShader wrap(android.graphics.BitmapShader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.BitmapShader(real);
    }

    public android.graphics.BitmapShader unwrap() {
        return real;
    }

    public BitmapShader(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg1, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg2) {
        this(new android.graphics.BitmapShader(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
    }

    public int getFilterMode() {
        return real.getFilterMode();
    }

    public int getMaxAnisotropy() {
        return real.getMaxAnisotropy();
    }

    public void setFilterMode(int arg0) {
        real.setFilterMode(arg0);
    }

    public void setMaxAnisotropy(int arg0) {
        real.setMaxAnisotropy(arg0);
    }

    public void setOverrideGainmap(com.micklab.dcg.wrapper.android.graphics.Gainmap arg0) {
        real.setOverrideGainmap(arg0 == null ? null : arg0.unwrap());
    }

    public static final int FILTER_MODE_DEFAULT = android.graphics.BitmapShader.FILTER_MODE_DEFAULT;
    public static final int FILTER_MODE_LINEAR = android.graphics.BitmapShader.FILTER_MODE_LINEAR;
    public static final int FILTER_MODE_NEAREST = android.graphics.BitmapShader.FILTER_MODE_NEAREST;

}
