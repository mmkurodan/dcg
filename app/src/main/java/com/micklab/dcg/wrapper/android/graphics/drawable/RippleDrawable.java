// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class RippleDrawable {
    private final android.graphics.drawable.RippleDrawable real;

    public RippleDrawable(android.graphics.drawable.RippleDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.RippleDrawable wrap(android.graphics.drawable.RippleDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.RippleDrawable(real);
    }

    public android.graphics.drawable.RippleDrawable unwrap() {
        return real;
    }

    public RippleDrawable(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg2) {
        this(new android.graphics.drawable.RippleDrawable(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2 == null ? null : arg2.unwrap()));
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

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(real.getConstantState());
    }

    public com.micklab.dcg.wrapper.android.graphics.Rect getDirtyBounds() {
        return com.micklab.dcg.wrapper.android.graphics.Rect.wrap(real.getDirtyBounds());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getEffectColor() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getEffectColor());
    }

    public void getHotspotBounds(com.micklab.dcg.wrapper.android.graphics.Rect arg0) {
        real.getHotspotBounds(arg0 == null ? null : arg0.unwrap());
    }

    public int getOpacity() {
        return real.getOpacity();
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        real.getOutline(arg0 == null ? null : arg0.unwrap());
    }

    public int getRadius() {
        return real.getRadius();
    }

    public boolean hasFocusStateSpecified() {
        return real.hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        real.inflate(arg0 == null ? null : arg0.unwrap(), arg1, arg2 == null ? null : arg2.unwrap(), arg3);
    }

    public void invalidateSelf() {
        real.invalidateSelf();
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

    public void setColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setColor(arg0 == null ? null : arg0.unwrap());
    }

    public boolean setDrawableByLayerId(int arg0, com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg1) {
        return real.setDrawableByLayerId(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void setEffectColor(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setEffectColor(arg0 == null ? null : arg0.unwrap());
    }

    public void setHotspot(float arg0, float arg1) {
        real.setHotspot(arg0, arg1);
    }

    public void setHotspotBounds(int arg0, int arg1, int arg2, int arg3) {
        real.setHotspotBounds(arg0, arg1, arg2, arg3);
    }

    public void setPaddingMode(int arg0) {
        real.setPaddingMode(arg0);
    }

    public void setRadius(int arg0) {
        real.setRadius(arg0);
    }

    public boolean setVisible(boolean arg0, boolean arg1) {
        return real.setVisible(arg0, arg1);
    }

    public static final int RADIUS_AUTO = android.graphics.drawable.RippleDrawable.RADIUS_AUTO;

}
