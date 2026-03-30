// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class Switch {
    private final android.widget.Switch real;

    public Switch(android.widget.Switch real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.Switch wrap(android.widget.Switch real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.Switch(real);
    }

    public android.widget.Switch unwrap() {
        return real;
    }

    public Switch(com.micklab.dcg.wrapper.android.content.Context arg0) {
        this(new android.widget.Switch(arg0 == null ? null : arg0.unwrap()));
    }

    public Switch(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1) {
        this(new android.widget.Switch(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap()));
    }

    public Switch(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2) {
        this(new android.widget.Switch(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2));
    }

    public Switch(com.micklab.dcg.wrapper.android.content.Context arg0, com.micklab.dcg.wrapper.android.util.AttributeSet arg1, int arg2, int arg3) {
        this(new android.widget.Switch(arg0 == null ? null : arg0.unwrap(), arg1 == null ? null : arg1.unwrap(), arg2, arg3));
    }

    public void draw(com.micklab.dcg.wrapper.android.graphics.Canvas arg0) {
        real.draw(arg0 == null ? null : arg0.unwrap());
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        real.drawableHotspotChanged(arg0, arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getCompoundPaddingLeft() {
        return real.getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        return real.getCompoundPaddingRight();
    }

    public boolean getShowText() {
        return real.getShowText();
    }

    public boolean getSplitTrack() {
        return real.getSplitTrack();
    }

    public int getSwitchMinWidth() {
        return real.getSwitchMinWidth();
    }

    public int getSwitchPadding() {
        return real.getSwitchPadding();
    }

    public java.lang.CharSequence getTextOff() {
        return real.getTextOff();
    }

    public java.lang.CharSequence getTextOn() {
        return real.getTextOn();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getThumbDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getThumbDrawable());
    }

    public int getThumbTextPadding() {
        return real.getThumbTextPadding();
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getThumbTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getThumbTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getThumbTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getThumbTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getThumbTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getThumbTintMode());
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getTrackDrawable() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getTrackDrawable());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getTrackTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getTrackTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getTrackTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getTrackTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getTrackTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getTrackTintMode());
    }

    public void jumpDrawablesToCurrentState() {
        real.jumpDrawablesToCurrentState();
    }

    public void onMeasure(int arg0, int arg1) {
        real.onMeasure(arg0, arg1);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void setChecked(boolean arg0) {
        real.setChecked(arg0);
    }

    public void setShowText(boolean arg0) {
        real.setShowText(arg0);
    }

    public void setSplitTrack(boolean arg0) {
        real.setSplitTrack(arg0);
    }

    public void setSwitchMinWidth(int arg0) {
        real.setSwitchMinWidth(arg0);
    }

    public void setSwitchPadding(int arg0) {
        real.setSwitchPadding(arg0);
    }

    public void setSwitchTextAppearance(com.micklab.dcg.wrapper.android.content.Context arg0, int arg1) {
        real.setSwitchTextAppearance(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setSwitchTypeface(com.micklab.dcg.wrapper.android.graphics.Typeface arg0) {
        real.setSwitchTypeface(arg0 == null ? null : arg0.unwrap());
    }

    public void setSwitchTypeface(com.micklab.dcg.wrapper.android.graphics.Typeface arg0, int arg1) {
        real.setSwitchTypeface(arg0 == null ? null : arg0.unwrap(), arg1);
    }

    public void setTextOff(java.lang.CharSequence arg0) {
        real.setTextOff(arg0);
    }

    public void setTextOn(java.lang.CharSequence arg0) {
        real.setTextOn(arg0);
    }

    public void setThumbDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setThumbDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setThumbIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        real.setThumbIcon(arg0 == null ? null : arg0.unwrap());
    }

    public void setThumbResource(int arg0) {
        real.setThumbResource(arg0);
    }

    public void setThumbTextPadding(int arg0) {
        real.setThumbTextPadding(arg0);
    }

    public void setThumbTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setThumbTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setThumbTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setThumbTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setThumbTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setThumbTintMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setTrackDrawable(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setTrackDrawable(arg0 == null ? null : arg0.unwrap());
    }

    public void setTrackIcon(com.micklab.dcg.wrapper.android.graphics.drawable.Icon arg0) {
        real.setTrackIcon(arg0 == null ? null : arg0.unwrap());
    }

    public void setTrackResource(int arg0) {
        real.setTrackResource(arg0);
    }

    public void setTrackTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setTrackTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setTrackTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setTrackTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setTrackTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setTrackTintMode(arg0 == null ? null : arg0.unwrap());
    }

    public void toggle() {
        real.toggle();
    }

}
