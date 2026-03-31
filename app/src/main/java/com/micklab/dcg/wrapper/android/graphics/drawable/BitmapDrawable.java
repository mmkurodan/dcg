// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class BitmapDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private BitmapDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.BitmapDrawable wrap(android.graphics.drawable.BitmapDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.BitmapDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.BitmapDrawable getReal() {
        return (android.graphics.drawable.BitmapDrawable) real;
    }

    public android.graphics.drawable.BitmapDrawable unwrap() {
        return getReal();
    }

    public BitmapDrawable() {
        this(new android.graphics.drawable.BitmapDrawable(), (__DcgwBridgeToken) null);
    }

    public BitmapDrawable(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        this(new android.graphics.drawable.BitmapDrawable(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public BitmapDrawable(java.io.InputStream arg0) {
        this(new android.graphics.drawable.BitmapDrawable(arg0), (__DcgwBridgeToken) null);
    }

    public BitmapDrawable(java.lang.String arg0) {
        this(new android.graphics.drawable.BitmapDrawable(arg0), (__DcgwBridgeToken) null);
    }

    public BitmapDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0) {
        this(new android.graphics.drawable.BitmapDrawable(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public BitmapDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0, java.lang.String arg1) {
        this(new android.graphics.drawable.BitmapDrawable(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public BitmapDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
        this(new android.graphics.drawable.BitmapDrawable(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public BitmapDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0, java.io.InputStream arg1) {
        this(new android.graphics.drawable.BitmapDrawable(arg0 == null ? null : arg0.getReal(), arg1), (__DcgwBridgeToken) null);
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).applyTheme(arg0);
    }

    public boolean canApplyTheme() {
        return ((android.graphics.drawable.BitmapDrawable) real).canApplyTheme();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getAlpha() {
        return ((android.graphics.drawable.BitmapDrawable) real).getAlpha();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(((android.graphics.drawable.BitmapDrawable) real).getBitmap());
    }

    public int getChangingConfigurations() {
        return ((android.graphics.drawable.BitmapDrawable) real).getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(((android.graphics.drawable.BitmapDrawable) real).getColorFilter());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(((android.graphics.drawable.BitmapDrawable) real).getConstantState());
    }

    public int getGravity() {
        return ((android.graphics.drawable.BitmapDrawable) real).getGravity();
    }

    public int getIntrinsicHeight() {
        return ((android.graphics.drawable.BitmapDrawable) real).getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return ((android.graphics.drawable.BitmapDrawable) real).getIntrinsicWidth();
    }

    public int getOpacity() {
        return ((android.graphics.drawable.BitmapDrawable) real).getOpacity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getOpticalInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.graphics.drawable.BitmapDrawable) real).getOpticalInsets());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint getPaint() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.wrap(((android.graphics.drawable.BitmapDrawable) real).getPaint());
    }

    public com.micklab.dcg.wrapper.android.graphics.Shader.TileMode getTileModeX() {
        return com.micklab.dcg.wrapper.android.graphics.Shader.TileMode.wrap(((android.graphics.drawable.BitmapDrawable) real).getTileModeX());
    }

    public com.micklab.dcg.wrapper.android.graphics.Shader.TileMode getTileModeY() {
        return com.micklab.dcg.wrapper.android.graphics.Shader.TileMode.wrap(((android.graphics.drawable.BitmapDrawable) real).getTileModeY());
    }

    public boolean hasAntiAlias() {
        return ((android.graphics.drawable.BitmapDrawable) real).hasAntiAlias();
    }

    public boolean hasFocusStateSpecified() {
        return ((android.graphics.drawable.BitmapDrawable) real).hasFocusStateSpecified();
    }

    public boolean hasMipMap() {
        return ((android.graphics.drawable.BitmapDrawable) real).hasMipMap();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.BitmapDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public boolean isAutoMirrored() {
        return ((android.graphics.drawable.BitmapDrawable) real).isAutoMirrored();
    }

    public boolean isFilterBitmap() {
        return ((android.graphics.drawable.BitmapDrawable) real).isFilterBitmap();
    }

    public boolean isStateful() {
        return ((android.graphics.drawable.BitmapDrawable) real).isStateful();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.BitmapDrawable) real).mutate());
    }

    public void setAlpha(int arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setAlpha(arg0);
    }

    public void setAntiAlias(boolean arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setAntiAlias(arg0);
    }

    public void setAutoMirrored(boolean arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setAutoMirrored(arg0);
    }

    public void setBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setBitmap(arg0 == null ? null : arg0.getReal());
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setColorFilter(arg0 == null ? null : arg0.getReal());
    }

    public void setDither(boolean arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setDither(arg0);
    }

    public void setFilterBitmap(boolean arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setFilterBitmap(arg0);
    }

    public void setGravity(int arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setGravity(arg0);
    }

    public void setMipMap(boolean arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setMipMap(arg0);
    }

    public void setTargetDensity(int arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setTargetDensity(arg0);
    }

    public void setTargetDensity(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setTargetDensity(arg0 == null ? null : arg0.getReal());
    }

    public void setTargetDensity(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setTargetDensity(arg0 == null ? null : arg0.getReal());
    }

    public void setTileModeX(com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setTileModeX(arg0 == null ? null : arg0.getReal());
    }

    public void setTileModeXY(com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg0, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg1) {
        ((android.graphics.drawable.BitmapDrawable) real).setTileModeXY(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal());
    }

    public void setTileModeY(com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setTileModeY(arg0 == null ? null : arg0.getReal());
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.BitmapDrawable) real).setTintList(arg0 == null ? null : arg0.getReal());
    }

}
