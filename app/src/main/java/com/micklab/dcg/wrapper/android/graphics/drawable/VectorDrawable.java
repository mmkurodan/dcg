// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class VectorDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private VectorDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.VectorDrawable wrap(android.graphics.drawable.VectorDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.VectorDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.VectorDrawable getReal() {
        return (android.graphics.drawable.VectorDrawable) real;
    }

    public android.graphics.drawable.VectorDrawable unwrap() {
        return getReal();
    }

    public VectorDrawable() {
        this(new android.graphics.drawable.VectorDrawable(), (__DcgwBridgeToken) null);
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.VectorDrawable) real).applyTheme(arg0);
    }

    public boolean canApplyTheme() {
        return ((android.graphics.drawable.VectorDrawable) real).canApplyTheme();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.VectorDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getAlpha() {
        return ((android.graphics.drawable.VectorDrawable) real).getAlpha();
    }

    public int getChangingConfigurations() {
        return ((android.graphics.drawable.VectorDrawable) real).getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(((android.graphics.drawable.VectorDrawable) real).getColorFilter());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(((android.graphics.drawable.VectorDrawable) real).getConstantState());
    }

    public int getIntrinsicHeight() {
        return ((android.graphics.drawable.VectorDrawable) real).getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return ((android.graphics.drawable.VectorDrawable) real).getIntrinsicWidth();
    }

    public int getOpacity() {
        return ((android.graphics.drawable.VectorDrawable) real).getOpacity();
    }

    public com.micklab.dcg.wrapper.android.graphics.Insets getOpticalInsets() {
        return com.micklab.dcg.wrapper.android.graphics.Insets.wrap(((android.graphics.drawable.VectorDrawable) real).getOpticalInsets());
    }

    public boolean hasFocusStateSpecified() {
        return ((android.graphics.drawable.VectorDrawable) real).hasFocusStateSpecified();
    }

    public void inflate(com.micklab.dcg.wrapper.android.content.res.Resources arg0, org.xmlpull.v1.XmlPullParser arg1, com.micklab.dcg.wrapper.android.util.AttributeSet arg2, android.content.res.Resources.Theme arg3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        ((android.graphics.drawable.VectorDrawable) real).inflate(arg0 == null ? null : arg0.getReal(), arg1, arg2 == null ? null : arg2.getReal(), arg3);
    }

    public boolean isAutoMirrored() {
        return ((android.graphics.drawable.VectorDrawable) real).isAutoMirrored();
    }

    public boolean isStateful() {
        return ((android.graphics.drawable.VectorDrawable) real).isStateful();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.VectorDrawable) real).mutate());
    }

    public void setAlpha(int arg0) {
        ((android.graphics.drawable.VectorDrawable) real).setAlpha(arg0);
    }

    public void setAutoMirrored(boolean arg0) {
        ((android.graphics.drawable.VectorDrawable) real).setAutoMirrored(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        ((android.graphics.drawable.VectorDrawable) real).setColorFilter(arg0 == null ? null : arg0.getReal());
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.graphics.drawable.VectorDrawable) real).setTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.VectorDrawable) real).setTintList(arg0 == null ? null : arg0.getReal());
    }

}
