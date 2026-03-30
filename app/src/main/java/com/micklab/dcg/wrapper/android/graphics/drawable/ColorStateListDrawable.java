// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class ColorStateListDrawable {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ColorStateListDrawable(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.ColorStateListDrawable wrap(android.graphics.drawable.ColorStateListDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.ColorStateListDrawable(real, (__DcgwBridgeToken) null);
    }

    public android.graphics.drawable.ColorStateListDrawable getReal() {
        return (android.graphics.drawable.ColorStateListDrawable) real;
    }

    public android.graphics.drawable.ColorStateListDrawable unwrap() {
        return getReal();
    }

    public ColorStateListDrawable() {
        this(new android.graphics.drawable.ColorStateListDrawable(), (__DcgwBridgeToken) null);
    }

    public ColorStateListDrawable(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        this(new android.graphics.drawable.ColorStateListDrawable(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        ((android.graphics.drawable.ColorStateListDrawable) real).applyTheme(arg0);
    }

    public boolean canApplyTheme() {
        return ((android.graphics.drawable.ColorStateListDrawable) real).canApplyTheme();
    }

    public void clearAlpha() {
        ((android.graphics.drawable.ColorStateListDrawable) real).clearAlpha();
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        ((android.graphics.drawable.ColorStateListDrawable) real).draw(arg0 == null ? null : arg0.getReal());
    }

    public int getAlpha() {
        return ((android.graphics.drawable.ColorStateListDrawable) real).getAlpha();
    }

    public int getChangingConfigurations() {
        return ((android.graphics.drawable.ColorStateListDrawable) real).getChangingConfigurations();
    }

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(((android.graphics.drawable.ColorStateListDrawable) real).getColorFilter());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getColorStateList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.graphics.drawable.ColorStateListDrawable) real).getColorStateList());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(((android.graphics.drawable.ColorStateListDrawable) real).getConstantState());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getCurrent() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.ColorStateListDrawable) real).getCurrent());
    }

    public int getOpacity() {
        return ((android.graphics.drawable.ColorStateListDrawable) real).getOpacity();
    }

    public boolean hasFocusStateSpecified() {
        return ((android.graphics.drawable.ColorStateListDrawable) real).hasFocusStateSpecified();
    }

    public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.graphics.drawable.ColorStateListDrawable) real).invalidateDrawable(arg0 == null ? null : arg0.getReal());
    }

    public boolean isStateful() {
        return ((android.graphics.drawable.ColorStateListDrawable) real).isStateful();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable mutate() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.graphics.drawable.ColorStateListDrawable) real).mutate());
    }

    public void scheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1, long arg2) {
        ((android.graphics.drawable.ColorStateListDrawable) real).scheduleDrawable(arg0 == null ? null : arg0.getReal(), arg1, arg2);
    }

    public void setAlpha(int arg0) {
        ((android.graphics.drawable.ColorStateListDrawable) real).setAlpha(arg0);
    }

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        ((android.graphics.drawable.ColorStateListDrawable) real).setColorFilter(arg0 == null ? null : arg0.getReal());
    }

    public void setColorStateList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.ColorStateListDrawable) real).setColorStateList(arg0 == null ? null : arg0.getReal());
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.graphics.drawable.ColorStateListDrawable) real).setTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.graphics.drawable.ColorStateListDrawable) real).setTintList(arg0 == null ? null : arg0.getReal());
    }

    public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1) {
        ((android.graphics.drawable.ColorStateListDrawable) real).unscheduleDrawable(arg0 == null ? null : arg0.getReal(), arg1);
    }

}
