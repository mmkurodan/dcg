// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ToggleButton {
    private static final class __DcgwBridgeToken {
    }

    private final java.lang.Object real;

    private ToggleButton(java.lang.Object real, __DcgwBridgeToken token) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ToggleButton wrap(android.widget.ToggleButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ToggleButton(real, (__DcgwBridgeToken) null);
    }

    public android.widget.ToggleButton getReal() {
        return (android.widget.ToggleButton) real;
    }

    public android.widget.ToggleButton unwrap() {
        return getReal();
    }

    public ToggleButton(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ToggleButton(arg0 == null ? null : arg0.getReal()), (__DcgwBridgeToken) null);
    }

    public ToggleButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ToggleButton(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal()), (__DcgwBridgeToken) null);
    }

    public ToggleButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ToggleButton(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2), (__DcgwBridgeToken) null);
    }

    public ToggleButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ToggleButton(arg0 == null ? null : arg0.getReal(), arg1 == null ? null : arg1.getReal(), arg2, arg3), (__DcgwBridgeToken) null);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return ((android.widget.ToggleButton) real).getAccessibilityClassName();
    }

    public float getDisabledAlpha() {
        return ((android.widget.ToggleButton) real).getDisabledAlpha();
    }

    public java.lang.CharSequence getTextOff() {
        return ((android.widget.ToggleButton) real).getTextOff();
    }

    public java.lang.CharSequence getTextOn() {
        return ((android.widget.ToggleButton) real).getTextOn();
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        ((android.widget.ToggleButton) real).setBackgroundDrawable(arg0 == null ? null : arg0.getReal());
    }

    public void setChecked(boolean arg0) {
        ((android.widget.ToggleButton) real).setChecked(arg0);
    }

    public void setTextOff(java.lang.CharSequence arg0) {
        ((android.widget.ToggleButton) real).setTextOff(arg0);
    }

    public void setTextOn(java.lang.CharSequence arg0) {
        ((android.widget.ToggleButton) real).setTextOn(arg0);
    }

}
