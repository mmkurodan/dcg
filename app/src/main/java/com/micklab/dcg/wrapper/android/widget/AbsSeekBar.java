// AUTO-GENERATED. DO NOT EDIT.
package com.micklab.dcg.wrapper.android.widget;

public final class AbsSeekBar {
    private final android.widget.AbsSeekBar real;

    public AbsSeekBar(android.widget.AbsSeekBar real) {
        this.real = real;
    }

    public static com.micklab.dcg.wrapper.android.widget.AbsSeekBar wrap(android.widget.AbsSeekBar real) {
        return real == null ? null : new com.micklab.dcg.wrapper.android.widget.AbsSeekBar(real);
    }

    public android.widget.AbsSeekBar unwrap() {
        return real;
    }

    public void drawableHotspotChanged(float arg0, float arg1) {
        real.drawableHotspotChanged(arg0, arg1);
    }

    public java.lang.CharSequence getAccessibilityClassName() {
        return real.getAccessibilityClassName();
    }

    public int getKeyProgressIncrement() {
        return real.getKeyProgressIncrement();
    }

    public boolean getSplitTrack() {
        return real.getSplitTrack();
    }

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getThumb() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getThumb());
    }

    public int getThumbOffset() {
        return real.getThumbOffset();
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

    public com.micklab.dcg.wrapper.android.graphics.drawable.Drawable getTickMark() {
        return com.micklab.dcg.wrapper.android.graphics.drawable.Drawable.wrap(real.getTickMark());
    }

    public com.micklab.dcg.wrapper.android.graphics.BlendMode getTickMarkTintBlendMode() {
        return com.micklab.dcg.wrapper.android.graphics.BlendMode.wrap(real.getTickMarkTintBlendMode());
    }

    public com.micklab.dcg.wrapper.android.content.res.ColorStateList getTickMarkTintList() {
        return com.micklab.dcg.wrapper.android.content.res.ColorStateList.wrap(real.getTickMarkTintList());
    }

    public com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode getTickMarkTintMode() {
        return com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode.wrap(real.getTickMarkTintMode());
    }

    public void jumpDrawablesToCurrentState() {
        real.jumpDrawablesToCurrentState();
    }

    public boolean onKeyDown(int arg0, com.micklab.dcg.wrapper.android.view.KeyEvent arg1) {
        return real.onKeyDown(arg0, arg1 == null ? null : arg1.unwrap());
    }

    public void onRtlPropertiesChanged(int arg0) {
        real.onRtlPropertiesChanged(arg0);
    }

    public boolean onTouchEvent(com.micklab.dcg.wrapper.android.view.MotionEvent arg0) {
        return real.onTouchEvent(arg0 == null ? null : arg0.unwrap());
    }

    public void setKeyProgressIncrement(int arg0) {
        real.setKeyProgressIncrement(arg0);
    }

    public void setMax(int arg0) {
        real.setMax(arg0);
    }

    public void setMin(int arg0) {
        real.setMin(arg0);
    }

    public void setSplitTrack(boolean arg0) {
        real.setSplitTrack(arg0);
    }

    public void setThumb(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setThumb(arg0 == null ? null : arg0.unwrap());
    }

    public void setThumbOffset(int arg0) {
        real.setThumbOffset(arg0);
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

    public void setTickMark(com.micklab.dcg.wrapper.android.graphics.drawable.Drawable arg0) {
        real.setTickMark(arg0 == null ? null : arg0.unwrap());
    }

    public void setTickMarkTintBlendMode(com.micklab.dcg.wrapper.android.graphics.BlendMode arg0) {
        real.setTickMarkTintBlendMode(arg0 == null ? null : arg0.unwrap());
    }

    public void setTickMarkTintList(com.micklab.dcg.wrapper.android.content.res.ColorStateList arg0) {
        real.setTickMarkTintList(arg0 == null ? null : arg0.unwrap());
    }

    public void setTickMarkTintMode(com.micklab.dcg.wrapper.android.graphics.PorterDuff.Mode arg0) {
        real.setTickMarkTintMode(arg0 == null ? null : arg0.unwrap());
    }

}
