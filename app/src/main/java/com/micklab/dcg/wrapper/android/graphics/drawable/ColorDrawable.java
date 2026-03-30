// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class ColorDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ColorDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.ColorDrawable wrap(android.graphics.drawable.ColorDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.ColorDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.ColorDrawable getReal() {
        return (android.graphics.drawable.ColorDrawable) real;
    }

    public android.graphics.drawable.ColorDrawable unwrap() {
        return getReal();
    }

    public ColorDrawable() {
        this(new android.graphics.drawable.ColorDrawable(), (__DcgwBridgeToken) null);
    }

    public ColorDrawable(int arg0) {
        this(new android.graphics.drawable.ColorDrawable(arg0), (__DcgwBridgeToken) null);
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.ColorDrawable) real).applyTheme(arg0);
    }

    public boolean canApplyTheme() {
        return ((android.graphics.drawable.ColorDrawable) real).canApplyTheme();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.ColorDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getAlpha() {
        return ((android.graphics.drawable.ColorDrawable) real).getAlpha();
    }

    public int getChangingConfigurations() {
        return ((android.graphics.drawable.ColorDrawable) real).getChangingConfigurations();
    }

    public int getColor() {
        return ((android.graphics.drawable.ColorDrawable) real).getColor();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(((android.graphics.drawable.ColorDrawable) real).getColorFilter());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(((android.graphics.drawable.ColorDrawable) real).getConstantState());
    }

    public int getOpacity() {
        return ((android.graphics.drawable.ColorDrawable) real).getOpacity();
    }

    public void getOutline(com.micklab.dcg.wrapper.android.graphics.Outline arg0) {
        ((android.graphics.drawable.ColorDrawable) real).getOutline(arg0 == null ? null : arg0.getReal());
    }

    public boolean hasFocusStateSpecified() {
        return ((android.graphics.drawable.ColorDrawable) real).hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.ColorDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public boolean isStateful() {
        return ((android.graphics.drawable.ColorDrawable) real).isStateful();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.ColorDrawable) real).mutate());
    }

    public void setAlpha(int arg0) {
        ((android.graphics.drawable.ColorDrawable) real).setAlpha(arg0);
    }

    public void setColor(int arg0) {
        ((android.graphics.drawable.ColorDrawable) real).setColor(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        ((android.graphics.drawable.ColorDrawable) real).setColorFilter(arg0 == null ? null : arg0.getReal());
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.graphics.drawable.ColorDrawable) real).setTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.ColorDrawable) real).setTintList(arg0 == null ? null : arg0.getReal());
    }

}
