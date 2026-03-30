// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class BitmapDrawable {
    private final android.graphics.drawable.BitmapDrawable real;

    public BitmapDrawable(android.graphics.drawable.BitmapDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.BitmapDrawable wrap(android.graphics.drawable.BitmapDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.BitmapDrawable(real);
    }

    public android.graphics.drawable.BitmapDrawable unwrap() {
        return real;
    }

    public BitmapDrawable() {
        this(new android.graphics.drawable.BitmapDrawable());
    }

    public BitmapDrawable(java.lang.String arg0) {
        this(new android.graphics.drawable.BitmapDrawable(arg0));
    }

    public BitmapDrawable(java.io.InputStream arg0) {
        this(new android.graphics.drawable.BitmapDrawable(arg0));
    }

    public BitmapDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0) {
        this(new android.graphics.drawable.BitmapDrawable(arg0 == null ? null : arg0.unwrap()));
    }

    public BitmapDrawable(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        this(new android.graphics.drawable.BitmapDrawable(arg0 == null ? null : arg0.unwrap()));
    }

    public BitmapDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0, java.lang.String arg1) {
        this(new android.graphics.drawable.BitmapDrawable(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public BitmapDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0, java.io.InputStream arg1) {
        this(new android.graphics.drawable.BitmapDrawable(arg0 == null ? null : arg0.unwrap(), arg1));
    }

    public BitmapDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1) {
        this(new android.graphics.drawable.BitmapDrawable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        real.applyTheme(arg0);
    }

    public boolean canApplyTheme() {
        return real.canApplyTheme();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public int getAlpha() {
        return real.getAlpha();
    }

    public com.micklab.dcg.wrapper.android.graphics.Bitmap getBitmap() {
        return com.micklab.dcg.wrapper.android.graphics.Bitmap.wrap(real.getBitmap());
    }

    public int getChangingConfigurations() {
        return real.getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(real.getColorFilter());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(real.getConstantState());
    }

    public int getGravity() {
        return real.getGravity();
    }

    public int getIntrinsicHeight() {
        return real.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return real.getIntrinsicWidth();
    }

    public int getOpacity() {
        return real.getOpacity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getOpticalInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(real.getOpticalInsets());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.getOutline(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint getPaint() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.wrap(real.getPaint());
    }

    public com.micklab.dcg.wrapper.android.graphics.Shader.TileMode getTileModeX() {
        return com.micklab.dcg.wrapper.android.graphics.Shader.TileMode.wrap(real.getTileModeX());
    }

    public com.micklab.dcg.wrapper.android.graphics.Shader.TileMode getTileModeY() {
        return com.micklab.dcg.wrapper.android.graphics.Shader.TileMode.wrap(real.getTileModeY());
    }

    public boolean hasAntiAlias() {
        return real.hasAntiAlias();
    }

    public boolean hasFocusStateSpecified() {
        return real.hasFocusStateSpecified();
    }

    public boolean hasMipMap() {
        return real.hasMipMap();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public boolean isAutoMirrored() {
        return real.isAutoMirrored();
    }

    public boolean isFilterBitmap() {
        return real.isFilterBitmap();
    }

    public boolean isStateful() {
        return real.isStateful();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.mutate());
    }

    public void setAlpha(int arg0) {
        real.setAlpha(arg0);
    }

    public void setAntiAlias(boolean arg0) {
        real.setAntiAlias(arg0);
    }

    public void setAutoMirrored(boolean arg0) {
        real.setAutoMirrored(arg0);
    }

    public void setBitmap(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0) {
        real.setBitmap(arg0 == null ? null : arg0.unwrap());
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        real.setColorFilter(arg0 == null ? null : arg0.unwrap());
    }

    public void setDither(boolean arg0) {
        real.setDither(arg0);
    }

    public void setFilterBitmap(boolean arg0) {
        real.setFilterBitmap(arg0);
    }

    public void setGravity(int arg0) {
        real.setGravity(arg0);
    }

    public void setMipMap(boolean arg0) {
        real.setMipMap(arg0);
    }

    public void setTargetDensity(int arg0) {
        real.setTargetDensity(arg0);
    }

    public void setTargetDensity(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        real.setTargetDensity(arg0 == null ? null : arg0.unwrap());
    }

    public void setTargetDensity(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.setTargetDensity(arg0 == null ? null : arg0.unwrap());
    }

    public void setTileModeX(com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg0) {
        real.setTileModeX(arg0 == null ? null : arg0.unwrap());
    }

    public void setTileModeXY(com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg0, com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg1) {
        real.setTileModeXY(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap());
    }

    public void setTileModeY(com.micklab.dcg.wrapper.android.graphics.Shader.TileMode arg0) {
        real.setTileModeY(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setTintList(arg0 == null ? null : arg0.unwrap());
    }

}
