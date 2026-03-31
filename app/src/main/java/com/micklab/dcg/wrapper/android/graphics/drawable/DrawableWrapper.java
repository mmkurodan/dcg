// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class DrawableWrapper {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private DrawableWrapper(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.DrawableWrapper wrap(android.graphics.drawable.DrawableWrapper real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.DrawableWrapper(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.DrawableWrapper getReal() {
        return (android.graphics.drawable.DrawableWrapper) real;
    }

    public android.graphics.drawable.DrawableWrapper unwrap() {
        return getReal();
    }

    public void applyTheme(com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.DrawableWrapper) real).applyTheme(arg0 == null ? null : arg0.getReal());
    }

    public boolean canApplyTheme() {
        return ((android.graphics.drawable.DrawableWrapper) real).canApplyTheme();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.DrawableWrapper) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getAlpha() {
        return ((android.graphics.drawable.DrawableWrapper) real).getAlpha();
    }

    public int getChangingConfigurations() {
        return ((android.graphics.drawable.DrawableWrapper) real).getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(((android.graphics.drawable.DrawableWrapper) real).getColorFilter());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(((android.graphics.drawable.DrawableWrapper) real).getConstantState());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.DrawableWrapper) real).getDrawable());
    }

    public void getHotspotBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.drawable.DrawableWrapper) real).getHotspotBounds(arg0 == null ? null : arg0.getReal());
    }

    public int getIntrinsicHeight() {
        return ((android.graphics.drawable.DrawableWrapper) real).getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return ((android.graphics.drawable.DrawableWrapper) real).getIntrinsicWidth();
    }

    public int getOpacity() {
        return ((android.graphics.drawable.DrawableWrapper) real).getOpacity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getOpticalInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.graphics.drawable.DrawableWrapper) real).getOpticalInsets());
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.DrawableWrapper) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public boolean getPadding(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        return ((android.graphics.drawable.DrawableWrapper) real).getPadding(arg0 == null ? null : arg0.getReal());
    }

    public boolean hasFocusStateSpecified() {
        return ((android.graphics.drawable.DrawableWrapper) real).hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.DrawableWrapper) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.graphics.drawable.DrawableWrapper) real).invalidateDrawable(arg0 == null ? null : arg0.getReal());
    }

    public boolean isStateful() {
        return ((android.graphics.drawable.DrawableWrapper) real).isStateful();
    }

    public void jumpToCurrentState() {
        ((android.graphics.drawable.DrawableWrapper) real).jumpToCurrentState();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.DrawableWrapper) real).mutate());
    }

    public boolean onLayoutDirectionChanged(int arg0) {
        return ((android.graphics.drawable.DrawableWrapper) real).onLayoutDirectionChanged(arg0);
    }

    public void scheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1, long arg2) {
        ((android.graphics.drawable.DrawableWrapper) real).scheduleDrawable(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void setAlpha(int arg0) {
        ((android.graphics.drawable.DrawableWrapper) real).setAlpha(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        ((android.graphics.drawable.DrawableWrapper) real).setColorFilter(arg0 == null ? null : arg0.getReal());
    }

    public void setDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.graphics.drawable.DrawableWrapper) real).setDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setHotspot(float arg0, float arg1) {
        ((android.graphics.drawable.DrawableWrapper) real).setHotspot(arg0, arg1);
    }

    public void setHotspotBounds(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.drawable.DrawableWrapper) real).setHotspotBounds(arg0, arg1, arg2, arg3);
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.graphics.drawable.DrawableWrapper) real).setTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.DrawableWrapper) real).setTintList(arg0 == null ? null : arg0.getReal());
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return ((android.graphics.drawable.DrawableWrapper) real).setVisible(arg0, arg1);
    }

    public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1) {
        ((android.graphics.drawable.DrawableWrapper) real).unscheduleDrawable(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
