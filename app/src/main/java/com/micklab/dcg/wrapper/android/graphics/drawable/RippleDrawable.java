// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class RippleDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private RippleDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.RippleDrawable wrap(android.graphics.drawable.RippleDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.RippleDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.RippleDrawable getReal() {
        return (android.graphics.drawable.RippleDrawable) real;
    }

    public android.graphics.drawable.RippleDrawable unwrap() {
        return getReal();
    }

    public RippleDrawable(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2) {
        this(new android.graphics.drawable.RippleDrawable(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2 == null ? null : arg2.getReal()), (__DcgwBridgeToken) null);
    }

    public void applyTheme(com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.RippleDrawable) real).applyTheme(arg0 == null ? null : arg0.getReal());
    }

    public boolean canApplyTheme() {
        return ((android.graphics.drawable.RippleDrawable) real).canApplyTheme();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.RippleDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(((android.graphics.drawable.RippleDrawable) real).getConstantState());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getDirtyBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(((android.graphics.drawable.RippleDrawable) real).getDirtyBounds());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getEffectColor() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.graphics.drawable.RippleDrawable) real).getEffectColor());
    }

    public void getHotspotBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        ((android.graphics.drawable.RippleDrawable) real).getHotspotBounds(arg0 == null ? null : arg0.getReal());
    }

    public int getOpacity() {
        return ((android.graphics.drawable.RippleDrawable) real).getOpacity();
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.RippleDrawable) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public int getRadius() {
        return ((android.graphics.drawable.RippleDrawable) real).getRadius();
    }

    public boolean hasFocusStateSpecified() {
        return ((android.graphics.drawable.RippleDrawable) real).hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, com.micklab.dcg.wrapper.android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.RippleDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3 == null ? null : arg3.getReal());
    }

    public void invalidateSelf() {
        ((android.graphics.drawable.RippleDrawable) real).invalidateSelf();
    }

    public boolean isProjected() {
        return ((android.graphics.drawable.RippleDrawable) real).isProjected();
    }

    public boolean isStateful() {
        return ((android.graphics.drawable.RippleDrawable) real).isStateful();
    }

    public void jumpToCurrentState() {
        ((android.graphics.drawable.RippleDrawable) real).jumpToCurrentState();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.RippleDrawable) real).mutate());
    }

    public void setColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.RippleDrawable) real).setColor(arg0 == null ? null : arg0.getReal());
    }

    public boolean setDrawableByLayerId(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        return ((android.graphics.drawable.RippleDrawable) real).setDrawableByLayerId(arg0, arg1 == null ? null : arg1.getReal());
    }

    public void setEffectColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.RippleDrawable) real).setEffectColor(arg0 == null ? null : arg0.getReal());
    }

    public void setHotspot(float arg0, float arg1) {
        ((android.graphics.drawable.RippleDrawable) real).setHotspot(arg0, arg1);
    }

    public void setHotspotBounds(int arg0, int arg1, int arg2, int arg3) {
        ((android.graphics.drawable.RippleDrawable) real).setHotspotBounds(arg0, arg1, arg2, arg3);
    }

    public void setPaddingMode(int arg0) {
        ((android.graphics.drawable.RippleDrawable) real).setPaddingMode(arg0);
    }

    public void setRadius(int arg0) {
        ((android.graphics.drawable.RippleDrawable) real).setRadius(arg0);
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return ((android.graphics.drawable.RippleDrawable) real).setVisible(arg0, arg1);
    }

    public static final int RADIUS_AUTO = android.graphics.drawable.RippleDrawable.RADIUS_AUTO;

}
