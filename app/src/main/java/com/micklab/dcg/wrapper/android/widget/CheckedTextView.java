// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class CheckedTextView {
    private final android.widget.CheckedTextView real;

    public CheckedTextView(android.widget.CheckedTextView real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.CheckedTextView wrap(android.widget.CheckedTextView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CheckedTextView(real);
    }

    public android.widget.CheckedTextView unwrap() {
        return real;
    }

    public CheckedTextView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.CheckedTextView(arg0 == null ? null : arg0.unwrap()));
    }

    public CheckedTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.CheckedTextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public CheckedTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.CheckedTextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public CheckedTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.CheckedTextView(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        real.drawableHotspotChanged(arg0, arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getCheckMarkDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getCheckMarkDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getCheckMarkTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getCheckMarkTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getCheckMarkTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getCheckMarkTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getCheckMarkTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getCheckMarkTintMode());
    }

    public boolean isChecked() {
        return real.isChecked();
    }

    public void jumpDrawablesToCurrentState() {
        real.jumpDrawablesToCurrentState();
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        real.onRestoreInstanceState(arg0 == null ? null : arg0.unwrap());
    }

    public void onRtlPropertiesChanged(int arg0) {
        real.onRtlPropertiesChanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(real.onSaveInstanceState());
    }

    public void setCheckMarkDrawable(int arg0) {
        real.setCheckMarkDrawable(arg0);
    }

    public void setCheckMarkDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setCheckMarkDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setCheckMarkTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setCheckMarkTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setCheckMarkTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setCheckMarkTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setCheckMarkTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setCheckMarkTintMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setChecked(boolean arg0) {
        real.setChecked(arg0);
    }

    public void setVisibility(int arg0) {
        real.setVisibility(arg0);
    }

    public void toggle() {
        real.toggle();
    }

}
