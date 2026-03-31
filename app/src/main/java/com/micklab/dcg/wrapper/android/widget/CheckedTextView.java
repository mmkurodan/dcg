// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class CheckedTextView {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private CheckedTextView(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.CheckedTextView wrap(android.widget.CheckedTextView real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.CheckedTextView(real, (__DcgwBridgeToken) null);
    }

    public android.widget.CheckedTextView getReal() {
        return (android.widget.CheckedTextView) real;
    }

    public android.widget.CheckedTextView unwrap() {
        return getReal();
    }

    public CheckedTextView(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.CheckedTextView(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public CheckedTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.CheckedTextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public CheckedTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.CheckedTextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public CheckedTextView(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.CheckedTextView(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        ((android.widget.CheckedTextView) real).drawableHotspotChanged(arg0, arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.CheckedTextView) real).getAccessibilityClassName();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getCheckMarkDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(((android.widget.CheckedTextView) real).getCheckMarkDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getCheckMarkTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(((android.widget.CheckedTextView) real).getCheckMarkTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getCheckMarkTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(((android.widget.CheckedTextView) real).getCheckMarkTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getCheckMarkTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(((android.widget.CheckedTextView) real).getCheckMarkTintMode());
    }

    public boolean isChecked() {
        return ((android.widget.CheckedTextView) real).isChecked();
    }

    public void jumpDrawablesToCurrentState() {
        ((android.widget.CheckedTextView) real).jumpDrawablesToCurrentState();
    }

    public void onRestoreInstanceState(com.micklab.dcg.wrapper.android.os.Parcelable arg0) {
        ((android.widget.CheckedTextView) real).onRestoreInstanceState(arg0 == null ? null : arg0.getReal());
    }

    public void onRtlPropertiesChanged(int arg0) {
        ((android.widget.CheckedTextView) real).onRtlPropertiesChanged(arg0);
    }

    public com.micklab.dcg.wrapper.android.os.Parcelable onSaveInstanceState() {
        return com.micklab.dcg.wrapper.android.os.Parcelable.wrap(((android.widget.CheckedTextView) real).onSaveInstanceState());
    }

    public void setCheckMarkDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.CheckedTextView) real).setCheckMarkDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setCheckMarkDrawable(int arg0) {
        ((android.widget.CheckedTextView) real).setCheckMarkDrawable(arg0);
    }

    public void setCheckMarkTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        ((android.widget.CheckedTextView) real).setCheckMarkTintBlendMode(arg0 == null ? null : arg0.getReal());
    }

    public void setCheckMarkTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        ((android.widget.CheckedTextView) real).setCheckMarkTintList(arg0 == null ? null : arg0.getReal());
    }

    public void setCheckMarkTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        ((android.widget.CheckedTextView) real).setCheckMarkTintMode(arg0 == null ? null : arg0.getReal());
    }

    public void setChecked(boolean arg0) {
        ((android.widget.CheckedTextView) real).setChecked(arg0);
    }

    public void setVisibility(int arg0) {
        ((android.widget.CheckedTextView) real).setVisibility(arg0);
    }

    public void toggle() {
        ((android.widget.CheckedTextView) real).toggle();
    }

}
