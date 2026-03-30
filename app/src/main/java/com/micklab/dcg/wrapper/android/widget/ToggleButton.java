// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class ToggleButton {
    private final android.widget.ToggleButton real;

    public ToggleButton(android.widget.ToggleButton real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.ToggleButton wrap(android.widget.ToggleButton real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.ToggleButton(real);
    }

    public android.widget.ToggleButton unwrap() {
        return real;
    }

    public ToggleButton(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.ToggleButton(arg0 == null ? null : arg0.unwrap()));
    }

    public ToggleButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.ToggleButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public ToggleButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.ToggleButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public ToggleButton(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.ToggleButton(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public float getDisabledAlpha() {
        return real.getDisabledAlpha();
    }

    public java.lang.CharSequence getTextOff() {
        return real.getTextOff();
    }

    public java.lang.CharSequence getTextOn() {
        return real.getTextOn();
    }

    public void setBackgroundDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setBackgroundDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setChecked(boolean arg0) {
        real.setChecked(arg0);
    }

    public void setTextOff(java.lang.CharSequence arg0) {
        real.setTextOff(arg0);
    }

    public void setTextOn(java.lang.CharSequence arg0) {
        real.setTextOn(arg0);
    }

}
