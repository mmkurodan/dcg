// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.graphics.drawable;

public final class ColorStateListDrawable {
    private final android.graphics.drawable.ColorStateListDrawable real;

    public ColorStateListDrawable(android.graphics.drawable.ColorStateListDrawable real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.graphics.drawable.ColorStateListDrawable wrap(android.graphics.drawable.ColorStateListDrawable real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.graphics.drawable.ColorStateListDrawable(real);
    }

    public android.graphics.drawable.ColorStateListDrawable unwrap() {
        return real;
    }

    public ColorStateListDrawable() {
        this(new android.graphics.drawable.ColorStateListDrawable());
    }

    public ColorStateListDrawable(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        this(new android.graphics.drawable.ColorStateListDrawable(arg0 == null ? null : arg0.unwrap()));
    }

    public void applyTheme(android.content.res.Resources.Theme arg0) {
        real.applyTheme(arg0);
    }

    public boolean canApplyTheme() {
        return real.canApplyTheme();
    }

    public void clearAlpha() {
        real.clearAlpha();
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

    public com.micklab.dcg.wrapper.android.graphics.ColorFilter getColorFilter() {
        return com.micklab.dcg.wrapper.android.graphics.ColorFilter.wrap(real.getColorFilter());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getColorStateList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getColorStateList());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.ConstantState.wrap(real.getConstantState());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getCurrent() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getCurrent());
    }

    public int getOpacity() {
        return real.getOpacity();
    }

    public boolean hasFocusStateSpecified() {
        return real.hasFocusStateSpecified();
    }

    public void invalidateDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.invalidateDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public boolean isStateful() {
        return real.isStateful();
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

    public void setColorFilter(com.micklab.dcg.wrapper.android.graphics.ColorFilter arg0) {
        real.setColorFilter(arg0 == null ? null : arg0.unwrap());
    }

    public void setColorStateList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setColorStateList(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void unscheduleDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0, java.lang.Runnable arg1) {
        real.unscheduleDrawable(arg0 == null ? null : arg0.unwrap(), arg1);
    }

}
