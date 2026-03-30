// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics;

public final class BitmapShader {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BitmapShader(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.BitmapShader wrap(android.graphics.BitmapShader real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.BitmapShader(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.BitmapShader getReal() {
        return (android.graphics.BitmapShader) real;
    }

    public android.graphics.BitmapShader unwrap() {
        return getReal();
    }

    public BitmapShader(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg1, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg2) {
        this(new android.graphics.BitmapShader(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public int getFilterMode() {
        return ((android.graphics.BitmapShader) real).getFilterMode();
    }

    public int getMaxAnisotropy() {
        return ((android.graphics.BitmapShader) real).getMaxAnisotropy();
    }

    public void setFilterMode(int arg0) {
        ((android.graphics.BitmapShader) real).setFilterMode(arg0);
    }

    public void setMaxAnisotropy(int arg0) {
        ((android.graphics.BitmapShader) real).setMaxAnisotropy(arg0);
    }

    public void setOverrideGainmap(com.micklab.dcg.wrapper.android.graphics.Gainmap arg0) {
        ((android.graphics.BitmapShader) real).setOverrideGainmap(arg0 == null ? null : arg0.getReal());
    }

    public static final int FILTER_MODE_DEFAULT = android.graphics.BitmapShader.FILTER_MODE_DEFAULT;
    public static final int FILTER_MODE_LINEAR = android.graphics.BitmapShader.FILTER_MODE_LINEAR;
    public static final int FILTER_MODE_NEAREST = android.graphics.BitmapShader.FILTER_MODE_NEAREST;

}
