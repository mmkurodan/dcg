// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class NinePatchDrawable {
    private final android.graphics.drawable.NinePatchDrawable real;

    public NinePatchDrawable(android.graphics.drawable.NinePatchDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.NinePatchDrawable wrap(android.graphics.drawable.NinePatchDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.NinePatchDrawable(real);
    }

    public android.graphics.drawable.NinePatchDrawable unwrap() {
        return real;
    }

    public NinePatchDrawable(com.micklab.dcg.wrapper.android.graphics.NinePatch arg0) {
        this(new android.graphics.drawable.NinePatchDrawable(arg0 == null ? null : arg0.unwrap()));
    }

    public NinePatchDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.graphics.NinePatch arg1) {
        this(new android.graphics.drawable.NinePatchDrawable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public NinePatchDrawable(com.micklab.dcg.wrapper.android.graphics.Bitmap arg0, byte[] arg1, com.micklab.dcg.wrapper.android.graphics.Rect arg2, java.lang.String arg3) {
        this(new android.graphics.drawable.NinePatchDrawable(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3));
    }

    public NinePatchDrawable(com.micklab.dcg.wrapper.android.content.res.Resources arg0, com.micklab.dcg.wrapper.android.graphics.Bitmap arg1, byte[] arg2, com.micklab.dcg.wrapper.android.graphics.Rect arg3, java.lang.String arg4) {
        this(new android.graphics.drawable.NinePatchDrawable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3 == null ? null : arg3.unwrap(), arg4));
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

    public int getChangingConfigurations() {
        return real.getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(real.getConstantState());
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

    public boolean getPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return real.getPadding(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.Paint getPaint() {
        return com.micklab.dcg.wrapper.android.graphics.Paint.wrap(real.getPaint());
    }

    public com.micklab.dcg.wrapper.android.graphics.Region getTransparentRegion() {
        return com.micklab.dcg.wrapper.android.graphics.Region.wrap(real.getTransparentRegion());
    }

    public boolean hasFocusStateSpecified() {
        return real.hasFocusStateSpecified();
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

    public void setAutoMirrored(boolean arg0) {
        real.setAutoMirrored(arg0);
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

    public void setTargetDensity(int arg0) {
        real.setTargetDensity(arg0);
    }

    public void setTargetDensity(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.setTargetDensity(arg0 == null ? null : arg0.unwrap());
    }

    public void setTargetDensity(com.micklab.dcg.wrapper.android.util.DisplayMetrics arg0) {
        real.setTargetDensity(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setTintList(arg0 == null ? null : arg0.unwrap());
    }

}
