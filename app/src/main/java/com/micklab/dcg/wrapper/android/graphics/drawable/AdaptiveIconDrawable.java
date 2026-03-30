// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class AdaptiveIconDrawable {
    private final android.graphics.drawable.AdaptiveIconDrawable real;

    public AdaptiveIconDrawable(android.graphics.drawable.AdaptiveIconDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.AdaptiveIconDrawable wrap(android.graphics.drawable.AdaptiveIconDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.AdaptiveIconDrawable(real);
    }

    public android.graphics.drawable.AdaptiveIconDrawable unwrap() {
        return real;
    }

    public AdaptiveIconDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        this(new android.graphics.drawable.AdaptiveIconDrawable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public AdaptiveIconDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2) {
        this(new android.graphics.drawable.AdaptiveIconDrawable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
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

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getBackground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getBackground());
    }

    public int getChangingConfigurations() {
        return real.getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(real.getConstantState());
    }

    public static float getExtraInsetFraction() {
        return android.graphics.drawable.AdaptiveIconDrawable.getExtraInsetFraction();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getForeground() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getForeground());
    }

    public void getHotspotBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getHotspotBounds(arg0 == null ? null : arg0.unwrap());
    }

    public com.micklab.dcg.wrapper.android.graphics.Path getIconMask() {
        return com.micklab.dcg.wrapper.android.graphics.Path.wrap(real.getIconMask());
    }

    public int getIntrinsicHeight() {
        return real.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return real.getIntrinsicWidth();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getMonochrome() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getMonochrome());
    }

    public int getOpacity() {
        return real.getOpacity();
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.getOutline(arg0 == null ? null : arg0.unwrap());
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

    public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.invalidateDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void invalidateSelf() {
        real.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return real.isAutoMirrored();
    }

    public boolean isProjected() {
        return real.isProjected();
    }

    public boolean isStateful() {
        return real.isStateful();
    }

    public void jumpToCurrentState() {
        real.jumpToCurrentState();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.mutate());
    }

    public void scheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1, long arg2) {
        real.scheduleDrawable(arg0 == null ? null : arg0.unwrap(), arg1, arg2);
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

    public void setHotspot(float arg0, float arg1) {
        real.setHotspot(arg0, arg1);
    }

    public void setHotspotBounds(int arg0, int arg1, int arg2, int arg3) {
        real.setHotspotBounds(arg0, arg1, arg2, arg3);
    }

    public void setOpacity(int arg0) {
        real.setOpacity(arg0);
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setTintList(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return real.setVisible(arg0, arg1);
    }

    public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1) {
        real.unscheduleDrawable(arg0 == null ? null : arg0.unwrap(), arg1);
    }

}
